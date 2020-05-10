package typingsSlinky.fullcalendar.parsableModelMixinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsableModelInterface extends js.Object {
  def applyManualStandardProps(rawProps: js.Any): js.Any = js.native
  def applyMiscProps(rawProps: js.Any): js.Any = js.native
  def applyProps(rawProps: js.Any): js.Any = js.native
  def isStandardProp(propName: js.Any): js.Any = js.native
}

object ParsableModelInterface {
  @scala.inline
  def apply(
    applyManualStandardProps: js.Any => js.Any,
    applyMiscProps: js.Any => js.Any,
    applyProps: js.Any => js.Any,
    isStandardProp: js.Any => js.Any
  ): ParsableModelInterface = {
    val __obj = js.Dynamic.literal(applyManualStandardProps = js.Any.fromFunction1(applyManualStandardProps), applyMiscProps = js.Any.fromFunction1(applyMiscProps), applyProps = js.Any.fromFunction1(applyProps), isStandardProp = js.Any.fromFunction1(isStandardProp))
    __obj.asInstanceOf[ParsableModelInterface]
  }
  @scala.inline
  implicit class ParsableModelInterfaceOps[Self <: ParsableModelInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplyManualStandardProps(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyManualStandardProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplyMiscProps(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyMiscProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withApplyProps(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsStandardProp(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStandardProp")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

