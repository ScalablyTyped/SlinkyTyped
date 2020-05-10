package typingsSlinky.jsforce.describeResultMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeGlobalSObjectResult extends js.Object {
  var activateable: Boolean = js.native
  var createable: Boolean = js.native
  var custom: Boolean = js.native
  var customSetting: Boolean = js.native
  var deletable: Boolean = js.native
  var deprecatedAndHidden: Boolean = js.native
  var feedEnabled: Boolean = js.native
  var hasSubtypes: Boolean = js.native
  var isSubtype: Boolean = js.native
  var keyPrefix: String | Null = js.native
  var label: String = js.native
  var labelPlural: String = js.native
  var layoutable: Boolean = js.native
  var mergeable: Boolean = js.native
  var mruEnabled: Boolean = js.native
  var name: String = js.native
  var queryable: Boolean = js.native
  var replicateable: Boolean = js.native
  var retrieveable: Boolean = js.native
  var searchable: Boolean = js.native
  var triggerable: Boolean = js.native
  var undeletable: Boolean = js.native
  var updateable: Boolean = js.native
  var urls: Record[String, String] = js.native
}

object DescribeGlobalSObjectResult {
  @scala.inline
  def apply(
    activateable: Boolean,
    createable: Boolean,
    custom: Boolean,
    customSetting: Boolean,
    deletable: Boolean,
    deprecatedAndHidden: Boolean,
    feedEnabled: Boolean,
    hasSubtypes: Boolean,
    isSubtype: Boolean,
    label: String,
    labelPlural: String,
    layoutable: Boolean,
    mergeable: Boolean,
    mruEnabled: Boolean,
    name: String,
    queryable: Boolean,
    replicateable: Boolean,
    retrieveable: Boolean,
    searchable: Boolean,
    triggerable: Boolean,
    undeletable: Boolean,
    updateable: Boolean,
    urls: Record[String, String]
  ): DescribeGlobalSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], customSetting = customSetting.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], feedEnabled = feedEnabled.asInstanceOf[js.Any], hasSubtypes = hasSubtypes.asInstanceOf[js.Any], isSubtype = isSubtype.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPlural = labelPlural.asInstanceOf[js.Any], layoutable = layoutable.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mruEnabled = mruEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], replicateable = replicateable.asInstanceOf[js.Any], retrieveable = retrieveable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], triggerable = triggerable.asInstanceOf[js.Any], undeletable = undeletable.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalSObjectResult]
  }
  @scala.inline
  implicit class DescribeGlobalSObjectResultOps[Self <: DescribeGlobalSObjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomSetting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSetting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeletable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecatedAndHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedAndHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeedEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feedEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasSubtypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSubtypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSubtype(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMergeable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mergeable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMruEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mruEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplicateable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replicateable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRetrieveable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrieveable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUndeletable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undeletable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdateable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrls(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(null)
        ret
    }
  }
  
}

