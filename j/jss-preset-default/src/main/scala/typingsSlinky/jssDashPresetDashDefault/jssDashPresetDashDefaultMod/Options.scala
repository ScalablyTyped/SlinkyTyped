package typingsSlinky.jssDashPresetDashDefault.jssDashPresetDashDefaultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var defaultUnit: js.UndefOr[
    typingsSlinky.jssDashPluginDashDefaultDashUnit.jssDashPluginDashDefaultDashUnitMod.Options
  ] = js.undefined
  var observable: js.UndefOr[
    typingsSlinky.jssDashPluginDashRuleDashValueDashObservable.jssDashPluginDashRuleDashValueDashObservableMod.Options
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    defaultUnit: typingsSlinky.jssDashPluginDashDefaultDashUnit.jssDashPluginDashDefaultDashUnitMod.Options = null,
    observable: typingsSlinky.jssDashPluginDashRuleDashValueDashObservable.jssDashPluginDashRuleDashValueDashObservableMod.Options = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (defaultUnit != null) __obj.updateDynamic("defaultUnit")(defaultUnit.asInstanceOf[js.Any])
    if (observable != null) __obj.updateDynamic("observable")(observable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

