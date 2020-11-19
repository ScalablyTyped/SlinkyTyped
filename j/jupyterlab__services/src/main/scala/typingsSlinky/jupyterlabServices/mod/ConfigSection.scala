package typingsSlinky.jupyterlabServices.mod

import typingsSlinky.jupyterlabServices.configMod.ConfigSection.IOptions
import typingsSlinky.jupyterlabServices.configMod.IConfigSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "ConfigSection")
@js.native
object ConfigSection extends js.Object {
  
  /**
    * Create a config section.
    *
    * @returns A Promise that is fulfilled with the config section is loaded.
    */
  def create(options: IOptions): js.Promise[IConfigSection] = js.native
}
