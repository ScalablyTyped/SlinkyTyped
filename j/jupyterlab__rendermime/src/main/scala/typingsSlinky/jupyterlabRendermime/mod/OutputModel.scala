package typingsSlinky.jupyterlabRendermime.mod

import typingsSlinky.jupyterlabNbformat.mod.IOutput
import typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions
import typingsSlinky.luminoCoreutils.jsonMod.PartialJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/rendermime", "OutputModel")
@js.native
class OutputModel protected ()
  extends typingsSlinky.jupyterlabRendermime.outputmodelMod.OutputModel {
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
  def getData(output: IOutput): PartialJSONObject = js.native
  
  /**
    * Get the metadata from an output message.
    *
    * @params output - A kernel output message payload.
    *
    * @returns - The metadata for the payload.
    */
  def getMetadata(output: IOutput): PartialJSONObject = js.native
}
