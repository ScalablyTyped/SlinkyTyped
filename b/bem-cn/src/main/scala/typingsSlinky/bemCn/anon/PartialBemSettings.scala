package typingsSlinky.bemCn.anon

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<bem-cn.bem-cn.BemSettings> */
@js.native
trait PartialBemSettings extends js.Object {
  var classMap: js.UndefOr[Record[String, String]] = js.native
  var el: js.UndefOr[String] = js.native
  var mod: js.UndefOr[String] = js.native
  var modValue: js.UndefOr[String] = js.native
  var ns: js.UndefOr[String] = js.native
}

object PartialBemSettings {
  @scala.inline
  def apply(): PartialBemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBemSettings]
  }
  @scala.inline
  implicit class PartialBemSettingsOps[Self <: PartialBemSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("el")(js.undefined)
        ret
    }
    @scala.inline
    def withMod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mod")(js.undefined)
        ret
    }
    @scala.inline
    def withModValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modValue")(js.undefined)
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

