package typingsSlinky.redom.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedomComponent extends RedomElement {
  var el: HTMLElement = js.native
  var onmount: js.UndefOr[js.Function0[Unit]] = js.native
  var onremount: js.UndefOr[js.Function0[Unit]] = js.native
  var onunmount: js.UndefOr[js.Function0[Unit]] = js.native
  var update: js.UndefOr[
    js.Function4[
      /* item */ js.Any, 
      /* index */ Double, 
      /* data */ js.Any, 
      /* context */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}

object RedomComponent {
  @scala.inline
  def apply(el: HTMLElement): RedomComponent = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedomComponent]
  }
  @scala.inline
  implicit class RedomComponentOps[Self <: RedomComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnmount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnremount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnremount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onremount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnunmount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onunmount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnunmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onunmount")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdate(
      value: (/* item */ js.Any, /* index */ Double, /* data */ js.Any, /* context */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.undefined)
        ret
    }
  }
  
}

