package typingsSlinky.babylonjs.miscIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Misc/index", "AssetsProgressEvent")
@js.native
class AssetsProgressEvent protected ()
  extends typingsSlinky.babylonjs.assetsManagerMod.AssetsProgressEvent {
  /**
    * Creates a AssetsProgressEvent
    * @param remainingCount defines the number of remaining tasks to process
    * @param totalCount defines the total number of tasks
    * @param task defines the task that was just processed
    */
  def this(
    remainingCount: Double,
    totalCount: Double,
    task: typingsSlinky.babylonjs.assetsManagerMod.AbstractAssetTask
  ) = this()
}
