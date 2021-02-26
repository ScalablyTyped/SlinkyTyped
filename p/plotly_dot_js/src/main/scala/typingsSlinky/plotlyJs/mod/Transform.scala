package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.aggregate
import typingsSlinky.plotlyJs.plotlyJsStrings.ascending
import typingsSlinky.plotlyJs.plotlyJsStrings.descending
import typingsSlinky.plotlyJs.plotlyJsStrings.filter
import typingsSlinky.plotlyJs.plotlyJsStrings.groupby
import typingsSlinky.plotlyJs.plotlyJsStrings.sort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transform extends StObject {
  
  var aggregations: js.Array[TransformAggregation] = js.native
  
  var enabled: Boolean = js.native
  
  var groups: String | (js.Array[Double | String]) = js.native
  
  var nameformat: String = js.native
  
  var operation: String = js.native
  
  var order: ascending | descending = js.native
  
  var preservegaps: Boolean = js.native
  
  var styles: js.Array[TransformStyle] = js.native
  
  var target: Double | String | (js.Array[Double | String]) = js.native
  
  var `type`: aggregate | filter | groupby | sort = js.native
  
  var value: js.Any = js.native
}
object Transform {
  
  @scala.inline
  def apply(
    aggregations: js.Array[TransformAggregation],
    enabled: Boolean,
    groups: String | (js.Array[Double | String]),
    nameformat: String,
    operation: String,
    order: ascending | descending,
    preservegaps: Boolean,
    styles: js.Array[TransformStyle],
    target: Double | String | (js.Array[Double | String]),
    `type`: aggregate | filter | groupby | sort,
    value: js.Any
  ): Transform = {
    val __obj = js.Dynamic.literal(aggregations = aggregations.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], nameformat = nameformat.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], preservegaps = preservegaps.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregations(value: js.Array[TransformAggregation]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationsVarargs(value: TransformAggregation*): Self = StObject.set(x, "aggregations", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroups(value: String | (js.Array[Double | String])): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: (Double | String)*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setNameformat(value: String): Self = StObject.set(x, "nameformat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: ascending | descending): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreservegaps(value: Boolean): Self = StObject.set(x, "preservegaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: js.Array[TransformStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesVarargs(value: TransformStyle*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: (Double | String)*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setType(value: aggregate | filter | groupby | sort): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
