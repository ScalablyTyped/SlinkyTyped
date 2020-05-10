package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestedRows extends Base {
  var bindRowsWithHeadersPlugin: BindRowsWithHeaders | Unit = js.native
  var collapsingUI: js.Object | Unit = js.native
  var dataManager: DataManager | Unit = js.native
  var headersUI: js.Object | Unit = js.native
  var sourceData: js.Object | Unit = js.native
  var trimRowsPlugin: TrimRows | Unit = js.native
}

object NestedRows {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    bindRowsWithHeadersPlugin: BindRowsWithHeaders | Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    collapsingUI: js.Object | Unit,
    dataManager: DataManager | Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    headersUI: js.Object | Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    sourceData: js.Object | Unit,
    t: RecordTranslator,
    trimRowsPlugin: TrimRows | Unit,
    updatePlugin: () => Unit
  ): NestedRows = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), bindRowsWithHeadersPlugin = bindRowsWithHeadersPlugin.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), collapsingUI = collapsingUI.asInstanceOf[js.Any], dataManager = dataManager.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], headersUI = headersUI.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), sourceData = sourceData.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], trimRowsPlugin = trimRowsPlugin.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[NestedRows]
  }
  @scala.inline
  implicit class NestedRowsOps[Self <: NestedRows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindRowsWithHeadersPlugin(value: BindRowsWithHeaders | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindRowsWithHeadersPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapsingUI(value: js.Object | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsingUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataManager(value: DataManager | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadersUI(value: js.Object | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceData(value: js.Object | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrimRowsPlugin(value: TrimRows | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimRowsPlugin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

