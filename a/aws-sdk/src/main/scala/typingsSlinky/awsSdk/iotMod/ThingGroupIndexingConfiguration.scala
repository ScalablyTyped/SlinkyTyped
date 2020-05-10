package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupIndexingConfiguration extends js.Object {
  /**
    * A list of thing group fields to index. This list cannot contain any managed fields. Use the GetIndexingConfiguration API to get a list of managed fields. Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.native
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.native
  /**
    * Thing group indexing mode.
    */
  var thingGroupIndexingMode: ThingGroupIndexingMode = js.native
}

object ThingGroupIndexingConfiguration {
  @scala.inline
  def apply(thingGroupIndexingMode: ThingGroupIndexingMode): ThingGroupIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingGroupIndexingMode = thingGroupIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingGroupIndexingConfiguration]
  }
  @scala.inline
  implicit class ThingGroupIndexingConfigurationOps[Self <: ThingGroupIndexingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingGroupIndexingMode(value: ThingGroupIndexingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingGroupIndexingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customFields")(js.undefined)
        ret
    }
    @scala.inline
    def withManagedFields(value: Fields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagedFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managedFields")(js.undefined)
        ret
    }
  }
  
}

