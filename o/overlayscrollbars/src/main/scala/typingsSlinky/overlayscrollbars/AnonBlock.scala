package typingsSlinky.overlayscrollbars

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.overlayscrollbars.mod.BlockBehavior
import typingsSlinky.overlayscrollbars.mod.JQuery
import typingsSlinky.overlayscrollbars.mod.Margin
import typingsSlinky.overlayscrollbars.mod.ScrollBehavior
import typingsSlinky.overlayscrollbars.mod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBlock extends _Coordinates {
  var block: js.UndefOr[BlockBehavior | AnonXY | (js.Tuple2[BlockBehavior, BlockBehavior])] = js.native
  var el: HTMLElement | JQuery = js.native
  var margin: js.UndefOr[
    Margin | AnonBottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])
  ] = js.native
  var scroll: js.UndefOr[ScrollBehavior | AnonY | (js.Tuple2[ScrollBehavior, ScrollBehavior])] = js.native
}

object AnonBlock {
  @scala.inline
  def apply(el: HTMLElement | JQuery): AnonBlock = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBlock]
  }
  @scala.inline
  implicit class AnonBlockOps[Self <: AnonBlock] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEl(value: HTMLElement | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlock(value: BlockBehavior | AnonXY | (js.Tuple2[BlockBehavior, BlockBehavior])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(
      value: Margin | AnonBottom | (js.Tuple2[Margin, Margin]) | (js.Tuple4[Margin, Margin, Margin, Margin])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: ScrollBehavior | AnonY | (js.Tuple2[ScrollBehavior, ScrollBehavior])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
  }
  
}

