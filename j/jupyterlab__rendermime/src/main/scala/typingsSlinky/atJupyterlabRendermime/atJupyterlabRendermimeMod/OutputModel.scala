package typingsSlinky.atJupyterlabRendermime.atJupyterlabRendermimeMod

import typingsSlinky.atJupyterlabCoreutils.libNbformatMod.nbformat.IOutput
import typingsSlinky.atJupyterlabRendermime.libOutputmodelMod.IOutputModel.IOptions
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime", "OutputModel")
@js.native
class OutputModel protected ()
  extends typingsSlinky.atJupyterlabRendermime.libOutputmodelMod.OutputModel {
  /**
    * Construct a new output model.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/rendermime", "OutputModel")
@js.native
object OutputModel extends js.Object {
  /**
    * Get the data for an output.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The data for the payload.
    */
  def getData(output: IOutput): JSONObject = js.native
  /**
    * Get the metadata from an output message.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The metadata for the payload.
    */
  def getMetadata(output: IOutput): JSONObject = js.native
}

