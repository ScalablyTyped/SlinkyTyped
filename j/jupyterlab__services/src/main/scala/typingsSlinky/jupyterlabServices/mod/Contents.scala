package typingsSlinky.jupyterlabServices.mod

import typingsSlinky.jupyterlabServices.contentsMod.Contents.ICheckpointModel
import typingsSlinky.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services", "Contents")
@js.native
object Contents extends js.Object {
  
  /**
    * Validates an ICheckpointModel, thowing an error if it does not pass.
    */
  def validateCheckpointModel(checkpoint: ICheckpointModel): Unit = js.native
  
  /**
    * Validates an IModel, thowing an error if it does not pass.
    */
  def validateContentsModel(contents: IModel): Unit = js.native
}
