package typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextPosition extends js.Object

@JSGlobal("ej.datavisualization.BulletGraph.TextPosition")
@js.native
object TextPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends TextPosition
  
  //string
  @js.native
  sealed trait Float extends TextPosition
  
  //string
  @js.native
  sealed trait Left extends TextPosition
  
  //string
  @js.native
  sealed trait Right extends TextPosition
  
  //string
  @js.native
  sealed trait Top extends TextPosition
  
  /* 3 */ val Bottom: typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextPosition.Bottom with Double = js.native
  /* 4 */ val Float: typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextPosition.Float with Double = js.native
  /* 2 */ val Left: typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextPosition.Left with Double = js.native
  /* 1 */ val Right: typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextPosition.Right with Double = js.native
  /* 0 */ val Top: typingsSlinky.ejDotWebDotAll.ej.datavisualization.BulletGraph.TextPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextPosition with Double] = js.native
}

