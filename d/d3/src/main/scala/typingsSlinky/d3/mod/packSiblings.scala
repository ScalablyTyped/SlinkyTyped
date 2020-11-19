package typingsSlinky.d3.mod

import typingsSlinky.d3Hierarchy.mod.PackCircle
import typingsSlinky.d3Hierarchy.mod.PackRadius
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "packSiblings")
@js.native
object packSiblings extends js.Object {
  
  def apply[Datum /* <: PackRadius */](circles: js.Array[Datum]): js.Array[Datum with PackCircle] = js.native
}
