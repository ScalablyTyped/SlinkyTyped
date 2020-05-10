package typingsSlinky.materializeCss

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.Modal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ModalOptions> */
@js.native
trait PartialModalOptionsDismissible extends js.Object {
  var dismissible: js.UndefOr[Boolean] = js.native
  var endingTop: js.UndefOr[String] = js.native
  var inDuration: js.UndefOr[Double] = js.native
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var outDuration: js.UndefOr[Double] = js.native
  var preventScrolling: js.UndefOr[Boolean] = js.native
  var startingTop: js.UndefOr[String] = js.native
}

object PartialModalOptionsDismissible {
  @scala.inline
  def apply(): PartialModalOptionsDismissible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalOptionsDismissible]
  }
  @scala.inline
  implicit class PartialModalOptionsDismissibleOps[Self <: PartialModalOptionsDismissible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDismissible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDismissible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dismissible")(js.undefined)
        ret
    }
    @scala.inline
    def withEndingTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endingTop")(js.undefined)
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
    def withOnCloseEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = {
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
    def withOnCloseStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = {
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
    def withOnOpenEnd(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = {
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
    def withOnOpenStart(value: js.ThisFunction1[/* this */ Modal, /* el */ Element, Unit]): Self = {
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
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
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
    @scala.inline
    def withPreventScrolling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScrolling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventScrolling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventScrolling")(js.undefined)
        ret
    }
    @scala.inline
    def withStartingTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartingTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startingTop")(js.undefined)
        ret
    }
  }
  
}

