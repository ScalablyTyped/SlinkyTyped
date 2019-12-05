package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SnapConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.SnapConstraints")
@js.native
object SnapConstraints extends js.Object {
  //Enable all the constraints
  @js.native
  sealed trait All extends SnapConstraints
  
  //Enables node to be snapped to horizontal gridlines
  @js.native
  sealed trait None extends SnapConstraints
  
  //Enable horizontal lines
  @js.native
  sealed trait ShowHorizontalLines extends SnapConstraints
  
  //Enable both horizontal and vertical lines
  @js.native
  sealed trait ShowLines extends SnapConstraints
  
  //Enable vertical lines
  @js.native
  sealed trait ShowVerticalLines extends SnapConstraints
  
  //Enables node to be snapped to vertical gridlines
  @js.native
  sealed trait SnapToHorizontalLines extends SnapConstraints
  
  //Enables node to be snapped to gridlines
  @js.native
  sealed trait SnapToLines extends SnapConstraints
  
  //Enables node to be snapped to horizontal gridlines
  @js.native
  sealed trait SnapToVerticalLines extends SnapConstraints
  
  /* 7 */ val All: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.SnapConstraints.All with Double = js.native
  /* 0 */ val None: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.SnapConstraints.None with Double = js.native
  /* 4 */ val ShowHorizontalLines: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.SnapConstraints.ShowHorizontalLines with Double = js.native
  /* 6 */ val ShowLines: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.SnapConstraints.ShowLines with Double = js.native
  /* 5 */ val ShowVerticalLines: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.SnapConstraints.ShowVerticalLines with Double = js.native
  /* 1 */ val SnapToHorizontalLines: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.SnapConstraints.SnapToHorizontalLines with Double = js.native
  /* 3 */ val SnapToLines: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.SnapConstraints.SnapToLines with Double = js.native
  /* 2 */ val SnapToVerticalLines: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.SnapConstraints.SnapToVerticalLines with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SnapConstraints with Double] = js.native
}

