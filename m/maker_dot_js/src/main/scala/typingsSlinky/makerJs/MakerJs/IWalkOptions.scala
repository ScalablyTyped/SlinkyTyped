package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options to pass to model.walk().
  */
@js.native
trait IWalkOptions extends js.Object {
  var afterChildWalk: js.UndefOr[IWalkModelCallback] = js.native
  var beforeChildWalk: js.UndefOr[IWalkModelCancellableCallback] = js.native
  var onPath: js.UndefOr[IWalkPathCallback] = js.native
}

object IWalkOptions {
  @scala.inline
  def apply(): IWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWalkOptions]
  }
  @scala.inline
  implicit class IWalkOptionsOps[Self <: IWalkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterChildWalk(value: /* context */ IWalkModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChildWalk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterChildWalk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterChildWalk")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeChildWalk(value: /* context */ IWalkModel => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChildWalk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeChildWalk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeChildWalk")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPath(value: /* context */ IWalkPath => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPath")(js.undefined)
        ret
    }
  }
  
}

