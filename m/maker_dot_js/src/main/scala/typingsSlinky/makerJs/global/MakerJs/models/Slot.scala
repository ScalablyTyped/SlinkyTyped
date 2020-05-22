package typingsSlinky.makerJs.global.MakerJs.models

import typingsSlinky.makerJs.MakerJs.IModelMap
import typingsSlinky.makerJs.MakerJs.IPathMap
import typingsSlinky.makerJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Slot")
@js.native
class Slot protected ()
  extends typingsSlinky.makerJs.MakerJs.models.Slot {
  def this(origin: IPoint, endPoint: IPoint, radius: Double) = this()
  def this(origin: IPoint, endPoint: IPoint, radius: Double, isolateCaps: Boolean) = this()
  /* CompleteClass */
  @JSName("models")
  override var models_Slot: IModelMap = js.native
  /* CompleteClass */
  @JSName("origin")
  override var origin_Slot: IPoint = js.native
  /* CompleteClass */
  @JSName("paths")
  override var paths_Slot: IPathMap = js.native
}

