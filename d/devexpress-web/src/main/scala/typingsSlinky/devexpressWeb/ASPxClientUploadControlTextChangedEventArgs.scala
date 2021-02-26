package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.TextChanged client event that allows you to respond to an end-user changing an edit box's text.
  */
@js.native
trait ASPxClientUploadControlTextChangedEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets the index of a file input element within the ASPxUploadControl.
    */
  var inputIndex: Double = js.native
}
object ASPxClientUploadControlTextChangedEventArgs {
  
  @scala.inline
  def apply(inputIndex: Double): ASPxClientUploadControlTextChangedEventArgs = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlTextChangedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientUploadControlTextChangedEventArgsMutableBuilder[Self <: ASPxClientUploadControlTextChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
  }
}
