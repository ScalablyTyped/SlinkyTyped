package typingsSlinky.jupyterlabLogconsole.loggerMod

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.IOutput
import typingsSlinky.jupyterlabLogconsole.loggerMod.LogOutputModel.IOptions
import typingsSlinky.jupyterlabRendermime.mod.OutputModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole/lib/logger", "LogOutputModel")
@js.native
class LogOutputModel_ protected ()
  extends OutputModel
     with ILogOutputModel {
  /**
    * Construct a LogOutputModel.
    *
    * @param options - The model initialization options.
    */
  def this(options: IOptions) = this()
  /**
    * Dispose of the resources used by the output model.
    */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /**
    * Set the data associated with the model.
    *
    * #### Notes
    * Calling this function may trigger an asynchronous operation
    * that could cause the renderer to be rendered with a new model
    * containing the new data.
    */
  /* InferMemberOverrides */
  override def setData(options: ISetDataOptions): Unit = js.native
  /**
    * Serialize the model to JSON.
    */
  /* InferMemberOverrides */
  override def toJSON(): IOutput = js.native
}

