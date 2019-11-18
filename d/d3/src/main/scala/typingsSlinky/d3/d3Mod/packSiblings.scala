package typingsSlinky.d3.d3Mod

import typingsSlinky.d3DashHierarchy.d3DashHierarchyMod.PackCircle
import typingsSlinky.d3DashHierarchy.d3DashHierarchyMod.PackRadius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "packSiblings")
@js.native
object packSiblings extends js.Object {
  def apply[Datum /* <: PackRadius */](circles: js.Array[Datum]): js.Array[Datum with PackCircle] = js.native
}

