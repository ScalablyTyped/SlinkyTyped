package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFileAssetTask extends AbstractAssetTask {
  
  /**
    * Callback called when the task is successful
    */
  def onError(task: TextFileAssetTask): Unit = js.native
  def onError(task: TextFileAssetTask, message: js.UndefOr[scala.Nothing], exception: js.Any): Unit = js.native
  def onError(task: TextFileAssetTask, message: String): Unit = js.native
  def onError(task: TextFileAssetTask, message: String, exception: js.Any): Unit = js.native
  
  /**
    * Callback called when the task is successful
    */
  def onSuccess(task: TextFileAssetTask): Unit = js.native
  
  /**
    * Gets the loaded text string
    */
  var text: String = js.native
  
  /**
    * Defines the location of the file to load
    */
  var url: String = js.native
}
