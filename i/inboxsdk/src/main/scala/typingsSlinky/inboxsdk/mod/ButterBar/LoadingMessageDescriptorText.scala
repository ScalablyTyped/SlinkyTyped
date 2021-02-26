package typingsSlinky.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadingMessageDescriptorText
  extends LoadingMessageDescriptorBase
     with LoadingMessageDescriptor {
  
  var text: String = js.native
}
object LoadingMessageDescriptorText {
  
  @scala.inline
  def apply(text: String): LoadingMessageDescriptorText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadingMessageDescriptorText]
  }
  
  @scala.inline
  implicit class LoadingMessageDescriptorTextMutableBuilder[Self <: LoadingMessageDescriptorText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
