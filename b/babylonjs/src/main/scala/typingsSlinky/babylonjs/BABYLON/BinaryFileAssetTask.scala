package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryFileAssetTask extends AbstractAssetTask {
  
  /**
    * Gets the lodaded data (as an array buffer)
    */
  var data: js.typedarray.ArrayBuffer = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: BinaryFileAssetTask): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: String): Unit = js.native
  def onError(task: BinaryFileAssetTask, message: String, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: BinaryFileAssetTask): Unit = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
