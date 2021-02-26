package typingsSlinky.activexLibreoffice.com_.sun.star.deployment

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.Exception
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A {@link LicenseException} reflects the necessity of someone agreeing to a license.
  * @since OOo 2.0.4
  */
@js.native
trait LicenseException extends Exception {
  
  /** contains the value of the attribute `/description/registration/simple-license/@accept-by` from the description.xml */
  var AcceptBy: String = js.native
  
  /**
    * name of the extension.
    *
    * The display name of the extension. See {@link XPackage.getDisplayName()}
    */
  var ExtensionName: String = js.native
  
  /** contains the text of the license. */
  var Text: String = js.native
}
object LicenseException {
  
  @scala.inline
  def apply(AcceptBy: String, Context: XInterface, ExtensionName: String, Message: String, Text: String): LicenseException = {
    val __obj = js.Dynamic.literal(AcceptBy = AcceptBy.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], ExtensionName = ExtensionName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseException]
  }
  
  @scala.inline
  implicit class LicenseExceptionMutableBuilder[Self <: LicenseException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptBy(value: String): Self = StObject.set(x, "AcceptBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionName(value: String): Self = StObject.set(x, "ExtensionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
