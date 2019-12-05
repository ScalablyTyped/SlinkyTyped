package typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NodeConstraints extends js.Object

@JSGlobal("ej.datavisualization.Diagram.NodeConstraints")
@js.native
object NodeConstraints extends js.Object {
  //Enables panning should be done while node dragging
  @js.native
  sealed trait AllowPan extends NodeConstraints
  
  //Enables Proportional resize for node
  @js.native
  sealed trait AspectRatio extends NodeConstraints
  
  //Enables node to be connected
  @js.native
  sealed trait Connect extends NodeConstraints
  
  //Enables contrast between clean edges for the node over rendering speed and geometric precision
  @js.native
  sealed trait CrispEdges extends NodeConstraints
  
  //Enables default node interactions such as select,delete,drag,rotate,resize,connect,inheritCrispEdges and inheritTooltip
  @js.native
  sealed trait Default extends NodeConstraints
  
  //Enables node to be Deleted
  @js.native
  sealed trait Delete extends NodeConstraints
  
  //Enables node to be Dragged
  @js.native
  sealed trait Drag extends NodeConstraints
  
  //Enables label of node to be Dragged
  @js.native
  sealed trait DragLabel extends NodeConstraints
  
  //Disable all node Constraints
  @js.native
  sealed trait None extends NodeConstraints
  
  //Enables the user interaction with the node
  @js.native
  sealed trait PointerEvents extends NodeConstraints
  
  //Enables node to be Resized
  @js.native
  sealed trait Resize extends NodeConstraints
  
  //Enables node to be resize east
  @js.native
  sealed trait ResizeEast extends NodeConstraints
  
  //Enables node to be resize north
  @js.native
  sealed trait ResizeNorth extends NodeConstraints
  
  //Enables node to be resize north east
  @js.native
  sealed trait ResizeNorthEast extends NodeConstraints
  
  //Enables node to be resize north west
  @js.native
  sealed trait ResizeNorthWest extends NodeConstraints
  
  //Enables node to be resize south
  @js.native
  sealed trait ResizeSouth extends NodeConstraints
  
  //Enables node to be resize south east
  @js.native
  sealed trait ResizeSouthEast extends NodeConstraints
  
  //Enables node to be resize south west
  @js.native
  sealed trait ResizeSouthWest extends NodeConstraints
  
  //Enables node to be resize west
  @js.native
  sealed trait ResizeWest extends NodeConstraints
  
  //Enables node to be Rotated
  @js.native
  sealed trait Rotate extends NodeConstraints
  
  //Enables node to be selected
  @js.native
  sealed trait Select extends NodeConstraints
  
  //Enables shadow
  @js.native
  sealed trait Shadow extends NodeConstraints
  
  /* 17 */ val AllowPan: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.AllowPan with Double = js.native
  /* 18 */ val AspectRatio: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.AspectRatio with Double = js.native
  /* 5 */ val Connect: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.Connect with Double = js.native
  /* 20 */ val CrispEdges: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.CrispEdges with Double = js.native
  /* 21 */ val Default: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.Default with Double = js.native
  /* 2 */ val Delete: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.Delete with Double = js.native
  /* 3 */ val Drag: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.Drag with Double = js.native
  /* 16 */ val DragLabel: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.DragLabel with Double = js.native
  /* 0 */ val None: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.None with Double = js.native
  /* 19 */ val PointerEvents: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.PointerEvents with Double = js.native
  /* 14 */ val Resize: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.Resize with Double = js.native
  /* 7 */ val ResizeEast: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.ResizeEast with Double = js.native
  /* 13 */ val ResizeNorth: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.ResizeNorth with Double = js.native
  /* 6 */ val ResizeNorthEast: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.ResizeNorthEast with Double = js.native
  /* 12 */ val ResizeNorthWest: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.ResizeNorthWest with Double = js.native
  /* 9 */ val ResizeSouth: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.ResizeSouth with Double = js.native
  /* 8 */ val ResizeSouthEast: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.ResizeSouthEast with Double = js.native
  /* 10 */ val ResizeSouthWest: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.ResizeSouthWest with Double = js.native
  /* 11 */ val ResizeWest: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.ResizeWest with Double = js.native
  /* 4 */ val Rotate: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.Rotate with Double = js.native
  /* 1 */ val Select: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.Select with Double = js.native
  /* 15 */ val Shadow: typingsSlinky.ejDotWebDotAll.ej.datavisualization.Diagram.NodeConstraints.Shadow with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NodeConstraints with Double] = js.native
}

