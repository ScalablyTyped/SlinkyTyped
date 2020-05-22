package typingsSlinky.jupyterlabRendermime.mimemodelMod

import typingsSlinky.jupyterlabRendermime.mimemodelMod.MimeModel.IOptions
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typingsSlinky.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/rendermime/lib/mimemodel", "MimeModel")
@js.native
/**
  * Construct a new mime model.
  */
class MimeModel_ () extends IMimeModel {
  def this(options: IOptions) = this()
  var _callback: js.Any = js.native
  var _data: js.Any = js.native
  var _metadata: js.Any = js.native
  /**
    * The data associated with the model.
    */
  /* CompleteClass */
  override val data: ReadonlyJSONObject = js.native
  /**
    * The metadata associated with the model.
    *
    * Among others, it can include an attribute named `fragment`
    * that stores a URI fragment identifier for the MIME resource.
    */
  /* CompleteClass */
  override val metadata: ReadonlyJSONObject = js.native
  /**
    * Whether the data in the model is trusted.
    */
  /* CompleteClass */
  override val trusted: Boolean = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  /* CompleteClass */
  override def setData(options: ISetDataOptions): Unit = js.native
}

