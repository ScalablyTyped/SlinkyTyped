package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateIndexingConfigurationRequest extends js.Object {
  
  /**
    * Thing group indexing configuration.
    */
  var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.native
  
  /**
    * Thing indexing configuration.
    */
  var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.native
}
object UpdateIndexingConfigurationRequest {
  
  @scala.inline
  def apply(): UpdateIndexingConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIndexingConfigurationRequest]
  }
  
  @scala.inline
  implicit class UpdateIndexingConfigurationRequestOps[Self <: UpdateIndexingConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setThingGroupIndexingConfiguration(value: ThingGroupIndexingConfiguration): Self = this.set("thingGroupIndexingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingGroupIndexingConfiguration: Self = this.set("thingGroupIndexingConfiguration", js.undefined)
    
    @scala.inline
    def setThingIndexingConfiguration(value: ThingIndexingConfiguration): Self = this.set("thingIndexingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThingIndexingConfiguration: Self = this.set("thingIndexingConfiguration", js.undefined)
  }
}
