package typingsSlinky.crossDomainUtils

import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.Asterisk
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.aboutColon
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.fileColon
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.iframe
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.mockColon
import typingsSlinky.crossDomainUtils.crossDomainUtilsStrings.popup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  object PROTOCOL {
    
    @JSImport("cross-domain-utils/constants", "PROTOCOL")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cross-domain-utils/constants", "PROTOCOL.ABOUT")
    @js.native
    def ABOUT: aboutColon = js.native
    @scala.inline
    def ABOUT_=(x: aboutColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ABOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils/constants", "PROTOCOL.FILE")
    @js.native
    def FILE: fileColon = js.native
    @scala.inline
    def FILE_=(x: fileColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils/constants", "PROTOCOL.MOCK")
    @js.native
    def MOCK: mockColon = js.native
    @scala.inline
    def MOCK_=(x: mockColon): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MOCK")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("cross-domain-utils/constants", "WILDCARD")
  @js.native
  val WILDCARD: Asterisk = js.native
  
  object WINDOW_TYPE {
    
    @JSImport("cross-domain-utils/constants", "WINDOW_TYPE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("cross-domain-utils/constants", "WINDOW_TYPE.IFRAME")
    @js.native
    def IFRAME: iframe = js.native
    @scala.inline
    def IFRAME_=(x: iframe): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IFRAME")(x.asInstanceOf[js.Any])
    
    @JSImport("cross-domain-utils/constants", "WINDOW_TYPE.POPUP")
    @js.native
    def POPUP: popup = js.native
    @scala.inline
    def POPUP_=(x: popup): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POPUP")(x.asInstanceOf[js.Any])
  }
}
