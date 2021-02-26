package typingsSlinky.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IModalStackService extends StObject {
  
  /**
    * Closes a modal instance with an optional result.
    */
  def close(modalInstance: IModalInstanceService): Unit = js.native
  def close(modalInstance: IModalInstanceService, result: js.Any): Unit = js.native
  
  /**
    * Dismisses a modal instance with an optional reason.
    */
  def dismiss(modalInstance: IModalInstanceService): Unit = js.native
  def dismiss(modalInstance: IModalInstanceService, reason: js.Any): Unit = js.native
  
  /**
    * Dismiss all open modal instances with an optional reason that will be passed to each instance.
    */
  def dismissAll(): Unit = js.native
  def dismissAll(reason: js.Any): Unit = js.native
  
  /**
    * Gets the topmost modal instance that is open.
    */
  def getTop(): IModalStackedMapKeyValuePair = js.native
  
  /**
    * Opens a new modal instance.
    */
  def open(modalInstance: IModalInstanceService, modal: js.Any): Unit = js.native
}
