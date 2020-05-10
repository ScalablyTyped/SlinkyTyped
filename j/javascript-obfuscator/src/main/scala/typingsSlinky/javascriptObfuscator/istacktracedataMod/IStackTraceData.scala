package typingsSlinky.javascriptObfuscator.istacktracedataMod

import typingsSlinky.javascriptObfuscator.icalleedataMod.ICalleeData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStackTraceData extends ICalleeData {
  var stackTrace: js.Array[IStackTraceData] = js.native
}

object IStackTraceData {
  @scala.inline
  def apply(
    callee: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ESTree.BlockStatement */ js.Any,
    stackTrace: js.Array[IStackTraceData]
  ): IStackTraceData = {
    val __obj = js.Dynamic.literal(callee = callee.asInstanceOf[js.Any], stackTrace = stackTrace.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStackTraceData]
  }
  @scala.inline
  implicit class IStackTraceDataOps[Self <: IStackTraceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStackTrace(value: js.Array[IStackTraceData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackTrace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

