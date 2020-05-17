package typingsSlinky.materializeCss.anon

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.CollapsibleOptions> */
@js.native
trait PartialCollapsibleOptions extends js.Object {
  var accordion: js.UndefOr[Boolean] = js.native
  var inDuration: js.UndefOr[Double] = js.native
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.native
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.native
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.native
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* el */ Element, Unit]] = js.native
  var outDuration: js.UndefOr[Double] = js.native
}

object PartialCollapsibleOptions {
  @scala.inline
  def apply(): PartialCollapsibleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCollapsibleOptions]
  }
  @scala.inline
  implicit class PartialCollapsibleOptionsOps[Self <: PartialCollapsibleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccordion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccordion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accordion")(js.undefined)
        ret
    }
    @scala.inline
    def withInDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseEnd(value: js.ThisFunction1[PartialCollapsibleOptions, /* el */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCloseEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseStart(value: js.ThisFunction1[PartialCollapsibleOptions, /* el */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCloseStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenEnd(value: js.ThisFunction1[PartialCollapsibleOptions, /* el */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpenEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpenStart(value: js.ThisFunction1[PartialCollapsibleOptions, /* el */ Element, Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnOpenStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpenStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOutDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outDuration")(js.undefined)
        ret
    }
  }
  
}

