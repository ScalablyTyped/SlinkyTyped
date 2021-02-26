package typingsSlinky.awsLambda.anon

import typingsSlinky.awsLambda.awsLambdaStrings.CustomPayload
import typingsSlinky.awsLambda.awsLambdaStrings.PlainText_
import typingsSlinky.awsLambda.awsLambdaStrings.SSML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content extends StObject {
  
  var content: String = js.native
  
  var contentType: PlainText_ | SSML | CustomPayload = js.native
}
object Content {
  
  @scala.inline
  def apply(content: String, contentType: PlainText_ | SSML | CustomPayload): Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: PlainText_ | SSML | CustomPayload): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
  }
}
