package typingsSlinky.hammerjs

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HammerDefaults extends HammerOptions {
  @JSName("cssProps")
  var cssProps_HammerDefaults: CssProps = js.native
  @JSName("domEvents")
  var domEvents_HammerDefaults: Boolean = js.native
  @JSName("enable")
  var enable_HammerDefaults: Boolean = js.native
  @JSName("inputClass")
  var inputClass_HammerDefaults: HammerInput = js.native
  @JSName("inputTarget")
  var inputTarget_HammerDefaults: EventTarget = js.native
  @JSName("preset")
  var preset_HammerDefaults: js.Array[RecognizerTuple] = js.native
  @JSName("touchAction")
  var touchAction_HammerDefaults: String = js.native
}

object HammerDefaults {
  @scala.inline
  def apply(
    cssProps: CssProps,
    domEvents: Boolean,
    enable: Boolean,
    inputClass: HammerInput,
    inputTarget: EventTarget,
    preset: js.Array[RecognizerTuple],
    touchAction: String
  ): HammerDefaults = {
    val __obj = js.Dynamic.literal(cssProps = cssProps.asInstanceOf[js.Any], domEvents = domEvents.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], inputClass = inputClass.asInstanceOf[js.Any], inputTarget = inputTarget.asInstanceOf[js.Any], preset = preset.asInstanceOf[js.Any], touchAction = touchAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[HammerDefaults]
  }
  @scala.inline
  implicit class HammerDefaultsOps[Self <: HammerDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCssProps(value: CssProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomEvents(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputClass(value: HammerInput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInputTarget(value: EventTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreset(value: js.Array[RecognizerTuple]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTouchAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touchAction")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

