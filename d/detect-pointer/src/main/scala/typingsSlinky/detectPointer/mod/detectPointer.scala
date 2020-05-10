package typingsSlinky.detectPointer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait detectPointer extends js.Object {
  var anyCoarse: Boolean = js.native
  var anyFine: Boolean = js.native
  var anyNone: Boolean = js.native
  var coarse: Boolean = js.native
  var fine: Boolean = js.native
  var none: Boolean = js.native
  def update(): Unit = js.native
}

object detectPointer {
  @scala.inline
  def apply(
    anyCoarse: Boolean,
    anyFine: Boolean,
    anyNone: Boolean,
    coarse: Boolean,
    fine: Boolean,
    none: Boolean,
    update: () => Unit
  ): detectPointer = {
    val __obj = js.Dynamic.literal(anyCoarse = anyCoarse.asInstanceOf[js.Any], anyFine = anyFine.asInstanceOf[js.Any], anyNone = anyNone.asInstanceOf[js.Any], coarse = coarse.asInstanceOf[js.Any], fine = fine.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[detectPointer]
  }
  @scala.inline
  implicit class detectPointerOps[Self <: detectPointer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnyCoarse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyCoarse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnyFine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyFine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnyNone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anyNone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCoarse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coarse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("none")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

