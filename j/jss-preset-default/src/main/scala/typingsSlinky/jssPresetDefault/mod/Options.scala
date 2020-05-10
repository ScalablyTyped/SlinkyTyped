package typingsSlinky.jssPresetDefault.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var defaultUnit: js.UndefOr[typingsSlinky.jssPluginDefaultUnit.mod.Options] = js.native
  var observable: js.UndefOr[typingsSlinky.jssPluginRuleValueObservable.mod.Options] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultUnit(value: typingsSlinky.jssPluginDefaultUnit.mod.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withObservable(value: typingsSlinky.jssPluginRuleValueObservable.mod.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observable")(js.undefined)
        ret
    }
  }
  
}

