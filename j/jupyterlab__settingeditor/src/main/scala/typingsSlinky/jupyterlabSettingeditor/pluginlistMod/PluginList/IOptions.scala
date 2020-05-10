package typingsSlinky.jupyterlabSettingeditor.pluginlistMod.PluginList

import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for a plugin list.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The setting registry for the plugin list.
    */
  var registry: ISettingRegistry = js.native
  /**
    * A function that allows for asynchronously confirming a selection.
    *
    * #### Notest
    * If the promise returned by the function resolves, then the selection will
    * succeed and emit an event. If the promise rejects, the selection is not
    * made.
    */
  def confirm(): js.Promise[Unit] = js.native
}

object IOptions {
  @scala.inline
  def apply(confirm: () => js.Promise[Unit], registry: ISettingRegistry): IOptions = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction0(confirm), registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfirm(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRegistry(value: ISettingRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

