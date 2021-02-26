package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeEntityRecognizerRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: typingsSlinky.awsSdk.comprehendMod.EntityRecognizerArn = js.native
}
object DescribeEntityRecognizerRequest {
  
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn): DescribeEntityRecognizerRequest = {
    val __obj = js.Dynamic.literal(EntityRecognizerArn = EntityRecognizerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEntityRecognizerRequest]
  }
  
  @scala.inline
  implicit class DescribeEntityRecognizerRequestMutableBuilder[Self <: DescribeEntityRecognizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
  }
}
