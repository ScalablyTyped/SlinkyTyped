package typingsSlinky.handsontable.mod.Handsontable.plugins

import org.scalajs.dom.raw.Event
import typingsSlinky.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownMenu extends Base {
  var SEPARATOR: SeparatorObject = js.native
  var commandExecutor: CommandExecutor = js.native
  var eventManager: EventManager = js.native
  var itemsFactory: ItemsFactory | Unit = js.native
  var menu: Menu | Unit = js.native
  def close(): Unit = js.native
  def executeCommand(commandName: String, params: js.Any*): Unit = js.native
  def open(event: Event): Unit = js.native
}

object DropdownMenu {
  @scala.inline
  def apply(
    SEPARATOR: SeparatorObject,
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    close: () => Unit,
    commandExecutor: CommandExecutor,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    executeCommand: (String, /* repeated */ js.Any) => Unit,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    itemsFactory: ItemsFactory | Unit,
    menu: Menu | Unit,
    open: Event => Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): DropdownMenu = {
    val __obj = js.Dynamic.literal(SEPARATOR = SEPARATOR.asInstanceOf[js.Any], addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), close = js.Any.fromFunction0(close), commandExecutor = commandExecutor.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], executeCommand = js.Any.fromFunction2(executeCommand), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], itemsFactory = itemsFactory.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], open = js.Any.fromFunction1(open), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[DropdownMenu]
  }
  @scala.inline
  implicit class DropdownMenuOps[Self <: DropdownMenu] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSEPARATOR(value: SeparatorObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SEPARATOR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCommandExecutor(value: CommandExecutor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commandExecutor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventManager(value: EventManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecuteCommand(value: (String, /* repeated */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withItemsFactory(value: ItemsFactory | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemsFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: Menu | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpen(value: Event => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

