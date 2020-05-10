package typingsSlinky.jupyterlabRendermime.attachmentmodelMod

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IMimeBundle
import typingsSlinky.jupyterlabRendermime.attachmentmodelMod.IAttachmentModel.IOptions
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/attachmentmodel", "AttachmentModel")
@js.native
class AttachmentModel protected () extends IAttachmentModel {
  /**
    * Construct a new attachment model.
    */
  def this(options: IOptions) = this()
  var _changed: js.Any = js.native
  var _data: js.Any = js.native
  var _raw: js.Any = js.native
  var _rawData: js.Any = js.native
  /**
    * Update an observable JSON object using a readonly JSON object.
    */
  var _updateObservable: js.Any = js.native
}

@JSImport("@jupyterlab/rendermime/lib/attachmentmodel", "AttachmentModel")
@js.native
object AttachmentModel extends js.Object {
  /**
    * Get the data for an attachment.
    *
    * @params bundle - A kernel attachment MIME bundle.
    *
    * @returns - The data for the payload.
    */
  def getData(bundle: IMimeBundle): JSONObject = js.native
}

