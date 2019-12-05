package typingsSlinky.atJupyterlabServices.atJupyterlabServicesMod

import typingsSlinky.atJupyterlabServices.libConfigMod.ConfigSection.IOptions
import typingsSlinky.atJupyterlabServices.libConfigMod.IConfigSection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

