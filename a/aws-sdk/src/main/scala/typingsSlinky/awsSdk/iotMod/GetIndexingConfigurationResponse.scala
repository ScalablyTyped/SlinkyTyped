package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIndexingConfigurationResponse extends js.Object {
  /**
    * The index configuration.
    */
  var thingGroupIndexingConfiguration: js.UndefOr[ThingGroupIndexingConfiguration] = js.native
  /**
    * Thing indexing configuration.
    */
  var thingIndexingConfiguration: js.UndefOr[ThingIndexingConfiguration] = js.native
}

object GetIndexingConfigurationResponse {
  @scala.inline
  def apply(): GetIndexingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIndexingConfigurationResponse]
  }
  @scala.inline
  implicit class GetIndexingConfigurationResponseOps[Self <: GetIndexingConfigurationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingGroupIndexingConfiguration(value: ThingGroupIndexingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupIndexingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingGroupIndexingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupIndexingConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withThingIndexingConfiguration(value: ThingIndexingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingIndexingConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingIndexingConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingIndexingConfiguration")(js.undefined)
        ret
    }
  }
  
}

