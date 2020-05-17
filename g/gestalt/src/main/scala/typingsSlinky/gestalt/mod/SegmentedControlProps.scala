package typingsSlinky.gestalt.mod

import slinky.core.TagMod
import typingsSlinky.gestalt.anon.ActiveIndex
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SegmentedControlProps extends js.Object {
  var items: js.Array[TagMod[Any]] = js.native
  var responsive: js.UndefOr[Boolean] = js.native
  var selectedItemIndex: Double = js.native
  var size: js.UndefOr[md | lg] = js.native
  def onChange(args: ActiveIndex): Unit = js.native
}

object SegmentedControlProps {
  @scala.inline
  def apply(items: js.Array[TagMod[Any]], onChange: ActiveIndex => Unit, selectedItemIndex: Double): SegmentedControlProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), selectedItemIndex = selectedItemIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentedControlProps]
  }
  @scala.inline
  implicit class SegmentedControlPropsOps[Self <: SegmentedControlProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnChange(value: ActiveIndex => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectedItemIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItemIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responsive")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: md | lg): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

