package typingsSlinky.antDesignReactNative.segmentedControlStyleMod

import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentControlStyle extends js.Object {
  var item: ViewStyle = js.native
  var itemLeftRadius: ViewStyle = js.native
  var itemRightRadius: ViewStyle = js.native
  var itemText: TextStyle = js.native
  var segment: ViewStyle = js.native
}

object SegmentControlStyle {
  @scala.inline
  def apply(
    item: ViewStyle,
    itemLeftRadius: ViewStyle,
    itemRightRadius: ViewStyle,
    itemText: TextStyle,
    segment: ViewStyle
  ): SegmentControlStyle = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLeftRadius = itemLeftRadius.asInstanceOf[js.Any], itemRightRadius = itemRightRadius.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentControlStyle]
  }
  @scala.inline
  implicit class SegmentControlStyleOps[Self <: SegmentControlStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemLeftRadius(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemRightRadius(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemText(value: TextStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegment(value: ViewStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

