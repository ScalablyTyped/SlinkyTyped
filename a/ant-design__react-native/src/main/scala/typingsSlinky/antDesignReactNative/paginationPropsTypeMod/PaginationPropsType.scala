package typingsSlinky.antDesignReactNative.paginationPropsTypeMod

import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.button
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.number
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.pointer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationPropsType extends js.Object {
  var current: Double = js.native
  var mode: js.UndefOr[button | number | pointer] = js.native
  var nextText: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
  var onNext: js.UndefOr[js.Function0[Unit]] = js.native
  var onPrev: js.UndefOr[js.Function0[Unit]] = js.native
  var prevText: js.UndefOr[String] = js.native
  var simple: js.UndefOr[Boolean] = js.native
  var total: Double = js.native
}

object PaginationPropsType {
  @scala.inline
  def apply(current: Double, total: Double): PaginationPropsType = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationPropsType]
  }
  @scala.inline
  implicit class PaginationPropsTypeOps[Self <: PaginationPropsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: button | number | pointer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withNextText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(value: /* current */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnNext(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onNext")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrev(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrev")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevText")(js.undefined)
        ret
    }
    @scala.inline
    def withSimple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simple")(js.undefined)
        ret
    }
  }
  
}

