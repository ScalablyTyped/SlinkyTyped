package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateJsonClassifierRequest extends StObject {
  
  /**
    * A JsonPath string defining the JSON data for the classifier to classify. AWS Glue supports a subset of JsonPath, as described in Writing JsonPath Custom Classifiers.
    */
  var JsonPath: typingsSlinky.awsSdk.glueMod.JsonPath = js.native
  
  /**
    * The name of the classifier.
    */
  var Name: NameString = js.native
}
object CreateJsonClassifierRequest {
  
  @scala.inline
  def apply(JsonPath: JsonPath, Name: NameString): CreateJsonClassifierRequest = {
    val __obj = js.Dynamic.literal(JsonPath = JsonPath.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJsonClassifierRequest]
  }
  
  @scala.inline
  implicit class CreateJsonClassifierRequestMutableBuilder[Self <: CreateJsonClassifierRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonPath(value: JsonPath): Self = StObject.set(x, "JsonPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
