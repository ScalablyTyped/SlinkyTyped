package typingsSlinky.fridaGum

import typingsSlinky.fridaGum.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arm64BaseOperand extends js.Object {
  var ext: js.UndefOr[Arm64Extender] = js.native
  var shift: js.UndefOr[Value] = js.native
  var vas: js.UndefOr[Arm64Vas] = js.native
  var vectorIndex: js.UndefOr[Double] = js.native
}

object Arm64BaseOperand {
  @scala.inline
  def apply(): Arm64BaseOperand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Arm64BaseOperand]
  }
  @scala.inline
  implicit class Arm64BaseOperandOps[Self <: Arm64BaseOperand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExt(value: Arm64Extender): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withShift(value: Value): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.undefined)
        ret
    }
    @scala.inline
    def withVas(value: Arm64Vas): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vas")(js.undefined)
        ret
    }
    @scala.inline
    def withVectorIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVectorIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vectorIndex")(js.undefined)
        ret
    }
  }
  
}

