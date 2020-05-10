package typingsSlinky.lobibox.LobiboxModule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressMethods extends js.Object {
  var getProgress: js.UndefOr[js.Function0[Double]] = js.native
  var setProgress: js.UndefOr[js.Function1[/* progress */ Double, this.type]] = js.native
}

object ProgressMethods {
  @scala.inline
  def apply(): ProgressMethods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressMethods]
  }
  @scala.inline
  implicit class ProgressMethodsOps[Self <: ProgressMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetProgress(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProgress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withSetProgress(value: /* progress */ Double => ProgressMethods): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProgress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setProgress")(js.undefined)
        ret
    }
  }
  
}

