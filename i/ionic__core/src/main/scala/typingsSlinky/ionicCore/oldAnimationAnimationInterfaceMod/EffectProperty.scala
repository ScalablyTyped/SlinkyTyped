package typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectProperty
  extends /* state */ StringDictionary[js.Any] {
  var effectName: String = js.native
  var from: js.UndefOr[EffectState] = js.native
  var to: js.UndefOr[EffectState] = js.native
  var trans: Boolean = js.native
  var wc: js.UndefOr[String] = js.native
}

object EffectProperty {
  @scala.inline
  def apply(effectName: String, trans: Boolean): EffectProperty = {
    val __obj = js.Dynamic.literal(effectName = effectName.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectProperty]
  }
  @scala.inline
  implicit class EffectPropertyOps[Self <: EffectProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffectName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrans(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: EffectState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: EffectState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
    @scala.inline
    def withWc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wc")(js.undefined)
        ret
    }
  }
  
}

