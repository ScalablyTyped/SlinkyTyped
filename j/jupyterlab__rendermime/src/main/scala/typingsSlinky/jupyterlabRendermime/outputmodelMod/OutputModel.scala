package typingsSlinky.jupyterlabRendermime.outputmodelMod

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsSlinky.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
@js.native
class OutputModel protected () extends IOutputModel {
  /**
    * Construct a new output model.
    */
  def this(options: IOptions) = this()
  var _changed: js.Any = js.native
  var _data: js.Any = js.native
  var _metadata: js.Any = js.native
  var _raw: js.Any = js.native
  var _rawData: js.Any = js.native
  var _rawMetadata: js.Any = js.native
  /**
    * Update an observable JSON object using a readonly JSON object.
    */
  var _updateObservable: js.Any = js.native
}

@JSImport("@jupyterlab/rendermime/lib/outputmodel", "OutputModel")
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

