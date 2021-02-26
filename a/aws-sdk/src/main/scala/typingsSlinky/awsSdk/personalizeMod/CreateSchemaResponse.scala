package typingsSlinky.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSchemaResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the created schema.
    */
  var schemaArn: js.UndefOr[Arn] = js.native
}
object CreateSchemaResponse {
  
  @scala.inline
  def apply(): CreateSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSchemaResponse]
  }
  
  @scala.inline
  implicit class CreateSchemaResponseMutableBuilder[Self <: CreateSchemaResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSchemaArn(value: Arn): Self = StObject.set(x, "schemaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaArnUndefined: Self = StObject.set(x, "schemaArn", js.undefined)
  }
}
