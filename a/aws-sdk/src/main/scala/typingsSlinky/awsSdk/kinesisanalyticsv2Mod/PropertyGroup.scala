package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyGroup extends js.Object {
  /**
    * Describes the key of an application execution property key-value pair.
    */
  var PropertyGroupId: Id = js.native
  /**
    * Describes the value of an application execution property key-value pair.
    */
  var PropertyMap: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.PropertyMap = js.native
}

object PropertyGroup {
  @scala.inline
  def apply(PropertyGroupId: Id, PropertyMap: PropertyMap): PropertyGroup = {
    val __obj = js.Dynamic.literal(PropertyGroupId = PropertyGroupId.asInstanceOf[js.Any], PropertyMap = PropertyMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyGroup]
  }
  @scala.inline
  implicit class PropertyGroupOps[Self <: PropertyGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyGroupId(value: Id): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropertyMap(value: PropertyMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PropertyMap")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

