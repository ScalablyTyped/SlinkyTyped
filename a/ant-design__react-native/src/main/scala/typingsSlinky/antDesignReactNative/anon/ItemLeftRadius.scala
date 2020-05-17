package typingsSlinky.antDesignReactNative.anon

import typingsSlinky.reactNative.mod.RegisteredStyle
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemLeftRadius extends js.Object {
  var item: RegisteredStyle[ViewStyle] = js.native
  var itemLeftRadius: RegisteredStyle[ViewStyle] = js.native
  var itemRightRadius: RegisteredStyle[ViewStyle] = js.native
  var itemText: RegisteredStyle[TextStyle] = js.native
  var segment: RegisteredStyle[ViewStyle] = js.native
}

object ItemLeftRadius {
  @scala.inline
  def apply(
    item: RegisteredStyle[ViewStyle],
    itemLeftRadius: RegisteredStyle[ViewStyle],
    itemRightRadius: RegisteredStyle[ViewStyle],
    itemText: RegisteredStyle[TextStyle],
    segment: RegisteredStyle[ViewStyle]
  ): ItemLeftRadius = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLeftRadius = itemLeftRadius.asInstanceOf[js.Any], itemRightRadius = itemRightRadius.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemLeftRadius]
  }
  @scala.inline
  implicit class ItemLeftRadiusOps[Self <: ItemLeftRadius] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItem(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemLeftRadius(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemLeftRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemRightRadius(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRightRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemText(value: RegisteredStyle[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSegment(value: RegisteredStyle[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

