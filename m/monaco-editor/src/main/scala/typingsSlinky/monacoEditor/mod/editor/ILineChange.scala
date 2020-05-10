package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILineChange extends IChange {
  val charChanges: js.UndefOr[js.Array[ICharChange]] = js.native
}

object ILineChange {
  @scala.inline
  def apply(
    modifiedEndLineNumber: Double,
    modifiedStartLineNumber: Double,
    originalEndLineNumber: Double,
    originalStartLineNumber: Double
  ): ILineChange = {
    val __obj = js.Dynamic.literal(modifiedEndLineNumber = modifiedEndLineNumber.asInstanceOf[js.Any], modifiedStartLineNumber = modifiedStartLineNumber.asInstanceOf[js.Any], originalEndLineNumber = originalEndLineNumber.asInstanceOf[js.Any], originalStartLineNumber = originalStartLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineChange]
  }
  @scala.inline
  implicit class ILineChangeOps[Self <: ILineChange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharChanges(value: js.Array[ICharChange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charChanges")(js.undefined)
        ret
    }
  }
  
}

