package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateThingTypeResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the thing type.
    */
  var thingTypeArn: js.UndefOr[ThingTypeArn] = js.native
  
  /**
    * The thing type ID.
    */
  var thingTypeId: js.UndefOr[ThingTypeId] = js.native
  
  /**
    * The name of the thing type.
    */
  var thingTypeName: js.UndefOr[ThingTypeName] = js.native
}
object CreateThingTypeResponse {
  
  @scala.inline
  def apply(): CreateThingTypeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateThingTypeResponse]
  }
  
  @scala.inline
  implicit class CreateThingTypeResponseMutableBuilder[Self <: CreateThingTypeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThingTypeArn(value: ThingTypeArn): Self = StObject.set(x, "thingTypeArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeArnUndefined: Self = StObject.set(x, "thingTypeArn", js.undefined)
    
    @scala.inline
    def setThingTypeId(value: ThingTypeId): Self = StObject.set(x, "thingTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeIdUndefined: Self = StObject.set(x, "thingTypeId", js.undefined)
    
    @scala.inline
    def setThingTypeName(value: ThingTypeName): Self = StObject.set(x, "thingTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThingTypeNameUndefined: Self = StObject.set(x, "thingTypeName", js.undefined)
  }
}
