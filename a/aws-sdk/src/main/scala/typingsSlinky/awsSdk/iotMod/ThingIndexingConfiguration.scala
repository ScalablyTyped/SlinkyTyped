package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingIndexingConfiguration extends js.Object {
  /**
    * Contains custom field names and their data type.
    */
  var customFields: js.UndefOr[Fields] = js.native
  /**
    * Contains fields that are indexed and whose types are already known by the Fleet Indexing service.
    */
  var managedFields: js.UndefOr[Fields] = js.native
  /**
    * Thing connectivity indexing mode. Valid values are:    STATUS – Your thing index contains connectivity status. To enable thing connectivity indexing, thingIndexMode must not be set to OFF.   OFF - Thing connectivity status indexing is disabled.  
    */
  var thingConnectivityIndexingMode: js.UndefOr[ThingConnectivityIndexingMode] = js.native
  /**
    * Thing indexing mode. Valid values are:   REGISTRY – Your thing index contains registry data only.   REGISTRY_AND_SHADOW - Your thing index contains registry and shadow data.   OFF - Thing indexing is disabled.  
    */
  var thingIndexingMode: ThingIndexingMode = js.native
}

object ThingIndexingConfiguration {
  @scala.inline
  def apply(thingIndexingMode: ThingIndexingMode): ThingIndexingConfiguration = {
    val __obj = js.Dynamic.literal(thingIndexingMode = thingIndexingMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingIndexingConfiguration]
  }
  @scala.inline
  implicit class ThingIndexingConfigurationOps[Self <: ThingIndexingConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingIndexingMode(value: ThingIndexingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingIndexingMode")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withThingConnectivityIndexingMode(value: ThingConnectivityIndexingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingConnectivityIndexingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingConnectivityIndexingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingConnectivityIndexingMode")(js.undefined)
        ret
    }
  }
  
}

