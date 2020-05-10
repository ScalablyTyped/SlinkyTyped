package typingsSlinky.handsontable.mod.Handsontable.plugins

import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base extends js.Object {
  var enabled: Boolean = js.native
  var hot: Core = js.native
  var initialized: Boolean = js.native
  var isPluginsReady: Boolean = js.native
  var pluginName: String = js.native
  var pluginsInitializedCallback: js.Array[_] = js.native
  var t: RecordTranslator = js.native
  def addHook(name: String, callback: js.Function1[/* repeated */ js.Any, _]): Unit = js.native
  def callOnPluginsReady(callback: js.Function0[Unit]): Unit = js.native
  def clearHooks(): Unit = js.native
  def destroy(): Unit = js.native
  def disablePlugin(): Unit = js.native
  def enablePlugin(): Unit = js.native
  def init(): Unit = js.native
  def removeHooks(name: String): Unit = js.native
  def updatePlugin(): Unit = js.native
}

object Base {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): Base = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[Base]
  }
  @scala.inline
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddHook(value: (String, js.Function1[/* repeated */ js.Any, _]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addHook")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCallOnPluginsReady(value: js.Function0[Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callOnPluginsReady")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearHooks(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearHooks")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisablePlugin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePlugin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnablePlugin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePlugin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHot(value: Core): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPluginsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPluginsReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginsInitializedCallback(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pluginsInitializedCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveHooks(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeHooks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withT(value: RecordTranslator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("t")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatePlugin(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatePlugin")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

