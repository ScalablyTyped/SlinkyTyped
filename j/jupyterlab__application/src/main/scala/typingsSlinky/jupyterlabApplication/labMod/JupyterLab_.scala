package typingsSlinky.jupyterlabApplication.labMod

import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd
import typingsSlinky.jupyterlabApplication.frontendMod.JupyterFrontEnd.IPaths
import typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IInfo
import typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IOptions
import typingsSlinky.jupyterlabApplication.labMod.JupyterLab.IPluginModule
import typingsSlinky.jupyterlabApplication.shellMod.ILabShell
import typingsSlinky.jupyterlabApplication.statusMod.LabStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def info: IInfo = js.native
  
  /**
    * The JupyterLab application paths dictionary.
    */
  def paths: IPaths = js.native
  
  /**
    * A list of all errors encountered when registering plugins.
    */
  val registerPluginErrors: js.Array[js.Error] = js.native
  
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
  
  /**
    * The application busy and dirty status signals and flags.
    */
  val status: LabStatus = js.native
}
