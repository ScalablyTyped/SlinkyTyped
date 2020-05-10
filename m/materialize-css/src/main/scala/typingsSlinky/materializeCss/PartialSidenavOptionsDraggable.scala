package typingsSlinky.materializeCss

import org.scalajs.dom.raw.Element
import typingsSlinky.materializeCss.M.Sidenav
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.SidenavOptions> */
@js.native
trait PartialSidenavOptionsDraggable extends js.Object {
  var draggable: js.UndefOr[Boolean] = js.native
  var edge: js.UndefOr[left | right] = js.native
  var inDuration: js.UndefOr[Double] = js.native
  var onCloseEnd: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.native
  var onCloseStart: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.native
  var onOpenEnd: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.native
  var onOpenStart: js.UndefOr[js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]] = js.native
  var outDuration: js.UndefOr[Double] = js.native
}

object PartialSidenavOptionsDraggable {
  @scala.inline
  def apply(): PartialSidenavOptionsDraggable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSidenavOptionsDraggable]
  }
  @scala.inline
  implicit class PartialSidenavOptionsDraggableOps[Self <: PartialSidenavOptionsDraggable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEdge(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(js.undefined)
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
    def withOnCloseEnd(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = {
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
    def withOnCloseStart(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = {
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
    def withOnOpenEnd(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = {
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
    def withOnOpenStart(value: js.ThisFunction1[/* this */ Sidenav, /* elem */ Element, Unit]): Self = {
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

