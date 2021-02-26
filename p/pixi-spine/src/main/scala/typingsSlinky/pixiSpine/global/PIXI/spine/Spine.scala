package typingsSlinky.pixiSpine.global.PIXI.spine

import typingsSlinky.pixiSpine.PIXI.spine.core.SkeletonData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.Spine")
@js.native
class Spine protected ()
  extends typingsSlinky.pixiSpine.PIXI.spine.Spine {
  def this(spineData: SkeletonData) = this()
}
object Spine {
  
  @JSGlobal("PIXI.spine.Spine")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("PIXI.spine.Spine.clippingPolygon")
  @js.native
  def clippingPolygon: js.Array[Double] = js.native
  @scala.inline
  def clippingPolygon_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clippingPolygon")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.Spine.globalAutoUpdate")
  @js.native
  def globalAutoUpdate: Boolean = js.native
  @scala.inline
  def globalAutoUpdate_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalAutoUpdate")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("PIXI.spine.Spine.globalDelayLimit")
  @js.native
  def globalDelayLimit: Double = js.native
  @scala.inline
  def globalDelayLimit_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("globalDelayLimit")(x.asInstanceOf[js.Any])
}
