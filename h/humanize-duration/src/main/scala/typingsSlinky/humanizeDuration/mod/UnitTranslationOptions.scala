package typingsSlinky.humanizeDuration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnitTranslationOptions extends js.Object {
  var d: js.UndefOr[js.Function0[String]] = js.native
  var h: js.UndefOr[js.Function0[String]] = js.native
  var m: js.UndefOr[js.Function0[String]] = js.native
  var mo: js.UndefOr[js.Function0[String]] = js.native
  var ms: js.UndefOr[js.Function0[String]] = js.native
  var s: js.UndefOr[js.Function0[String]] = js.native
  var w: js.UndefOr[js.Function0[String]] = js.native
  var y: js.UndefOr[js.Function0[String]] = js.native
}

object UnitTranslationOptions {
  @scala.inline
  def apply(): UnitTranslationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnitTranslationOptions]
  }
  @scala.inline
  implicit class UnitTranslationOptionsOps[Self <: UnitTranslationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withD(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("d")(js.undefined)
        ret
    }
    @scala.inline
    def withH(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutH: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(js.undefined)
        ret
    }
    @scala.inline
    def withM(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m")(js.undefined)
        ret
    }
    @scala.inline
    def withMo(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mo")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mo")(js.undefined)
        ret
    }
    @scala.inline
    def withMs(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ms")(js.undefined)
        ret
    }
    @scala.inline
    def withS(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(js.undefined)
        ret
    }
    @scala.inline
    def withW(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutW: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

