package typingsSlinky.monacoEditor.mod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutoClosingPairConditional extends IAutoClosingPair {
  var notIn: js.UndefOr[js.Array[String]] = js.native
}

object IAutoClosingPairConditional {
  @scala.inline
  def apply(close: String, open: String): IAutoClosingPairConditional = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAutoClosingPairConditional]
  }
  @scala.inline
  implicit class IAutoClosingPairConditionalOps[Self <: IAutoClosingPairConditional] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotIn(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notIn")(js.undefined)
        ret
    }
  }
  
}

