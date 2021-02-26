package typingsSlinky.hellosignEmbedded.mod.HelloSign

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.cs_CZ
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.da_DK
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.de_DE
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.en_US
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.es_ES
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.es_MX
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.fr_FR
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.it_IT
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.ja_JP
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.nl_NL
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.pl_PL
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.pt_BR
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.sv_SE
import typingsSlinky.hellosignEmbedded.hellosignEmbeddedStrings.zh_CN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var allowCancel: js.UndefOr[Boolean] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var container: js.UndefOr[HTMLElement] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var hideHeader: js.UndefOr[Boolean] = js.native
  
  var locale: js.UndefOr[
    sv_SE | ja_JP | es_ES | da_DK | zh_CN | nl_NL | es_MX | de_DE | pl_PL | en_US | it_IT | pt_BR | fr_FR | cs_CZ
  ] = js.native
  
  var redirectTo: js.UndefOr[String] = js.native
  
  var requestingEmail: js.UndefOr[String] = js.native
  
  var skipDomainVerification: js.UndefOr[Boolean] = js.native
  
  var testMode: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var whiteLabeling: js.UndefOr[js.Object] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCancel(value: Boolean): Self = StObject.set(x, "allowCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCancelUndefined: Self = StObject.set(x, "allowCancel", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
    
    @scala.inline
    def setLocale(
      value: sv_SE | ja_JP | es_ES | da_DK | zh_CN | nl_NL | es_MX | de_DE | pl_PL | en_US | it_IT | pt_BR | fr_FR | cs_CZ
    ): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setRedirectTo(value: String): Self = StObject.set(x, "redirectTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectToUndefined: Self = StObject.set(x, "redirectTo", js.undefined)
    
    @scala.inline
    def setRequestingEmail(value: String): Self = StObject.set(x, "requestingEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestingEmailUndefined: Self = StObject.set(x, "requestingEmail", js.undefined)
    
    @scala.inline
    def setSkipDomainVerification(value: Boolean): Self = StObject.set(x, "skipDomainVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipDomainVerificationUndefined: Self = StObject.set(x, "skipDomainVerification", js.undefined)
    
    @scala.inline
    def setTestMode(value: Boolean): Self = StObject.set(x, "testMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestModeUndefined: Self = StObject.set(x, "testMode", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setWhiteLabeling(value: js.Object): Self = StObject.set(x, "whiteLabeling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteLabelingUndefined: Self = StObject.set(x, "whiteLabeling", js.undefined)
  }
}
