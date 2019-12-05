package typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Orientation extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.Orientation")
@js.native
object Orientation extends js.Object {
  //string
  @js.native
  sealed trait Horizontal
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation
  
  //string
  @js.native
  sealed trait Vertical
    extends typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation
  
  /* 0 */ val Horizontal: typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation.Horizontal with Double = js.native
  /* 1 */ val Vertical: typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation.Vertical with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.Orientation with Double
  ] = js.native
}

