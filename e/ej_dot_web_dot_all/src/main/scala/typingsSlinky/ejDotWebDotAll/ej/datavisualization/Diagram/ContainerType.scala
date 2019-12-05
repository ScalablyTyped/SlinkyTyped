package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContainerType extends js.Object

@JSGlobal("ej.datavisualization.Diagram.ContainerType")
@js.native
object ContainerType extends js.Object {
  //Sets the container type as Canvas
  @js.native
  sealed trait Canvas extends ContainerType
  
  //Sets the container type as Stack
  @js.native
  sealed trait Stack extends ContainerType
  
  /* 0 */ val Canvas: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ContainerType.Canvas with Double = js.native
  /* 1 */ val Stack: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.ContainerType.Stack with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContainerType with Double] = js.native
}

