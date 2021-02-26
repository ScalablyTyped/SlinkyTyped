package typingsSlinky.jsforce.describeResultMod

import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeGlobalSObjectResult extends StObject {
  
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
  implicit class DescribeGlobalSObjectResultMutableBuilder[Self <: DescribeGlobalSObjectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivateable(value: Boolean): Self = StObject.set(x, "activateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateable(value: Boolean): Self = StObject.set(x, "createable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSetting(value: Boolean): Self = StObject.set(x, "customSetting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletable(value: Boolean): Self = StObject.set(x, "deletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeprecatedAndHidden(value: Boolean): Self = StObject.set(x, "deprecatedAndHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeedEnabled(value: Boolean): Self = StObject.set(x, "feedEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasSubtypes(value: Boolean): Self = StObject.set(x, "hasSubtypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSubtype(value: Boolean): Self = StObject.set(x, "isSubtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPrefixNull: Self = StObject.set(x, "keyPrefix", null)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlural(value: String): Self = StObject.set(x, "labelPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutable(value: Boolean): Self = StObject.set(x, "layoutable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeable(value: Boolean): Self = StObject.set(x, "mergeable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMruEnabled(value: Boolean): Self = StObject.set(x, "mruEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryable(value: Boolean): Self = StObject.set(x, "queryable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicateable(value: Boolean): Self = StObject.set(x, "replicateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetrieveable(value: Boolean): Self = StObject.set(x, "retrieveable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerable(value: Boolean): Self = StObject.set(x, "triggerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndeletable(value: Boolean): Self = StObject.set(x, "undeletable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateable(value: Boolean): Self = StObject.set(x, "updateable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: Record[String, String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
