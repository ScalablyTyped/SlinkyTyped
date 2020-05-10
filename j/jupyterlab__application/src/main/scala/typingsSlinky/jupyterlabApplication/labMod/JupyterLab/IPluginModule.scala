package typingsSlinky.jupyterlabApplication.labMod.JupyterLab

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a module that exports a plugin or plugins as
  * the default value.
  */
@js.native
trait IPluginModule extends js.Object {
  /**
    * The default export.
    */
  var default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]] = js.native
}

object IPluginModule {
  @scala.inline
  def apply(default: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]): IPluginModule = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginModule]
  }
  @scala.inline
  implicit class IPluginModuleOps[Self <: IPluginModule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: JupyterFrontEndPlugin[_] | js.Array[JupyterFrontEndPlugin[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

