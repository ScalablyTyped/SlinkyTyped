package typingsSlinky.rcTable.anon

import typingsSlinky.rcTable.interfaceMod.FixedType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fixed extends js.Object {
  var fixed: js.UndefOr[FixedType] = js.native
}

object Fixed {
  @scala.inline
  def apply(): Fixed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fixed]
  }
  @scala.inline
  implicit class FixedOps[Self <: Fixed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixed(value: FixedType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed")(js.undefined)
        ret
    }
  }
  
}

