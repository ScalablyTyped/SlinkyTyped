package typingsSlinky.jsdom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  DISABLED  :string,   SILENT  :string,   STRICT  :string}> */
@js.native
trait ReadonlyDISABLEDstringSIL extends js.Object {
  val DISABLED: String = js.native
  val SILENT: String = js.native
  val STRICT: String = js.native
}

object ReadonlyDISABLEDstringSIL {
  @scala.inline
  def apply(DISABLED: String, SILENT: String, STRICT: String): ReadonlyDISABLEDstringSIL = {
    val __obj = js.Dynamic.literal(DISABLED = DISABLED.asInstanceOf[js.Any], SILENT = SILENT.asInstanceOf[js.Any], STRICT = STRICT.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyDISABLEDstringSIL]
  }
  @scala.inline
  implicit class ReadonlyDISABLEDstringSILOps[Self <: ReadonlyDISABLEDstringSIL] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDISABLED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DISABLED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSILENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SILENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTRICT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STRICT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

