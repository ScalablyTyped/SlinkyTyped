package typingsSlinky.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource representing a Group
  */
@js.native
trait SchemaGroup extends js.Object {
  /**
    * Optional. Additional entity key aliases for a Group
    */
  var additionalGroupKeys: js.UndefOr[js.Array[SchemaEntityKey]] = js.native
  /**
    * The time when the Group was created. Output only
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * An extended description to help users determine the purpose of a Group.
    * For example, you can include information about who should join the Group,
    * the types of messages to send to the Group, links to FAQs about the
    * Group, or related Groups. Maximum length is 4,096 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The Group&#39;s display name.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * EntityKey of the Group.  Must be set when creating a Group, read-only
    * afterwards.
    */
  var groupKey: js.UndefOr[SchemaEntityKey] = js.native
  /**
    * Labels for Group resource. Required. For creating Groups under a
    * namespace, set label key to &#39;labels/system/groups/external&#39; and
    * label value as empty.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * [Resource name](https://cloud.google.com/apis/design/resource_names) of
    * the Group in the format: `groups/{group_id}`, where group_id is the
    * unique id assigned to the Group.  Must be left blank while creating a
    * Group
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The entity under which this Group resides in Cloud Identity resource
    * hierarchy. Must be set when creating a Group, read-only afterwards.
    * Currently allowed types: &#39;identitysources&#39;.
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The time when the Group was last updated. Output only
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGroup {
  @scala.inline
  def apply(): SchemaGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroup]
  }
  @scala.inline
  implicit class SchemaGroupOps[Self <: SchemaGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalGroupKeys(value: js.Array[SchemaEntityKey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalGroupKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalGroupKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalGroupKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupKey(value: SchemaEntityKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

