package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payload extends StObject {
  
  /**
    * The content of the payload. You can use a string expression that includes quoted strings ('&lt;string&gt;'), variables ($variable.&lt;variable-name&gt;), input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;), string concatenations, and quoted strings that contain ${} as the content. The recommended maximum size of a content expression is 1 KB.
    */
  var contentExpression: ContentExpression = js.native
  
  /**
    * The value of the payload type can be either STRING or JSON.
    */
  var `type`: PayloadType = js.native
}
object Payload {
  
  @scala.inline
  def apply(contentExpression: ContentExpression, `type`: PayloadType): Payload = {
    val __obj = js.Dynamic.literal(contentExpression = contentExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentExpression(value: ContentExpression): Self = StObject.set(x, "contentExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PayloadType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
