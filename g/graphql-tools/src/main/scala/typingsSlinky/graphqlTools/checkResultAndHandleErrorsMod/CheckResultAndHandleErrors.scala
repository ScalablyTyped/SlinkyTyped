package typingsSlinky.graphqlTools.checkResultAndHandleErrorsMod

import typingsSlinky.graphqlTools.interfacesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckResultAndHandleErrors extends Transform {
  var fieldName: js.UndefOr[js.Any] = js.native
  var info: js.Any = js.native
  @JSName("transformResult")
  def transformResult_MCheckResultAndHandleErrors(result: js.Any): js.Any = js.native
}

object CheckResultAndHandleErrors {
  @scala.inline
  def apply(info: js.Any, transformResult: js.Any => js.Any): CheckResultAndHandleErrors = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], transformResult = js.Any.fromFunction1(transformResult))
    __obj.asInstanceOf[CheckResultAndHandleErrors]
  }
  @scala.inline
  implicit class CheckResultAndHandleErrorsOps[Self <: CheckResultAndHandleErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransformResult(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformResult")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFieldName(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(js.undefined)
        ret
    }
  }
  
}

