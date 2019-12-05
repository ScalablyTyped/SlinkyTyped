package typingsSlinky.makerDotJs.MakerJs.models

import typingsSlinky.makerDotJs.MakerJs.IModel
import typingsSlinky.makerDotJs.MakerJs.IModelMap
import typingsSlinky.makerDotJs.MakerJs.IPathMap
import typingsSlinky.makerDotJs.MakerJs.IPoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MakerJs.models.Slot")
@js.native
class Slot protected () extends IModel {
  def this(origin: IPoint, endPoint: IPoint, radius: Double) = this()
  def this(origin: IPoint, endPoint: IPoint, radius: Double, isolateCaps: Boolean) = this()
  @JSName("models")
  var models_Slot: IModelMap = js.native
  @JSName("origin")
  var origin_Slot: IPoint = js.native
  @JSName("paths")
  var paths_Slot: IPathMap = js.native
}

