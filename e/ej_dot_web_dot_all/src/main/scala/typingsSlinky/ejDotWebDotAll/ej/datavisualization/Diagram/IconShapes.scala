package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconShapes extends js.Object

@JSGlobal("ej.datavisualization.Diagram.IconShapes")
@js.native
object IconShapes extends js.Object {
  //Used to set collapse icon shape as Arrow(Up/Down)
  @js.native
  sealed trait Arrow extends IconShapes
  
  //Used to set icon shape as image
  @js.native
  sealed trait Image extends IconShapes
  
  //Used to set collapse icon shape as Minus
  @js.native
  sealed trait Minus extends IconShapes
  
  //Used to set collapse icon shape as none
  @js.native
  sealed trait None extends IconShapes
  
  //Used to set collapse icon shape as path
  @js.native
  sealed trait Path extends IconShapes
  
  //Used to set collapse icon shape as Plus
  @js.native
  sealed trait Plus extends IconShapes
  
  //Used to set icon shape as template
  @js.native
  sealed trait Template extends IconShapes
  
  /* 1 */ val Arrow: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.IconShapes.Arrow with Double = js.native
  /* 6 */ val Image: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.IconShapes.Image with Double = js.native
  /* 3 */ val Minus: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.IconShapes.Minus with Double = js.native
  /* 0 */ val None: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.IconShapes.None with Double = js.native
  /* 4 */ val Path: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.IconShapes.Path with Double = js.native
  /* 2 */ val Plus: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.IconShapes.Plus with Double = js.native
  /* 5 */ val Template: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.IconShapes.Template with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconShapes with Double] = js.native
}

