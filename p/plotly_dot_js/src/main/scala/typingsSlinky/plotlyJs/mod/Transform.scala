package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.plotlyJsStrings.aggregate
import typingsSlinky.plotlyJs.plotlyJsStrings.ascending
import typingsSlinky.plotlyJs.plotlyJsStrings.descending
import typingsSlinky.plotlyJs.plotlyJsStrings.filter
import typingsSlinky.plotlyJs.plotlyJsStrings.groupby
import typingsSlinky.plotlyJs.plotlyJsStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transform extends js.Object {
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
  implicit class TransformOps[Self <: Transform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregations(value: js.Array[TransformAggregation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameformat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameformat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrder(value: ascending | descending): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreservegaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preservegaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyles(value: js.Array[TransformStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: Double | String | (js.Array[Double | String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: aggregate | filter | groupby | sort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

