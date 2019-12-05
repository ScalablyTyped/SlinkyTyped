package typingsSlinky.atJupyterlabApplication.libLabMod

import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd
import typingsSlinky.atJupyterlabApplication.libFrontendMod.JupyterFrontEnd.IPaths
import typingsSlinky.atJupyterlabApplication.libLabMod.JupyterLab.IInfo
import typingsSlinky.atJupyterlabApplication.libLabMod.JupyterLab.IOptions
import typingsSlinky.atJupyterlabApplication.libLabMod.JupyterLab.IPluginModule
import typingsSlinky.atJupyterlabApplication.libShellMod.ILabShell
import typingsSlinky.atJupyterlabApplication.libStatusMod.LabStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/lab", "JupyterLab")
@js.native
/**
  * Construct a new JupyterLab object.
  */
class JupyterLab_ () extends JupyterFrontEnd[ILabShell] {
  def this(options: IOptions) = this()
  var _info: js.Any = js.native
  var _paths: js.Any = js.native
  /**
    * The JupyterLab application information dictionary.
    */
  val info: IInfo = js.native
  /**
    * The JupyterLab application paths dictionary.
    */
  val paths: IPaths = js.native
  /**
    * A list of all errors encountered when registering plugins.
    */
  val registerPluginErrors: js.Array[js.Error] = js.native
  /**
    * The application busy and dirty status signals and flags.
    */
  val status: LabStatus = js.native
  /**
    * Register plugins from a plugin module.
    *
    * @param mod - The plugin module to register.
    */
  def registerPluginModule(mod: IPluginModule): Unit = js.native
  /**
    * Register the plugins from multiple plugin modules.
    *
    * @param mods - The plugin modules to register.
    */
  def registerPluginModules(mods: js.Array[IPluginModule]): Unit = js.native
}

