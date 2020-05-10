package typingsSlinky.jsforce.describeResultMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSObjectResult extends js.Object {
  var actionOverrides: js.UndefOr[maybe[js.Array[ActionOverride]]] = js.native
  var activateable: Boolean = js.native
  var childRelationships: js.Array[ChildRelationship] = js.native
  var compactLayoutable: Boolean = js.native
  var createable: Boolean = js.native
  var custom: Boolean = js.native
  var customSetting: Boolean = js.native
  var deletable: Boolean = js.native
  var deprecatedAndHidden: Boolean = js.native
  var feedEnabled: Boolean = js.native
  var fields: js.Array[Field] = js.native
  var keyPrefix: js.UndefOr[maybe[String]] = js.native
  var label: String = js.native
  var labelPlural: String = js.native
  var layoutable: Boolean = js.native
  var listviewable: js.UndefOr[maybe[Boolean]] = js.native
  var lookupLayoutable: js.UndefOr[maybe[Boolean]] = js.native
  var mergeable: Boolean = js.native
  var mruEnabled: Boolean = js.native
  var name: String = js.native
  var namedLayoutInfos: js.Array[NamedLayoutInfo] = js.native
  var networkScopeFieldName: js.UndefOr[maybe[String]] = js.native
  var queryable: Boolean = js.native
  var recordTypeInfos: js.Array[RecordTypeInfo] = js.native
  var replicateable: Boolean = js.native
  var retrieveable: Boolean = js.native
  var searchLayoutable: Boolean = js.native
  var searchable: Boolean = js.native
  var supportedScopes: js.Array[ScopeInfo] = js.native
  var triggerable: Boolean = js.native
  var undeletable: Boolean = js.native
  var updateable: Boolean = js.native
  var urlDetail: js.UndefOr[String] = js.native
  var urlEdit: js.UndefOr[String] = js.native
  var urlNew: js.UndefOr[String] = js.native
  var urls: Record[String, String] = js.native
}

object DescribeSObjectResult {
  @scala.inline
  def apply(
    activateable: Boolean,
    childRelationships: js.Array[ChildRelationship],
    compactLayoutable: Boolean,
    createable: Boolean,
    custom: Boolean,
    customSetting: Boolean,
    deletable: Boolean,
    deprecatedAndHidden: Boolean,
    feedEnabled: Boolean,
    fields: js.Array[Field],
    label: String,
    labelPlural: String,
    layoutable: Boolean,
    mergeable: Boolean,
    mruEnabled: Boolean,
    name: String,
    namedLayoutInfos: js.Array[NamedLayoutInfo],
    queryable: Boolean,
    recordTypeInfos: js.Array[RecordTypeInfo],
    replicateable: Boolean,
    retrieveable: Boolean,
    searchLayoutable: Boolean,
    searchable: Boolean,
    supportedScopes: js.Array[ScopeInfo],
    triggerable: Boolean,
    undeletable: Boolean,
    updateable: Boolean,
    urls: Record[String, String]
  ): DescribeSObjectResult = {
    val __obj = js.Dynamic.literal(activateable = activateable.asInstanceOf[js.Any], childRelationships = childRelationships.asInstanceOf[js.Any], compactLayoutable = compactLayoutable.asInstanceOf[js.Any], createable = createable.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], customSetting = customSetting.asInstanceOf[js.Any], deletable = deletable.asInstanceOf[js.Any], deprecatedAndHidden = deprecatedAndHidden.asInstanceOf[js.Any], feedEnabled = feedEnabled.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelPlural = labelPlural.asInstanceOf[js.Any], layoutable = layoutable.asInstanceOf[js.Any], mergeable = mergeable.asInstanceOf[js.Any], mruEnabled = mruEnabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namedLayoutInfos = namedLayoutInfos.asInstanceOf[js.Any], queryable = queryable.asInstanceOf[js.Any], recordTypeInfos = recordTypeInfos.asInstanceOf[js.Any], replicateable = replicateable.asInstanceOf[js.Any], retrieveable = retrieveable.asInstanceOf[js.Any], searchLayoutable = searchLayoutable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any], supportedScopes = supportedScopes.asInstanceOf[js.Any], triggerable = triggerable.asInstanceOf[js.Any], undeletable = undeletable.asInstanceOf[js.Any], updateable = updateable.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSObjectResult]
  }
  @scala.inline
  implicit class DescribeSObjectResultOps[Self <: DescribeSObjectResult] (val x: Self) extends AnyVal {
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
    def withChildRelationships(value: js.Array[ChildRelationship]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childRelationships")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompactLayoutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compactLayoutable")(value.asInstanceOf[js.Any])
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
    def withFields(value: js.Array[Field]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
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
    def withNamedLayoutInfos(value: js.Array[NamedLayoutInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedLayoutInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordTypeInfos(value: js.Array[RecordTypeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recordTypeInfos")(value.asInstanceOf[js.Any])
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
    def withSearchLayoutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchLayoutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedScopes(value: js.Array[ScopeInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedScopes")(value.asInstanceOf[js.Any])
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
    def withActionOverrides(value: maybe[js.Array[ActionOverride]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withActionOverridesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOverrides")(null)
        ret
    }
    @scala.inline
    def withKeyPrefix(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyPrefixNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPrefix")(null)
        ret
    }
    @scala.inline
    def withListviewable(value: maybe[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listviewable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListviewable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listviewable")(js.undefined)
        ret
    }
    @scala.inline
    def withListviewableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listviewable")(null)
        ret
    }
    @scala.inline
    def withLookupLayoutable(value: maybe[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupLayoutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookupLayoutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupLayoutable")(js.undefined)
        ret
    }
    @scala.inline
    def withLookupLayoutableNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookupLayoutable")(null)
        ret
    }
    @scala.inline
    def withNetworkScopeFieldName(value: maybe[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkScopeFieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkScopeFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkScopeFieldName")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkScopeFieldNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkScopeFieldName")(null)
        ret
    }
    @scala.inline
    def withUrlDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlDetail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlDetail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlDetail")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlEdit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlEdit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlNew(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlNew")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlNew")(js.undefined)
        ret
    }
  }
  
}

