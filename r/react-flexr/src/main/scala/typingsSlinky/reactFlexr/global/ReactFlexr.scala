package typingsSlinky.reactFlexr.global

import typingsSlinky.react.mod.Component
import typingsSlinky.reactFlexr.ReactFlexr.CellProps
import typingsSlinky.reactFlexr.ReactFlexr.ErgonomicType
import typingsSlinky.reactFlexr.ReactFlexr.GridProps
import typingsSlinky.reactFlexr.ReactFlexr.OptimizedResize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__ReactFlexr")
@js.native
object ReactFlexr extends js.Object {
  @js.native
  class Cell ()
    extends Component[CellProps, js.Object, js.Any]
  
  @js.native
  class Grid ()
    extends Component[GridProps, js.Object, js.Any]
  
  val desk: String = js.native
  val lap: String = js.native
  val optimizedResize: OptimizedResize = js.native
  val palm: String = js.native
  val portable: String = js.native
  def findBreakpoints(): js.Array[ErgonomicType] | Boolean = js.native
  def findMatch(arguments: ErgonomicType*): Boolean = js.native
  def getCurrentBreakpoints(): js.Array[ErgonomicType] = js.native
  def setBreakpoints(breakpoints: js.Array[ErgonomicType]): Unit = js.native
}

