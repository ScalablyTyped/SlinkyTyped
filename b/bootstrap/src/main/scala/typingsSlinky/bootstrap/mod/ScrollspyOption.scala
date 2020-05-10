package typingsSlinky.bootstrap.mod

import org.scalajs.dom.raw.Element
import typingsSlinky.bootstrap.bootstrapStrings.auto
import typingsSlinky.bootstrap.bootstrapStrings.offset
import typingsSlinky.bootstrap.bootstrapStrings.position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollspyOption extends js.Object {
  /**
    * Finds which section the spied element is in:
    * * `auto` will choose the best method get scroll coordinates.
    * * `offset` will use jQuery offset method to get scroll coordinates.
    * * `position` will use jQuery position method to get scroll coordinates.
    *
    * @default "auto"
    */
  var method: js.UndefOr[auto | offset | position] = js.native
  /**
    * Pixels to offset from top when calculating position of scroll.
    *
    * @default 10
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * A selector of the parent element or the parent element itself
    * of any Bootstrap `.nav` or `.list-group` component.
    *
    * @default ""
    */
  var target: js.UndefOr[String | Element] = js.native
}

object ScrollspyOption {
  @scala.inline
  def apply(): ScrollspyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollspyOption]
  }
  @scala.inline
  implicit class ScrollspyOptionOps[Self <: ScrollspyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMethod(value: auto | offset | position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String | Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

