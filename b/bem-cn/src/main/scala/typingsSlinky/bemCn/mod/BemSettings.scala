package typingsSlinky.bemCn.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BemSettings extends js.Object {
  var classMap: js.UndefOr[Record[String, String]] = js.native
  var el: String = js.native
  var mod: String = js.native
  var modValue: String = js.native
  var ns: js.UndefOr[String] = js.native
}

object BemSettings {
  @scala.inline
  def apply(el: String, mod: String, modValue: String): BemSettings = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], modValue = modValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[BemSettings]
  }
  @scala.inline
  implicit class BemSettingsOps[Self <: BemSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassMap(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classMap")(js.undefined)
        ret
    }
    @scala.inline
    def withNs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ns")(js.undefined)
        ret
    }
  }
  
}

