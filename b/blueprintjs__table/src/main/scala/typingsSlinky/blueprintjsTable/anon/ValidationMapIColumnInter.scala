package typingsSlinky.blueprintjsTable.anon

import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.ValidationMap<@blueprintjs/table.@blueprintjs/table/lib/esm/common/context.IColumnInteractionBarContextTypes> */
@js.native
trait ValidationMapIColumnInter extends js.Object {
  var enableColumnInteractionBar: js.UndefOr[Validator[Boolean]] = js.native
}

object ValidationMapIColumnInter {
  @scala.inline
  def apply(): ValidationMapIColumnInter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationMapIColumnInter]
  }
  @scala.inline
  implicit class ValidationMapIColumnInterOps[Self <: ValidationMapIColumnInter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableColumnInteractionBar(value: Validator[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnInteractionBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnInteractionBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnInteractionBar")(js.undefined)
        ret
    }
  }
  
}

