package typingsSlinky.ejWebAll.ej.datavisualization

import typingsSlinky.ejWebAll.ej.Model
import typingsSlinky.ejWebAll.ej.Widget_
import typingsSlinky.ejWebAll.ej.datavisualization.Diagram.ExportImageSettings
import typingsSlinky.ejWebAll.ej.datavisualization.Diagram.FitMode
import typingsSlinky.ejWebAll.ej.datavisualization.Diagram.Options
import typingsSlinky.ejWebAll.ej.datavisualization.Diagram.PrintImageSettings
import typingsSlinky.ejWebAll.ej.datavisualization.Diagram.PrintSettings
import typingsSlinky.ejWebAll.ej.datavisualization.Diagram.Region
import typingsSlinky.ejWebAll.ej.datavisualization.Diagram.Zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Diagram extends Widget_ {
  
  /** Add nodes and connectors to diagram at runtime
    * @param {any} a JSON to define a node/connector or an array of nodes and connector
    * @returns {boolean}
    */
  def add(node: js.Any): Boolean = js.native
  
  /** Add a label to a node at runtime
    * @param {string} name of the node to which label will be added
    * @param {any} JSON for the new label to be added
    * @returns {void}
    */
  def addLabel(nodeName: String, newLabel: js.Any): Unit = js.native
  
  /** Add dynamic Lanes to swimlane at runtime
    * @param {any} JSON for the new lane to be added
    * @param {number} Index value to add the lane in swimlane
    * @returns {void}
    */
  def addLane(lane: js.Any, index: Double): Unit = js.native
  
  /** Add a collection of layers can be added to the existing diagram layer at runtime.
    * @param {any[]} a collection of layers to be added to the existing diagram layers.
    * @returns {void}
    */
  def addLayers(layers: js.Array[_]): Unit = js.native
  
  /** Add a collection of diagram elements can be added to the specific diagram layer.
    * @param {string} specifies the name of the layer to the nodes will be added.
    * @param {any[]} collection of diagram elements to be added to the specific layer.
    * @returns {void}
    */
  def addNodeToLayer(layerName: String, nodes: js.Array[_]): Unit = js.native
  
  /** Add a phase to a swimlane at runtime
    * @param {string} name of the swimlane to which the phase will be added
    * @param {any} JSON object to define the phase to be added
    * @returns {void}
    */
  def addPhase(name: String, options: js.Any): Unit = js.native
  
  /** Add a collection of ports to the node specified by name
    * @param {string} name of the node to which the ports have to be added
    * @param {any[]} a collection of ports to be added to the specified node
    * @returns {void}
    */
  def addPorts(name: String, ports: js.Array[_]): Unit = js.native
  
  /** Add the specified node to selection list
    * @param {any} the node to be selected
    * @param {boolean} to define whether to clear the existing selection or not
    * @returns {void}
    */
  def addSelection(node: js.Any): Unit = js.native
  def addSelection(node: js.Any, clearSelection: Boolean): Unit = js.native
  
  /** Align the selected objects based on the reference object and direction
    * @param {string} to specify the direction towards which the selected objects are to be aligned("left","right",top","bottom")
    * @returns {void}
    */
  def align(direction: String): Unit = js.native
  
  /** Bring the specified portion of the diagram content to the diagram viewport
    * @param {any} the rectangular region that is to be brought into diagram viewport
    * @returns {void}
    */
  def bringIntoView(rect: js.Any): Unit = js.native
  
  /** Bring the specified portion of the diagram content to the center of the diagram viewport
    * @param {any} the rectangular region that is to be brought to the center of diagram viewport
    * @returns {void}
    */
  def bringToCenter(rect: js.Any): Unit = js.native
  
  /** Visually move the selected object over all other intersected objects
    * @returns {void}
    */
  def bringToFront(): Unit = js.native
  
  /** Remove all the elements from diagram
    * @returns {void}
    */
  def clear(): Unit = js.native
  
  /** Clears the actions which is recorded to perform undo/redo operation in the diagram.
    * @returns {void}
    */
  def clearHistory(): Unit = js.native
  
  /** Remove the current selection in diagram
    * @returns {void}
    */
  def clearSelection(): Unit = js.native
  
  /** Copy the selected object to internal clipboard and get the copied object
    * @returns {any}
    */
  def copy(): js.Any = js.native
  
  /** Cut the selected object from diagram to diagram internal clipboard
    * @returns {void}
    */
  def cut(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Export the diagram as downloadable files or as data
    * @param {Diagram.Options} options to export the desired region of diagram to the desired formats.
    * @returns {string}
    */
  def exportDiagram(): String = js.native
  def exportDiagram(options: Options): String = js.native
  
  /** The exportImage method is used to export the image passed through argument with different image format and exporting options as like exportDiagram method.
    * @param {string} pass the base64String image to be exported.
    * @param {Diagram.ExportImageSettings} options to export the desired region of diagram to the desired formats.
    * @returns {string}
    */
  def exportImage(image: String): String = js.native
  def exportImage(image: String, exportImageSettings: ExportImageSettings): String = js.native
  
  /** Read a node/connector object by its name
    * @param {string} name of the node/connector that is to be identified
    * @returns {any}
    */
  def findNode(name: String): js.Any = js.native
  
  /** Fit the diagram content into diagram viewport
    * @param {ej.datavisualization.Diagram.FitMode} to set the mode of fit to command.
    * @param {ej.datavisualization.Diagram.Region} to set whether the region to be fit will be based on diagram elements or page settings.
    * @param {any} to set the required margin
    * @returns {void}
    */
  def fitToPage(): Unit = js.native
  def fitToPage(mode: js.UndefOr[scala.Nothing], region: js.UndefOr[scala.Nothing], margin: js.Any): Unit = js.native
  def fitToPage(mode: js.UndefOr[scala.Nothing], region: Region): Unit = js.native
  def fitToPage(mode: js.UndefOr[scala.Nothing], region: Region, margin: js.Any): Unit = js.native
  def fitToPage(mode: FitMode): Unit = js.native
  def fitToPage(mode: FitMode, region: js.UndefOr[scala.Nothing], margin: js.Any): Unit = js.native
  def fitToPage(mode: FitMode, region: Region): Unit = js.native
  def fitToPage(mode: FitMode, region: Region, margin: js.Any): Unit = js.native
  
  /** Get the bounds of the diagram.
    * @returns {void}
    */
  def getDiagramBounds(): Unit = js.native
  
  /** Get the diagram DOM element as a string along with dependent stylesheets.
    * @param {any[]} If its specified, will get the diagram DOM element along with specified stylesheet references. Please note that you have to define absolute path for local CSS file.
    * If not specified, will get the diagram content along with all stylesheets loaded in the document.
    * @returns {void}
    */
  def getDiagramContent(): Unit = js.native
  def getDiagramContent(styleSheets: js.Array[_]): Unit = js.native
  
  /** Group the selected nodes and connectors
    * @returns {void}
    */
  def group(): Unit = js.native
  
  /** Insert a label into a node's label collection at runtime
    * @param {string} name of the node to which the label has to be inserted
    * @param {any} JSON to define the new label
    * @param {number} index to insert the label into the node
    * @returns {void}
    */
  def insertLabel(name: String, label: js.Any): Unit = js.native
  def insertLabel(name: String, label: js.Any, index: Double): Unit = js.native
  
  /** Refresh the diagram with the specified layout
    * @returns {void}
    */
  def layout(): Unit = js.native
  
  /** Load the diagram
    * @param {any} JSON data to load the diagram
    * @returns {void}
    */
  def load(data: js.Any): Unit = js.native
  
  @JSName("model")
  var model_Diagram: Model = js.native
  
  /** Visually move the selected object over its closest intersected object
    * @returns {void}
    */
  def moveForward(): Unit = js.native
  
  /** Move the selected objects by either one pixel or by the pixels specified through argument
    * @param {string} specifies the direction to move the selected objects ("left","right",top","bottom")
    * @param {number} specifies the number of pixels by which the selected objects have to be moved
    * @returns {void}
    */
  def nudge(direction: String): Unit = js.native
  def nudge(direction: String, delta: Double): Unit = js.native
  
  /** Paste the selected object from internal clipboard to diagram
    * @param {any} object to be added to diagram
    * @param {boolean} to define whether the specified object is to be renamed or not
    * @returns {void}
    */
  def paste(): Unit = js.native
  def paste(`object`: js.UndefOr[scala.Nothing], rename: Boolean): Unit = js.native
  def paste(`object`: js.Any): Unit = js.native
  def paste(`object`: js.Any, rename: Boolean): Unit = js.native
  
  /** Print the diagram as image
    * @param {Diagram.PrintSettings} options to print the desired region of diagram and print the diagram in multiple pages.
    * @returns {void}
    */
  def print(): Unit = js.native
  def print(printSettings: PrintSettings): Unit = js.native
  
  /** The printImage method is used to print the image passed through argument with desired region and multiple pages as like print method.
    * @param {string} pass the base64String image to be printed.
    * @param {Diagram.PrintImageSettings} options to export the desired region of diagram to the desired formats.
    * @returns {string}
    */
  def printImage(image: String): String = js.native
  def printImage(image: String, printImageSettings: PrintImageSettings): String = js.native
  
  /** Restore the last action that was reverted
    * @returns {void}
    */
  def redo(): Unit = js.native
  
  /** Refresh the diagram at runtime
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Remove either the given node/connector or the selected element from diagram
    * @param {any} the node/connector to be removed from diagram
    * @returns {void}
    */
  def remove(): Unit = js.native
  def remove(node: js.Any): Unit = js.native
  
  /** Add a collection of ports to the node specified by name
    * @param {string} name of the node to which the ports have to be added
    * @param {any[]} a collection of labels to be deleted from the specified node
    * @returns {void}
    */
  def removeLabels(name: String, labels: js.Array[_]): Unit = js.native
  
  /** Remove the collection of layers from the diagram layers.
    * @param {any[]} collection of layers to be removed from diagram layer.
    * @returns {void}
    */
  def removeLayers(layers: js.Array[_]): Unit = js.native
  
  /** Remove the collection of nodes from the specific layer.
    * @param {string} Specifies the layer name to the node will be removed.
    * @param {any[]} collection of diagram elements name to be removed from specific layer.
    * @returns {void}
    */
  def removeNodeToLayer(layerName: String, nodes: js.Array[_]): Unit = js.native
  
  /** Remove the collection of ports from the specified node.
    * @param {string} name of the node to which the ports have to be added
    * @param {any[]} a collection of ports to be deleted from the specified node
    * @returns {void}
    */
  def removePorts(name: String, ports: js.Array[_]): Unit = js.native
  
  /** Remove a particular object from selection list
    * @param {any} the node/connector to be removed from selection list
    * @returns {void}
    */
  def removeSelection(node: js.Any): Unit = js.native
  
  /** Scale the selected objects to the height of the first selected object
    * @returns {void}
    */
  def sameHeight(): Unit = js.native
  
  /** Scale the selected objects to the size of the first selected object
    * @returns {void}
    */
  def sameSize(): Unit = js.native
  
  /** Scale the selected objects to the width of the first selected object
    * @returns {void}
    */
  def sameWidth(): Unit = js.native
  
  /** Returns the diagram as serialized JSON
    * @returns {any}
    */
  def save(): js.Any = js.native
  
  /** Bring the node into view
    * @param {any} the node/connector to be brought into view
    * @returns {void}
    */
  def scrollToNode(node: js.Any): Unit = js.native
  
  /** Select all nodes and connector in diagram
    * @returns {void}
    */
  def selectAll(): Unit = js.native
  
  /** Visually move the selected object behind its closest intersected object
    * @returns {void}
    */
  def sendBackward(): Unit = js.native
  
  /** Visually move the selected object behind all other intersected objects
    * @returns {void}
    */
  def sendToBack(): Unit = js.native
  
  /** Update the horizontal space between the selected objects as equal and within the selection boundary
    * @returns {void}
    */
  def spaceAcross(): Unit = js.native
  
  /** Update the vertical space between the selected objects as equal and within the selection boundary
    * @returns {void}
    */
  def spaceDown(): Unit = js.native
  
  /** Move the specified label to edit mode
    * @param {any} node/connector that contains the label to be edited
    * @param {any} to be edited
    * @returns {void}
    */
  def startLabelEdit(node: js.Any, label: js.Any): Unit = js.native
  
  /** Reverse the last action that was performed
    * @returns {void}
    */
  def undo(): Unit = js.native
  
  /** Ungroup the selected group
    * @returns {void}
    */
  def ungroup(): Unit = js.native
  
  /** Update diagram at runtime
    * @param {any} JSON to specify the diagram properties that have to be modified
    * @returns {void}
    */
  def update(options: js.Any): Unit = js.native
  
  /** Update Connectors at runtime
    * @param {string} name of the connector to be updated
    * @param {any} JSON to specify the connector properties that have to be updated
    * @returns {void}
    */
  def updateConnector(name: String, options: js.Any): Unit = js.native
  
  /** Update the given label at runtime
    * @param {string} the name of node/connector which contains the label to be updated
    * @param {any} the label to be modified
    * @param {any} JSON to specify the label properties that have to be updated
    * @returns {any}
    */
  def updateLabel(nodeName: String, label: js.Any, options: js.Any): js.Any = js.native
  
  /** Update the given layer at run time.
    * @param {string} the name of layer to be updated
    * @param {any} the layer object to be modified
    * @returns {void}
    */
  def updateLayer(layerName: String, options: js.Any): Unit = js.native
  
  /** Update nodes at runtime
    * @param {string} name of the node that is to be updated
    * @param {any} JSON to specify the properties of node that have to be updated
    * @returns {void}
    */
  def updateNode(name: String, options: js.Any): Unit = js.native
  
  /** Update a port with its modified properties at runtime
    * @param {string} the name of node which contains the port to be updated
    * @param {any} the port to be updated
    * @param {any} JSON to specify the properties of the port that have to be updated
    * @returns {void}
    */
  def updatePort(nodeName: String, port: js.Any, options: js.Any): Unit = js.native
  
  /** Update the specified node as selected object
    * @param {string} name of the node to be updated as selected object
    * @returns {void}
    */
  def updateSelectedObject(name: String): Unit = js.native
  
  /** Update the selection at runtime
    * @param {boolean} to specify whether to show the user handles or not
    * @returns {void}
    */
  def updateSelection(): Unit = js.native
  def updateSelection(showUserHandles: Boolean): Unit = js.native
  
  /** Update user handles with respect to the given node
    * @param {any} node/connector with respect to which, the user handles have to be updated
    * @returns {void}
    */
  def updateUserHandles(node: js.Any): Unit = js.native
  
  /** Update the diagram viewport at runtime
    * @returns {void}
    */
  def updateViewPort(): Unit = js.native
  
  /** Upgrade the diagram from old version
    * @param {any} to be upgraded
    * @returns {void}
    */
  def upgrade(data: js.Any): Unit = js.native
  
  /** Used to zoomIn/zoomOut diagram
    * @param {Diagram.Zoom} options to zoom the diagram(zoom factor, zoomIn/zoomOut)
    * @returns {void}
    */
  def zoomTo(): Unit = js.native
  def zoomTo(Zoom: Zoom): Unit = js.native
}
object Diagram {
  
  @js.native
  sealed trait ActiveTool extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ActiveTool")
  @js.native
  object ActiveTool extends StObject {
    
    //Activate the port tool to drag when the mouse is moved over the port
    @js.native
    sealed trait Drag extends ActiveTool
    
    //Activate the draw tool to draw when the mouse is moved over the port
    @js.native
    sealed trait Draw extends ActiveTool
    
    //Set the default Tool
    @js.native
    sealed trait None extends ActiveTool
  }
  
  @js.native
  sealed trait Alignment extends StObject
  @JSGlobal("ej.datavisualization.Diagram.Alignment")
  @js.native
  object Alignment extends StObject {
    
    //Used to align the label either bottom or right(after) of the connector segment
    @js.native
    sealed trait After extends Alignment
    
    //Used to align the label either top or left(before) of the connector segment
    @js.native
    sealed trait Before extends Alignment
    
    //Used to align the label at center of the connector segment
    @js.native
    sealed trait Center extends Alignment
  }
  
  @js.native
  sealed trait AssociationFlows extends StObject
  @JSGlobal("ej.datavisualization.Diagram.AssociationFlows")
  @js.native
  object AssociationFlows extends StObject {
    
    //User to notate bi-directional association in a BPMN Process
    @js.native
    sealed trait BiDirectional extends AssociationFlows
    
    //Used to notate default association in a BPMN Process
    @js.native
    sealed trait Default extends AssociationFlows
    
    //Used to notate directional association in a BPMN Process
    @js.native
    sealed trait Directional extends AssociationFlows
  }
  
  @js.native
  sealed trait BPMNActivity extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNActivity")
  @js.native
  object BPMNActivity extends StObject {
    
    //Used to set BPMN Activity as None
    @js.native
    sealed trait None extends BPMNActivity
    
    //Used to set BPMN Activity as SubProcess
    @js.native
    sealed trait SubProcess extends BPMNActivity
    
    //Used to set BPMN Activity as Task
    @js.native
    sealed trait Task extends BPMNActivity
  }
  
  @js.native
  sealed trait BPMNAnnotationDirection extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNAnnotationDirection")
  @js.native
  object BPMNAnnotationDirection extends StObject {
    
    //Used to set the direction of BPMN Annotation as bottom
    @js.native
    sealed trait Bottom extends BPMNAnnotationDirection
    
    //Used to set the direction of BPMN Annotation as left
    @js.native
    sealed trait Left extends BPMNAnnotationDirection
    
    //Used to set the direction of BPMN Annotation as right
    @js.native
    sealed trait Right extends BPMNAnnotationDirection
    
    //Used to set the direction of BPMN Annotation as top
    @js.native
    sealed trait Top extends BPMNAnnotationDirection
  }
  
  @js.native
  sealed trait BPMNBoundary extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNBoundary")
  @js.native
  object BPMNBoundary extends StObject {
    
    //Used to set BPMN SubProcess's Boundary as Call
    @js.native
    sealed trait Call extends BPMNBoundary
    
    //Used to set BPMN SubProcess's Boundary as Default
    @js.native
    sealed trait Default extends BPMNBoundary
    
    //Used to set BPMN SubProcess's Boundary as Event
    @js.native
    sealed trait Event extends BPMNBoundary
  }
  
  @js.native
  sealed trait BPMNDataObjects extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNDataObjects")
  @js.native
  object BPMNDataObjects extends StObject {
    
    //Used to notate the Input type BPMN data object
    @js.native
    sealed trait Input extends BPMNDataObjects
    
    //Used to set BPMN data object type as None
    @js.native
    sealed trait None extends BPMNDataObjects
    
    //Used to notate the Output type BPMN data object
    @js.native
    sealed trait Output extends BPMNDataObjects
  }
  
  @js.native
  sealed trait BPMNEvents extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNEvents")
  @js.native
  object BPMNEvents extends StObject {
    
    //Used to set BPMN Event as End
    @js.native
    sealed trait End extends BPMNEvents
    
    //Used to set BPMN Event as Intermediate
    @js.native
    sealed trait Intermediate extends BPMNEvents
    
    //Used to set BPMN Event as NonInterruptingIntermediate
    @js.native
    sealed trait NonInterruptingIntermediate extends BPMNEvents
    
    //Used to set BPMN Event as NonInterruptingStart
    @js.native
    sealed trait NonInterruptingStart extends BPMNEvents
    
    //Used to set BPMN Event as Start
    @js.native
    sealed trait Start extends BPMNEvents
    
    //Used to set BPMN Event as ThrowingIntermediate
    @js.native
    sealed trait ThrowingIntermediate extends BPMNEvents
  }
  
  @js.native
  sealed trait BPMNFlows extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNFlows")
  @js.native
  object BPMNFlows extends StObject {
    
    //Used to specify the Association flow in a BPMN Process
    @js.native
    sealed trait Association extends BPMNFlows
    
    //Used to specify the Message flow in a BPMN Process
    @js.native
    sealed trait Message extends BPMNFlows
    
    //Used to specify the Sequence flow in a BPMN Process
    @js.native
    sealed trait Sequence extends BPMNFlows
  }
  
  @js.native
  sealed trait BPMNGateways extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNGateways")
  @js.native
  object BPMNGateways extends StObject {
    
    //Used to set BPMN Gateway as Complex
    @js.native
    sealed trait Complex extends BPMNGateways
    
    //Used to set BPMN Gateway as EventBased
    @js.native
    sealed trait EventBased extends BPMNGateways
    
    //Used to set BPMN Gateway as Exclusive
    @js.native
    sealed trait Exclusive extends BPMNGateways
    
    //Used to set BPMN Gateway as ExclusiveEventBased
    @js.native
    sealed trait ExclusiveEventBased extends BPMNGateways
    
    //Used to set BPMN Gateway as Inclusive
    @js.native
    sealed trait Inclusive extends BPMNGateways
    
    //Used to set BPMN Gateway as None
    @js.native
    sealed trait None extends BPMNGateways
    
    //Used to set BPMN Gateway as Parallel
    @js.native
    sealed trait Parallel extends BPMNGateways
    
    //Used to set BPMN Gateway as ParallelEventBased
    @js.native
    sealed trait ParallelEventBased extends BPMNGateways
  }
  
  @js.native
  sealed trait BPMNLoops extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNLoops")
  @js.native
  object BPMNLoops extends StObject {
    
    //Used to set BPMN Activity's Loop as None
    @js.native
    sealed trait None extends BPMNLoops
    
    //Used to set BPMN Activity's Loop as ParallelMultiInstance
    @js.native
    sealed trait ParallelMultiInstance extends BPMNLoops
    
    //Used to set BPMN Activity's Loop as SequenceMultiInstance
    @js.native
    sealed trait SequenceMultiInstance extends BPMNLoops
    
    //Used to set BPMN Activity's Loop as Standard
    @js.native
    sealed trait Standard extends BPMNLoops
  }
  
  @js.native
  sealed trait BPMNMessageFlows extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNMessageFlows")
  @js.native
  object BPMNMessageFlows extends StObject {
    
    //Used to notate the default message flow in a BPMN Process
    @js.native
    sealed trait Default extends BPMNMessageFlows
    
    //Used to notate the instantiating message flow in a BPMN Process
    @js.native
    sealed trait InitiatingMessage extends BPMNMessageFlows
    
    //Used to notate the non-instantiating message flow in a BPMN Process
    @js.native
    sealed trait NonInitiatingMessage extends BPMNMessageFlows
  }
  
  @js.native
  sealed trait BPMNSequenceFlows extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNSequenceFlows")
  @js.native
  object BPMNSequenceFlows extends StObject {
    
    //Used to notate the conditional sequence flow in a BPMN Process
    @js.native
    sealed trait Conditional extends BPMNSequenceFlows
    
    //Used to notate the default sequence flow in a BPMN Process
    @js.native
    sealed trait Default extends BPMNSequenceFlows
    
    //Used to notate the normal sequence flow in a BPMN Process
    @js.native
    sealed trait Normal extends BPMNSequenceFlows
  }
  
  @js.native
  sealed trait BPMNShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNShapes")
  @js.native
  object BPMNShapes extends StObject {
    
    //Used to specify node Shape as Activity
    @js.native
    sealed trait Activity extends BPMNShapes
    
    //Used to specify node Shape as DataObject
    @js.native
    sealed trait DataObject extends BPMNShapes
    
    //Used to specify node Shape as DataSource
    @js.native
    sealed trait DataSource extends BPMNShapes
    
    //Used to specify node Shape as Event
    @js.native
    sealed trait Event extends BPMNShapes
    
    //Used to specify node Shape as Gateway
    @js.native
    sealed trait Gateway extends BPMNShapes
    
    //Used to specify node Shape as Group
    @js.native
    sealed trait Group extends BPMNShapes
    
    //Used to specify node Shape as Message
    @js.native
    sealed trait Message extends BPMNShapes
  }
  
  @js.native
  sealed trait BPMNSubProcessTypes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNSubProcessTypes")
  @js.native
  object BPMNSubProcessTypes extends StObject {
    
    //Used to set BPMN SubProcess type as Event
    @js.native
    sealed trait Event extends BPMNSubProcessTypes
    
    //Used to set BPMN SubProcess type as None
    @js.native
    sealed trait None extends BPMNSubProcessTypes
    
    //Used to set BPMN SubProcess type as Transaction
    @js.native
    sealed trait Transaction extends BPMNSubProcessTypes
  }
  
  @js.native
  sealed trait BPMNTasks extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNTasks")
  @js.native
  object BPMNTasks extends StObject {
    
    //Used to set BPMN Task Type as BusinessRule
    @js.native
    sealed trait BusinessRule extends BPMNTasks
    
    //Used to set BPMN Task Type as InstantiatingReceive
    @js.native
    sealed trait InstantiatingReceive extends BPMNTasks
    
    //Used to set BPMN Task Type as Manual
    @js.native
    sealed trait Manual extends BPMNTasks
    
    //Used to set BPMN Task Type as None
    @js.native
    sealed trait None extends BPMNTasks
    
    //Used to set BPMN Task Type as Parallel
    @js.native
    sealed trait Parallel extends BPMNTasks
    
    //Used to set BPMN Task Type as Receive
    @js.native
    sealed trait Receive extends BPMNTasks
    
    //Used to set BPMN Task Type as Script
    @js.native
    sealed trait Script extends BPMNTasks
    
    //Used to set BPMN Task Type as Send
    @js.native
    sealed trait Send extends BPMNTasks
    
    //Used to set BPMN Task Type as Service
    @js.native
    sealed trait Service extends BPMNTasks
    
    //Used to set BPMN Task Type as User
    @js.native
    sealed trait User extends BPMNTasks
  }
  
  @js.native
  sealed trait BPMNTriggers extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BPMNTriggers")
  @js.native
  object BPMNTriggers extends StObject {
    
    //Used to set Event Trigger as Cancel
    @js.native
    sealed trait Cancel extends BPMNTriggers
    
    //Used to set Event Trigger as Compensation
    @js.native
    sealed trait Compensation extends BPMNTriggers
    
    //Used to set Event Trigger as Conditional
    @js.native
    sealed trait Conditional extends BPMNTriggers
    
    //Used to set Event Trigger as Error
    @js.native
    sealed trait Error extends BPMNTriggers
    
    //Used to set Event Trigger as Escalation
    @js.native
    sealed trait Escalation extends BPMNTriggers
    
    //Used to set Event Trigger as Link
    @js.native
    sealed trait Link extends BPMNTriggers
    
    //Used to set Event Trigger as Message
    @js.native
    sealed trait Message extends BPMNTriggers
    
    //Used to set Event Trigger as Multiple
    @js.native
    sealed trait Multiple extends BPMNTriggers
    
    //Used to set Event Trigger as None
    @js.native
    sealed trait None extends BPMNTriggers
    
    //Used to set Event Trigger as Parallel
    @js.native
    sealed trait Parallel extends BPMNTriggers
    
    //Used to set Event Trigger as Signal
    @js.native
    sealed trait Signal extends BPMNTriggers
    
    //Used to set Event Trigger as Terminate
    @js.native
    sealed trait Terminate extends BPMNTriggers
    
    //Used to set Event Trigger as Timer
    @js.native
    sealed trait Timer extends BPMNTriggers
  }
  
  @js.native
  sealed trait BasicShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BasicShapes")
  @js.native
  object BasicShapes extends StObject {
    
    //Used to specify node Shape as Cylinder
    @js.native
    sealed trait Cylinder extends BasicShapes
    
    //Used to specify node Shape as Decagon
    @js.native
    sealed trait Decagon extends BasicShapes
    
    //Used to specify node Shape as Ellipse
    @js.native
    sealed trait Ellipse extends BasicShapes
    
    //Used to specify node Shape as Heptagon
    @js.native
    sealed trait Heptagon extends BasicShapes
    
    //Used to specify node Shape as Octagon
    @js.native
    sealed trait Octagon extends BasicShapes
    
    //Used to specify node Shape as Path
    @js.native
    sealed trait Path extends BasicShapes
    
    //Used to specify node Shape as Pentagon
    @js.native
    sealed trait Pentagon extends BasicShapes
    
    //Used to specify node Shape as Plus
    @js.native
    sealed trait Plus extends BasicShapes
    
    //Used to specify node Shape as Polygon
    @js.native
    sealed trait Polygon extends BasicShapes
    
    //Used to specify node Shape as Rectangle
    @js.native
    sealed trait Rectangle extends BasicShapes
    
    //Used to specify node Shape as RightTriangle
    @js.native
    sealed trait RightTriangle extends BasicShapes
    
    //Used to specify node Shape as Star
    @js.native
    sealed trait Star extends BasicShapes
    
    //Used to specify node Shape as Trapezoid
    @js.native
    sealed trait Trapezoid extends BasicShapes
    
    //Used to specify node Shape as Triangle
    @js.native
    sealed trait Triangle extends BasicShapes
  }
  
  @js.native
  sealed trait BoundaryConstraints extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BoundaryConstraints")
  @js.native
  object BoundaryConstraints extends StObject {
    
    //Used to set boundaryConstraints as Diagram
    @js.native
    sealed trait Diagram extends BoundaryConstraints
    
    //Used to set boundaryConstraints as Infinite
    @js.native
    sealed trait Infinite extends BoundaryConstraints
    
    //Used to set boundaryConstraints as Page
    @js.native
    sealed trait Page extends BoundaryConstraints
  }
  
  @js.native
  sealed trait BridgeDirection extends StObject
  @JSGlobal("ej.datavisualization.Diagram.BridgeDirection")
  @js.native
  object BridgeDirection extends StObject {
    
    //Used to set the direction of line bridges as bottom
    @js.native
    sealed trait Bottom extends BridgeDirection
    
    //Used to set the direction of line bridges as left
    @js.native
    sealed trait Left extends BridgeDirection
    
    //Used to set the direction of line bridges as right
    @js.native
    sealed trait Right extends BridgeDirection
    
    //Used to set the direction of line bridges as top
    @js.native
    sealed trait Top extends BridgeDirection
  }
  
  @js.native
  sealed trait ClassifierShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ClassifierShapes")
  @js.native
  object ClassifierShapes extends StObject {
    
    //Used to notate aggregation in a UML Class Diagram
    @js.native
    sealed trait Aggregation extends ClassifierShapes
    
    //Used to notate association in UML Class Diagram
    @js.native
    sealed trait Association extends ClassifierShapes
    
    //Used to define a Class
    @js.native
    sealed trait Class extends ClassifierShapes
    
    //Used to notate composition in a UML Class Diagram
    @js.native
    sealed trait Composition extends ClassifierShapes
    
    //Used to notate dependency in a UML Class Diagram
    @js.native
    sealed trait Dependency extends ClassifierShapes
    
    //Used to define an Enumeration
    @js.native
    sealed trait Enumeration extends ClassifierShapes
    
    //Used to notate inheritance in a UML Class Diagram
    @js.native
    sealed trait Inheritance extends ClassifierShapes
    
    //Used to define an Interface
    @js.native
    sealed trait Interface extends ClassifierShapes
  }
  
  @js.native
  sealed trait ConnectorConstraints extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ConnectorConstraints")
  @js.native
  object ConnectorConstraints extends StObject {
    
    //Allows the object to drop over the connector.
    @js.native
    sealed trait AllowDrop extends ConnectorConstraints
    
    //Enables or disables bridging over a connector, if bridging constraints disabled..
    @js.native
    sealed trait BridgeObstacle extends ConnectorConstraints
    
    //Enables bridging to the connector
    @js.native
    sealed trait Bridging extends ConnectorConstraints
    
    //Enables the contrast between clean edges of connector over rendering speed and geometric precision
    @js.native
    sealed trait CrispEdges extends ConnectorConstraints
    
    //Enables all constraints
    @js.native
    sealed trait Default extends ConnectorConstraints
    
    //Enables connector to be Deleted
    @js.native
    sealed trait Delete extends ConnectorConstraints
    
    //Enables connector to be Dragged
    @js.native
    sealed trait Drag extends ConnectorConstraints
    
    //Enables label of node to be Dragged
    @js.native
    sealed trait DragLabel extends ConnectorConstraints
    
    //Enables the contrast between clean edges of connector over rendering speed and geometric precision
    @js.native
    sealed trait DragLimit extends ConnectorConstraints
    
    //Enables control point and end point of every segment in a connector for editing
    @js.native
    sealed trait DragSegmentThumb extends ConnectorConstraints
    
    //Enables connectors source end to be selected
    @js.native
    sealed trait DragSourceEnd extends ConnectorConstraints
    
    //Enables connectors target end to be selected
    @js.native
    sealed trait DragTargetEnd extends ConnectorConstraints
    
    //Inherit the bridging option defined in the diagram constraints.
    @js.native
    sealed trait InheritBridging extends ConnectorConstraints
    
    //Enables the contrast between clean edges of connector over rendering speed and geometric precision
    @js.native
    sealed trait InheritCrispEdges extends ConnectorConstraints
    
    //Inherit the routing option defined in the diagram constraints.
    @js.native
    sealed trait InheritRouting extends ConnectorConstraints
    
    //Inherit the tooltip option defined in the diagram constraints.
    @js.native
    sealed trait InheritTooltip extends ConnectorConstraints
    
    //Enables connector to be selected and dragged.
    @js.native
    sealed trait Interaction extends ConnectorConstraints
    
    //Disable all connector Constraints
    @js.native
    sealed trait None extends ConnectorConstraints
    
    //Enables user interaction to the connector
    @js.native
    sealed trait PointerEvents extends ConnectorConstraints
    
    //Enables the Routing for an connector
    @js.native
    sealed trait Routing extends ConnectorConstraints
    
    //Enables connector to be selected
    @js.native
    sealed trait Select extends ConnectorConstraints
  }
  
  @js.native
  sealed trait ConnectorShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ConnectorShapes")
  @js.native
  object ConnectorShapes extends StObject {
    
    //Used to specify connector type as BPMN
    @js.native
    sealed trait BPMN extends ConnectorShapes
    
    //Used to specify connector type as UMLActivity
    @js.native
    sealed trait UMLActivity extends ConnectorShapes
    
    //Used to specify connector type as UMLClassifier
    @js.native
    sealed trait UMLClassifier extends ConnectorShapes
  }
  
  @js.native
  sealed trait ContainerType extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ContainerType")
  @js.native
  object ContainerType extends StObject {
    
    //Sets the container type as Canvas
    @js.native
    sealed trait Canvas extends ContainerType
    
    //Sets the container type as Stack
    @js.native
    sealed trait Stack extends ContainerType
  }
  
  @js.native
  sealed trait DecoratorShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.DecoratorShapes")
  @js.native
  object DecoratorShapes extends StObject {
    
    //Used to set decorator shape as Arrow
    @js.native
    sealed trait Arrow extends DecoratorShapes
    
    //Used to set decorator shape as Circle
    @js.native
    sealed trait Circle extends DecoratorShapes
    
    //Used to set decorator shape as Diamond
    @js.native
    sealed trait Diamond extends DecoratorShapes
    
    //Used to set decorator shape as none
    @js.native
    sealed trait None extends DecoratorShapes
    
    //Used to set decorator shape as Open Arrow
    @js.native
    sealed trait OpenArrow extends DecoratorShapes
    
    //Used to set decorator shape as path
    @js.native
    sealed trait Path extends DecoratorShapes
  }
  
  @js.native
  sealed trait DiagramConstraints extends StObject
  @JSGlobal("ej.datavisualization.Diagram.DiagramConstraints")
  @js.native
  object DiagramConstraints extends StObject {
    
    //Enables/Disables interaction done with the help of API methods
    @js.native
    sealed trait APIUpdate extends DiagramConstraints
    
    //Enables/Disables Bridging
    @js.native
    sealed trait Bridging extends DiagramConstraints
    
    //Enables/Disables the sharp edges
    @js.native
    sealed trait CrispEdges extends DiagramConstraints
    
    //Enables all Constraints
    @js.native
    sealed trait Default extends DiagramConstraints
    
    //Enables/Disables the drag and drop of element from one diagram to the other
    @js.native
    sealed trait FloatElements extends DiagramConstraints
    
    //Disables all DiagramConstraints
    @js.native
    sealed trait None extends DiagramConstraints
    
    //Enables/Disables PageEditing
    @js.native
    sealed trait PageEditable extends DiagramConstraints
    
    //Enables/Disables Panning
    @js.native
    sealed trait Pannable extends DiagramConstraints
    
    //Enables/Disables panning on horizontal axis
    @js.native
    sealed trait PannableX extends DiagramConstraints
    
    //Enables/Disables panning on vertical axis
    @js.native
    sealed trait PannableY extends DiagramConstraints
    
    //Enables/Disables the Diagram size updation on the window resize function
    @js.native
    sealed trait Resizable extends DiagramConstraints
    
    //Enables the routing for an connector in diagram
    @js.native
    sealed trait Routing extends DiagramConstraints
    
    //Enables/Disables undo actions
    @js.native
    sealed trait Undoable extends DiagramConstraints
    
    //Enables/Disables UserInteraction
    @js.native
    sealed trait UserInteraction extends DiagramConstraints
    
    //Enables/Disables the Zooming of labels text editor
    @js.native
    sealed trait ZoomTextEditor extends DiagramConstraints
    
    //Enables/Disables Zooming
    @js.native
    sealed trait Zoomable extends DiagramConstraints
  }
  
  @js.native
  sealed trait ExportModes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ExportModes")
  @js.native
  object ExportModes extends StObject {
    
    //Used to export the diagram as raw data.
    @js.native
    sealed trait Data extends ExportModes
    
    //Used to export the diagram as a file.
    @js.native
    sealed trait Download extends ExportModes
  }
  
  @js.native
  sealed trait FileFormats extends StObject
  @JSGlobal("ej.datavisualization.Diagram.FileFormats")
  @js.native
  object FileFormats extends StObject {
    
    //Used to export the diagram into BMP format.
    @js.native
    sealed trait BMP extends FileFormats
    
    //Used to export the diagram into JPG format.
    @js.native
    sealed trait JPG extends FileFormats
    
    //Used to export the diagram into PNG format.
    @js.native
    sealed trait PNG extends FileFormats
    
    //Used to export the diagram into SVG format.
    @js.native
    sealed trait SVG extends FileFormats
  }
  
  @js.native
  sealed trait FitMode extends StObject
  @JSGlobal("ej.datavisualization.Diagram.FitMode")
  @js.native
  object FitMode extends StObject {
    
    //Used to fit the diagram content based on diagram height.
    @js.native
    sealed trait Height extends FitMode
    
    //Used to fit the diagram content based on page size.
    @js.native
    sealed trait Page extends FitMode
    
    //Used to fit the diagram content based on diagram width.
    @js.native
    sealed trait Width extends FitMode
  }
  
  @js.native
  sealed trait FlowShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.FlowShapes")
  @js.native
  object FlowShapes extends StObject {
    
    //Used to specify node Shape as Annotation1
    @js.native
    sealed trait Annotation1 extends FlowShapes
    
    //Used to specify node Shape as Annotation2
    @js.native
    sealed trait Annotation2 extends FlowShapes
    
    //Used to specify node Shape as Card
    @js.native
    sealed trait Card extends FlowShapes
    
    //Used to specify node Shape as Collate
    @js.native
    sealed trait Collate extends FlowShapes
    
    //Used to specify node Shape as Data
    @js.native
    sealed trait Data extends FlowShapes
    
    //Used to specify node Shape as Decision
    @js.native
    sealed trait Decision extends FlowShapes
    
    //Used to specify node Shape as DirectData
    @js.native
    sealed trait DirectData extends FlowShapes
    
    //Used to specify node Shape as Document
    @js.native
    sealed trait Document extends FlowShapes
    
    //Used to specify node Shape as Extract
    @js.native
    sealed trait Extract extends FlowShapes
    
    //Used to specify node Shape as InternalStorage
    @js.native
    sealed trait InternalStorage extends FlowShapes
    
    //Used to specify node Shape as ManualOperation
    @js.native
    sealed trait ManualOperation extends FlowShapes
    
    //Used to specify node Shape as Merge
    @js.native
    sealed trait Merge extends FlowShapes
    
    //Used to specify node Shape as MultiDocument
    @js.native
    sealed trait MultiDocument extends FlowShapes
    
    //Used to specify node Shape as OffPageReference
    @js.native
    sealed trait OffPageReference extends FlowShapes
    
    //Used to specify node Shape as Or
    @js.native
    sealed trait Or extends FlowShapes
    
    //Used to specify node Shape as PaperTap
    @js.native
    sealed trait PaperTap extends FlowShapes
    
    //Used to specify node Shape as PreDefinedProcess
    @js.native
    sealed trait PreDefinedProcess extends FlowShapes
    
    //Used to specify node Shape as Process
    @js.native
    sealed trait Process extends FlowShapes
    
    //Used to specify node Shape as SequentialAccessStorage
    @js.native
    sealed trait SequentialAccessStorage extends FlowShapes
    
    //Used to specify node Shape as SequentialData
    @js.native
    sealed trait SequentialData extends FlowShapes
    
    //Used to specify node Shape as Sort
    @js.native
    sealed trait Sort extends FlowShapes
    
    //Used to specify node Shape as SummingJunction
    @js.native
    sealed trait SummingJunction extends FlowShapes
    
    //Used to specify node Shape as Terminator
    @js.native
    sealed trait Terminator extends FlowShapes
  }
  
  @js.native
  sealed trait HorizontalAlignment extends StObject
  @JSGlobal("ej.datavisualization.Diagram.HorizontalAlignment")
  @js.native
  object HorizontalAlignment extends StObject {
    
    //Used to align text horizontally on center of node/connector
    @js.native
    sealed trait Center extends HorizontalAlignment
    
    //Used to align text horizontally on left side of node/connector
    @js.native
    sealed trait Left extends HorizontalAlignment
    
    //Used to align text horizontally on right side of node/connector
    @js.native
    sealed trait Right extends HorizontalAlignment
  }
  
  @js.native
  sealed trait IconShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.IconShapes")
  @js.native
  object IconShapes extends StObject {
    
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
  }
  
  @js.native
  sealed trait ImageAlignment extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ImageAlignment")
  @js.native
  object ImageAlignment extends StObject {
    
    //Scales the graphic content non-uniformly to the width and height of the diagram area
    @js.native
    sealed trait None extends ImageAlignment
    
    //Used to align the image at the bottom right of diagram area/node
    @js.native
    sealed trait XMaxYMax extends ImageAlignment
    
    //Used to align the image at the right center of diagram area/node
    @js.native
    sealed trait XMaxYMid extends ImageAlignment
    
    //Used to align the image at the top right of diagram area/node
    @js.native
    sealed trait XMaxYMin extends ImageAlignment
    
    //Used to align the image at the bottom center of diagram area
    @js.native
    sealed trait XMidYMax extends ImageAlignment
    
    //Used to align the image at the center of diagram area
    @js.native
    sealed trait XMidYMid extends ImageAlignment
    
    //Used to align the image at the top center of diagram area
    @js.native
    sealed trait XMidYMin extends ImageAlignment
    
    //Used to align the image at the bottom left of diagram area
    @js.native
    sealed trait XMinYMax extends ImageAlignment
    
    //Used to align the image at the left center of diagram area
    @js.native
    sealed trait XMinYMid extends ImageAlignment
    
    //Used to align the image at the top left of diagram area
    @js.native
    sealed trait XMinYMin extends ImageAlignment
  }
  
  @js.native
  sealed trait KeyModifiers extends StObject
  @JSGlobal("ej.datavisualization.Diagram.KeyModifiers")
  @js.native
  object KeyModifiers extends StObject {
    
    //The ALT key.
    @js.native
    sealed trait Alt extends KeyModifiers
    
    //The CTRL key.
    @js.native
    sealed trait Control extends KeyModifiers
    
    //No modifiers are pressed.
    @js.native
    sealed trait None extends KeyModifiers
    
    //The SHIFT key.
    @js.native
    sealed trait Shift extends KeyModifiers
  }
  
  @js.native
  sealed trait Keys extends StObject
  @JSGlobal("ej.datavisualization.Diagram.Keys")
  @js.native
  object Keys extends StObject {
    
    //The A key.
    @js.native
    sealed trait A extends Keys
    
    //The B key.
    @js.native
    sealed trait B extends Keys
    
    //The C key.
    @js.native
    sealed trait C extends Keys
    
    //The D Key.
    @js.native
    sealed trait D extends Keys
    
    //The DEL key.
    @js.native
    sealed trait Delete extends Keys
    
    //The DOWN ARROW key.
    @js.native
    sealed trait Down extends Keys
    
    //The E key.
    @js.native
    sealed trait E extends Keys
    
    //The ENTER key.
    @js.native
    sealed trait Enter extends Keys
    
    //The ESC key.
    @js.native
    sealed trait Escape extends Keys
    
    //The F key.
    @js.native
    sealed trait F extends Keys
    
    //The G key.
    @js.native
    sealed trait G extends Keys
    
    //The H Key.
    @js.native
    sealed trait H extends Keys
    
    //The I key.
    @js.native
    sealed trait I extends Keys
    
    //The J key.
    @js.native
    sealed trait J extends Keys
    
    //The K key.
    @js.native
    sealed trait K extends Keys
    
    //The L Key.
    @js.native
    sealed trait L extends Keys
    
    //The LEFT ARROW key.
    @js.native
    sealed trait Left extends Keys
    
    //The M key.
    @js.native
    sealed trait M extends Keys
    
    //The N key.
    @js.native
    sealed trait N extends Keys
    
    //No key pressed.
    @js.native
    sealed trait None extends Keys
    
    //The 0 key.
    @js.native
    sealed trait Number0 extends Keys
    
    //The 1 key.
    @js.native
    sealed trait Number1 extends Keys
    
    //The 2 key.
    @js.native
    sealed trait Number2 extends Keys
    
    //The 3 key.
    @js.native
    sealed trait Number3 extends Keys
    
    //The 4 key.
    @js.native
    sealed trait Number4 extends Keys
    
    //The 5 key.
    @js.native
    sealed trait Number5 extends Keys
    
    //The 6 key.
    @js.native
    sealed trait Number6 extends Keys
    
    //The 7 key.
    @js.native
    sealed trait Number7 extends Keys
    
    //The 8 key.
    @js.native
    sealed trait Number8 extends Keys
    
    //The 9 key.
    @js.native
    sealed trait Number9 extends Keys
    
    //The O key.
    @js.native
    sealed trait O extends Keys
    
    //The P Key.
    @js.native
    sealed trait P extends Keys
    
    //The Q key.
    @js.native
    sealed trait Q extends Keys
    
    //The R key.
    @js.native
    sealed trait R extends Keys
    
    //The RIGHT ARROW key.
    @js.native
    sealed trait Right extends Keys
    
    //The S key.
    @js.native
    sealed trait S extends Keys
    
    //The T Key.
    @js.native
    sealed trait T extends Keys
    
    //The TAB key.
    @js.native
    sealed trait Tab extends Keys
    
    //The U key.
    @js.native
    sealed trait U extends Keys
    
    //The UP ARROW key.
    @js.native
    sealed trait Up extends Keys
    
    //The V key.
    @js.native
    sealed trait V extends Keys
    
    //The W key.
    @js.native
    sealed trait W extends Keys
    
    //The X key.
    @js.native
    sealed trait X extends Keys
    
    //The Y key.
    @js.native
    sealed trait Y extends Keys
    
    //The Z key.
    @js.native
    sealed trait Z extends Keys
  }
  
  @js.native
  sealed trait LabelConstraints extends StObject
  @JSGlobal("ej.datavisualization.Diagram.LabelConstraints")
  @js.native
  object LabelConstraints extends StObject {
    
    //Enables all label constraints
    @js.native
    sealed trait All extends LabelConstraints
    
    //Enables label to be Dragged
    @js.native
    sealed trait Draggable extends LabelConstraints
    
    //Disable all label Constraints
    @js.native
    sealed trait None extends LabelConstraints
    
    //Enables label to be Resized
    @js.native
    sealed trait Resizable extends LabelConstraints
    
    //Enables label to be Rotated
    @js.native
    sealed trait Rotatable extends LabelConstraints
    
    //Enables label to be selected
    @js.native
    sealed trait Selectable extends LabelConstraints
  }
  
  @js.native
  sealed trait LabelEditMode extends StObject
  @JSGlobal("ej.datavisualization.Diagram.LabelEditMode")
  @js.native
  object LabelEditMode extends StObject {
    
    //Used to set label edit mode as edit
    @js.native
    sealed trait Edit extends LabelEditMode
    
    //Used to set label edit mode as view
    @js.native
    sealed trait View extends LabelEditMode
  }
  
  @js.native
  sealed trait LabelRelativeMode extends StObject
  @JSGlobal("ej.datavisualization.Diagram.LabelRelativeMode")
  @js.native
  object LabelRelativeMode extends StObject {
    
    //Sets the relativeMode as SegmentBounds
    @js.native
    sealed trait SegmentBounds extends LabelRelativeMode
    
    //Sets the relativeMode as SegmentPath
    @js.native
    sealed trait SegmentPath extends LabelRelativeMode
  }
  
  @js.native
  sealed trait LabelRenderingMode extends StObject
  @JSGlobal("ej.datavisualization.Diagram.LabelRenderingMode")
  @js.native
  object LabelRenderingMode extends StObject {
    
    //Sets the labelRenderingMode as HTML
    @js.native
    sealed trait HTML extends LabelRenderingMode
    
    //Sets the labelRenderingMode as SVG
    @js.native
    sealed trait SVG extends LabelRenderingMode
  }
  
  @js.native
  sealed trait LayoutOrientations extends StObject
  @JSGlobal("ej.datavisualization.Diagram.LayoutOrientations")
  @js.native
  object LayoutOrientations extends StObject {
    
    //Used to set LayoutOrientation from bottom to top
    @js.native
    sealed trait BottomToTop extends LayoutOrientations
    
    //Used to set LayoutOrientation from left to right
    @js.native
    sealed trait LeftToRight extends LayoutOrientations
    
    //Used to set LayoutOrientation from right to left
    @js.native
    sealed trait RightToLeft extends LayoutOrientations
    
    //Used to set LayoutOrientation from top to bottom
    @js.native
    sealed trait TopToBottom extends LayoutOrientations
  }
  
  @js.native
  sealed trait LayoutTypes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.LayoutTypes")
  @js.native
  object LayoutTypes extends StObject {
    
    //Used to set layout type as hierarchical layout
    @js.native
    sealed trait HierarchicalTree extends LayoutTypes
    
    //Used not to set any specific layout
    @js.native
    sealed trait None extends LayoutTypes
    
    //Used to set layout type as organnizational chart
    @js.native
    sealed trait OrganizationalChart extends LayoutTypes
    
    //Used to set layout type as radial tree
    @js.native
    sealed trait RadialTree extends LayoutTypes
    
    //Used to set layout type as symmetric layout
    @js.native
    sealed trait SymmetricLayout extends LayoutTypes
  }
  
  @js.native
  sealed trait Multiplicity extends StObject
  @JSGlobal("ej.datavisualization.Diagram.Multiplicity")
  @js.native
  object Multiplicity extends StObject {
    
    //The entity instances can be related to multiple instances of each other
    @js.native
    sealed trait ManyToMany extends Multiplicity
    
    //Multiple instances of an entity can be related to a single instance of the other entity
    @js.native
    sealed trait ManyToOne extends Multiplicity
    
    //An entity instance can be related to multiple instances of the other entities
    @js.native
    sealed trait OneToMany extends Multiplicity
    
    //Each entity instance is related to a single instance of another entity
    @js.native
    sealed trait OneToOne extends Multiplicity
  }
  
  @js.native
  sealed trait NodeConstraints extends StObject
  @JSGlobal("ej.datavisualization.Diagram.NodeConstraints")
  @js.native
  object NodeConstraints extends StObject {
    
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
  }
  
  @js.native
  sealed trait OverflowType extends StObject
  @JSGlobal("ej.datavisualization.Diagram.OverflowType")
  @js.native
  object OverflowType extends StObject {
    
    //Set overflow Type  as Clip
    @js.native
    sealed trait Clip extends OverflowType
    
    //Set overflow Type as ellipsis
    @js.native
    sealed trait Ellipsis extends OverflowType
  }
  
  @js.native
  sealed trait PageOrientations extends StObject
  @JSGlobal("ej.datavisualization.Diagram.PageOrientations")
  @js.native
  object PageOrientations extends StObject {
    
    //Used to set orientation as Landscape
    @js.native
    sealed trait Landscape extends PageOrientations
    
    //Used to set orientation as portrait
    @js.native
    sealed trait Portrait extends PageOrientations
  }
  
  @js.native
  sealed trait PortConstraints extends StObject
  @JSGlobal("ej.datavisualization.Diagram.PortConstraints")
  @js.native
  object PortConstraints extends StObject {
    
    //Enables connections with connector
    @js.native
    sealed trait Connect extends PortConstraints
    
    //Enables to create the connection when mouse hover on the port.
    @js.native
    sealed trait ConnectOnDrag extends PortConstraints
    
    //Disable all constraints
    @js.native
    sealed trait None extends PortConstraints
  }
  
  @js.native
  sealed trait PortShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.PortShapes")
  @js.native
  object PortShapes extends StObject {
    
    //Used to set port shape as Circle
    @js.native
    sealed trait Circle extends PortShapes
    
    //Used to set port shape as Path
    @js.native
    sealed trait Path extends PortShapes
    
    //Used to set port shape as Square
    @js.native
    sealed trait Square extends PortShapes
    
    //Used to set port shape as X
    @js.native
    sealed trait X extends PortShapes
  }
  
  @js.native
  sealed trait PortVisibility extends StObject
  @JSGlobal("ej.datavisualization.Diagram.PortVisibility")
  @js.native
  object PortVisibility extends StObject {
    
    //Port gets visible when connect connector to node
    @js.native
    sealed trait Connect extends PortVisibility
    
    //Specifies the port visibility as default
    @js.native
    sealed trait Default extends PortVisibility
    
    //Set the port visibility as Hidden
    @js.native
    sealed trait Hidden extends PortVisibility
    
    //Port get visible when hover connector on node
    @js.native
    sealed trait Hover extends PortVisibility
    
    //Set the port visibility as Visible
    @js.native
    sealed trait Visible extends PortVisibility
  }
  
  @js.native
  sealed trait Region extends StObject
  @JSGlobal("ej.datavisualization.Diagram.Region")
  @js.native
  object Region extends StObject {
    
    //Used to export the content of the diagram only.
    @js.native
    sealed trait Content extends Region
    
    //Used to export the page region of the diagram.
    @js.native
    sealed trait PageSettings extends Region
  }
  
  @js.native
  sealed trait RelativeMode extends StObject
  @JSGlobal("ej.datavisualization.Diagram.RelativeMode")
  @js.native
  object RelativeMode extends StObject {
    
    //Shows tooltip at the mouse position
    @js.native
    sealed trait Mouse extends RelativeMode
    
    //Shows tooltip around the node
    @js.native
    sealed trait Object extends RelativeMode
  }
  
  @js.native
  sealed trait ScrollLimit extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ScrollLimit")
  @js.native
  object ScrollLimit extends StObject {
    
    //Used to set scrollLimit as Diagram
    @js.native
    sealed trait Diagram extends ScrollLimit
    
    //Used to set scrollLimit as Infinite
    @js.native
    sealed trait Infinite extends ScrollLimit
    
    //Used to set scrollLimit as Limited
    @js.native
    sealed trait Limited extends ScrollLimit
  }
  
  @js.native
  sealed trait Segments extends StObject
  @JSGlobal("ej.datavisualization.Diagram.Segments")
  @js.native
  object Segments extends StObject {
    
    //Used to specify the lines as Bezier
    @js.native
    sealed trait Bezier extends Segments
    
    //Used to specify the lines as Orthogonal
    @js.native
    sealed trait Orthogonal extends Segments
    
    //Used to specify the lines as Straight
    @js.native
    sealed trait Straight extends Segments
  }
  
  @js.native
  sealed trait SelectorConstraints extends StObject
  @JSGlobal("ej.datavisualization.Diagram.SelectorConstraints")
  @js.native
  object SelectorConstraints extends StObject {
    
    //Sets the visibility of all selection handles as visible
    @js.native
    sealed trait All extends SelectorConstraints
    
    //Show/Hide the selection handles when it is overlapped with each other's.
    @js.native
    sealed trait AutoHideThumbs extends SelectorConstraints
    
    //Enables dragging while selecting the multiple nodes and click on the empty region of the selection rectangle.
    @js.native
    sealed trait DragOnEmptySpace extends SelectorConstraints
    
    //Hides the selector
    @js.native
    sealed trait None extends SelectorConstraints
    
    //Sets the visibility of resize handles as visible
    @js.native
    sealed trait Resizer extends SelectorConstraints
    
    //Sets the visibility of rotation handle as visible
    @js.native
    sealed trait Rotator extends SelectorConstraints
    
    //Enables the default tooltip of the diagram control.
    @js.native
    sealed trait Tooltip extends SelectorConstraints
    
    //Sets the visibility of user handles as visible
    @js.native
    sealed trait UserHandles extends SelectorConstraints
  }
  
  @js.native
  sealed trait Shapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.Shapes")
  @js.native
  object Shapes extends StObject {
    
    //Used to specify node type as BPMN
    @js.native
    sealed trait BPMN extends Shapes
    
    //Used to specify node type as Basic
    @js.native
    sealed trait Basic extends Shapes
    
    //Used to specify node type as Flow
    @js.native
    sealed trait Flow extends Shapes
    
    //Used to specify node type as HTML
    @js.native
    sealed trait Html extends Shapes
    
    //Used to specify node type as Image
    @js.native
    sealed trait Image extends Shapes
    
    //Used to specify node type as Native
    @js.native
    sealed trait Native extends Shapes
    
    //Used to specify node type as Text
    @js.native
    sealed trait Text extends Shapes
    
    //Used to specify node type as UMLActivity
    @js.native
    sealed trait UMLActivity extends Shapes
    
    //Used to specify node type as UMLClassifier
    @js.native
    sealed trait UMLClassifier extends Shapes
  }
  
  @js.native
  sealed trait SnapConstraints extends StObject
  @JSGlobal("ej.datavisualization.Diagram.SnapConstraints")
  @js.native
  object SnapConstraints extends StObject {
    
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
  }
  
  @js.native
  sealed trait Stretch extends StObject
  @JSGlobal("ej.datavisualization.Diagram.Stretch")
  @js.native
  object Stretch extends StObject {
    
    //The diagram content is resized to fill the destination dimensions. The aspect ratio is not preserved.
    @js.native
    sealed trait Fill extends Stretch
    
    //The diagram content preserves its original size.
    @js.native
    sealed trait None extends Stretch
    
    //The diagram content is resized to fit in the destination dimensions while it preserves its native aspect ratio.
    @js.native
    sealed trait Uniform extends Stretch
    
    //The diagram content is resized to fill the destination dimensions while it preserves its native aspect ratio. If the aspect ratio of the destination rectangle differs from the
    //source, the source content is clipped to fit in the destination dimensions.
    @js.native
    sealed trait UniformToFill extends Stretch
  }
  
  @js.native
  sealed trait TextAlign extends StObject
  @JSGlobal("ej.datavisualization.Diagram.TextAlign")
  @js.native
  object TextAlign extends StObject {
    
    //Used to align text on center of node/connector
    @js.native
    sealed trait Center extends TextAlign
    
    //Used to align text on left side of node/connector
    @js.native
    sealed trait Left extends TextAlign
    
    //Used to align text on Right side of node/connector
    @js.native
    sealed trait Right extends TextAlign
  }
  
  @js.native
  sealed trait TextDecorations extends StObject
  @JSGlobal("ej.datavisualization.Diagram.TextDecorations")
  @js.native
  object TextDecorations extends StObject {
    
    //Used to set text decoration of the label as LineThrough
    @js.native
    sealed trait LineThrough extends TextDecorations
    
    //Used to set text decoration of the label as None
    @js.native
    sealed trait None extends TextDecorations
    
    //Used to set text decoration of the label as Overline
    @js.native
    sealed trait Overline extends TextDecorations
    
    //Used to set text decoration of the label as Underline
    @js.native
    sealed trait Underline extends TextDecorations
  }
  
  @js.native
  sealed trait TextWrapping extends StObject
  @JSGlobal("ej.datavisualization.Diagram.TextWrapping")
  @js.native
  object TextWrapping extends StObject {
    
    //Disables wrapping
    @js.native
    sealed trait NoWrap extends TextWrapping
    
    //Enables Line-break at normal word break points
    @js.native
    sealed trait Wrap extends TextWrapping
    
    //Enables Line-break at normal word break points with longer word overflows
    @js.native
    sealed trait WrapWithOverflow extends TextWrapping
  }
  
  @js.native
  sealed trait TickAlignment extends StObject
  @JSGlobal("ej.datavisualization.Diagram.TickAlignment")
  @js.native
  object TickAlignment extends StObject {
    
    //Align the ruler scale either left or top position of the ruler.
    @js.native
    sealed trait LeftOrTop extends TickAlignment
    
    //Align the ruler scale either right or bottom position of the ruler.
    @js.native
    sealed trait RightOrBottom extends TickAlignment
  }
  
  @js.native
  sealed trait Tool extends StObject
  @JSGlobal("ej.datavisualization.Diagram.Tool")
  @js.native
  object Tool extends StObject {
    
    //Enables/Disables ContinuousDraw tool
    @js.native
    sealed trait ContinuesDraw extends Tool
    
    //Enables/Disables DrawOnce tool
    @js.native
    sealed trait DrawOnce extends Tool
    
    //Enables/Disables MultiSelect tool
    @js.native
    sealed trait MultipleSelect extends Tool
    
    //Disables all Tools
    @js.native
    sealed trait None extends Tool
    
    //Enables/Disables SingleSelect tool
    @js.native
    sealed trait SingleSelect extends Tool
    
    //Enables/Disables ZoomPan tool
    @js.native
    sealed trait ZoomPan extends Tool
  }
  
  @js.native
  sealed trait UMLActivityFlow extends StObject
  @JSGlobal("ej.datavisualization.Diagram.UMLActivityFlow")
  @js.native
  object UMLActivityFlow extends StObject {
    
    //Defines a activity flow as Control in UML Activity Diagram
    @js.native
    sealed trait Control extends UMLActivityFlow
    
    //Defines a activity flow as Exception in UML Activity Diagram
    @js.native
    sealed trait Exception extends UMLActivityFlow
    
    //Defines a activity flow as Object in UML Activity Diagram
    @js.native
    sealed trait Object extends UMLActivityFlow
  }
  
  @js.native
  sealed trait UMLActivityShapes extends StObject
  @JSGlobal("ej.datavisualization.Diagram.UMLActivityShapes")
  @js.native
  object UMLActivityShapes extends StObject {
    
    //Used to set UML ActivityShapes as AcceptingEvent
    @js.native
    sealed trait AcceptingEvent extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as Action
    @js.native
    sealed trait Action extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as Decision
    @js.native
    sealed trait Decision extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as FinalNode
    @js.native
    sealed trait FinalNode extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as ForkNode
    @js.native
    sealed trait ForkNode extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as InitialNode
    @js.native
    sealed trait InitialNode extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as JoinNode
    @js.native
    sealed trait JoinNode extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as MergeNode
    @js.native
    sealed trait MergeNode extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as Note
    @js.native
    sealed trait Note extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as ReceiveSignal
    @js.native
    sealed trait ReceiveSignal extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as SendSignal
    @js.native
    sealed trait SendSignal extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as StructuredNode
    @js.native
    sealed trait StructuredNode extends UMLActivityShapes
    
    //Used to set UML ActivityShapes as TimeEvent
    @js.native
    sealed trait TimeEvent extends UMLActivityShapes
  }
  
  @js.native
  sealed trait UserHandlePositions extends StObject
  @JSGlobal("ej.datavisualization.Diagram.UserHandlePositions")
  @js.native
  object UserHandlePositions extends StObject {
    
    //Set the position of the userhandle as bottomcenter
    @js.native
    sealed trait BottomCenter extends UserHandlePositions
    
    //Set the position of the userhandle as bottomleft
    @js.native
    sealed trait BottomLeft extends UserHandlePositions
    
    //Set the position of the userhandle as bottom right
    @js.native
    sealed trait BottomRight extends UserHandlePositions
    
    //Set the position of the userhandle as middleleft
    @js.native
    sealed trait MiddleLeft extends UserHandlePositions
    
    //Set the position of the userhandle as middleright
    @js.native
    sealed trait MiddleRight extends UserHandlePositions
    
    //Set the position of the userhandle as topcenter
    @js.native
    sealed trait TopCenter extends UserHandlePositions
    
    //Set the position of the userhandle as topleft
    @js.native
    sealed trait TopLeft extends UserHandlePositions
    
    //Set the position of the userhandle as topright
    @js.native
    sealed trait TopRight extends UserHandlePositions
  }
  
  @js.native
  sealed trait VerticalAlignment extends StObject
  @JSGlobal("ej.datavisualization.Diagram.VerticalAlignment")
  @js.native
  object VerticalAlignment extends StObject {
    
    //Used to align text Vertically on bottom of node/connector
    @js.native
    sealed trait Bottom extends VerticalAlignment
    
    //Used to align text Vertically on center of node/connector
    @js.native
    sealed trait Center extends VerticalAlignment
    
    //Used to align text Vertically on left side of node/connector
    @js.native
    sealed trait Top extends VerticalAlignment
  }
  
  @js.native
  sealed trait ZoomCommand extends StObject
  @JSGlobal("ej.datavisualization.Diagram.ZoomCommand")
  @js.native
  object ZoomCommand extends StObject {
    
    //Used to zoom in the Diagram
    @js.native
    sealed trait ZoomIn extends ZoomCommand
    
    //Used to zoom out the diagram
    @js.native
    sealed trait ZoomOut extends ZoomCommand
  }
  
  @js.native
  trait AutoScrollChangeEventArgs extends StObject {
    
    /** Returns the delay between subsequent auto scrolls
      */
    var delay: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
  }
  object AutoScrollChangeEventArgs {
    
    @scala.inline
    def apply(): AutoScrollChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoScrollChangeEventArgs]
    }
    
    @scala.inline
    implicit class AutoScrollChangeEventArgsMutableBuilder[Self <: AutoScrollChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: String): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
    }
  }
  
  @js.native
  trait BackgroundImage extends StObject {
    
    /** Defines how to align the background image over the diagram area.
      * @Default {ej.datavisualization.Diagram.ImageAlignment.XMidYMid}
      */
    var alignment: js.UndefOr[ImageAlignment | String] = js.native
  }
  object BackgroundImage {
    
    @scala.inline
    def apply(): BackgroundImage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundImage]
    }
    
    @scala.inline
    implicit class BackgroundImageMutableBuilder[Self <: BackgroundImage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: ImageAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
    }
  }
  
  @js.native
  trait ClickEventArgs extends StObject {
    
    /** parameter returns the object that is actually clicked
      */
    var actualObject: js.UndefOr[Double] = js.native
    
    /** parameter to specify whether or not to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the count of how many times the mouse button is pressed
      */
    var count: js.UndefOr[Double] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the clicked node, connector or diagram
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the event triggered
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the horizontal coordinate of the mouse pointer, relative to the diagram
      */
    var offsetX: js.UndefOr[Double] = js.native
    
    /** parameter returns  the vertical coordinate of the mouse pointer, relative to the diagram
      */
    var offsetY: js.UndefOr[Double] = js.native
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualObject(value: Double): Self = StObject.set(x, "actualObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualObjectUndefined: Self = StObject.set(x, "actualObject", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    }
  }
  
  @js.native
  trait CommandManager extends StObject {
    
    /** An object that maps a set of command names with the corresponding command objects
      * @Default {{}}
      */
    var commands: js.UndefOr[CommandManagerCommands] = js.native
  }
  object CommandManager {
    
    @scala.inline
    def apply(): CommandManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandManager]
    }
    
    @scala.inline
    implicit class CommandManagerMutableBuilder[Self <: CommandManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommands(value: CommandManagerCommands): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandsUndefined: Self = StObject.set(x, "commands", js.undefined)
    }
  }
  
  @js.native
  trait CommandManagerCommands extends StObject {
    
    /** A method that defines whether the command is executable at the moment or not.
      */
    var canExecute: js.UndefOr[js.Any] = js.native
    
    /** A method that defines what to be executed when the key combination is recognized.
      */
    var execute: js.UndefOr[js.Any] = js.native
    
    /** Defines a combination of keys and key modifiers, on recognition of which the command will be executed
      */
    var gesture: js.UndefOr[CommandManagerCommandsGesture] = js.native
    
    /** Defines any additional parameters that are required at runtime
      * @Default {null}
      */
    var parameter: js.UndefOr[js.Any] = js.native
  }
  object CommandManagerCommands {
    
    @scala.inline
    def apply(): CommandManagerCommands = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandManagerCommands]
    }
    
    @scala.inline
    implicit class CommandManagerCommandsMutableBuilder[Self <: CommandManagerCommands] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanExecute(value: js.Any): Self = StObject.set(x, "canExecute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanExecuteUndefined: Self = StObject.set(x, "canExecute", js.undefined)
      
      @scala.inline
      def setExecute(value: js.Any): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      @scala.inline
      def setGesture(value: CommandManagerCommandsGesture): Self = StObject.set(x, "gesture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGestureUndefined: Self = StObject.set(x, "gesture", js.undefined)
      
      @scala.inline
      def setParameter(value: js.Any): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    }
  }
  
  @js.native
  trait CommandManagerCommandsGesture extends StObject {
    
    /** Sets the key value, on recognition of which the command will be executed.
      * @Default {ej.datavisualization.Diagram.Keys.None}
      */
    var key: js.UndefOr[Keys | String] = js.native
    
    /** Sets a combination of key modifiers, on recognition of which the command will be executed.
      * @Default {ej.datavisualization.Diagram.KeyModifiers.None}
      */
    var keyModifiers: js.UndefOr[KeyModifiers | String] = js.native
  }
  object CommandManagerCommandsGesture {
    
    @scala.inline
    def apply(): CommandManagerCommandsGesture = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandManagerCommandsGesture]
    }
    
    @scala.inline
    implicit class CommandManagerCommandsGestureMutableBuilder[Self <: CommandManagerCommandsGesture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: Keys | String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyModifiers(value: KeyModifiers | String): Self = StObject.set(x, "keyModifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyModifiersUndefined: Self = StObject.set(x, "keyModifiers", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionChangeEventArgs extends StObject {
    
    /** parameter defines whether to cancel the change or not
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the new source node or target node of the connector
      */
    var connection: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the connection that is changed between nodes, ports or points
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the new source port or target port of the connector
      */
    var port: js.UndefOr[js.Any] = js.native
  }
  object ConnectionChangeEventArgs {
    
    @scala.inline
    def apply(): ConnectionChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionChangeEventArgs]
    }
    
    @scala.inline
    implicit class ConnectionChangeEventArgsMutableBuilder[Self <: ConnectionChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setPort(value: js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait Connector extends StObject {
    
    /** To maintain additional information about connectors
      * @Default {null}
      */
    var addInfo: js.UndefOr[js.Any] = js.native
    
    /** Defines the width of the line bridges
      * @Default {10}
      */
    var bridgeSpace: js.UndefOr[Double] = js.native
    
    /** Enables or disables the behaviors of connectors.
      * @Default {ej.datavisualization.Diagram.ConnectorConstraints.Default}
      */
    var constraints: js.UndefOr[ConnectorConstraints | String] = js.native
    
    /** Defines the radius of the rounded corner
      * @Default {0}
      */
    var cornerRadius: js.UndefOr[Double] = js.native
    
    /** This property allows you to customize connectors appearance using user-defined CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Sets the horizontal alignment of the connector. Applicable, if the parent of the connector is a container.
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Left}
      */
    var horizontalAlign: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** A collection of JSON objects where each object represents a label.
      * @Default {[]}
      */
    var labels: js.UndefOr[js.Array[ConnectorsLabel]] = js.native
    
    /** Sets the stroke color of the connector
      * @Default {black}
      */
    var lineColor: js.UndefOr[String] = js.native
    
    /** Sets the pattern of dashes and gaps used to stroke the path of the connector
      */
    var lineDashArray: js.UndefOr[String] = js.native
    
    /** Defines the padding value to ease the interaction with connectors
      * @Default {10}
      */
    var lineHitPadding: js.UndefOr[Double] = js.native
    
    /** Sets the width of the line
      * @Default {1}
      */
    var lineWidth: js.UndefOr[Double] = js.native
    
    /** Defines the minimum space to be left between the bottom of parent bounds and the connector. Applicable, if the parent is a container.
      * @Default {0}
      */
    var marginBottom: js.UndefOr[Double] = js.native
    
    /** Defines the minimum space to be left between the left of parent bounds and the connector. Applicable, if the parent is a container.
      * @Default {0}
      */
    var marginLeft: js.UndefOr[Double] = js.native
    
    /** Defines the minimum space to be left between the right of parent bounds and the connector. Applicable, if the parent is a container.
      * @Default {0}
      */
    var marginRight: js.UndefOr[Double] = js.native
    
    /** Defines the minimum space to be left between the top of parent bounds and the connector. Applicable, if the parent is a container.
      * @Default {0}
      */
    var marginTop: js.UndefOr[Double] = js.native
    
    /** Sets a unique name for the connector
      */
    var name: js.UndefOr[String] = js.native
    
    /** Defines the transparency of the connector
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Defines the size and preview size of the node to add that to symbol palette. To explore palette item, refer Palette Item
      * @Default {null}
      */
    var paletteItem: js.UndefOr[js.Any] = js.native
    
    /** Sets the parent name of the connector.
      */
    var parent: js.UndefOr[String] = js.native
    
    /** An array of JSON objects where each object represents a segment
      * @Default {[ { type:straight } ]}
      */
    var segments: js.UndefOr[js.Array[ConnectorsSegment]] = js.native
    
    /** Defines the role/meaning of the connector
      * @Default {null}
      */
    var shape: js.UndefOr[ConnectorsShape] = js.native
    
    /** Defines the source decorator of the connector
      * @Default {{ shape:arrow, width: 8, height:8, borderColor:black, fillColor:black }}
      */
    var sourceDecorator: js.UndefOr[ConnectorsSourceDecorator] = js.native
    
    /** Sets the source node of the connector
      */
    var sourceNode: js.UndefOr[String] = js.native
    
    /** Defines the space to be left between the source node and the source point of a connector
      * @Default {0}
      */
    var sourcePadding: js.UndefOr[Double] = js.native
    
    /** Describes the start point of the connector
      * @Default {ej.datavisualization.Diagram.Point()}
      */
    var sourcePoint: js.UndefOr[ConnectorsSourcePoint] = js.native
    
    /** Sets the source port of the connector
      */
    var sourcePort: js.UndefOr[String] = js.native
    
    /** Defines the target decorator of the connector
      * @Default {{ shape:arrow, width: 8, height:8, borderColor:black, fillColor:black }}
      */
    var targetDecorator: js.UndefOr[ConnectorsTargetDecorator] = js.native
    
    /** Sets the target node of the connector
      */
    var targetNode: js.UndefOr[String] = js.native
    
    /** Defines the space to be left between the target node and the target point of the connector
      * @Default {0}
      */
    var targetPadding: js.UndefOr[Double] = js.native
    
    /** Describes the end point of the connector
      * @Default {ej.datavisualization.Diagram.Point()}
      */
    var targetPoint: js.UndefOr[ConnectorsSourcePoint] = js.native
    
    /** Sets the targetPort of the connector
      */
    var targetPort: js.UndefOr[String] = js.native
    
    /** Defines the tooltip that should be shown when the mouse hovers over connector. For tooltip properties, refer Tooltip
      * @Default {null}
      */
    var tooltip: js.UndefOr[js.Any] = js.native
    
    /** To set the vertical alignment of connector (Applicable,if the parent is group).
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Top}
      */
    var verticalAlign: js.UndefOr[VerticalAlignment | String] = js.native
    
    /** Enables or disables the visibility of connector
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Sets the z-index of the connector
      * @Default {0}
      */
    var zOrder: js.UndefOr[Double] = js.native
  }
  object Connector {
    
    @scala.inline
    def apply(): Connector = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Connector]
    }
    
    @scala.inline
    implicit class ConnectorMutableBuilder[Self <: Connector] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddInfo(value: js.Any): Self = StObject.set(x, "addInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddInfoUndefined: Self = StObject.set(x, "addInfo", js.undefined)
      
      @scala.inline
      def setBridgeSpace(value: Double): Self = StObject.set(x, "bridgeSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridgeSpaceUndefined: Self = StObject.set(x, "bridgeSpace", js.undefined)
      
      @scala.inline
      def setConstraints(value: ConnectorConstraints | String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setHorizontalAlign(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Array[ConnectorsLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: ConnectorsLabel*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      @scala.inline
      def setLineDashArray(value: String): Self = StObject.set(x, "lineDashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashArrayUndefined: Self = StObject.set(x, "lineDashArray", js.undefined)
      
      @scala.inline
      def setLineHitPadding(value: Double): Self = StObject.set(x, "lineHitPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHitPaddingUndefined: Self = StObject.set(x, "lineHitPadding", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPaletteItem(value: js.Any): Self = StObject.set(x, "paletteItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteItemUndefined: Self = StObject.set(x, "paletteItem", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setSegments(value: js.Array[ConnectorsSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
      
      @scala.inline
      def setSegmentsVarargs(value: ConnectorsSegment*): Self = StObject.set(x, "segments", js.Array(value :_*))
      
      @scala.inline
      def setShape(value: ConnectorsShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSourceDecorator(value: ConnectorsSourceDecorator): Self = StObject.set(x, "sourceDecorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDecoratorUndefined: Self = StObject.set(x, "sourceDecorator", js.undefined)
      
      @scala.inline
      def setSourceNode(value: String): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
      
      @scala.inline
      def setSourcePadding(value: Double): Self = StObject.set(x, "sourcePadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePaddingUndefined: Self = StObject.set(x, "sourcePadding", js.undefined)
      
      @scala.inline
      def setSourcePoint(value: ConnectorsSourcePoint): Self = StObject.set(x, "sourcePoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePointUndefined: Self = StObject.set(x, "sourcePoint", js.undefined)
      
      @scala.inline
      def setSourcePort(value: String): Self = StObject.set(x, "sourcePort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePortUndefined: Self = StObject.set(x, "sourcePort", js.undefined)
      
      @scala.inline
      def setTargetDecorator(value: ConnectorsTargetDecorator): Self = StObject.set(x, "targetDecorator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetDecoratorUndefined: Self = StObject.set(x, "targetDecorator", js.undefined)
      
      @scala.inline
      def setTargetNode(value: String): Self = StObject.set(x, "targetNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNodeUndefined: Self = StObject.set(x, "targetNode", js.undefined)
      
      @scala.inline
      def setTargetPadding(value: Double): Self = StObject.set(x, "targetPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPaddingUndefined: Self = StObject.set(x, "targetPadding", js.undefined)
      
      @scala.inline
      def setTargetPoint(value: ConnectorsSourcePoint): Self = StObject.set(x, "targetPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPointUndefined: Self = StObject.set(x, "targetPoint", js.undefined)
      
      @scala.inline
      def setTargetPort(value: String): Self = StObject.set(x, "targetPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPortUndefined: Self = StObject.set(x, "targetPort", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorCollectionChangeEventArgs extends StObject {
    
    /** parameter defines whether to cancel the collection change or not
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns whether the connector is inserted or removed
      */
    var changeType: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the connector that is to be added or deleted
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** triggers before and after adding the connector in the diagram which can be differentiated through `state` argument. We can cancel the event only before adding the connector.
      */
    var state: js.UndefOr[String] = js.native
  }
  object ConnectorCollectionChangeEventArgs {
    
    @scala.inline
    def apply(): ConnectorCollectionChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorCollectionChangeEventArgs]
    }
    
    @scala.inline
    implicit class ConnectorCollectionChangeEventArgsMutableBuilder[Self <: ConnectorCollectionChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorSourceChangeEventArgs extends StObject {
    
    /** parameter defines whether to cancel the change or not
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** returns the state of connection end point dragging(starting, dragging, completed)
      */
    var dragState: js.UndefOr[String] = js.native
    
    /** returns the connector, the source point of which is being dragged
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the source node of the element
      */
    var node: js.UndefOr[js.Any] = js.native
    
    /** returns the source point of the element
      */
    var point: js.UndefOr[js.Any] = js.native
    
    /** returns the source port of the element
      */
    var port: js.UndefOr[js.Any] = js.native
  }
  object ConnectorSourceChangeEventArgs {
    
    @scala.inline
    def apply(): ConnectorSourceChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorSourceChangeEventArgs]
    }
    
    @scala.inline
    implicit class ConnectorSourceChangeEventArgsMutableBuilder[Self <: ConnectorSourceChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setDragState(value: String): Self = StObject.set(x, "dragState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragStateUndefined: Self = StObject.set(x, "dragState", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setPoint(value: js.Any): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      @scala.inline
      def setPort(value: js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorTargetChangeEventArgs extends StObject {
    
    /** parameter defines whether to cancel the change or not
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** returns the state of connection end point dragging(starting, dragging, completed)
      */
    var dragState: js.UndefOr[String] = js.native
    
    /** parameter returns the connector, the target point of which is being dragged
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** returns the target node of the element
      */
    var node: js.UndefOr[js.Any] = js.native
    
    /** returns the target point of the element
      */
    var point: js.UndefOr[js.Any] = js.native
    
    /** returns the target port of the element
      */
    var port: js.UndefOr[js.Any] = js.native
  }
  object ConnectorTargetChangeEventArgs {
    
    @scala.inline
    def apply(): ConnectorTargetChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorTargetChangeEventArgs]
    }
    
    @scala.inline
    implicit class ConnectorTargetChangeEventArgsMutableBuilder[Self <: ConnectorTargetChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setDragState(value: String): Self = StObject.set(x, "dragState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragStateUndefined: Self = StObject.set(x, "dragState", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setPoint(value: js.Any): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      @scala.inline
      def setPort(value: js.Any): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsLabel extends StObject {
    
    /** Defines how the label should be aligned with respect to the segment
      * @Default {ej.datavisualization.Diagram.Alignment.Center}
      */
    var alignment: js.UndefOr[Alignment | String] = js.native
    
    /** Enables/disables the bold style
      * @Default {false}
      */
    var bold: js.UndefOr[Boolean] = js.native
    
    /** Sets the border color of the label
      * @Default {transparent}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Sets the border width of the label
      * @Default {0}
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /** Defines whether the label should be aligned within the connector boundaries
      * @Default {true}
      */
    var boundaryConstraints: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the default behaviors of the label.
      * @Default {ej.datavisualization.Diagram.LabelConstraints.None}
      */
    var constraints: js.UndefOr[LabelConstraints | String] = js.native
    
    /** Sets the value which is used to drag the label within certain bounds.
      * @Default {null}
      */
    var dragLimit: js.UndefOr[ConnectorsLabelsDragLimit] = js.native
    
    /** Sets the fill color of the text area
      * @Default {transparent}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Sets the font color of the text
      * @Default {black}
      */
    var fontColor: js.UndefOr[String] = js.native
    
    /** Sets the font family of the text
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Defines the font size of the text
      * @Default {12}
      */
    var fontSize: js.UndefOr[Double] = js.native
    
    /** Sets the height of the label(the maximum value of label height and the connector height will be considered as label height)
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets the horizontal alignment of the label.
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** Sets the hyperlink for the labels in the connectors.
      * @Default {none}
      */
    var hyperlink: js.UndefOr[String] = js.native
    
    /** Enables/disables the italic style
      * @Default {false}
      */
    var italic: js.UndefOr[Boolean] = js.native
    
    /** Sets the fraction/ratio(relative to connector) that defines the position of the label
      * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
      */
    var margin: js.UndefOr[ConnectorsLabelsMargin] = js.native
    
    /** Gets whether the label is currently being edited or not.
      * @Default {ej.datavisualization.Diagram.LabelEditMode.Edit}
      */
    var mode: js.UndefOr[LabelEditMode | String] = js.native
    
    /** Sets the unique identifier of the label
      */
    var name: js.UndefOr[String] = js.native
    
    /** Sets the fraction/ratio(relative to connector) that defines the position of the label
      * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** Defines the transparency of labels
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Sets the padding for connector label.
      * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
      */
    var padding: js.UndefOr[js.Any] = js.native
    
    /** Defines whether the label is editable or not
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /** Defines whether the label should be positioned whether relative to segments or connector boundaries
      * @Default {ej.datavisualization.Diagram.LabelRelativeMode.SegmentPath}
      */
    var relativeMode: js.UndefOr[LabelRelativeMode | String] = js.native
    
    /** Defines the angle to which the label needs to be rotated
      * @Default {0}
      */
    var rotateAngle: js.UndefOr[Double] = js.native
    
    /** Sets the position of the label with respect to the total segment length
      * @Default {0.5}
      */
    var segmentOffset: js.UndefOr[String] = js.native
    
    /** Defines the label text
      */
    var text: js.UndefOr[String] = js.native
    
    /** Defines how to align the text inside the label.
      * @Default {ej.datavisualization.Diagram.TextAlign.Center}
      */
    var textAlign: js.UndefOr[typingsSlinky.ejWebAll.ej.TextAlign | String] = js.native
    
    /** Sets how to decorate the label text.
      * @Default {ej.datavisualization.Diagram.TextDecorations.None}
      */
    var textDecoration: js.UndefOr[TextDecorations | String] = js.native
    
    /** Sets the vertical alignment of the label.
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
    
    /** Enables or disables the visibility of the label
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Sets the width of the label(the maximum value of label width and the connector width will be considered as label width)
      * @Default {50}
      */
    var width: js.UndefOr[Double] = js.native
    
    /** Defines how the label text needs to be wrapped.
      * @Default {ej.datavisualization.Diagram.TextWrapping.WrapWithOverflow}
      */
    var wrapping: js.UndefOr[TextWrapping | String] = js.native
  }
  object ConnectorsLabel {
    
    @scala.inline
    def apply(): ConnectorsLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsLabel]
    }
    
    @scala.inline
    implicit class ConnectorsLabelMutableBuilder[Self <: ConnectorsLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: Alignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setBoundaryConstraints(value: Boolean): Self = StObject.set(x, "boundaryConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryConstraintsUndefined: Self = StObject.set(x, "boundaryConstraints", js.undefined)
      
      @scala.inline
      def setConstraints(value: LabelConstraints | String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setDragLimit(value: ConnectorsLabelsDragLimit): Self = StObject.set(x, "dragLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragLimitUndefined: Self = StObject.set(x, "dragLimit", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setMargin(value: ConnectorsLabelsMargin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMode(value: LabelEditMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRelativeMode(value: LabelRelativeMode | String): Self = StObject.set(x, "relativeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeModeUndefined: Self = StObject.set(x, "relativeMode", js.undefined)
      
      @scala.inline
      def setRotateAngle(value: Double): Self = StObject.set(x, "rotateAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateAngleUndefined: Self = StObject.set(x, "rotateAngle", js.undefined)
      
      @scala.inline
      def setSegmentOffset(value: String): Self = StObject.set(x, "segmentOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentOffsetUndefined: Self = StObject.set(x, "segmentOffset", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlign(value: typingsSlinky.ejWebAll.ej.TextAlign | String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: TextDecorations | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapping(value: TextWrapping | String): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsLabelsDragLimit extends StObject {
    
    /** To set the drag limit of the label in bottom direction
      * @Default {10}
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** To set the drag limit of the label in left direction
      * @Default {10}
      */
    var left: js.UndefOr[Double] = js.native
    
    /** To set the drag limit of the label in right direction
      * @Default {10}
      */
    var right: js.UndefOr[Double] = js.native
    
    /** To set the drag limit of the label in top direction
      * @Default {10}
      */
    var top: js.UndefOr[Double] = js.native
  }
  object ConnectorsLabelsDragLimit {
    
    @scala.inline
    def apply(): ConnectorsLabelsDragLimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsLabelsDragLimit]
    }
    
    @scala.inline
    implicit class ConnectorsLabelsDragLimitMutableBuilder[Self <: ConnectorsLabelsDragLimit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsLabelsMargin extends StObject {
    
    /** To set the margin of the label in bottom direction
      * @Default {0}
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** To set the margin of the label in left direction
      * @Default {0}
      */
    var left: js.UndefOr[Double] = js.native
    
    /** To set the margin of the label in right direction
      * @Default {0}
      */
    var right: js.UndefOr[Double] = js.native
    
    /** To set the margin of the label in top direction
      * @Default {0}
      */
    var top: js.UndefOr[Double] = js.native
  }
  object ConnectorsLabelsMargin {
    
    @scala.inline
    def apply(): ConnectorsLabelsMargin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsLabelsMargin]
    }
    
    @scala.inline
    implicit class ConnectorsLabelsMarginMutableBuilder[Self <: ConnectorsLabelsMargin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsSegment extends StObject {
    
    /** Sets the direction of orthogonal segment
      */
    var direction: js.UndefOr[String] = js.native
    
    /** Describes the length of orthogonal segment
      * @Default {undefined}
      */
    var length: js.UndefOr[Double] = js.native
    
    /** Describes the end point of bezier/straight segment
      * @Default {Diagram.Point()}
      */
    var point: js.UndefOr[ConnectorsSourcePoint] = js.native
    
    /** Defines the first control point of the bezier segment
      * @Default {null}
      */
    var point1: js.UndefOr[ConnectorsSourcePoint] = js.native
    
    /** Defines the second control point of bezier segment
      * @Default {null}
      */
    var point2: js.UndefOr[ConnectorsSourcePoint] = js.native
    
    /** Sets the type of the segment.
      * @Default {ej.datavisualization.Diagram.Segments.Straight}
      */
    var `type`: js.UndefOr[Segments | String] = js.native
    
    /** Describes the length and angle between the first control point and the start point of bezier segment
      * @Default {null}
      */
    var vector1: js.UndefOr[js.Any] = js.native
    
    /** Describes the length and angle between the second control point and end point of bezier segment
      * @Default {null}
      */
    var vector2: js.UndefOr[js.Any] = js.native
  }
  object ConnectorsSegment {
    
    @scala.inline
    def apply(): ConnectorsSegment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsSegment]
    }
    
    @scala.inline
    implicit class ConnectorsSegmentMutableBuilder[Self <: ConnectorsSegment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setPoint(value: ConnectorsSourcePoint): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint1(value: ConnectorsSourcePoint): Self = StObject.set(x, "point1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint1Undefined: Self = StObject.set(x, "point1", js.undefined)
      
      @scala.inline
      def setPoint2(value: ConnectorsSourcePoint): Self = StObject.set(x, "point2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoint2Undefined: Self = StObject.set(x, "point2", js.undefined)
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      @scala.inline
      def setType(value: Segments | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVector1(value: js.Any): Self = StObject.set(x, "vector1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVector1Undefined: Self = StObject.set(x, "vector1", js.undefined)
      
      @scala.inline
      def setVector2(value: js.Any): Self = StObject.set(x, "vector2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVector2Undefined: Self = StObject.set(x, "vector2", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsShape extends StObject {
    
    /** Defines the shape of UMLActivity to connector. Applicable, if the connector is of type UMLActivity
      * @Default {ej.datavisualization.Diagram.UMLActivityFlow.Control}
      */
    var ActivityFlow: js.UndefOr[UMLActivityFlow | String] = js.native
    
    /** Sets the type of the Association in a BPMN Process
      * @Default {ej.datavisualization.Diagram.AssociationFlows.Default}
      */
    var association: js.UndefOr[AssociationFlows | String] = js.native
    
    /** Sets the type of the flow in a BPMN Process
      * @Default {ej.datavisualization.Diagram.BPMNFlows.Sequence}
      */
    var flow: js.UndefOr[BPMNFlows | String] = js.native
    
    /** Sets the type of the message flow. Applicable, if the connector is of type &quot;BPMN&quot;
      * @Default {ej.datavisualization.Diagram.BPMNMessageFlows.Default}
      */
    var message: js.UndefOr[BPMNMessageFlows | String] = js.native
    
    /** Defines the multiplicity option of the connector
      * @Default {null}
      */
    var multiplicity: js.UndefOr[ConnectorsShapeMultiplicity] = js.native
    
    /** Defines the role of the connector in a UML Class Diagram. Applicable, if the type of the connector is &quot;classifier&quot;.
      * @Default {ej.datavisualization.Diagram.ClassifierShapes.Association}
      */
    var relationship: js.UndefOr[ClassifierShapes | String] = js.native
    
    /** Sets the type of BPMN sequence flow
      * @Default {ej.datavisualization.Diagram.BPMNSequenceFlows.Normal}
      */
    var sequence: js.UndefOr[BPMNSequenceFlows | String] = js.native
    
    /** Sets the type of the connector
      * @Default {ej.datavisualization.Diagram.ConnectorShapes.BPMN}
      */
    var `type`: js.UndefOr[ConnectorShapes | String] = js.native
  }
  object ConnectorsShape {
    
    @scala.inline
    def apply(): ConnectorsShape = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsShape]
    }
    
    @scala.inline
    implicit class ConnectorsShapeMutableBuilder[Self <: ConnectorsShape] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivityFlow(value: UMLActivityFlow | String): Self = StObject.set(x, "ActivityFlow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityFlowUndefined: Self = StObject.set(x, "ActivityFlow", js.undefined)
      
      @scala.inline
      def setAssociation(value: AssociationFlows | String): Self = StObject.set(x, "association", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationUndefined: Self = StObject.set(x, "association", js.undefined)
      
      @scala.inline
      def setFlow(value: BPMNFlows | String): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
      
      @scala.inline
      def setMessage(value: BPMNMessageFlows | String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setMultiplicity(value: ConnectorsShapeMultiplicity): Self = StObject.set(x, "multiplicity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplicityUndefined: Self = StObject.set(x, "multiplicity", js.undefined)
      
      @scala.inline
      def setRelationship(value: ClassifierShapes | String): Self = StObject.set(x, "relationship", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelationshipUndefined: Self = StObject.set(x, "relationship", js.undefined)
      
      @scala.inline
      def setSequence(value: BPMNSequenceFlows | String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
      
      @scala.inline
      def setType(value: ConnectorShapes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsShapeMultiplicity extends StObject {
    
    /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
      */
    var source: js.UndefOr[ConnectorsShapeMultiplicitySource] = js.native
    
    /** Defines the target label to connector. Applicable, if the connector is of type &quot;UML&quot;
      * @Default {true}
      */
    var target: js.UndefOr[ConnectorsShapeMultiplicitySource] = js.native
    
    /** Sets the type of the multiplicity. Applicable, if the connector is of type &quot;classifier&quot;
      * @Default {ej.datavisualization.Diagram.Multiplicity.OneToOne}
      */
    var `type`: js.UndefOr[Multiplicity | String] = js.native
  }
  object ConnectorsShapeMultiplicity {
    
    @scala.inline
    def apply(): ConnectorsShapeMultiplicity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsShapeMultiplicity]
    }
    
    @scala.inline
    implicit class ConnectorsShapeMultiplicityMutableBuilder[Self <: ConnectorsShapeMultiplicity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: ConnectorsShapeMultiplicitySource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: ConnectorsShapeMultiplicitySource): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: Multiplicity | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsShapeMultiplicitySource extends StObject {
    
    /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
      * @Default {null}
      */
    var lowerBounds: js.UndefOr[Double] = js.native
    
    /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
      * @Default {true}
      */
    var optional: js.UndefOr[Boolean] = js.native
    
    /** Defines the source label to connector. Applicable, if the connector is of type &quot;UML&quot;
      * @Default {null}
      */
    var upperBounds: js.UndefOr[Double] = js.native
  }
  object ConnectorsShapeMultiplicitySource {
    
    @scala.inline
    def apply(): ConnectorsShapeMultiplicitySource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsShapeMultiplicitySource]
    }
    
    @scala.inline
    implicit class ConnectorsShapeMultiplicitySourceMutableBuilder[Self <: ConnectorsShapeMultiplicitySource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLowerBounds(value: Double): Self = StObject.set(x, "lowerBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowerBoundsUndefined: Self = StObject.set(x, "lowerBounds", js.undefined)
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
      
      @scala.inline
      def setUpperBounds(value: Double): Self = StObject.set(x, "upperBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpperBoundsUndefined: Self = StObject.set(x, "upperBounds", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsSourceDecorator extends StObject {
    
    /** Sets the border color of the source decorator
      * @Default {black}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Sets the border width of the decorator
      * @Default {1}
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /** This property allows you to customize sourceDecorator appearance using user-defined CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Sets the fill color of the source decorator
      * @Default {black}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Sets the height of the source decorator
      * @Default {8}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Defines the custom shape of the source decorator
      */
    var pathData: js.UndefOr[String] = js.native
    
    /** Defines the shape of the source decorator.
      * @Default {ej.datavisualization.Diagram.DecoratorShapes.Arrow}
      */
    var shape: js.UndefOr[DecoratorShapes | String] = js.native
    
    /** Defines the width of the source decorator
      * @Default {8}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ConnectorsSourceDecorator {
    
    @scala.inline
    def apply(): ConnectorsSourceDecorator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsSourceDecorator]
    }
    
    @scala.inline
    implicit class ConnectorsSourceDecoratorMutableBuilder[Self <: ConnectorsSourceDecorator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPathData(value: String): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathDataUndefined: Self = StObject.set(x, "pathData", js.undefined)
      
      @scala.inline
      def setShape(value: DecoratorShapes | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsSourcePoint extends StObject {
    
    /** Defines the x-coordinate of a position
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Defines the y-coordinate of a position
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object ConnectorsSourcePoint {
    
    @scala.inline
    def apply(): ConnectorsSourcePoint = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsSourcePoint]
    }
    
    @scala.inline
    implicit class ConnectorsSourcePointMutableBuilder[Self <: ConnectorsSourcePoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ConnectorsTargetDecorator extends StObject {
    
    /** Sets the border color of the decorator
      * @Default {black}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** This property allows you to customize targetDecorator appearance using user-defined CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Sets the color with which the decorator will be filled
      * @Default {black}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Defines the height of the target decorator
      * @Default {8}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Defines the custom shape of the target decorator
      */
    var pathData: js.UndefOr[String] = js.native
    
    /** Defines the shape of the target decorator.
      * @Default {ej.datavisualization.Diagram.DecoratorShapes.Arrow}
      */
    var shape: js.UndefOr[DecoratorShapes | String] = js.native
    
    /** Defines the width of the target decorator
      * @Default {8}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ConnectorsTargetDecorator {
    
    @scala.inline
    def apply(): ConnectorsTargetDecorator = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectorsTargetDecorator]
    }
    
    @scala.inline
    implicit class ConnectorsTargetDecoratorMutableBuilder[Self <: ConnectorsTargetDecorator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setPathData(value: String): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathDataUndefined: Self = StObject.set(x, "pathData", js.undefined)
      
      @scala.inline
      def setShape(value: DecoratorShapes | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ContextMenu extends StObject {
    
    /** Defines the collection of context menu items
      * @Default {[]}
      */
    var items: js.UndefOr[js.Array[ContextMenuItem]] = js.native
    
    /** To set whether to display the default context menu items or not
      * @Default {false}
      */
    var showCustomMenuItemsOnly: js.UndefOr[Boolean] = js.native
  }
  object ContextMenu {
    
    @scala.inline
    def apply(): ContextMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenu]
    }
    
    @scala.inline
    implicit class ContextMenuMutableBuilder[Self <: ContextMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[ContextMenuItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: ContextMenuItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setShowCustomMenuItemsOnly(value: Boolean): Self = StObject.set(x, "showCustomMenuItemsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCustomMenuItemsOnlyUndefined: Self = StObject.set(x, "showCustomMenuItemsOnly", js.undefined)
    }
  }
  
  @js.native
  trait ContextMenuBeforeOpenEventArgs extends StObject {
    
    /** parameter returns whether or not to cancel the dragOver event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the actual arguments from context menu
      */
    var contextmenu: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the diagram object
      */
    var diagram: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the actual click event arguments that explains which button is clicked
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the object that was clicked
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the type of the event triggered
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ContextMenuBeforeOpenEventArgs {
    
    @scala.inline
    def apply(): ContextMenuBeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuBeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit class ContextMenuBeforeOpenEventArgsMutableBuilder[Self <: ContextMenuBeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContextmenu(value: js.Any): Self = StObject.set(x, "contextmenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextmenuUndefined: Self = StObject.set(x, "contextmenu", js.undefined)
      
      @scala.inline
      def setDiagram(value: js.Any): Self = StObject.set(x, "diagram", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setDiagramUndefined: Self = StObject.set(x, "diagram", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ContextMenuClickEventArgs extends StObject {
    
    /** parameter defines whether to execute the click event or not
      */
    var canExecute: js.UndefOr[Boolean] = js.native
    
    /** parameter to specify whether or not to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the element of the object that was clicked
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the model of the diagram
      */
    var events: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the id of the selected context menu item
      */
    var id: js.UndefOr[String] = js.native
    
    /** parameter returns the parent id of the selected context menu item
      */
    var parentId: js.UndefOr[String] = js.native
    
    /** parameter returns the parent text of the selected context menu item
      */
    var parentText: js.UndefOr[String] = js.native
    
    /** parameter returns the object that is selected
      */
    var selectedItem: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the object that was clicked
      */
    var target: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the text of the selected context menu item
      */
    var text: js.UndefOr[String] = js.native
  }
  object ContextMenuClickEventArgs {
    
    @scala.inline
    def apply(): ContextMenuClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuClickEventArgs]
    }
    
    @scala.inline
    implicit class ContextMenuClickEventArgsMutableBuilder[Self <: ContextMenuClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanExecute(value: Boolean): Self = StObject.set(x, "canExecute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanExecuteUndefined: Self = StObject.set(x, "canExecute", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      @scala.inline
      def setParentText(value: String): Self = StObject.set(x, "parentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentTextUndefined: Self = StObject.set(x, "parentText", js.undefined)
      
      @scala.inline
      def setSelectedItem(value: js.Any): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ContextMenuItem extends StObject {
    
    /** Defines the CssClass for the collection of context menu items
      * @Default {null}
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Defines the image url for the collection of context menu items
      * @Default {null}
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /** Defines the name for the collection of context menu items
      * @Default {null}
      */
    var name: js.UndefOr[String] = js.native
    
    /** Defines the collection of sub items for the context menu items
      * @Default {[]}
      */
    var subItems: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines the text for the collection of context menu item
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
  }
  object ContextMenuItem {
    
    @scala.inline
    def apply(): ContextMenuItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuItem]
    }
    
    @scala.inline
    implicit class ContextMenuItemMutableBuilder[Self <: ContextMenuItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSubItems(value: js.Array[_]): Self = StObject.set(x, "subItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubItemsUndefined: Self = StObject.set(x, "subItems", js.undefined)
      
      @scala.inline
      def setSubItemsVarargs(value: js.Any*): Self = StObject.set(x, "subItems", js.Array(value :_*))
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** Returns the diagram model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceSettings extends StObject {
    
    /** Defines the data source either as a collection of objects or as an instance of ej.DataManager
      * @Default {null}
      */
    var connectionDataSource: js.UndefOr[DataSourceSettingsConnectionDataSource] = js.native
    
    /** Specifies the method name which is used to get the updated data from client side to the server side
      * @Default {null}
      */
    var crudAction: js.UndefOr[DataSourceSettingsCrudAction] = js.native
    
    /** Specifies the custom fields to get the updated data from client side to the server side
      * @Default {[]}
      */
    var customFields: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines the data source either as a collection of objects or as an instance of ej.DataManager
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.native
    
    /** Sets the unique id of the data source items
      */
    var id: js.UndefOr[String] = js.native
    
    /** Defines the parent id of the data source item
      * @Default {''}
      */
    var parent: js.UndefOr[String] = js.native
    
    /** Describes query to retrieve a set of data from the specified datasource
      * @Default {null}
      */
    var query: js.UndefOr[String] = js.native
    
    /** Sets the unique id of the root data source item
      */
    var root: js.UndefOr[String] = js.native
    
    /** Describes the name of the table on which the specified query has to be executed
      * @Default {null}
      */
    var tableName: js.UndefOr[String] = js.native
  }
  object DataSourceSettings {
    
    @scala.inline
    def apply(): DataSourceSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceSettings]
    }
    
    @scala.inline
    implicit class DataSourceSettingsMutableBuilder[Self <: DataSourceSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionDataSource(value: DataSourceSettingsConnectionDataSource): Self = StObject.set(x, "connectionDataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionDataSourceUndefined: Self = StObject.set(x, "connectionDataSource", js.undefined)
      
      @scala.inline
      def setCrudAction(value: DataSourceSettingsCrudAction): Self = StObject.set(x, "crudAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrudActionUndefined: Self = StObject.set(x, "crudAction", js.undefined)
      
      @scala.inline
      def setCustomFields(value: js.Array[_]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
      
      @scala.inline
      def setCustomFieldsVarargs(value: js.Any*): Self = StObject.set(x, "customFields", js.Array(value :_*))
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setTableName(value: String): Self = StObject.set(x, "tableName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTableNameUndefined: Self = StObject.set(x, "tableName", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceSettingsConnectionDataSource extends StObject {
    
    /** Specifies the method name which is used to get updated connectors from client side to the server side
      * @Default {null}
      */
    var crudAction: js.UndefOr[DataSourceSettingsConnectionDataSourceCrudAction] = js.native
    
    /** Specifies the custom fields to get the updated data from client side to the server side
      * @Default {[]}
      */
    var customFields: js.UndefOr[js.Array[_]] = js.native
    
    /** Sets the datasource for the connection datasource settings items.
      * @Default {null}
      */
    var dataSource: js.UndefOr[String] = js.native
    
    /** Sets the unique id of the connection data source item
      * @Default {null}
      */
    var id: js.UndefOr[String] = js.native
    
    /** Sets the source node of the connection data source item
      * @Default {null}
      */
    var sourceNode: js.UndefOr[String] = js.native
    
    /** Sets the sourcePointX value of the connection data source item
      * @Default {null}
      */
    var sourcePointX: js.UndefOr[String] = js.native
    
    /** Sets the sourcePointY value of the connection data source item
      * @Default {null}
      */
    var sourcePointY: js.UndefOr[String] = js.native
    
    /** Sets the target node of the connection data source item
      * @Default {null}
      */
    var targetNode: js.UndefOr[String] = js.native
    
    /** Sets the targetPoint-x value of the connection data source item
      * @Default {null}
      */
    var targetPointX: js.UndefOr[String] = js.native
    
    /** Sets the targetPoint-y value of the connection data source item
      * @Default {null}
      */
    var targetPointY: js.UndefOr[String] = js.native
  }
  object DataSourceSettingsConnectionDataSource {
    
    @scala.inline
    def apply(): DataSourceSettingsConnectionDataSource = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceSettingsConnectionDataSource]
    }
    
    @scala.inline
    implicit class DataSourceSettingsConnectionDataSourceMutableBuilder[Self <: DataSourceSettingsConnectionDataSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrudAction(value: DataSourceSettingsConnectionDataSourceCrudAction): Self = StObject.set(x, "crudAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrudActionUndefined: Self = StObject.set(x, "crudAction", js.undefined)
      
      @scala.inline
      def setCustomFields(value: js.Array[_]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
      
      @scala.inline
      def setCustomFieldsVarargs(value: js.Any*): Self = StObject.set(x, "customFields", js.Array(value :_*))
      
      @scala.inline
      def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setSourceNode(value: String): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
      
      @scala.inline
      def setSourcePointX(value: String): Self = StObject.set(x, "sourcePointX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePointXUndefined: Self = StObject.set(x, "sourcePointX", js.undefined)
      
      @scala.inline
      def setSourcePointY(value: String): Self = StObject.set(x, "sourcePointY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePointYUndefined: Self = StObject.set(x, "sourcePointY", js.undefined)
      
      @scala.inline
      def setTargetNode(value: String): Self = StObject.set(x, "targetNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNodeUndefined: Self = StObject.set(x, "targetNode", js.undefined)
      
      @scala.inline
      def setTargetPointX(value: String): Self = StObject.set(x, "targetPointX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPointXUndefined: Self = StObject.set(x, "targetPointX", js.undefined)
      
      @scala.inline
      def setTargetPointY(value: String): Self = StObject.set(x, "targetPointY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPointYUndefined: Self = StObject.set(x, "targetPointY", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceSettingsConnectionDataSourceCrudAction extends StObject {
    
    /** Specifies the create method which is used to get the connectors to be added from client side to the server side
      * @Default {null}
      */
    var create: js.UndefOr[String] = js.native
    
    /** Specifies the destroy method which is used to get the deleted items data from client side to the server side
      * @Default {null}
      */
    var destroy: js.UndefOr[String] = js.native
    
    /** Specifies the read method which is used to get the data from client side to the server side
      * @Default {null}
      */
    var read: js.UndefOr[String] = js.native
    
    /** Specifies the update method which is used to get the updated connectors from client side to the server side
      * @Default {null}
      */
    var update: js.UndefOr[String] = js.native
  }
  object DataSourceSettingsConnectionDataSourceCrudAction {
    
    @scala.inline
    def apply(): DataSourceSettingsConnectionDataSourceCrudAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceSettingsConnectionDataSourceCrudAction]
    }
    
    @scala.inline
    implicit class DataSourceSettingsConnectionDataSourceCrudActionMutableBuilder[Self <: DataSourceSettingsConnectionDataSourceCrudAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(value: String): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait DataSourceSettingsCrudAction extends StObject {
    
    /** Specifies the create method which is used to get the nodes to be added from client side to the server side
      * @Default {null}
      */
    var create: js.UndefOr[String] = js.native
    
    /** Specifies the destroy method which is used to get the deleted items data from client side to the server side
      * @Default {null}
      */
    var destroy: js.UndefOr[String] = js.native
    
    /** Specifies the read method to get the created nodes from client side to the server side
      * @Default {null}
      */
    var read: js.UndefOr[String] = js.native
    
    /** Specifies the update method which is used to get the updated data from client side to the server side
      * @Default {null}
      */
    var update: js.UndefOr[String] = js.native
  }
  object DataSourceSettingsCrudAction {
    
    @scala.inline
    def apply(): DataSourceSettingsCrudAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataSourceSettingsCrudAction]
    }
    
    @scala.inline
    implicit class DataSourceSettingsCrudActionMutableBuilder[Self <: DataSourceSettingsCrudAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: String): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDestroy(value: String): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setRead(value: String): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait DefaultSettings extends StObject {
    
    /** Initializes the default connector properties
      * @Default {null}
      */
    var connector: js.UndefOr[js.Any] = js.native
    
    /** Initializes the default properties of groups
      * @Default {null}
      */
    var group: js.UndefOr[js.Any] = js.native
    
    /** Initializes the default properties for nodes
      * @Default {null}
      */
    var node: js.UndefOr[js.Any] = js.native
  }
  object DefaultSettings {
    
    @scala.inline
    def apply(): DefaultSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultSettings]
    }
    
    @scala.inline
    implicit class DefaultSettingsMutableBuilder[Self <: DefaultSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnector(value: js.Any): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorUndefined: Self = StObject.set(x, "connector", js.undefined)
      
      @scala.inline
      def setGroup(value: js.Any): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setNode(value: js.Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  @js.native
  trait DoubleClickEventArgs extends StObject {
    
    /** parameter returns the object that is actually clicked
      */
    var actualObject: js.UndefOr[js.Any] = js.native
    
    /** parameter to specify whether or not to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the selected object
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object DoubleClickEventArgs {
    
    @scala.inline
    def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class DoubleClickEventArgsMutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualObject(value: js.Any): Self = StObject.set(x, "actualObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualObjectUndefined: Self = StObject.set(x, "actualObject", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait DragEnterEventArgs extends StObject {
    
    /** parameter returns whether to add or remove the symbol from diagram
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the node or connector that is dragged into diagram
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object DragEnterEventArgs {
    
    @scala.inline
    def apply(): DragEnterEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEnterEventArgs]
    }
    
    @scala.inline
    implicit class DragEnterEventArgsMutableBuilder[Self <: DragEnterEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait DragEventArgs extends StObject {
    
    /** parameter returns whether or not to cancel the drag event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the state of drag event (Starting, dragging, completed)
      */
    var dragState: js.UndefOr[String] = js.native
    
    /** parameter returns the node or connector that is being dragged
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the new position of the node/connector
      */
    var newValue: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the offset of the selected items
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the previous position of the node/connector
      */
    var oldValue: js.UndefOr[js.Any] = js.native
  }
  object DragEventArgs {
    
    @scala.inline
    def apply(): DragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEventArgs]
    }
    
    @scala.inline
    implicit class DragEventArgsMutableBuilder[Self <: DragEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setDragState(value: String): Self = StObject.set(x, "dragState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragStateUndefined: Self = StObject.set(x, "dragState", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  @js.native
  trait DragLeaveEventArgs extends StObject {
    
    /** parameter returns whether or not to cancel the dragOver event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the node or connector that is dragged outside of the diagram
      */
    var element: js.UndefOr[js.Any] = js.native
  }
  object DragLeaveEventArgs {
    
    @scala.inline
    def apply(): DragLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragLeaveEventArgs]
    }
    
    @scala.inline
    implicit class DragLeaveEventArgsMutableBuilder[Self <: DragLeaveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    }
  }
  
  @js.native
  trait DragOverEventArgs extends StObject {
    
    /** parameter defines whether the symbol can be dropped at the current mouse position
      */
    var allowDrop: js.UndefOr[Boolean] = js.native
    
    /** parameter returns whether or not to cancel the dragOver event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the node or connector that is dragged over diagram
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the new position of the node/connector
      */
    var newValue: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the previous position of the node/connector
      */
    var oldValue: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the node/connector over which the symbol is dragged
      */
    var target: js.UndefOr[js.Any] = js.native
  }
  object DragOverEventArgs {
    
    @scala.inline
    def apply(): DragOverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragOverEventArgs]
    }
    
    @scala.inline
    implicit class DragOverEventArgsMutableBuilder[Self <: DragOverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDrop(value: Boolean): Self = StObject.set(x, "allowDrop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDropUndefined: Self = StObject.set(x, "allowDrop", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait DropEventArgs extends StObject {
    
    /** parameter returns whether or not to cancel the drop event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns node or connector that is being dropped
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the enum which defines the type of the source
      */
    var objectType: js.UndefOr[String] = js.native
    
    /** parameter returns the object from where the element is dragged
      */
    var source: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the object over which the object will be dropped
      */
    var target: js.UndefOr[js.Any] = js.native
  }
  object DropEventArgs {
    
    @scala.inline
    def apply(): DropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropEventArgs]
    }
    
    @scala.inline
    implicit class DropEventArgsMutableBuilder[Self <: DropEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setObjectType(value: String): Self = StObject.set(x, "objectType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectTypeUndefined: Self = StObject.set(x, "objectType", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait EditorFocusChangeEventArgs extends StObject {
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the editor element
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** Returns the diagram model.
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object EditorFocusChangeEventArgs {
    
    @scala.inline
    def apply(): EditorFocusChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditorFocusChangeEventArgs]
    }
    
    @scala.inline
    implicit class EditorFocusChangeEventArgsMutableBuilder[Self <: EditorFocusChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ExportImageSettings extends StObject {
    
    /** to export any custom region of diagram.
      */
    var bounds: js.UndefOr[js.Any] = js.native
    
    /** name of the file to be downloaded.
      */
    var fileName: js.UndefOr[String] = js.native
    
    /** format of the exported file/data.
      */
    var format: js.UndefOr[FileFormats] = js.native
    
    /** to set margin to the exported data.
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** to export the diagram into multiple pages
      */
    var multiplePage: js.UndefOr[Boolean] = js.native
    
    /** to set the page height of the diagram while exporting the diagram into multiple pages.
      */
    var pageHeight: js.UndefOr[Double] = js.native
    
    /** to sets the orientation of the page.
      */
    var pageOrientation: js.UndefOr[PageOrientations] = js.native
    
    /** to set the page width of the diagram while exporting the diagram into multiple pages.
      */
    var pageWidth: js.UndefOr[Double] = js.native
    
    /** to set the region of the diagram to be exported.
      */
    var region: js.UndefOr[Region] = js.native
  }
  object ExportImageSettings {
    
    @scala.inline
    def apply(): ExportImageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportImageSettings]
    }
    
    @scala.inline
    implicit class ExportImageSettingsMutableBuilder[Self <: ExportImageSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: js.Any): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFormat(value: FileFormats): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMultiplePage(value: Boolean): Self = StObject.set(x, "multiplePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplePageUndefined: Self = StObject.set(x, "multiplePage", js.undefined)
      
      @scala.inline
      def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientations): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPageWidth(value: Double): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
      
      @scala.inline
      def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  @js.native
  trait GroupChangeEventArgs extends StObject {
    
    /** parameter returns the cause of group change("group", unGroup")
      */
    var cause: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the object that is added to/removed from a group
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the new parent group(if any) of the object
      */
    var newParent: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the old parent group(if any) of the object
      */
    var oldParent: js.UndefOr[js.Any] = js.native
  }
  object GroupChangeEventArgs {
    
    @scala.inline
    def apply(): GroupChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupChangeEventArgs]
    }
    
    @scala.inline
    implicit class GroupChangeEventArgsMutableBuilder[Self <: GroupChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNewParent(value: js.Any): Self = StObject.set(x, "newParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewParentUndefined: Self = StObject.set(x, "newParent", js.undefined)
      
      @scala.inline
      def setOldParent(value: js.Any): Self = StObject.set(x, "oldParent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldParentUndefined: Self = StObject.set(x, "oldParent", js.undefined)
    }
  }
  
  @js.native
  trait HistoryChangeEventArgs extends StObject {
    
    /** A collection of objects that are changed in the last undo/redo
      */
    var Source: js.UndefOr[js.Array[_]] = js.native
    
    /** parameter to specify whether or not to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the model of the diagram
      */
    var cause: js.UndefOr[Boolean] = js.native
    
    /** An array of objects, where each object represents the changes made in last undo/redo. To explore how the changes are defined, refer [Undo Redo Changes](#undo-redo-changes)
      */
    var changes: js.UndefOr[js.Array[_]] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
  }
  object HistoryChangeEventArgs {
    
    @scala.inline
    def apply(): HistoryChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistoryChangeEventArgs]
    }
    
    @scala.inline
    implicit class HistoryChangeEventArgsMutableBuilder[Self <: HistoryChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCause(value: Boolean): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      @scala.inline
      def setChanges(value: js.Array[_]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
      
      @scala.inline
      def setChangesVarargs(value: js.Any*): Self = StObject.set(x, "changes", js.Array(value :_*))
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setSource(value: js.Array[_]): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
      
      @scala.inline
      def setSourceVarargs(value: js.Any*): Self = StObject.set(x, "Source", js.Array(value :_*))
    }
  }
  
  @js.native
  trait HistoryManager extends StObject {
    
    /** A method that takes a history entry as argument and returns whether the specific entry can be popped or not
      */
    var canPop: js.UndefOr[js.Any] = js.native
    
    /** A method that ends grouping the changes
      */
    var closeGroupAction: js.UndefOr[js.Any] = js.native
    
    /** A method that removes the history of a recent change made in diagram
      */
    var pop: js.UndefOr[js.Any] = js.native
    
    /** A method that allows to track the custom changes made in diagram
      */
    var push: js.UndefOr[js.Any] = js.native
    
    /** Defines what should be happened while trying to restore a custom change
      * @Default {null}
      */
    var redo: js.UndefOr[js.Any] = js.native
    
    /** The redoStack property is used to get the number of redo actions to be stored on the history manager. Its an read-only property and the collection should not be modified.
      * @Default {[]}
      */
    var redoStack: js.UndefOr[js.Array[_]] = js.native
    
    /** The stackLimit property used to restrict the undo and redo actions to a certain limit.
      * @Default {null}
      */
    var stackLimit: js.UndefOr[Double] = js.native
    
    /** A method that starts to group the changes to revert/restore them in a single undo or redo
      */
    var startGroupAction: js.UndefOr[js.Any] = js.native
    
    /** Defines what should be happened while trying to revert a custom change
      */
    var undo: js.UndefOr[js.Any] = js.native
    
    /** The undoStack property is used to get the number of undo actions to be stored on the history manager. Its an read-only property and the collection should not be modified.
      * @Default {[]}
      */
    var undoStack: js.UndefOr[js.Array[_]] = js.native
  }
  object HistoryManager {
    
    @scala.inline
    def apply(): HistoryManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HistoryManager]
    }
    
    @scala.inline
    implicit class HistoryManagerMutableBuilder[Self <: HistoryManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanPop(value: js.Any): Self = StObject.set(x, "canPop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanPopUndefined: Self = StObject.set(x, "canPop", js.undefined)
      
      @scala.inline
      def setCloseGroupAction(value: js.Any): Self = StObject.set(x, "closeGroupAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseGroupActionUndefined: Self = StObject.set(x, "closeGroupAction", js.undefined)
      
      @scala.inline
      def setPop(value: js.Any): Self = StObject.set(x, "pop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopUndefined: Self = StObject.set(x, "pop", js.undefined)
      
      @scala.inline
      def setPush(value: js.Any): Self = StObject.set(x, "push", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushUndefined: Self = StObject.set(x, "push", js.undefined)
      
      @scala.inline
      def setRedo(value: js.Any): Self = StObject.set(x, "redo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedoStack(value: js.Array[_]): Self = StObject.set(x, "redoStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedoStackUndefined: Self = StObject.set(x, "redoStack", js.undefined)
      
      @scala.inline
      def setRedoStackVarargs(value: js.Any*): Self = StObject.set(x, "redoStack", js.Array(value :_*))
      
      @scala.inline
      def setRedoUndefined: Self = StObject.set(x, "redo", js.undefined)
      
      @scala.inline
      def setStackLimit(value: Double): Self = StObject.set(x, "stackLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackLimitUndefined: Self = StObject.set(x, "stackLimit", js.undefined)
      
      @scala.inline
      def setStartGroupAction(value: js.Any): Self = StObject.set(x, "startGroupAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartGroupActionUndefined: Self = StObject.set(x, "startGroupAction", js.undefined)
      
      @scala.inline
      def setUndo(value: js.Any): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndoStack(value: js.Array[_]): Self = StObject.set(x, "undoStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUndoStackUndefined: Self = StObject.set(x, "undoStack", js.undefined)
      
      @scala.inline
      def setUndoStackVarargs(value: js.Any*): Self = StObject.set(x, "undoStack", js.Array(value :_*))
      
      @scala.inline
      def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    }
  }
  
  @js.native
  trait ItemClickEventArgs extends StObject {
    
    /** parameter returns the object that was actually clicked
      */
    var actualObject: js.UndefOr[js.Any] = js.native
    
    /** parameter returns whether or not to cancel the drop event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the model of the diagram
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the object that is selected
      */
    var selectedObject: js.UndefOr[js.Any] = js.native
  }
  object ItemClickEventArgs {
    
    @scala.inline
    def apply(): ItemClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemClickEventArgs]
    }
    
    @scala.inline
    implicit class ItemClickEventArgsMutableBuilder[Self <: ItemClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualObject(value: js.Any): Self = StObject.set(x, "actualObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualObjectUndefined: Self = StObject.set(x, "actualObject", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setSelectedObject(value: js.Any): Self = StObject.set(x, "selectedObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedObjectUndefined: Self = StObject.set(x, "selectedObject", js.undefined)
    }
  }
  
  @js.native
  trait Layer extends StObject {
    
    /** Enable or disable diagram objects to be added to the specific layer.
      * @Default {false}
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /** Enable or disable the interaction of the specific diagram objects.
      * @Default {false}
      */
    var lock: js.UndefOr[Boolean] = js.native
    
    /** To specify the name of the diagram layer. Layer name should be unique.
      */
    var name: js.UndefOr[String] = js.native
    
    /** To Specify the collection of the object names belongs to the layer.
      * @Default {[]}
      */
    var objects: js.UndefOr[js.Array[_]] = js.native
    
    /** Enable or disable the specific layer objects to be visible on printing or exporting.
      * @Default {true}
      */
    var print: js.UndefOr[Boolean] = js.native
    
    /** Enable or disable the specific layer objects to be visible.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Layer {
    
    @scala.inline
    def apply(): Layer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layer]
    }
    
    @scala.inline
    implicit class LayerMutableBuilder[Self <: Layer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setObjects(value: js.Array[_]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      @scala.inline
      def setObjectsVarargs(value: js.Any*): Self = StObject.set(x, "objects", js.Array(value :_*))
      
      @scala.inline
      def setPrint(value: Boolean): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait Layout extends StObject {
    
    /** Enable or disable connector's segment overlapping with each other when executing the layout with multiple parents.
      * @Default {false}
      */
    var avoidSegmentOverlapping: js.UndefOr[Boolean] = js.native
    
    /** Specifies the custom bounds to arrange/align the layout
      * @Default {ej.datavisualization.Diagram.Rectangle()}
      */
    var bounds: js.UndefOr[js.Any] = js.native
    
    /** Defines the fixed node with reference to which, the layout will be arranged and fixed node will not be repositioned
      */
    var fixedNode: js.UndefOr[String] = js.native
    
    /** Defines a method to customize the segments based on source and target nodes.
      * @Default {null}
      */
    var getConnectorSegments: js.UndefOr[js.Any] = js.native
    
    /** Customizes the orientation of trees/sub trees. For orientations, see Chart Orientations. For chart types, see Chart Types
      * @Default {null}
      */
    var getLayoutInfo: js.UndefOr[js.Any] = js.native
    
    /** Defines how to horizontally align the layout within the layout bounds
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** Sets the space to be horizontally left between nodes
      * @Default {30}
      */
    var horizontalSpacing: js.UndefOr[Double] = js.native
    
    /** Defines the space to be left between layout bounds and layout.
      * @Default {ej.datavisualization.Diagram.Margin()}
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** Defines how long edges should be, ideally. This will be the resting length for the springs.
      * @Default {1000}
      */
    var maxIteration: js.UndefOr[Double] = js.native
    
    /** Sets the orientation/direction to arrange the diagram elements.
      * @Default {ej.datavisualization.Diagram.LayoutOrientations.TopToBottom}
      */
    var orientation: js.UndefOr[LayoutOrientations | String] = js.native
    
    /** Sets the value is used to define the root node of the layout.
      * @Default {30}
      */
    var root: js.UndefOr[String] = js.native
    
    /** Defines how long edges should be, ideally. This will be the resting length for the springs.
      * @Default {0.442}
      */
    var springFactor: js.UndefOr[Double] = js.native
    
    /** Defines how long edges should be, ideally. This will be the resting length for the springs.
      * @Default {100}
      */
    var springLength: js.UndefOr[Double] = js.native
    
    /** Sets the type of the layout based on which the elements will be arranged.
      * @Default {ej.datavisualization.Diagram.LayoutTypes.None}
      */
    var `type`: js.UndefOr[LayoutTypes | String] = js.native
    
    /** Defines how to vertically align the layout within the layout bounds
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
    
    /** Sets the space to be vertically left between nodes
      * @Default {30}
      */
    var verticalSpacing: js.UndefOr[Double] = js.native
  }
  object Layout {
    
    @scala.inline
    def apply(): Layout = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvoidSegmentOverlapping(value: Boolean): Self = StObject.set(x, "avoidSegmentOverlapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvoidSegmentOverlappingUndefined: Self = StObject.set(x, "avoidSegmentOverlapping", js.undefined)
      
      @scala.inline
      def setBounds(value: js.Any): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setFixedNode(value: String): Self = StObject.set(x, "fixedNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedNodeUndefined: Self = StObject.set(x, "fixedNode", js.undefined)
      
      @scala.inline
      def setGetConnectorSegments(value: js.Any): Self = StObject.set(x, "getConnectorSegments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetConnectorSegmentsUndefined: Self = StObject.set(x, "getConnectorSegments", js.undefined)
      
      @scala.inline
      def setGetLayoutInfo(value: js.Any): Self = StObject.set(x, "getLayoutInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetLayoutInfoUndefined: Self = StObject.set(x, "getLayoutInfo", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setHorizontalSpacing(value: Double): Self = StObject.set(x, "horizontalSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalSpacingUndefined: Self = StObject.set(x, "horizontalSpacing", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMaxIteration(value: Double): Self = StObject.set(x, "maxIteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxIterationUndefined: Self = StObject.set(x, "maxIteration", js.undefined)
      
      @scala.inline
      def setOrientation(value: LayoutOrientations | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSpringFactor(value: Double): Self = StObject.set(x, "springFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringFactorUndefined: Self = StObject.set(x, "springFactor", js.undefined)
      
      @scala.inline
      def setSpringLength(value: Double): Self = StObject.set(x, "springLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpringLengthUndefined: Self = StObject.set(x, "springLength", js.undefined)
      
      @scala.inline
      def setType(value: LayoutTypes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalSpacingUndefined: Self = StObject.set(x, "verticalSpacing", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggers When auto scroll is changed
      */
    var autoScrollChange: js.UndefOr[js.Function1[/* e */ AutoScrollChangeEventArgs, Unit]] = js.native
    
    /** Defines the background color of diagram elements
      * @Default {transparent}
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /** Defines the path of the background image of diagram elements
      */
    var backgroundImage: js.UndefOr[String] = js.native
    
    /** Sets the direction of line bridges.
      * @Default {ej.datavisualization.Diagram.BridgeDirection.Top}
      */
    var bridgeDirection: js.UndefOr[BridgeDirection | String] = js.native
    
    /** Triggers when a node, connector or diagram is clicked
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
    
    /** Defines a set of custom commands and binds them with a set of desired key gestures.
      */
    var commandManager: js.UndefOr[CommandManager] = js.native
    
    /** Triggers when the connection is changed
      */
    var connectionChange: js.UndefOr[js.Function1[/* e */ ConnectionChangeEventArgs, Unit]] = js.native
    
    /** Triggers when the connector collection is changed
      */
    var connectorCollectionChange: js.UndefOr[js.Function1[/* e */ ConnectorCollectionChangeEventArgs, Unit]] = js.native
    
    /** Triggers when the connectors' source point is changed
      */
    var connectorSourceChange: js.UndefOr[js.Function1[/* e */ ConnectorSourceChangeEventArgs, Unit]] = js.native
    
    /** Triggers when the connectors' target point is changed
      */
    var connectorTargetChange: js.UndefOr[js.Function1[/* e */ ConnectorTargetChangeEventArgs, Unit]] = js.native
    
    /** Binds the custom JSON data with connector properties
      * @Default {null}
      */
    var connectorTemplate: js.UndefOr[js.Any] = js.native
    
    /** A collection of JSON objects where each object represents a connector
      * @Default {[]}
      */
    var connectors: js.UndefOr[js.Array[Connector]] = js.native
    
    /** Enables/Disables the default behaviors of the diagram.
      * @Default {ej.datavisualization.Diagram.DiagramConstraints.All}
      */
    var constraints: js.UndefOr[DiagramConstraints | String] = js.native
    
    /** An object to customize the context menu of diagram
      */
    var contextMenu: js.UndefOr[ContextMenu] = js.native
    
    /** Triggers before opening the context menu
      */
    var contextMenuBeforeOpen: js.UndefOr[js.Function1[/* e */ ContextMenuBeforeOpenEventArgs, Unit]] = js.native
    
    /** Triggers when a context menu item is clicked
      */
    var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.native
    
    /** Triggered when the diagram is rendered completely.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
    
    /** Configures the data source that is to be bound with diagram
      */
    var dataSourceSettings: js.UndefOr[DataSourceSettings] = js.native
    
    /** Initializes the default values for nodes and connectors
      * @Default {{}}
      */
    var defaultSettings: js.UndefOr[DefaultSettings] = js.native
    
    /** Triggers when a node, connector or diagram model is clicked twice
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
    
    /** Triggers while dragging the elements in diagram
      */
    var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
    
    /** Triggers when a symbol is dragged into diagram from symbol palette
      */
    var dragEnter: js.UndefOr[js.Function1[/* e */ DragEnterEventArgs, Unit]] = js.native
    
    /** Triggers when a symbol is dragged outside of the diagram.
      */
    var dragLeave: js.UndefOr[js.Function1[/* e */ DragLeaveEventArgs, Unit]] = js.native
    
    /** Triggers when a symbol is dragged over diagram
      */
    var dragOver: js.UndefOr[js.Function1[/* e */ DragOverEventArgs, Unit]] = js.native
    
    /** Sets the type of JSON object to be drawn through drawing tool
      * @Default {{}}
      */
    var drawType: js.UndefOr[js.Any] = js.native
    
    /** Triggers when a symbol is dragged and dropped from symbol palette to drawing area
      */
    var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.native
    
    /** Triggers when editor got focus at the time of node's label or text node editing.
      */
    var editorFocusChange: js.UndefOr[js.Function1[/* e */ EditorFocusChangeEventArgs, Unit]] = js.native
    
    /** Enables or disables auto scroll in diagram
      * @Default {true}
      */
    var enableAutoScroll: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables diagram context menu
      * @Default {true}
      */
    var enableContextMenu: js.UndefOr[Boolean] = js.native
    
    /** Triggers when a child is added to or removed from a group
      */
    var groupChange: js.UndefOr[js.Function1[/* e */ GroupChangeEventArgs, Unit]] = js.native
    
    /** Specifies the height of the diagram
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Triggers when a change is reverted or restored(undo/redo)
      */
    var historyChange: js.UndefOr[js.Function1[/* e */ HistoryChangeEventArgs, Unit]] = js.native
    
    /** Customizes the undo redo functionality
      */
    var historyManager: js.UndefOr[HistoryManager] = js.native
    
    /** Triggers when a diagram element is clicked
      */
    var itemClick: js.UndefOr[js.Function1[/* e */ ItemClickEventArgs, Unit]] = js.native
    
    /** Defines the type of the rendering mode of label.
      * @Default {HTML}
      */
    var labelRenderingMode: js.UndefOr[LabelRenderingMode | String] = js.native
    
    /** A collection of JSON objects where each object represents a layer. Layer is a named category of diagram shapes.
      * @Default {[]}
      */
    var layers: js.UndefOr[js.Array[Layer]] = js.native
    
    /** Automatically arranges the nodes and connectors in a predefined manner.
      */
    var layout: js.UndefOr[Layout] = js.native
    
    /** Defines the current culture of diagram
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Triggers when mouse enters a node/connector
      */
    var mouseEnter: js.UndefOr[js.Function1[/* e */ MouseEnterEventArgs, Unit]] = js.native
    
    /** Triggers when mouse leaves node/connector
      */
    var mouseLeave: js.UndefOr[js.Function1[/* e */ MouseLeaveEventArgs, Unit]] = js.native
    
    /** Triggers when mouse hovers over a node/connector
      */
    var mouseOver: js.UndefOr[js.Function1[/* e */ MouseOverEventArgs, Unit]] = js.native
    
    /** Triggers when node collection is changed
      */
    var nodeCollectionChange: js.UndefOr[js.Function1[/* e */ NodeCollectionChangeEventArgs, Unit]] = js.native
    
    /** Binds the custom JSON data with node properties
      * @Default {null}
      */
    var nodeTemplate: js.UndefOr[js.Any] = js.native
    
    /** Array of JSON objects where each object represents a node
      * @Default {[]}
      */
    var nodes: js.UndefOr[js.Array[Node]] = js.native
    
    /** Defines the size and appearance of diagram page
      */
    var pageSettings: js.UndefOr[PageSettings] = js.native
    
    /** Triggers when the node properties(x, y,width and height alone) are changed using nudge commands or updateNode API.
      */
    var propertyChange: js.UndefOr[js.Function1[/* e */ PropertyChangeEventArgs, Unit]] = js.native
    
    /** Triggers when the diagram elements are rotated
      */
    var rotationChange: js.UndefOr[js.Function1[/* e */ RotationChangeEventArgs, Unit]] = js.native
    
    /** Defines the properties of the both the horizontal and vertical gauge to measure the diagram area.
      */
    var rulerSettings: js.UndefOr[RulerSettings] = js.native
    
    /** Triggers when the diagram is zoomed or panned
      */
    var scrollChange: js.UndefOr[js.Function1[/* e */ ScrollChangeEventArgs, Unit]] = js.native
    
    /** Defines the zoom value, zoom factor, scroll status and view port size of the diagram
      */
    var scrollSettings: js.UndefOr[ScrollSettings] = js.native
    
    /** Triggers when a connector segment is edited
      */
    var segmentChange: js.UndefOr[js.Function1[/* e */ SegmentChangeEventArgs, Unit]] = js.native
    
    /** Defines the size and position of selected items and defines the appearance of selector
      */
    var selectedItems: js.UndefOr[SelectedItems] = js.native
    
    /** Triggers when the selection is changed in diagram
      */
    var selectionChange: js.UndefOr[js.Function1[/* e */ SelectionChangeEventArgs, Unit]] = js.native
    
    /** Defines diagram serialization properties that would defines how the serialization content would be.
      */
    var serializationSettings: js.UndefOr[SerializationSettings] = js.native
    
    /** Used to decide on the action on Diagramming elements at runtime.
      */
    var setTool: js.UndefOr[js.Function1[/* e */ SetToolEventArgs, Unit]] = js.native
    
    /** Enables or disables tooltip of diagram
      * @Default {true}
      */
    var showTooltip: js.UndefOr[Boolean] = js.native
    
    /** Triggers when a node is resized
      */
    var sizeChange: js.UndefOr[js.Function1[/* e */ SizeChangeEventArgs, Unit]] = js.native
    
    /** Defines the gridlines and defines how and when the objects have to be snapped
      */
    var snapSettings: js.UndefOr[SnapSettings] = js.native
    
    /** Triggers when label editing is ended
      */
    var textChange: js.UndefOr[js.Function1[/* e */ TextChangeEventArgs, Unit]] = js.native
    
    /** Enables/Disables the interactive behaviors of diagram.
      * @Default {ej.datavisualization.Diagram.Tool.All}
      */
    var tool: js.UndefOr[Tool | String] = js.native
    
    /** An object that defines the description, appearance and alignments of tooltips
      * @Default {null}
      */
    var tooltip: js.UndefOr[Tooltip] = js.native
    
    /** Specifies the width of the diagram
      * @Default {null}
      */
    var width: js.UndefOr[String] = js.native
    
    /** Sets the factor by which we can zoom in or zoom out
      * @Default {0.2}
      */
    var zoomFactor: js.UndefOr[Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typingsSlinky.ejWebAll.ej.datavisualization.Diagram.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.ejWebAll.ej.datavisualization.Diagram.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typingsSlinky.ejWebAll.ej.datavisualization.Diagram.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoScrollChange(value: /* e */ AutoScrollChangeEventArgs => Unit): Self = StObject.set(x, "autoScrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAutoScrollChangeUndefined: Self = StObject.set(x, "autoScrollChange", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      @scala.inline
      def setBridgeDirection(value: BridgeDirection | String): Self = StObject.set(x, "bridgeDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBridgeDirectionUndefined: Self = StObject.set(x, "bridgeDirection", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setCommandManager(value: CommandManager): Self = StObject.set(x, "commandManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommandManagerUndefined: Self = StObject.set(x, "commandManager", js.undefined)
      
      @scala.inline
      def setConnectionChange(value: /* e */ ConnectionChangeEventArgs => Unit): Self = StObject.set(x, "connectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConnectionChangeUndefined: Self = StObject.set(x, "connectionChange", js.undefined)
      
      @scala.inline
      def setConnectorCollectionChange(value: /* e */ ConnectorCollectionChangeEventArgs => Unit): Self = StObject.set(x, "connectorCollectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConnectorCollectionChangeUndefined: Self = StObject.set(x, "connectorCollectionChange", js.undefined)
      
      @scala.inline
      def setConnectorSourceChange(value: /* e */ ConnectorSourceChangeEventArgs => Unit): Self = StObject.set(x, "connectorSourceChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConnectorSourceChangeUndefined: Self = StObject.set(x, "connectorSourceChange", js.undefined)
      
      @scala.inline
      def setConnectorTargetChange(value: /* e */ ConnectorTargetChangeEventArgs => Unit): Self = StObject.set(x, "connectorTargetChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setConnectorTargetChangeUndefined: Self = StObject.set(x, "connectorTargetChange", js.undefined)
      
      @scala.inline
      def setConnectorTemplate(value: js.Any): Self = StObject.set(x, "connectorTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorTemplateUndefined: Self = StObject.set(x, "connectorTemplate", js.undefined)
      
      @scala.inline
      def setConnectors(value: js.Array[Connector]): Self = StObject.set(x, "connectors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorsUndefined: Self = StObject.set(x, "connectors", js.undefined)
      
      @scala.inline
      def setConnectorsVarargs(value: Connector*): Self = StObject.set(x, "connectors", js.Array(value :_*))
      
      @scala.inline
      def setConstraints(value: DiagramConstraints | String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setContextMenu(value: ContextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuBeforeOpen(value: /* e */ ContextMenuBeforeOpenEventArgs => Unit): Self = StObject.set(x, "contextMenuBeforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextMenuBeforeOpenUndefined: Self = StObject.set(x, "contextMenuBeforeOpen", js.undefined)
      
      @scala.inline
      def setContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = StObject.set(x, "contextMenuClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContextMenuClickUndefined: Self = StObject.set(x, "contextMenuClick", js.undefined)
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setDataSourceSettings(value: DataSourceSettings): Self = StObject.set(x, "dataSourceSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceSettingsUndefined: Self = StObject.set(x, "dataSourceSettings", js.undefined)
      
      @scala.inline
      def setDefaultSettings(value: DefaultSettings): Self = StObject.set(x, "defaultSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSettingsUndefined: Self = StObject.set(x, "defaultSettings", js.undefined)
      
      @scala.inline
      def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      @scala.inline
      def setDrag(value: /* e */ DragEventArgs => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragEnter(value: /* e */ DragEnterEventArgs => Unit): Self = StObject.set(x, "dragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
      
      @scala.inline
      def setDragLeave(value: /* e */ DragLeaveEventArgs => Unit): Self = StObject.set(x, "dragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
      
      @scala.inline
      def setDragOver(value: /* e */ DragOverEventArgs => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDragOverUndefined: Self = StObject.set(x, "dragOver", js.undefined)
      
      @scala.inline
      def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      @scala.inline
      def setDrawType(value: js.Any): Self = StObject.set(x, "drawType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawTypeUndefined: Self = StObject.set(x, "drawType", js.undefined)
      
      @scala.inline
      def setDrop(value: /* e */ DropEventArgs => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      @scala.inline
      def setEditorFocusChange(value: /* e */ EditorFocusChangeEventArgs => Unit): Self = StObject.set(x, "editorFocusChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEditorFocusChangeUndefined: Self = StObject.set(x, "editorFocusChange", js.undefined)
      
      @scala.inline
      def setEnableAutoScroll(value: Boolean): Self = StObject.set(x, "enableAutoScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAutoScrollUndefined: Self = StObject.set(x, "enableAutoScroll", js.undefined)
      
      @scala.inline
      def setEnableContextMenu(value: Boolean): Self = StObject.set(x, "enableContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableContextMenuUndefined: Self = StObject.set(x, "enableContextMenu", js.undefined)
      
      @scala.inline
      def setGroupChange(value: /* e */ GroupChangeEventArgs => Unit): Self = StObject.set(x, "groupChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGroupChangeUndefined: Self = StObject.set(x, "groupChange", js.undefined)
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHistoryChange(value: /* e */ HistoryChangeEventArgs => Unit): Self = StObject.set(x, "historyChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHistoryChangeUndefined: Self = StObject.set(x, "historyChange", js.undefined)
      
      @scala.inline
      def setHistoryManager(value: HistoryManager): Self = StObject.set(x, "historyManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistoryManagerUndefined: Self = StObject.set(x, "historyManager", js.undefined)
      
      @scala.inline
      def setItemClick(value: /* e */ ItemClickEventArgs => Unit): Self = StObject.set(x, "itemClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemClickUndefined: Self = StObject.set(x, "itemClick", js.undefined)
      
      @scala.inline
      def setLabelRenderingMode(value: LabelRenderingMode | String): Self = StObject.set(x, "labelRenderingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelRenderingModeUndefined: Self = StObject.set(x, "labelRenderingMode", js.undefined)
      
      @scala.inline
      def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
      
      @scala.inline
      def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setMouseEnter(value: /* e */ MouseEnterEventArgs => Unit): Self = StObject.set(x, "mouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseEnterUndefined: Self = StObject.set(x, "mouseEnter", js.undefined)
      
      @scala.inline
      def setMouseLeave(value: /* e */ MouseLeaveEventArgs => Unit): Self = StObject.set(x, "mouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseLeaveUndefined: Self = StObject.set(x, "mouseLeave", js.undefined)
      
      @scala.inline
      def setMouseOver(value: /* e */ MouseOverEventArgs => Unit): Self = StObject.set(x, "mouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMouseOverUndefined: Self = StObject.set(x, "mouseOver", js.undefined)
      
      @scala.inline
      def setNodeCollectionChange(value: /* e */ NodeCollectionChangeEventArgs => Unit): Self = StObject.set(x, "nodeCollectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNodeCollectionChangeUndefined: Self = StObject.set(x, "nodeCollectionChange", js.undefined)
      
      @scala.inline
      def setNodeTemplate(value: js.Any): Self = StObject.set(x, "nodeTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeTemplateUndefined: Self = StObject.set(x, "nodeTemplate", js.undefined)
      
      @scala.inline
      def setNodes(value: js.Array[Node]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
      
      @scala.inline
      def setNodesVarargs(value: Node*): Self = StObject.set(x, "nodes", js.Array(value :_*))
      
      @scala.inline
      def setPageSettings(value: PageSettings): Self = StObject.set(x, "pageSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSettingsUndefined: Self = StObject.set(x, "pageSettings", js.undefined)
      
      @scala.inline
      def setPropertyChange(value: /* e */ PropertyChangeEventArgs => Unit): Self = StObject.set(x, "propertyChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPropertyChangeUndefined: Self = StObject.set(x, "propertyChange", js.undefined)
      
      @scala.inline
      def setRotationChange(value: /* e */ RotationChangeEventArgs => Unit): Self = StObject.set(x, "rotationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRotationChangeUndefined: Self = StObject.set(x, "rotationChange", js.undefined)
      
      @scala.inline
      def setRulerSettings(value: RulerSettings): Self = StObject.set(x, "rulerSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRulerSettingsUndefined: Self = StObject.set(x, "rulerSettings", js.undefined)
      
      @scala.inline
      def setScrollChange(value: /* e */ ScrollChangeEventArgs => Unit): Self = StObject.set(x, "scrollChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setScrollChangeUndefined: Self = StObject.set(x, "scrollChange", js.undefined)
      
      @scala.inline
      def setScrollSettings(value: ScrollSettings): Self = StObject.set(x, "scrollSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollSettingsUndefined: Self = StObject.set(x, "scrollSettings", js.undefined)
      
      @scala.inline
      def setSegmentChange(value: /* e */ SegmentChangeEventArgs => Unit): Self = StObject.set(x, "segmentChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSegmentChangeUndefined: Self = StObject.set(x, "segmentChange", js.undefined)
      
      @scala.inline
      def setSelectedItems(value: SelectedItems): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSelectionChange(value: /* e */ SelectionChangeEventArgs => Unit): Self = StObject.set(x, "selectionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSelectionChangeUndefined: Self = StObject.set(x, "selectionChange", js.undefined)
      
      @scala.inline
      def setSerializationSettings(value: SerializationSettings): Self = StObject.set(x, "serializationSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializationSettingsUndefined: Self = StObject.set(x, "serializationSettings", js.undefined)
      
      @scala.inline
      def setSetTool(value: /* e */ SetToolEventArgs => Unit): Self = StObject.set(x, "setTool", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetToolUndefined: Self = StObject.set(x, "setTool", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setSizeChange(value: /* e */ SizeChangeEventArgs => Unit): Self = StObject.set(x, "sizeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSizeChangeUndefined: Self = StObject.set(x, "sizeChange", js.undefined)
      
      @scala.inline
      def setSnapSettings(value: SnapSettings): Self = StObject.set(x, "snapSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapSettingsUndefined: Self = StObject.set(x, "snapSettings", js.undefined)
      
      @scala.inline
      def setTextChange(value: /* e */ TextChangeEventArgs => Unit): Self = StObject.set(x, "textChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTextChangeUndefined: Self = StObject.set(x, "textChange", js.undefined)
      
      @scala.inline
      def setTool(value: Tool | String): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
      
      @scala.inline
      def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    }
  }
  
  @js.native
  trait MouseEnterEventArgs extends StObject {
    
    /** parameter returns whether or not to cancel the dragOver event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the target node or connector
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the object from where the selected object is dragged
      */
    var source: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the target object over which the selected object is dragged
      */
    var target: js.UndefOr[js.Any] = js.native
  }
  object MouseEnterEventArgs {
    
    @scala.inline
    def apply(): MouseEnterEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseEnterEventArgs]
    }
    
    @scala.inline
    implicit class MouseEnterEventArgsMutableBuilder[Self <: MouseEnterEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait MouseLeaveEventArgs extends StObject {
    
    /** parameter returns whether or not to cancel the dragOver event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the target node or connector
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the object from where the selected object is dragged
      */
    var source: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the target object over which the selected object is dragged
      */
    var target: js.UndefOr[js.Any] = js.native
  }
  object MouseLeaveEventArgs {
    
    @scala.inline
    def apply(): MouseLeaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseLeaveEventArgs]
    }
    
    @scala.inline
    implicit class MouseLeaveEventArgsMutableBuilder[Self <: MouseLeaveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait MouseOverEventArgs extends StObject {
    
    /** parameter returns whether or not to cancel the dragOver event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the target node or connector
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the object from where the element is dragged
      */
    var source: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the object over which the element is being dragged.
      */
    var target: js.UndefOr[js.Any] = js.native
  }
  object MouseOverEventArgs {
    
    @scala.inline
    def apply(): MouseOverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseOverEventArgs]
    }
    
    @scala.inline
    implicit class MouseOverEventArgsMutableBuilder[Self <: MouseOverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    /** Defines the type of BPMN Activity. Applicable, if the node is a BPMN activity.
      * @Default {ej.datavisualization.Diagram.BPMNActivity.Task}
      */
    var activity: js.UndefOr[BPMNActivity | String] = js.native
    
    /** To maintain additional information about nodes
      * @Default {{}}
      */
    var addInfo: js.UndefOr[js.Any] = js.native
    
    /** Defines the additional information of a process. It is not directly related to the message flows or sequence flows of the process.
      * @Default {ej.datavisualization.Diagram.BPMNTextAnnotation()}
      */
    var annotation: js.UndefOr[NodesAnnotation] = js.native
    
    /** Sets the border color of node
      * @Default {black}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Sets the pattern of dashes and gaps to stroke the border
      */
    var borderDashArray: js.UndefOr[String] = js.native
    
    /** defines the node border with a smooth transition from one color to another color.
      * @Default {null}
      */
    var borderGradient: js.UndefOr[js.Any] = js.native
    
    /** Sets the border width of the node
      * @Default {1}
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /** Defines whether the group can be ungrouped or not
      * @Default {true}
      */
    var canUngroup: js.UndefOr[Boolean] = js.native
    
    /** Array of JSON objects where each object represents a child node/connector
      * @Default {[]}
      */
    var children: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines the name, attributes and methods of a Class. Applicable, if the node is a Class.
      * @Default {null}
      */
    var `class`: js.UndefOr[NodesClass] = js.native
    
    /** Sets the type of UML classifier. Applicable, if the node is a UML Class Diagram shape.
      * @Default {ej.datavisualization.Diagram.ClassifierShapes.Class}
      */
    var classifier: js.UndefOr[ClassifierShapes | String] = js.native
    
    /** Defines the state of the node is collapsed.
      */
    var collapseIcon: js.UndefOr[NodesCollapseIcon] = js.native
    
    /** Defines the distance to be left between a node and its connections(In coming and out going connections).
      * @Default {0}
      */
    var connectorPadding: js.UndefOr[Double] = js.native
    
    /** Enables or disables the default behaviors of the node.
      * @Default {ej.datavisualization.Diagram.NodeConstraints.Default}
      */
    var constraints: js.UndefOr[NodeConstraints | String] = js.native
    
    /** Defines how the child objects need to be arranged(Either in any predefined manner or automatically). Applicable, if the node is a group.
      * @Default {null}
      */
    var container: js.UndefOr[NodesContainer] = js.native
    
    /** Defines the corner radius of rectangular shapes.
      * @Default {0}
      */
    var cornerRadius: js.UndefOr[Double] = js.native
    
    /** This property allows you to customize nodes appearance using user-defined CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Defines the BPMN data object
      */
    var data: js.UndefOr[NodesData] = js.native
    
    /** Defines an Enumeration in a UML Class Diagram
      * @Default {null}
      */
    var enumeration: js.UndefOr[NodesEnumeration] = js.native
    
    /** Sets the type of the BPMN Events. Applicable, if the node is a BPMN event.
      * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
      */
    var event: js.UndefOr[BPMNEvents | String] = js.native
    
    /** Defines whether the node can be automatically arranged using layout or not
      * @Default {false}
      */
    var excludeFromLayout: js.UndefOr[Boolean] = js.native
    
    /** Defines the state of the node is expanded or collapsed.
      */
    var expandIcon: js.UndefOr[NodesExpandIcon] = js.native
    
    /** Defines the fill color of the node
      * @Default {white}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Sets the type of the BPMN Gateway. Applicable, if the node is a BPMN gateway.
      * @Default {ej.datavisualization.Diagram.BPMNGateways.None}
      */
    var gateway: js.UndefOr[BPMNGateways | String] = js.native
    
    /** Paints the node with a smooth transition from one color to another color
      */
    var gradient: js.UndefOr[NodesGradient] = js.native
    
    /** Defines the header of a swimlane/lane
      * @Default {{ text: Title, fontSize: 11 }}
      */
    var header: js.UndefOr[js.Any] = js.native
    
    /** Defines the height of the node
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets the horizontal alignment of the node. Applicable, if the parent of the node is a container.
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Left}
      */
    var horizontalAlign: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** A read only collection of the incoming connectors/edges of the node
      * @Default {[]}
      */
    var inEdges: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines an interface in a UML Class Diagram
      * @Default {null}
      */
    var interface: js.UndefOr[NodesInterface] = js.native
    
    /** Defines whether the sub tree of the node is expanded or collapsed
      * @Default {true}
      */
    var isExpanded: js.UndefOr[Boolean] = js.native
    
    /** Sets the node as a swimlane
      * @Default {false}
      */
    var isSwimlane: js.UndefOr[Boolean] = js.native
    
    /** A collection of objects where each object represents a label
      * @Default {[]}
      */
    var labels: js.UndefOr[js.Array[NodesLabel]] = js.native
    
    /** An array of objects where each object represents a lane. Applicable, if the node is a swimlane.
      * @Default {[]}
      */
    var lanes: js.UndefOr[js.Array[NodesLane]] = js.native
    
    /** Defines the minimum space to be left between the bottom of parent bounds and the node. Applicable, if the parent is a container.
      * @Default {0}
      */
    var marginBottom: js.UndefOr[Double] = js.native
    
    /** Defines the minimum space to be left between the left of parent bounds and the node. Applicable, if the parent is a container.
      * @Default {0}
      */
    var marginLeft: js.UndefOr[Double] = js.native
    
    /** Defines the minimum space to be left between the right of the parent bounds and the node. Applicable, if the parent is a container.
      * @Default {0}
      */
    var marginRight: js.UndefOr[Double] = js.native
    
    /** Defines the minimum space to be left between the top of parent bounds and the node. Applicable, if the parent is a container.
      * @Default {0}
      */
    var marginTop: js.UndefOr[Double] = js.native
    
    /** Defines the maximum height limit of the node
      * @Default {0}
      */
    var maxHeight: js.UndefOr[Double] = js.native
    
    /** Defines the maximum width limit of the node
      * @Default {0}
      */
    var maxWidth: js.UndefOr[Double] = js.native
    
    /** Defines the minimum height limit of the node
      * @Default {0}
      */
    var minHeight: js.UndefOr[Double] = js.native
    
    /** Defines the minimum width limit of the node
      * @Default {0}
      */
    var minWidth: js.UndefOr[Double] = js.native
    
    /** Sets the unique identifier of the node
      */
    var name: js.UndefOr[String] = js.native
    
    /** Defines the position of the node on X-Axis
      * @Default {0}
      */
    var offsetX: js.UndefOr[Double] = js.native
    
    /** Defines the position of the node on Y-Axis
      * @Default {0}
      */
    var offsetY: js.UndefOr[Double] = js.native
    
    /** Defines the opaque of the node
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Defines the orientation of nodes. Applicable, if the node is a swimlane.
      * @Default {vertical}
      */
    var orientation: js.UndefOr[String] = js.native
    
    /** A read only collection of outgoing connectors/edges of the node
      * @Default {[]}
      */
    var outEdges: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines the minimum padding value to be left between the bottom most position of a group and its children. Applicable, if the group is a container.
      * @Default {0}
      */
    var paddingBottom: js.UndefOr[Double] = js.native
    
    /** Defines the minimum padding value to be left between the left most position of a group and its children. Applicable, if the group is a container.
      * @Default {0}
      */
    var paddingLeft: js.UndefOr[Double] = js.native
    
    /** Defines the minimum padding value to be left between the right most position of a group and its children. Applicable, if the group is a container.
      * @Default {0}
      */
    var paddingRight: js.UndefOr[Double] = js.native
    
    /** Defines the minimum padding value to be left between the top most position of a group and its children. Applicable, if the group is a container.
      * @Default {0}
      */
    var paddingTop: js.UndefOr[Double] = js.native
    
    /** Defines the size and preview size of the node to add that to symbol palette
      * @Default {null}
      */
    var paletteItem: js.UndefOr[NodesPaletteItem] = js.native
    
    /** Sets the name of the parent group
      */
    var parent: js.UndefOr[String] = js.native
    
    /** Sets the path geometry that defines the shape of a path node
      */
    var pathData: js.UndefOr[String] = js.native
    
    /** Sets the height of the phase headers
      * @Default {0}
      */
    var phaseSize: js.UndefOr[Double] = js.native
    
    /** An array of objects, where each object represents a smaller region(phase) of a swimlane.
      * @Default {[]}
      */
    var phases: js.UndefOr[js.Array[NodesPhase]] = js.native
    
    /** Sets the ratio/ fractional value relative to node, based on which the node will be transformed(positioning, scaling and rotation)
      * @Default {ej.datavisualization.Diagram.Points(0.5,0.5)}
      */
    var pivot: js.UndefOr[js.Any] = js.native
    
    /** Defines a collection of points to draw a polygon. Applicable, if the shape is a polygon.
      * @Default {[]}
      */
    var points: js.UndefOr[js.Array[_]] = js.native
    
    /** An array of objects where each object represents a port
      * @Default {[]}
      */
    var ports: js.UndefOr[js.Array[NodesPort]] = js.native
    
    /** Sets the angle to which the node should be rotated
      * @Default {0}
      */
    var rotateAngle: js.UndefOr[Double] = js.native
    
    /** Defines the opacity and the position of shadow
      * @Default {ej.datavisualization.Diagram.Shadow()}
      */
    var shadow: js.UndefOr[NodesShadow] = js.native
    
    /** Sets the shape of the node. It depends upon the type of node.
      * @Default {ej.datavisualization.Diagram.BasicShapes.Rectangle}
      */
    var shape: js.UndefOr[BasicShapes | FlowShapes | BPMNShapes | UMLActivityShapes | String] = js.native
    
    /** Sets the source path of the image. Applicable, if the type of the node is image.
      */
    var source: js.UndefOr[String] = js.native
    
    /** Defines the sub process of a BPMN Activity. Applicable, if the type of the BPMN activity is sub process.
      * @Default {ej.datavisualization.Diagram.BPMNSubProcess()}
      */
    var subProcess: js.UndefOr[NodesSubProcess] = js.native
    
    /** Defines the task of the BPMN activity. Applicable, if the type of activity is set as task.
      * @Default {ej.datavisualization.Diagram.BPMNTask()}
      */
    var task: js.UndefOr[NodesTask] = js.native
    
    /** Sets the id of svg/html templates. Applicable, if the node is HTML or native.
      */
    var templateId: js.UndefOr[String] = js.native
    
    /** Defines the textBlock of a text node
      * @Default {null}
      */
    var textBlock: js.UndefOr[js.Any] = js.native
    
    /** Defines the tooltip that should be shown when the mouse hovers over node. For tooltip properties, refer Tooltip
      * @Default {null}
      */
    var tooltip: js.UndefOr[js.Any] = js.native
    
    /** Sets the type of BPMN Event Triggers.
      * @Default {ej.datavisualization.Diagram.BPMNTriggers.None}
      */
    var trigger: js.UndefOr[BPMNTriggers | String] = js.native
    
    /** Defines the type of the node.
      * @Default {ej.datavisualization.Diagram.Shapes.Basic}
      */
    var `type`: js.UndefOr[Shapes | String] = js.native
    
    /** Sets the vertical alignment of a node. Applicable, if the parent of a node is a container.
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Top}
      */
    var verticalAlign: js.UndefOr[VerticalAlignment | String] = js.native
    
    /** Defines the visibility of the node
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Defines the width of the node
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
    
    /** Defines the z-index of the node
      * @Default {0}
      */
    var zOrder: js.UndefOr[Double] = js.native
  }
  object Node {
    
    @scala.inline
    def apply(): Node = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivity(value: BPMNActivity | String): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
      
      @scala.inline
      def setAddInfo(value: js.Any): Self = StObject.set(x, "addInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddInfoUndefined: Self = StObject.set(x, "addInfo", js.undefined)
      
      @scala.inline
      def setAnnotation(value: NodesAnnotation): Self = StObject.set(x, "annotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationUndefined: Self = StObject.set(x, "annotation", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderDashArray(value: String): Self = StObject.set(x, "borderDashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderDashArrayUndefined: Self = StObject.set(x, "borderDashArray", js.undefined)
      
      @scala.inline
      def setBorderGradient(value: js.Any): Self = StObject.set(x, "borderGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderGradientUndefined: Self = StObject.set(x, "borderGradient", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setCanUngroup(value: Boolean): Self = StObject.set(x, "canUngroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanUngroupUndefined: Self = StObject.set(x, "canUngroup", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setClass(value: NodesClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setClassifier(value: ClassifierShapes | String): Self = StObject.set(x, "classifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassifierUndefined: Self = StObject.set(x, "classifier", js.undefined)
      
      @scala.inline
      def setCollapseIcon(value: NodesCollapseIcon): Self = StObject.set(x, "collapseIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseIconUndefined: Self = StObject.set(x, "collapseIcon", js.undefined)
      
      @scala.inline
      def setConnectorPadding(value: Double): Self = StObject.set(x, "connectorPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorPaddingUndefined: Self = StObject.set(x, "connectorPadding", js.undefined)
      
      @scala.inline
      def setConstraints(value: NodeConstraints | String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setContainer(value: NodesContainer): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      @scala.inline
      def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setData(value: NodesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setEnumeration(value: NodesEnumeration): Self = StObject.set(x, "enumeration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerationUndefined: Self = StObject.set(x, "enumeration", js.undefined)
      
      @scala.inline
      def setEvent(value: BPMNEvents | String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setExcludeFromLayout(value: Boolean): Self = StObject.set(x, "excludeFromLayout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeFromLayoutUndefined: Self = StObject.set(x, "excludeFromLayout", js.undefined)
      
      @scala.inline
      def setExpandIcon(value: NodesExpandIcon): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setGateway(value: BPMNGateways | String): Self = StObject.set(x, "gateway", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayUndefined: Self = StObject.set(x, "gateway", js.undefined)
      
      @scala.inline
      def setGradient(value: NodesGradient): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontalAlign(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignUndefined: Self = StObject.set(x, "horizontalAlign", js.undefined)
      
      @scala.inline
      def setInEdges(value: js.Array[_]): Self = StObject.set(x, "inEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInEdgesUndefined: Self = StObject.set(x, "inEdges", js.undefined)
      
      @scala.inline
      def setInEdgesVarargs(value: js.Any*): Self = StObject.set(x, "inEdges", js.Array(value :_*))
      
      @scala.inline
      def setInterface(value: NodesInterface): Self = StObject.set(x, "interface", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterfaceUndefined: Self = StObject.set(x, "interface", js.undefined)
      
      @scala.inline
      def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      @scala.inline
      def setIsSwimlane(value: Boolean): Self = StObject.set(x, "isSwimlane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSwimlaneUndefined: Self = StObject.set(x, "isSwimlane", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Array[NodesLabel]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: NodesLabel*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setLanes(value: js.Array[NodesLane]): Self = StObject.set(x, "lanes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanesUndefined: Self = StObject.set(x, "lanes", js.undefined)
      
      @scala.inline
      def setLanesVarargs(value: NodesLane*): Self = StObject.set(x, "lanes", js.Array(value :_*))
      
      @scala.inline
      def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setOutEdges(value: js.Array[_]): Self = StObject.set(x, "outEdges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutEdgesUndefined: Self = StObject.set(x, "outEdges", js.undefined)
      
      @scala.inline
      def setOutEdgesVarargs(value: js.Any*): Self = StObject.set(x, "outEdges", js.Array(value :_*))
      
      @scala.inline
      def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      @scala.inline
      def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      @scala.inline
      def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      @scala.inline
      def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      @scala.inline
      def setPaletteItem(value: NodesPaletteItem): Self = StObject.set(x, "paletteItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteItemUndefined: Self = StObject.set(x, "paletteItem", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPathData(value: String): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathDataUndefined: Self = StObject.set(x, "pathData", js.undefined)
      
      @scala.inline
      def setPhaseSize(value: Double): Self = StObject.set(x, "phaseSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhaseSizeUndefined: Self = StObject.set(x, "phaseSize", js.undefined)
      
      @scala.inline
      def setPhases(value: js.Array[NodesPhase]): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhasesUndefined: Self = StObject.set(x, "phases", js.undefined)
      
      @scala.inline
      def setPhasesVarargs(value: NodesPhase*): Self = StObject.set(x, "phases", js.Array(value :_*))
      
      @scala.inline
      def setPivot(value: js.Any): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPivotUndefined: Self = StObject.set(x, "pivot", js.undefined)
      
      @scala.inline
      def setPoints(value: js.Array[_]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPointsVarargs(value: js.Any*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      @scala.inline
      def setPorts(value: js.Array[NodesPort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      @scala.inline
      def setPortsVarargs(value: NodesPort*): Self = StObject.set(x, "ports", js.Array(value :_*))
      
      @scala.inline
      def setRotateAngle(value: Double): Self = StObject.set(x, "rotateAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateAngleUndefined: Self = StObject.set(x, "rotateAngle", js.undefined)
      
      @scala.inline
      def setShadow(value: NodesShadow): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
      
      @scala.inline
      def setShape(value: BasicShapes | FlowShapes | BPMNShapes | UMLActivityShapes | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSubProcess(value: NodesSubProcess): Self = StObject.set(x, "subProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubProcessUndefined: Self = StObject.set(x, "subProcess", js.undefined)
      
      @scala.inline
      def setTask(value: NodesTask): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
      
      @scala.inline
      def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      @scala.inline
      def setTextBlock(value: js.Any): Self = StObject.set(x, "textBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBlockUndefined: Self = StObject.set(x, "textBlock", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTrigger(value: BPMNTriggers | String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setType(value: Shapes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setVerticalAlign(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZOrderUndefined: Self = StObject.set(x, "zOrder", js.undefined)
    }
  }
  
  @js.native
  trait NodeCollectionChangeEventArgs extends StObject {
    
    /** parameter defines whether to cancel the collection change or not
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns whether the node is to be added or removed
      */
    var changeType: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the node which needs to be added or deleted
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** triggers before and after adding the node in the diagram which can be differentiated through `state` argument. We can cancel the event only before adding the node
      */
    var state: js.UndefOr[String] = js.native
  }
  object NodeCollectionChangeEventArgs {
    
    @scala.inline
    def apply(): NodeCollectionChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeCollectionChangeEventArgs]
    }
    
    @scala.inline
    implicit class NodeCollectionChangeEventArgsMutableBuilder[Self <: NodeCollectionChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait NodesAnnotation extends StObject {
    
    /** Sets the angle between the BPMN shape and the annotation
      * @Default {0}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Sets the direction of the text annotation
      * @Default {ej.datavisualization.Diagram.BPMNAnnotationDirections.Left}
      */
    var direction: js.UndefOr[BPMNAnnotationDirection | String] = js.native
    
    /** Sets the height of the text annotation
      * @Default {20}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets the distance between the BPMN shape and the annotation
      * @Default {0}
      */
    var length: js.UndefOr[Double] = js.native
    
    /** Defines the additional information about the flow object in a BPMN Process
      */
    var text: js.UndefOr[String] = js.native
    
    /** Sets the  width of the text annotation
      * @Default {20}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object NodesAnnotation {
    
    @scala.inline
    def apply(): NodesAnnotation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesAnnotation]
    }
    
    @scala.inline
    implicit class NodesAnnotationMutableBuilder[Self <: NodesAnnotation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setDirection(value: BPMNAnnotationDirection | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait NodesClass extends StObject {
    
    /** Defines the collection of attributes
      * @Default {[]}
      */
    var attributes: js.UndefOr[js.Array[NodesClassAttribute]] = js.native
    
    /** Defines the collection of methods of a Class.
      * @Default {[]}
      */
    var methods: js.UndefOr[js.Array[NodesClassMethod]] = js.native
    
    /** Sets the name of class.
      */
    var name: js.UndefOr[String] = js.native
  }
  object NodesClass {
    
    @scala.inline
    def apply(): NodesClass = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesClass]
    }
    
    @scala.inline
    implicit class NodesClassMutableBuilder[Self <: NodesClass] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[NodesClassAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: NodesClassAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setMethods(value: js.Array[NodesClassMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: NodesClassMethod*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait NodesClassAttribute extends StObject {
    
    /** Sets the name of the attribute
      */
    var name: js.UndefOr[String] = js.native
    
    /** Defines the visibility of the attribute
      * @Default {ej.datavisualization.Diagram.ScopeValueDefaults.Public}
      */
    var scope: js.UndefOr[String] = js.native
    
    /** Sets the data type of attribute
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodesClassAttribute {
    
    @scala.inline
    def apply(): NodesClassAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesClassAttribute]
    }
    
    @scala.inline
    implicit class NodesClassAttributeMutableBuilder[Self <: NodesClassAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodesClassMethod extends StObject {
    
    /** Sets the visibility of the method.
      * @Default {ej.datavisualization.Diagram.ScopeValueDefaults.Public}
      */
    var scope: js.UndefOr[String] = js.native
  }
  object NodesClassMethod {
    
    @scala.inline
    def apply(): NodesClassMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesClassMethod]
    }
    
    @scala.inline
    implicit class NodesClassMethodMutableBuilder[Self <: NodesClassMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait NodesCollapseIcon extends StObject {
    
    /** Sets the border color for collapse icon of node
      * @Default {black}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Sets the border width for collapse icon of node
      * @Default {1}
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /** Sets the fill color for collapse icon of node
      * @Default {white}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Defines the height for collapse icon of node
      * @Default {15}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets the horizontal alignment of the icon.
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** To set the margin for the collapse icon of node
      * @Default {ej.datavisualization.Diagram.Margin()}
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** Sets the fraction/ratio(relative to node) that defines the position of the icon
      * @Default {ej.datavisualization.Diagram.Point(0.5, 1)}
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** Defines the shape of the collapsed state of the node.
      * @Default {ej.datavisualization.Diagram.IconShapes.None}
      */
    var shape: js.UndefOr[IconShapes | String] = js.native
    
    /** Sets the vertical alignment of the icon.
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  }
  object NodesCollapseIcon {
    
    @scala.inline
    def apply(): NodesCollapseIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesCollapseIcon]
    }
    
    @scala.inline
    implicit class NodesCollapseIconMutableBuilder[Self <: NodesCollapseIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setShape(value: IconShapes | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    }
  }
  
  @js.native
  trait NodesContainer extends StObject {
    
    /** Defines the orientation of the container. Applicable, if the group is a container.
      * @Default {vertical}
      */
    var orientation: js.UndefOr[String] = js.native
    
    /** Sets the type of the container. Applicable if the group is a container.
      * @Default {ej.datavisualization.Diagram.ContainerType.Canvas}
      */
    var `type`: js.UndefOr[ContainerType | String] = js.native
  }
  object NodesContainer {
    
    @scala.inline
    def apply(): NodesContainer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesContainer]
    }
    
    @scala.inline
    implicit class NodesContainerMutableBuilder[Self <: NodesContainer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setType(value: ContainerType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodesData extends StObject {
    
    /** Defines whether the BPMN data object is a collection or not
      * @Default {false}
      */
    var collection: js.UndefOr[Boolean] = js.native
    
    /** Sets the type of the BPMN Data object
      * @Default {ej.datavisualization.Diagram.BPMNDataObjects.None}
      */
    var `type`: js.UndefOr[BPMNDataObjects | String] = js.native
  }
  object NodesData {
    
    @scala.inline
    def apply(): NodesData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesData]
    }
    
    @scala.inline
    implicit class NodesDataMutableBuilder[Self <: NodesData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollection(value: Boolean): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
      
      @scala.inline
      def setType(value: BPMNDataObjects | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodesEnumeration extends StObject {
    
    /** Defines the collection of enumeration members
      * @Default {[]}
      */
    var members: js.UndefOr[js.Array[NodesEnumerationMember]] = js.native
    
    /** Sets the name of the Enumeration
      */
    var name: js.UndefOr[String] = js.native
  }
  object NodesEnumeration {
    
    @scala.inline
    def apply(): NodesEnumeration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesEnumeration]
    }
    
    @scala.inline
    implicit class NodesEnumerationMutableBuilder[Self <: NodesEnumeration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMembers(value: js.Array[NodesEnumerationMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setMembersVarargs(value: NodesEnumerationMember*): Self = StObject.set(x, "members", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait NodesEnumerationMember extends StObject {
    
    /** Sets the name of the enumeration member
      */
    var name: js.UndefOr[String] = js.native
  }
  object NodesEnumerationMember {
    
    @scala.inline
    def apply(): NodesEnumerationMember = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesEnumerationMember]
    }
    
    @scala.inline
    implicit class NodesEnumerationMemberMutableBuilder[Self <: NodesEnumerationMember] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait NodesExpandIcon extends StObject {
    
    /** Sets the border color for expand icon of node
      * @Default {black}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Sets the border width for expand icon of node
      * @Default {1}
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /** Sets the fill color for expand icon of node
      * @Default {white}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Defines the height for expand icon of node
      * @Default {15}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets the horizontal alignment of the icon.
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** To set the margin for the expand icon of node
      * @Default {ej.datavisualization.Diagram.Margin()}
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** Sets the fraction/ratio(relative to node) that defines the position of the icon
      * @Default {ej.datavisualization.Diagram.Point(0.5, 1)}
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** Defines the shape of the expanded state of the node.
      * @Default {ej.datavisualization.Diagram.IconShapes.None}
      */
    var shape: js.UndefOr[IconShapes | String] = js.native
    
    /** Sets the vertical alignment of the icon.
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  }
  object NodesExpandIcon {
    
    @scala.inline
    def apply(): NodesExpandIcon = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesExpandIcon]
    }
    
    @scala.inline
    implicit class NodesExpandIconMutableBuilder[Self <: NodesExpandIcon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setShape(value: IconShapes | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    }
  }
  
  @js.native
  trait NodesGradient extends StObject {
    
    /** Paints the node with linear color transitions
      */
    var LinearGradient: js.UndefOr[NodesGradientLinearGradient] = js.native
    
    /** Paints the node with radial color transitions. A focal point defines the beginning of the gradient, and a circle defines the end point of the gradient.
      */
    var RadialGradient: js.UndefOr[NodesGradientRadialGradient] = js.native
    
    /** Defines the color and a position where the previous color transition ends and a new color transition starts
      */
    var Stop: js.UndefOr[NodesGradientStop] = js.native
  }
  object NodesGradient {
    
    @scala.inline
    def apply(): NodesGradient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesGradient]
    }
    
    @scala.inline
    implicit class NodesGradientMutableBuilder[Self <: NodesGradient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinearGradient(value: NodesGradientLinearGradient): Self = StObject.set(x, "LinearGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinearGradientUndefined: Self = StObject.set(x, "LinearGradient", js.undefined)
      
      @scala.inline
      def setRadialGradient(value: NodesGradientRadialGradient): Self = StObject.set(x, "RadialGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadialGradientUndefined: Self = StObject.set(x, "RadialGradient", js.undefined)
      
      @scala.inline
      def setStop(value: NodesGradientStop): Self = StObject.set(x, "Stop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "Stop", js.undefined)
    }
  }
  
  @js.native
  trait NodesGradientLinearGradient extends StObject {
    
    /** Defines the different colors and the region of color transitions
      * @Default {[]}
      */
    var stops: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines the type of gradient
      * @Default {linear}
      */
    var `type`: js.UndefOr[String] = js.native
    
    /** Defines the left most position(relative to node) of the rectangular region that needs to be painted
      * @Default {0}
      */
    var x1: js.UndefOr[Double] = js.native
    
    /** Defines the right most position(relative to node) of the rectangular region that needs to be painted
      * @Default {0}
      */
    var x2: js.UndefOr[Double] = js.native
    
    /** Defines the top most position(relative to node) of the rectangular region that needs to be painted
      * @Default {0}
      */
    var y1: js.UndefOr[Double] = js.native
    
    /** Defines the bottom most position(relative to node) of the rectangular region that needs to be painted
      * @Default {0}
      */
    var y2: js.UndefOr[Double] = js.native
  }
  object NodesGradientLinearGradient {
    
    @scala.inline
    def apply(): NodesGradientLinearGradient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesGradientLinearGradient]
    }
    
    @scala.inline
    implicit class NodesGradientLinearGradientMutableBuilder[Self <: NodesGradientLinearGradient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStops(value: js.Array[_]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
      
      @scala.inline
      def setStopsVarargs(value: js.Any*): Self = StObject.set(x, "stops", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX1Undefined: Self = StObject.set(x, "x1", js.undefined)
      
      @scala.inline
      def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY1Undefined: Self = StObject.set(x, "y1", js.undefined)
      
      @scala.inline
      def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
    }
  }
  
  @js.native
  trait NodesGradientRadialGradient extends StObject {
    
    /** Defines the position of the outermost circle
      * @Default {0}
      */
    var cx: js.UndefOr[Double] = js.native
    
    /** Defines the outer most circle of the radial gradient
      * @Default {0}
      */
    var cy: js.UndefOr[Double] = js.native
    
    /** Defines the innermost circle of the radial gradient
      * @Default {0}
      */
    var fx: js.UndefOr[Double] = js.native
    
    /** Defines the innermost circle of the radial gradient
      * @Default {0}
      */
    var fy: js.UndefOr[Double] = js.native
    
    /** Defines the different colors and the region of color transitions.
      * @Default {[]}
      */
    var stops: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines the type of gradient
      * @Default {radial}
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodesGradientRadialGradient {
    
    @scala.inline
    def apply(): NodesGradientRadialGradient = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesGradientRadialGradient]
    }
    
    @scala.inline
    implicit class NodesGradientRadialGradientMutableBuilder[Self <: NodesGradientRadialGradient] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCx(value: Double): Self = StObject.set(x, "cx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCxUndefined: Self = StObject.set(x, "cx", js.undefined)
      
      @scala.inline
      def setCy(value: Double): Self = StObject.set(x, "cy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      @scala.inline
      def setFx(value: Double): Self = StObject.set(x, "fx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFxUndefined: Self = StObject.set(x, "fx", js.undefined)
      
      @scala.inline
      def setFy(value: Double): Self = StObject.set(x, "fy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFyUndefined: Self = StObject.set(x, "fy", js.undefined)
      
      @scala.inline
      def setStops(value: js.Array[_]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
      
      @scala.inline
      def setStopsVarargs(value: js.Any*): Self = StObject.set(x, "stops", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodesGradientStop extends StObject {
    
    /** Sets the color to be filled over the specified region
      */
    var color: js.UndefOr[String] = js.native
    
    /** Sets the position where the previous color transition ends and a new color transition starts
      * @Default {0}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Describes the transparency level of the region
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object NodesGradientStop {
    
    @scala.inline
    def apply(): NodesGradientStop = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesGradientStop]
    }
    
    @scala.inline
    implicit class NodesGradientStopMutableBuilder[Self <: NodesGradientStop] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait NodesInterface extends StObject {
    
    /** Defines a collection of attributes of the interface
      * @Default {[]}
      */
    var attributes: js.UndefOr[js.Array[NodesInterfaceAttribute]] = js.native
    
    /** Defines the collection of public methods of an interface
      * @Default {[]}
      */
    var methods: js.UndefOr[js.Array[NodesInterfaceMethod]] = js.native
    
    /** Sets the name of the interface
      */
    var name: js.UndefOr[String] = js.native
  }
  object NodesInterface {
    
    @scala.inline
    def apply(): NodesInterface = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesInterface]
    }
    
    @scala.inline
    implicit class NodesInterfaceMutableBuilder[Self <: NodesInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[NodesInterfaceAttribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setAttributesVarargs(value: NodesInterfaceAttribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setMethods(value: js.Array[NodesInterfaceMethod]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: NodesInterfaceMethod*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait NodesInterfaceAttribute extends StObject {
    
    /** Sets the name of the attribute
      */
    var name: js.UndefOr[String] = js.native
    
    /** Sets the visibility of the attribute
      */
    var scope: js.UndefOr[String] = js.native
    
    /** Sets the type of the attribute
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodesInterfaceAttribute {
    
    @scala.inline
    def apply(): NodesInterfaceAttribute = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesInterfaceAttribute]
    }
    
    @scala.inline
    implicit class NodesInterfaceAttributeMutableBuilder[Self <: NodesInterfaceAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodesInterfaceMethod extends StObject {
    
    /** Sets the visibility of the method
      */
    var scope: js.UndefOr[String] = js.native
  }
  object NodesInterfaceMethod {
    
    @scala.inline
    def apply(): NodesInterfaceMethod = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesInterfaceMethod]
    }
    
    @scala.inline
    implicit class NodesInterfaceMethodMutableBuilder[Self <: NodesInterfaceMethod] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait NodesLabel extends StObject {
    
    /** Enables/disables the bold style
      * @Default {false}
      */
    var bold: js.UndefOr[Boolean] = js.native
    
    /** Sets the border color of the label
      * @Default {transparent}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Sets the border width of the label
      * @Default {0}
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /** Enables or disables the default behaviors of the label.
      * @Default {ej.datavisualization.Diagram.LabelConstraints.None}
      */
    var constraints: js.UndefOr[LabelConstraints | String] = js.native
    
    /** This property allows you to customize labels appearance using user-defined CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Sets the fill color of the text area
      * @Default {transparent}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Sets the font color of the text
      * @Default {black}
      */
    var fontColor: js.UndefOr[String] = js.native
    
    /** Sets the font family of the text
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Defines the font size of the text
      * @Default {12}
      */
    var fontSize: js.UndefOr[Double] = js.native
    
    /** Sets the height of the label(the maximum value of label height and the node height will be considered as label height)
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets the horizontal alignment of the label.
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** Enables/disables the italic style
      * @Default {false}
      */
    var italic: js.UndefOr[Boolean] = js.native
    
    /** To set the margin of the label
      * @Default {ej.datavisualization.Diagram.Margin()}
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** Gets whether the label is currently being edited or not.
      * @Default {ej.datavisualization.Diagram.LabelEditMode.Edit}
      */
    var mode: js.UndefOr[LabelEditMode | String] = js.native
    
    /** Sets the unique identifier of the label
      */
    var name: js.UndefOr[String] = js.native
    
    /** Sets the fraction/ratio(relative to node) that defines the position of the label
      * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** Defines the transparency of the labels
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Sets the overflowType of the labels
      * @Default {ej.datavisualization.Diagram.OverflowType.Ellipsis}
      */
    var overflowType: js.UndefOr[OverflowType | String] = js.native
    
    /** To set the padding of the node label
      * @Default {ej.datavisualization.Diagram.Padding()}
      */
    var padding: js.UndefOr[js.Any] = js.native
    
    /** Defines whether the label is editable or not
      * @Default {false}
      */
    var readOnly: js.UndefOr[Boolean] = js.native
    
    /** Defines the angle to which the label needs to be rotated
      * @Default {0}
      */
    var rotateAngle: js.UndefOr[Double] = js.native
    
    /** Sets the id of svg/html templates. Applicable, if the node's label is HTML or native.
      */
    var templateId: js.UndefOr[String] = js.native
    
    /** Defines the label text
      */
    var text: js.UndefOr[String] = js.native
    
    /** Defines how to align the text inside the label.
      * @Default {ej.datavisualization.Diagram.TextAlign.Center}
      */
    var textAlign: js.UndefOr[typingsSlinky.ejWebAll.ej.TextAlign | String] = js.native
    
    /** Sets how to decorate the label text.
      * @Default {ej.datavisualization.Diagram.TextDecorations.None}
      */
    var textDecoration: js.UndefOr[TextDecorations | String] = js.native
    
    /** Defines the overflowed content is displayed or not.
      * @Default {false}
      */
    var textOverflow: js.UndefOr[Boolean] = js.native
    
    /** Sets the vertical alignment of the label.
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
    
    /** Enables or disables the visibility of the label
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Sets the width of the label(the maximum value of label width and the node width will be considered as label width)
      * @Default {50}
      */
    var width: js.UndefOr[Double] = js.native
    
    /** Defines how the label text needs to be wrapped.
      * @Default {ej.datavisualization.Diagram.TextWrapping.WrapWithOverflow}
      */
    var wrapping: js.UndefOr[TextWrapping | String] = js.native
  }
  object NodesLabel {
    
    @scala.inline
    def apply(): NodesLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesLabel]
    }
    
    @scala.inline
    implicit class NodesLabelMutableBuilder[Self <: NodesLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setConstraints(value: LabelConstraints | String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMode(value: LabelEditMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOverflowType(value: OverflowType | String): Self = StObject.set(x, "overflowType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowTypeUndefined: Self = StObject.set(x, "overflowType", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRotateAngle(value: Double): Self = StObject.set(x, "rotateAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateAngleUndefined: Self = StObject.set(x, "rotateAngle", js.undefined)
      
      @scala.inline
      def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlign(value: typingsSlinky.ejWebAll.ej.TextAlign | String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextDecoration(value: TextDecorations | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: Boolean): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrapping(value: TextWrapping | String): Self = StObject.set(x, "wrapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrappingUndefined: Self = StObject.set(x, "wrapping", js.undefined)
    }
  }
  
  @js.native
  trait NodesLane extends StObject {
    
    /** Allows to maintain additional information about lane
      * @Default {{}}
      */
    var addInfo: js.UndefOr[js.Any] = js.native
    
    /** An array of objects where each object represents a child node of the lane
      * @Default {[]}
      */
    var children: js.UndefOr[js.Array[_]] = js.native
    
    /** This property allows you to customize lanes appearance using user-defined CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Defines the fill color of the lane
      * @Default {white}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Defines the header of the lane
      * @Default {{ text: Function, fontSize: 11 }}
      */
    var header: js.UndefOr[js.Any] = js.native
    
    /** Defines the height of lane
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Defines the object as a lane
      * @Default {false}
      */
    var isLane: js.UndefOr[Boolean] = js.native
    
    /** Sets the unique identifier of the lane
      */
    var name: js.UndefOr[String] = js.native
    
    /** Sets the orientation of the lane.
      * @Default {vertical}
      */
    var orientation: js.UndefOr[String] = js.native
    
    /** Defines the width of lane
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
    
    /** Defines the z-index of the lane
      * @Default {0}
      */
    var zorder: js.UndefOr[Double] = js.native
  }
  object NodesLane {
    
    @scala.inline
    def apply(): NodesLane = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesLane]
    }
    
    @scala.inline
    implicit class NodesLaneMutableBuilder[Self <: NodesLane] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddInfo(value: js.Any): Self = StObject.set(x, "addInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddInfoUndefined: Self = StObject.set(x, "addInfo", js.undefined)
      
      @scala.inline
      def setChildren(value: js.Array[_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setHeader(value: js.Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsLane(value: Boolean): Self = StObject.set(x, "isLane", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLaneUndefined: Self = StObject.set(x, "isLane", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZorder(value: Double): Self = StObject.set(x, "zorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZorderUndefined: Self = StObject.set(x, "zorder", js.undefined)
    }
  }
  
  @js.native
  trait NodesPaletteItem extends StObject {
    
    /** Defines whether the symbol should be drawn at its actual size regardless of precedence factors or not
      * @Default {true}
      */
    var enableScale: js.UndefOr[Boolean] = js.native
    
    /** Defines the height of the symbol
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** To display a name for nodes in the symbol palette
      * @Default {null}
      */
    var label: js.UndefOr[String] = js.native
    
    /** Defines the margin of the symbol item
      * @Default {{ left: 4, right: 4, top: 4, bottom: 4 }}
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** Defines the preview height of the symbol
      * @Default {undefined}
      */
    var previewHeight: js.UndefOr[Double] = js.native
    
    /** Defines the preview width of the symbol
      * @Default {undefined}
      */
    var previewWidth: js.UndefOr[Double] = js.native
    
    /** Defines the width of the symbol
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object NodesPaletteItem {
    
    @scala.inline
    def apply(): NodesPaletteItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesPaletteItem]
    }
    
    @scala.inline
    implicit class NodesPaletteItemMutableBuilder[Self <: NodesPaletteItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableScale(value: Boolean): Self = StObject.set(x, "enableScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableScaleUndefined: Self = StObject.set(x, "enableScale", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setPreviewHeight(value: Double): Self = StObject.set(x, "previewHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewHeightUndefined: Self = StObject.set(x, "previewHeight", js.undefined)
      
      @scala.inline
      def setPreviewWidth(value: Double): Self = StObject.set(x, "previewWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewWidthUndefined: Self = StObject.set(x, "previewWidth", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait NodesPhase extends StObject {
    
    /** Defines the header of the smaller regions
      * @Default {null}
      */
    var label: js.UndefOr[js.Any] = js.native
    
    /** Defines the line color of the splitter that splits adjacent phases.
      * @Default {#606060}
      */
    var lineColor: js.UndefOr[String] = js.native
    
    /** Sets the dash array that used to stroke the phase splitter
      * @Default {3,3}
      */
    var lineDashArray: js.UndefOr[String] = js.native
    
    /** Sets the lineWidth of the phase
      * @Default {1}
      */
    var lineWidth: js.UndefOr[Double] = js.native
    
    /** Sets the unique identifier of the phase
      */
    var name: js.UndefOr[String] = js.native
    
    /** Sets the length of the smaller region(phase) of a swimlane
      * @Default {100}
      */
    var offset: js.UndefOr[Double] = js.native
    
    /** Sets the orientation of the phase
      * @Default {horizontal}
      */
    var orientation: js.UndefOr[String] = js.native
    
    /** Sets the type of the object as phase
      * @Default {phase}
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object NodesPhase {
    
    @scala.inline
    def apply(): NodesPhase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesPhase]
    }
    
    @scala.inline
    implicit class NodesPhaseMutableBuilder[Self <: NodesPhase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      @scala.inline
      def setLineDashArray(value: String): Self = StObject.set(x, "lineDashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashArrayUndefined: Self = StObject.set(x, "lineDashArray", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodesPort extends StObject {
    
    /** Sets the border color of the port
      * @Default {#1a1a1a}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Sets the stroke width of the port
      * @Default {1}
      */
    var borderWidth: js.UndefOr[Double] = js.native
    
    /** Defines the space to be left between the port bounds and its incoming and outgoing connections.
      * @Default {0}
      */
    var connectorPadding: js.UndefOr[Double] = js.native
    
    /** Defines whether connections can be created with the port
      * @Default {ej.datavisualization.Diagram.PortConstraints.Connect}
      */
    var constraints: js.UndefOr[PortConstraints | String] = js.native
    
    /** This property allows you to customize ports appearance using user-defined CSS.
      */
    var cssClass: js.UndefOr[String] = js.native
    
    /** Sets the fill color of the port
      * @Default {white}
      */
    var fillColor: js.UndefOr[String] = js.native
    
    /** Sets the unique identifier of the port
      */
    var name: js.UndefOr[String] = js.native
    
    /** Defines the position of the port as fraction/ ratio relative to node
      * @Default {ej.datavisualization.Diagram.Point(0, 0)}
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** Sets the name of the node which contains this port.
      */
    var parent: js.UndefOr[String] = js.native
    
    /** Defines the path data to draw the port. Applicable, if the port shape is path.
      */
    var pathData: js.UndefOr[String] = js.native
    
    /** Defines the shape of the port.
      * @Default {ej.datavisualization.Diagram.PortShapes.Square}
      */
    var shape: js.UndefOr[PortShapes | String] = js.native
    
    /** Defines the size of the port
      * @Default {8}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Defines when the port should be visible.
      * @Default {ej.datavisualization.Diagram.PortVisibility.Default}
      */
    var visibility: js.UndefOr[PortVisibility | String] = js.native
  }
  object NodesPort {
    
    @scala.inline
    def apply(): NodesPort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesPort]
    }
    
    @scala.inline
    implicit class NodesPortMutableBuilder[Self <: NodesPort] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      @scala.inline
      def setConnectorPadding(value: Double): Self = StObject.set(x, "connectorPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectorPaddingUndefined: Self = StObject.set(x, "connectorPadding", js.undefined)
      
      @scala.inline
      def setConstraints(value: PortConstraints | String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setFillColor(value: String): Self = StObject.set(x, "fillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillColorUndefined: Self = StObject.set(x, "fillColor", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setPathData(value: String): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathDataUndefined: Self = StObject.set(x, "pathData", js.undefined)
      
      @scala.inline
      def setShape(value: PortShapes | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setVisibility(value: PortVisibility | String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
    }
  }
  
  @js.native
  trait NodesShadow extends StObject {
    
    /** Defines the angle of the shadow relative to node
      * @Default {45}
      */
    var angle: js.UndefOr[Double] = js.native
    
    /** Sets the distance to move the shadow relative to node
      * @Default {5}
      */
    var distance: js.UndefOr[Double] = js.native
    
    /** Defines the opaque of the shadow
      * @Default {0.7}
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object NodesShadow {
    
    @scala.inline
    def apply(): NodesShadow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesShadow]
    }
    
    @scala.inline
    implicit class NodesShadowMutableBuilder[Self <: NodesShadow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait NodesSubProcess extends StObject {
    
    /** Defines the children for BPMN's SubProcess
      * @Default {[]}
      */
    var Processes: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines whether the BPMN sub process is without any prescribed order or not
      * @Default {false}
      */
    var adhoc: js.UndefOr[Boolean] = js.native
    
    /** Sets the boundary of the BPMN process
      * @Default {ej.datavisualization.Diagram.BPMNBoundary.Default}
      */
    var boundary: js.UndefOr[BPMNBoundary | String] = js.native
    
    /** Sets whether the BPMN subprocess is triggered as a collapsed of a specific activity
      * @Default {true}
      */
    var collapsed: js.UndefOr[Boolean] = js.native
    
    /** Sets whether the BPMN subprocess is triggered as a compensation of a specific activity
      * @Default {false}
      */
    var compensation: js.UndefOr[Boolean] = js.native
    
    /** Sets the type of the event by which the sub-process will be triggered
      * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
      */
    var event: js.UndefOr[BPMNEvents | String] = js.native
    
    /** Defines the collection of events that need to be appended with BPMN Sub-Process
      */
    var events: js.UndefOr[js.Array[NodesSubProcessEvent]] = js.native
    
    /** Defines the loop type of a sub process.
      * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
      */
    var loop: js.UndefOr[BPMNLoops | String] = js.native
    
    /** Defines the type of the event trigger
      * @Default {ej.datavisualization.Diagram.BPMNTriggers.Message}
      */
    var trigger: js.UndefOr[BPMNTriggers | String] = js.native
    
    /** Defines the type of a sub process
      * @Default {ej.datavisualization.Diagram.BPMNSubProcessTypes.None}
      */
    var `type`: js.UndefOr[BPMNSubProcessTypes | String] = js.native
  }
  object NodesSubProcess {
    
    @scala.inline
    def apply(): NodesSubProcess = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesSubProcess]
    }
    
    @scala.inline
    implicit class NodesSubProcessMutableBuilder[Self <: NodesSubProcess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdhoc(value: Boolean): Self = StObject.set(x, "adhoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdhocUndefined: Self = StObject.set(x, "adhoc", js.undefined)
      
      @scala.inline
      def setBoundary(value: BPMNBoundary | String): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setCollapsed(value: Boolean): Self = StObject.set(x, "collapsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapsedUndefined: Self = StObject.set(x, "collapsed", js.undefined)
      
      @scala.inline
      def setCompensation(value: Boolean): Self = StObject.set(x, "compensation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompensationUndefined: Self = StObject.set(x, "compensation", js.undefined)
      
      @scala.inline
      def setEvent(value: BPMNEvents | String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[NodesSubProcessEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: NodesSubProcessEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setLoop(value: BPMNLoops | String): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setProcesses(value: js.Array[_]): Self = StObject.set(x, "Processes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessesUndefined: Self = StObject.set(x, "Processes", js.undefined)
      
      @scala.inline
      def setProcessesVarargs(value: js.Any*): Self = StObject.set(x, "Processes", js.Array(value :_*))
      
      @scala.inline
      def setTrigger(value: BPMNTriggers | String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setType(value: BPMNSubProcessTypes | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait NodesSubProcessEvent extends StObject {
    
    /** Sets the type of the event by which the sub-process will be triggered
      * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
      */
    var event: js.UndefOr[BPMNEvents | String] = js.native
    
    /** A collection of objects where each object represents a label
      * @Default {[]}
      */
    var labels: js.UndefOr[js.Array[_]] = js.native
    
    /** Sets the name of the BPMN event shape.
      */
    var name: js.UndefOr[String] = js.native
    
    /** Sets the fraction/ratio(relative to parent) that defines the position of the event shape
      * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** An array of objects where each object represents a port
      * @Default {[]}
      */
    var ports: js.UndefOr[js.Array[_]] = js.native
    
    /** Defines the type of the event trigger
      * @Default {ej.datavisualization.Diagram.BPMNTriggers.Message}
      */
    var trigger: js.UndefOr[BPMNTriggers | String] = js.native
  }
  object NodesSubProcessEvent {
    
    @scala.inline
    def apply(): NodesSubProcessEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesSubProcessEvent]
    }
    
    @scala.inline
    implicit class NodesSubProcessEventMutableBuilder[Self <: NodesSubProcessEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: BPMNEvents | String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setLabels(value: js.Array[_]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: js.Any*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPorts(value: js.Array[_]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      @scala.inline
      def setPortsVarargs(value: js.Any*): Self = StObject.set(x, "ports", js.Array(value :_*))
      
      @scala.inline
      def setTrigger(value: BPMNTriggers | String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
  
  @js.native
  trait NodesTask extends StObject {
    
    /** To set whether the task is a global task or not
      * @Default {false}
      */
    var call: js.UndefOr[Boolean] = js.native
    
    /** Sets whether the task is triggered as a compensation of another specific activity
      * @Default {false}
      */
    var compensation: js.UndefOr[Boolean] = js.native
    
    /** Defines the collection of events that need to be appended with BPMN tasks
      */
    var events: js.UndefOr[js.Array[_]] = js.native
    
    /** Sets the loop type of a BPMN task.
      * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
      */
    var loop: js.UndefOr[BPMNLoops | String] = js.native
    
    /** Sets the type of the BPMN task.
      * @Default {ej.datavisualization.Diagram.BPMNTasks.None}
      */
    var `type`: js.UndefOr[BPMNTasks | String] = js.native
  }
  object NodesTask {
    
    @scala.inline
    def apply(): NodesTask = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodesTask]
    }
    
    @scala.inline
    implicit class NodesTaskMutableBuilder[Self <: NodesTask] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: Boolean): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
      
      @scala.inline
      def setCompensation(value: Boolean): Self = StObject.set(x, "compensation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompensationUndefined: Self = StObject.set(x, "compensation", js.undefined)
      
      @scala.inline
      def setEvents(value: js.Array[_]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      @scala.inline
      def setEventsVarargs(value: js.Any*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      @scala.inline
      def setLoop(value: BPMNLoops | String): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setType(value: BPMNTasks | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** to export any custom region of diagram.
      */
    var bounds: js.UndefOr[js.Any] = js.native
    
    /** name of the file to be downloaded.
      */
    var fileName: js.UndefOr[String] = js.native
    
    /** format of the exported file/data.
      */
    var format: js.UndefOr[FileFormats] = js.native
    
    /** to set margin to the exported data.
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** to set whether to export diagram as a file or as raw data.
      */
    var mode: js.UndefOr[ExportModes] = js.native
    
    /** to export the diagram into multiple pages
      */
    var multiplePage: js.UndefOr[Boolean] = js.native
    
    /** to set the page height of the diagram while exporting the diagram into multiple pages.
      */
    var pageHeight: js.UndefOr[Double] = js.native
    
    /** to sets the orientation of the page.
      */
    var pageOrientation: js.UndefOr[PageOrientations] = js.native
    
    /** to set the page width of the diagram while exporting the diagram into multiple pages.
      */
    var pageWidth: js.UndefOr[Double] = js.native
    
    /** to set the region of the diagram to be exported.
      */
    var region: js.UndefOr[Region] = js.native
    
    /** to resize the diagram content to fill its allocated space.
      */
    var stretch: js.UndefOr[Stretch] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: js.Any): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setFormat(value: FileFormats): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setMode(value: ExportModes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setMultiplePage(value: Boolean): Self = StObject.set(x, "multiplePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplePageUndefined: Self = StObject.set(x, "multiplePage", js.undefined)
      
      @scala.inline
      def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientations): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPageWidth(value: Double): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
      
      @scala.inline
      def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setStretch(value: Stretch): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    }
  }
  
  @js.native
  trait PageSettings extends StObject {
    
    /** Defines the maximum distance to be left between the object and the scroll bar to trigger auto scrolling
      * @Default {{ left: 15, top: 15, right: 15, bottom: 15 }}
      */
    var autoScrollBorder: js.UndefOr[js.Any] = js.native
    
    /** Defines the draggable region of diagram elements.
      * @Default {ej.datavisualization.Diagram.BoundaryConstraints.Infinite}
      */
    var boundaryConstraints: js.UndefOr[BoundaryConstraints | String] = js.native
    
    /** Sets whether multiple pages can be created to fit all nodes and connectors
      * @Default {false}
      */
    var multiplePage: js.UndefOr[Boolean] = js.native
    
    /** Defines the background color of diagram pages
      * @Default {#ffffff}
      */
    var pageBackgroundColor: js.UndefOr[String] = js.native
    
    /** Defines the page border color
      * @Default {#565656}
      */
    var pageBorderColor: js.UndefOr[String] = js.native
    
    /** Sets the border width of diagram pages
      * @Default {0}
      */
    var pageBorderWidth: js.UndefOr[Double] = js.native
    
    /** Defines the height of a page
      * @Default {null}
      */
    var pageHeight: js.UndefOr[Double] = js.native
    
    /** Defines the page margin
      * @Default {24}
      */
    var pageMargin: js.UndefOr[Double] = js.native
    
    /** Sets the orientation of the page.
      * @Default {ej.datavisualization.Diagram.PageOrientations.Portrait}
      */
    var pageOrientation: js.UndefOr[PageOrientations | String] = js.native
    
    /** Defines the height of a diagram page
      * @Default {null}
      */
    var pageWidth: js.UndefOr[Double] = js.native
    
    /** Defines the scrollable region of diagram.
      * @Default {ej.datavisualization.Diagram.ScrollLimit.Infinite}
      */
    var scrollLimit: js.UndefOr[ScrollLimit | String] = js.native
    
    /** Defines the scrollable area of diagram. Applicable, if the scroll limit is &quot;limited&quot;.
      * @Default {null}
      */
    var scrollableArea: js.UndefOr[js.Any] = js.native
    
    /** Enables or disables the page breaks
      * @Default {false}
      */
    var showPageBreak: js.UndefOr[Boolean] = js.native
  }
  object PageSettings {
    
    @scala.inline
    def apply(): PageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageSettings]
    }
    
    @scala.inline
    implicit class PageSettingsMutableBuilder[Self <: PageSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoScrollBorder(value: js.Any): Self = StObject.set(x, "autoScrollBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoScrollBorderUndefined: Self = StObject.set(x, "autoScrollBorder", js.undefined)
      
      @scala.inline
      def setBoundaryConstraints(value: BoundaryConstraints | String): Self = StObject.set(x, "boundaryConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryConstraintsUndefined: Self = StObject.set(x, "boundaryConstraints", js.undefined)
      
      @scala.inline
      def setMultiplePage(value: Boolean): Self = StObject.set(x, "multiplePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplePageUndefined: Self = StObject.set(x, "multiplePage", js.undefined)
      
      @scala.inline
      def setPageBackgroundColor(value: String): Self = StObject.set(x, "pageBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBackgroundColorUndefined: Self = StObject.set(x, "pageBackgroundColor", js.undefined)
      
      @scala.inline
      def setPageBorderColor(value: String): Self = StObject.set(x, "pageBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBorderColorUndefined: Self = StObject.set(x, "pageBorderColor", js.undefined)
      
      @scala.inline
      def setPageBorderWidth(value: Double): Self = StObject.set(x, "pageBorderWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageBorderWidthUndefined: Self = StObject.set(x, "pageBorderWidth", js.undefined)
      
      @scala.inline
      def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
      
      @scala.inline
      def setPageMargin(value: Double): Self = StObject.set(x, "pageMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageMarginUndefined: Self = StObject.set(x, "pageMargin", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientations | String): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPageWidth(value: Double): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
      
      @scala.inline
      def setScrollLimit(value: ScrollLimit | String): Self = StObject.set(x, "scrollLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollLimitUndefined: Self = StObject.set(x, "scrollLimit", js.undefined)
      
      @scala.inline
      def setScrollableArea(value: js.Any): Self = StObject.set(x, "scrollableArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableAreaUndefined: Self = StObject.set(x, "scrollableArea", js.undefined)
      
      @scala.inline
      def setShowPageBreak(value: Boolean): Self = StObject.set(x, "showPageBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPageBreakUndefined: Self = StObject.set(x, "showPageBreak", js.undefined)
    }
  }
  
  @js.native
  trait PrintImageSettings extends StObject {
    
    /** to print any custom region of diagram.
      */
    var bounds: js.UndefOr[js.Any] = js.native
    
    /** to export the diagram into multiple pages
      */
    var multiplePage: js.UndefOr[Boolean] = js.native
    
    /** to set the page height of the diagram while printing the diagram into multiple pages.
      */
    var pageHeight: js.UndefOr[Double] = js.native
    
    /** to sets the orientation of the page.
      */
    var pageOrientation: js.UndefOr[PageOrientations] = js.native
    
    /** to set the page width of the diagram while printing the diagram into multiple pages.
      */
    var pageWidth: js.UndefOr[Double] = js.native
    
    /** to set the region of the diagram to be printed.
      */
    var region: js.UndefOr[Region] = js.native
  }
  object PrintImageSettings {
    
    @scala.inline
    def apply(): PrintImageSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintImageSettings]
    }
    
    @scala.inline
    implicit class PrintImageSettingsMutableBuilder[Self <: PrintImageSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: js.Any): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setMultiplePage(value: Boolean): Self = StObject.set(x, "multiplePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplePageUndefined: Self = StObject.set(x, "multiplePage", js.undefined)
      
      @scala.inline
      def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientations): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPageWidth(value: Double): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
      
      @scala.inline
      def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  @js.native
  trait PrintSettings extends StObject {
    
    /** to print any custom region of diagram.
      */
    var bounds: js.UndefOr[js.Any] = js.native
    
    /** to print the diagram into multiple pages
      */
    var multiplePage: js.UndefOr[Boolean] = js.native
    
    /** to set the page height of the diagram while printing the diagram into multiple pages.
      */
    var pageHeight: js.UndefOr[Double] = js.native
    
    /** to sets the orientation of the page.
      */
    var pageOrientation: js.UndefOr[PageOrientations] = js.native
    
    /** to set the page width of the diagram while printing the diagram into multiple pages.
      */
    var pageWidth: js.UndefOr[Double] = js.native
    
    /** to set the region of the diagram to be printed.
      */
    var region: js.UndefOr[Region] = js.native
    
    /** to resize the diagram content to fill its allocated space and printed.
      */
    var stretch: js.UndefOr[Stretch] = js.native
  }
  object PrintSettings {
    
    @scala.inline
    def apply(): PrintSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintSettings]
    }
    
    @scala.inline
    implicit class PrintSettingsMutableBuilder[Self <: PrintSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: js.Any): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setMultiplePage(value: Boolean): Self = StObject.set(x, "multiplePage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiplePageUndefined: Self = StObject.set(x, "multiplePage", js.undefined)
      
      @scala.inline
      def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageHeightUndefined: Self = StObject.set(x, "pageHeight", js.undefined)
      
      @scala.inline
      def setPageOrientation(value: PageOrientations): Self = StObject.set(x, "pageOrientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageOrientationUndefined: Self = StObject.set(x, "pageOrientation", js.undefined)
      
      @scala.inline
      def setPageWidth(value: Double): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageWidthUndefined: Self = StObject.set(x, "pageWidth", js.undefined)
      
      @scala.inline
      def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setStretch(value: Stretch): Self = StObject.set(x, "stretch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchUndefined: Self = StObject.set(x, "stretch", js.undefined)
    }
  }
  
  @js.native
  trait PropertyChangeEventArgs extends StObject {
    
    /** parameter defines whether to cancel the property change or not
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the action is nudge or not
      */
    var cause: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the selected element
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the new value of the node property that is being changed
      */
    var newValue: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the old value of the property that is being changed
      */
    var oldValue: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the name of the property that is changed
      */
    var propertyName: js.UndefOr[String] = js.native
  }
  object PropertyChangeEventArgs {
    
    @scala.inline
    def apply(): PropertyChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropertyChangeEventArgs]
    }
    
    @scala.inline
    implicit class PropertyChangeEventArgsMutableBuilder[Self <: PropertyChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyNameUndefined: Self = StObject.set(x, "propertyName", js.undefined)
    }
  }
  
  @js.native
  trait RotationChangeEventArgs extends StObject {
    
    /** parameter to specify whether or not to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the actual click event arguments that explains which button is clicked
      */
    var cause: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the node that is rotated
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the new rotation angle
      */
    var newValue: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the previous rotation angle
      */
    var oldValue: js.UndefOr[js.Any] = js.native
  }
  object RotationChangeEventArgs {
    
    @scala.inline
    def apply(): RotationChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotationChangeEventArgs]
    }
    
    @scala.inline
    implicit class RotationChangeEventArgsMutableBuilder[Self <: RotationChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  @js.native
  trait RulerSettings extends StObject {
    
    /** Defines the appearance of horizontal ruler
      */
    var horizontalRuler: js.UndefOr[RulerSettingsHorizontalRuler] = js.native
    
    /** Enables or disables both the horizontal and vertical ruler.
      * @Default {false}
      */
    var showRulers: js.UndefOr[Boolean] = js.native
    
    /** Defines the appearance of vertical ruler
      */
    var verticalRuler: js.UndefOr[RulerSettingsVerticalRuler] = js.native
  }
  object RulerSettings {
    
    @scala.inline
    def apply(): RulerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RulerSettings]
    }
    
    @scala.inline
    implicit class RulerSettingsMutableBuilder[Self <: RulerSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontalRuler(value: RulerSettingsHorizontalRuler): Self = StObject.set(x, "horizontalRuler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalRulerUndefined: Self = StObject.set(x, "horizontalRuler", js.undefined)
      
      @scala.inline
      def setShowRulers(value: Boolean): Self = StObject.set(x, "showRulers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRulersUndefined: Self = StObject.set(x, "showRulers", js.undefined)
      
      @scala.inline
      def setVerticalRuler(value: RulerSettingsVerticalRuler): Self = StObject.set(x, "verticalRuler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalRulerUndefined: Self = StObject.set(x, "verticalRuler", js.undefined)
    }
  }
  
  @js.native
  trait RulerSettingsHorizontalRuler extends StObject {
    
    /** Defines the method which used to position and arrange the tick elements of the horizontal ruler.
      * @Default {null}
      */
    var arrangeTick: js.UndefOr[js.Any] = js.native
    
    /** Defines the number of intervals to be present on the each segment of the horizontal ruler.
      * @Default {5}
      */
    var interval: js.UndefOr[Double] = js.native
    
    /** Defines the width of the horizontal ruler.
      * @Default {null}
      */
    var length: js.UndefOr[Double] = js.native
    
    /** Defines the color of the horizontal marker brush.
      * @Default {red}
      */
    var markerColor: js.UndefOr[String] = js.native
    
    /** Defines the textual description of the ruler segment, and the appearance of the ruler ticks of the horizontal ruler.
      * @Default {100}
      */
    var segmentWidth: js.UndefOr[Double] = js.native
    
    /** Defines the height of the horizontal ruler.
      * @Default {25}
      */
    var thickness: js.UndefOr[Double] = js.native
    
    /** Defines and sets the tick alignment of the ruler scale.
      * @Default {ej.datavisualization.Diagram.TickAlignment.RightOrBottom}
      */
    var tickAlignment: js.UndefOr[TickAlignment | String] = js.native
  }
  object RulerSettingsHorizontalRuler {
    
    @scala.inline
    def apply(): RulerSettingsHorizontalRuler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RulerSettingsHorizontalRuler]
    }
    
    @scala.inline
    implicit class RulerSettingsHorizontalRulerMutableBuilder[Self <: RulerSettingsHorizontalRuler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrangeTick(value: js.Any): Self = StObject.set(x, "arrangeTick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrangeTickUndefined: Self = StObject.set(x, "arrangeTick", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setSegmentWidth(value: Double): Self = StObject.set(x, "segmentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentWidthUndefined: Self = StObject.set(x, "segmentWidth", js.undefined)
      
      @scala.inline
      def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      @scala.inline
      def setTickAlignment(value: TickAlignment | String): Self = StObject.set(x, "tickAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickAlignmentUndefined: Self = StObject.set(x, "tickAlignment", js.undefined)
    }
  }
  
  @js.native
  trait RulerSettingsVerticalRuler extends StObject {
    
    /** Defines the method which used to position and arrange the tick elements of the vertical ruler.
      * @Default {null}
      */
    var arrangeTick: js.UndefOr[js.Any] = js.native
    
    /** Defines the number of intervals to be present on the each segment of the vertical ruler.
      * @Default {5}
      */
    var interval: js.UndefOr[Double] = js.native
    
    /** Defines the height of the vertical ruler.
      * @Default {null}
      */
    var length: js.UndefOr[Double] = js.native
    
    /** Defines the color of the vertical marker brush.
      * @Default {red}
      */
    var markerColor: js.UndefOr[String] = js.native
    
    /** Defines the textual description of the ruler segment, and the appearance of the ruler ticks of the vertical ruler.
      * @Default {100}
      */
    var segmentWidth: js.UndefOr[Double] = js.native
    
    /** Defines the width of the vertical ruler.
      * @Default {25}
      */
    var thickness: js.UndefOr[Double] = js.native
    
    /** Defines and sets the tick alignment of the ruler scale.
      * @Default {ej.datavisualization.Diagram.TickAlignment.RightOrBottom}
      */
    var tickAlignment: js.UndefOr[TickAlignment | String] = js.native
  }
  object RulerSettingsVerticalRuler {
    
    @scala.inline
    def apply(): RulerSettingsVerticalRuler = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RulerSettingsVerticalRuler]
    }
    
    @scala.inline
    implicit class RulerSettingsVerticalRulerMutableBuilder[Self <: RulerSettingsVerticalRuler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrangeTick(value: js.Any): Self = StObject.set(x, "arrangeTick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrangeTickUndefined: Self = StObject.set(x, "arrangeTick", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMarkerColor(value: String): Self = StObject.set(x, "markerColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkerColorUndefined: Self = StObject.set(x, "markerColor", js.undefined)
      
      @scala.inline
      def setSegmentWidth(value: Double): Self = StObject.set(x, "segmentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentWidthUndefined: Self = StObject.set(x, "segmentWidth", js.undefined)
      
      @scala.inline
      def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      @scala.inline
      def setTickAlignment(value: TickAlignment | String): Self = StObject.set(x, "tickAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTickAlignmentUndefined: Self = StObject.set(x, "tickAlignment", js.undefined)
    }
  }
  
  @js.native
  trait ScrollChangeEventArgs extends StObject {
    
    /** parameter returns whether or not to cancel the dragOver event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
      */
    var cause: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** Parameter returns the new zoom value, horizontal and vertical scroll offsets.
      */
    var newValues: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the previous zoom value, horizontal and vertical scroll offsets.
      */
    var oldValues: js.UndefOr[js.Any] = js.native
  }
  object ScrollChangeEventArgs {
    
    @scala.inline
    def apply(): ScrollChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollChangeEventArgs]
    }
    
    @scala.inline
    implicit class ScrollChangeEventArgsMutableBuilder[Self <: ScrollChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setNewValues(value: js.Any): Self = StObject.set(x, "newValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValuesUndefined: Self = StObject.set(x, "newValues", js.undefined)
      
      @scala.inline
      def setOldValues(value: js.Any): Self = StObject.set(x, "oldValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValuesUndefined: Self = StObject.set(x, "oldValues", js.undefined)
    }
  }
  
  @js.native
  trait ScrollSettings extends StObject {
    
    /** Allows to read the zoom value of diagram
      * @Default {0}
      */
    var currentZoom: js.UndefOr[Double] = js.native
    
    /** Sets the horizontal scroll offset
      * @Default {0}
      */
    var horizontalOffset: js.UndefOr[Double] = js.native
    
    /** Allows to extend the scrollable region that is based on the scroll limit
      * @Default {{left: 0, right: 0, top:0, bottom: 0}}
      */
    var padding: js.UndefOr[js.Any] = js.native
    
    /** Sets the vertical scroll offset
      * @Default {0}
      */
    var verticalOffset: js.UndefOr[Double] = js.native
    
    /** Allows to read the view port height of the diagram
      * @Default {0}
      */
    var viewPortHeight: js.UndefOr[Double] = js.native
    
    /** Allows to read the view port width of the diagram
      * @Default {0}
      */
    var viewPortWidth: js.UndefOr[Double] = js.native
  }
  object ScrollSettings {
    
    @scala.inline
    def apply(): ScrollSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSettings]
    }
    
    @scala.inline
    implicit class ScrollSettingsMutableBuilder[Self <: ScrollSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentZoom(value: Double): Self = StObject.set(x, "currentZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentZoomUndefined: Self = StObject.set(x, "currentZoom", js.undefined)
      
      @scala.inline
      def setHorizontalOffset(value: Double): Self = StObject.set(x, "horizontalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalOffsetUndefined: Self = StObject.set(x, "horizontalOffset", js.undefined)
      
      @scala.inline
      def setPadding(value: js.Any): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setVerticalOffset(value: Double): Self = StObject.set(x, "verticalOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalOffsetUndefined: Self = StObject.set(x, "verticalOffset", js.undefined)
      
      @scala.inline
      def setViewPortHeight(value: Double): Self = StObject.set(x, "viewPortHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewPortHeightUndefined: Self = StObject.set(x, "viewPortHeight", js.undefined)
      
      @scala.inline
      def setViewPortWidth(value: Double): Self = StObject.set(x, "viewPortWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewPortWidthUndefined: Self = StObject.set(x, "viewPortWidth", js.undefined)
    }
  }
  
  @js.native
  trait SegmentChangeEventArgs extends StObject {
    
    /** parameter to specify whether or not to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the state of editing (starting, dragging, completed)
      */
    var dragState: js.UndefOr[String] = js.native
    
    /** Parameter returns the connector that is being edited
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the current mouse position
      */
    var point: js.UndefOr[js.Any] = js.native
  }
  object SegmentChangeEventArgs {
    
    @scala.inline
    def apply(): SegmentChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentChangeEventArgs]
    }
    
    @scala.inline
    implicit class SegmentChangeEventArgsMutableBuilder[Self <: SegmentChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setDragState(value: String): Self = StObject.set(x, "dragState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDragStateUndefined: Self = StObject.set(x, "dragState", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setPoint(value: js.Any): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    }
  }
  
  @js.native
  trait SelectedItems extends StObject {
    
    /** A read only collection of the selected items
      * @Default {[]}
      */
    var children: js.UndefOr[js.Array[_]] = js.native
    
    /** Controls the visibility of selector.
      * @Default {ej.datavisualization.Diagram.SelectorConstraints.All}
      */
    var constraints: js.UndefOr[SelectorConstraints | String] = js.native
    
    /** Defines a method that dynamically enables/ disables the interaction with multiple selection.
      * @Default {null}
      */
    var getConstraints: js.UndefOr[js.Any] = js.native
    
    /** Sets the height of the selected items
      * @Default {0}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets the x position of the selector
      * @Default {0}
      */
    var offsetX: js.UndefOr[Double] = js.native
    
    /** Sets the y position of the selector
      * @Default {0}
      */
    var offsetY: js.UndefOr[Double] = js.native
    
    /** Sets the angle to rotate the selected items
      * @Default {0}
      */
    var rotateAngle: js.UndefOr[Double] = js.native
    
    /** Sets the angle to rotate the selected items. For tooltip properties, refer Tooltip
      * @Default {ej.datavisualization.Diagram.Tooltip()}
      */
    var tooltip: js.UndefOr[js.Any] = js.native
    
    /** A collection of frequently used commands that will be added around the selector
      * @Default {[]}
      */
    var userHandles: js.UndefOr[js.Array[SelectedItemsUserHandle]] = js.native
    
    /** Sets the width of the selected items
      * @Default {0}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SelectedItems {
    
    @scala.inline
    def apply(): SelectedItems = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectedItems]
    }
    
    @scala.inline
    implicit class SelectedItemsMutableBuilder[Self <: SelectedItems] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[_]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setChildrenVarargs(value: js.Any*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setConstraints(value: SelectorConstraints | String): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraintsUndefined: Self = StObject.set(x, "constraints", js.undefined)
      
      @scala.inline
      def setGetConstraints(value: js.Any): Self = StObject.set(x, "getConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetConstraintsUndefined: Self = StObject.set(x, "getConstraints", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setRotateAngle(value: Double): Self = StObject.set(x, "rotateAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateAngleUndefined: Self = StObject.set(x, "rotateAngle", js.undefined)
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setUserHandles(value: js.Array[SelectedItemsUserHandle]): Self = StObject.set(x, "userHandles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserHandlesUndefined: Self = StObject.set(x, "userHandles", js.undefined)
      
      @scala.inline
      def setUserHandlesVarargs(value: SelectedItemsUserHandle*): Self = StObject.set(x, "userHandles", js.Array(value :_*))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SelectedItemsUserHandle extends StObject {
    
    /** Defines the background color of the user handle
      * @Default {#2382c3}
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /** Sets the border color of the user handle
      * @Default {transparent}
      */
    var borderColor: js.UndefOr[String] = js.native
    
    /** Defines whether the user handle should be added, when more than one element is selected
      * @Default {false}
      */
    var enableMultiSelection: js.UndefOr[Boolean] = js.native
    
    /** Sets the horizontal alignment of the user handle
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
      */
    var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** To set the margin of the user handle
      * @Default {ej.datavisualization.Diagram.Margin()}
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** Defines the name of the user handle
      */
    var name: js.UndefOr[String] = js.native
    
    /** Sets the fraction/ratio(relative to node) that defines the position of the user handle
      * @Default {ej.datavisualization.Diagram.point(0.5, 1)}
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** Sets the stroke color of the user handle
      * @Default {transparent}
      */
    var pathColor: js.UndefOr[String] = js.native
    
    /** Defines the custom shape of the user handle
      */
    var pathData: js.UndefOr[String] = js.native
    
    /** Defines the position of the user handle
      * @Default {ej.datavisualization.Diagram.UserHandlePositions.BottomCenter}
      */
    var position: js.UndefOr[UserHandlePositions | String] = js.native
    
    /** Defines the size of the user handle
      * @Default {8}
      */
    var size: js.UndefOr[Double] = js.native
    
    /** Defines the interactive behaviors of the user handle
      */
    var tool: js.UndefOr[js.Any] = js.native
    
    /** Sets the vertical alignment of the user handle
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
      */
    var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
    
    /** Defines the visibility of the user handle
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object SelectedItemsUserHandle {
    
    @scala.inline
    def apply(): SelectedItemsUserHandle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectedItemsUserHandle]
    }
    
    @scala.inline
    implicit class SelectedItemsUserHandleMutableBuilder[Self <: SelectedItemsUserHandle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      @scala.inline
      def setEnableMultiSelection(value: Boolean): Self = StObject.set(x, "enableMultiSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMultiSelectionUndefined: Self = StObject.set(x, "enableMultiSelection", js.undefined)
      
      @scala.inline
      def setHorizontalAlignment(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPathColor(value: String): Self = StObject.set(x, "pathColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathColorUndefined: Self = StObject.set(x, "pathColor", js.undefined)
      
      @scala.inline
      def setPathData(value: String): Self = StObject.set(x, "pathData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathDataUndefined: Self = StObject.set(x, "pathData", js.undefined)
      
      @scala.inline
      def setPosition(value: UserHandlePositions | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTool(value: js.Any): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolUndefined: Self = StObject.set(x, "tool", js.undefined)
      
      @scala.inline
      def setVerticalAlignment(value: VerticalAlignment | String): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait SelectionChangeEventArgs extends StObject {
    
    /** parameter to specify whether or not to cancel the selection change event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the actual cause of the event
      */
    var cause: js.UndefOr[String] = js.native
    
    /** parameter returns whether the item is selected or removed selection
      */
    var changeType: js.UndefOr[String] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the item which is selected or to be selected
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the collection of nodes and connectors that have to be added to selection list
      */
    var newItems: js.UndefOr[js.Array[_]] = js.native
    
    /** parameter returns the collection of nodes and connectors that have to be removed from selection list
      */
    var oldItems: js.UndefOr[js.Array[_]] = js.native
    
    /** parameter returns the collection of nodes and connectors that will be selected after selection change
      */
    var selectedItems: js.UndefOr[js.Array[_]] = js.native
    
    /** triggers before and after adding the selection to the object in the diagram which can be differentiated through `state` argument. We can cancel the event only before the selection
      * of the object.
      */
    var state: js.UndefOr[String] = js.native
  }
  object SelectionChangeEventArgs {
    
    @scala.inline
    def apply(): SelectionChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionChangeEventArgs]
    }
    
    @scala.inline
    implicit class SelectionChangeEventArgsMutableBuilder[Self <: SelectionChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      @scala.inline
      def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNewItems(value: js.Array[_]): Self = StObject.set(x, "newItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewItemsUndefined: Self = StObject.set(x, "newItems", js.undefined)
      
      @scala.inline
      def setNewItemsVarargs(value: js.Any*): Self = StObject.set(x, "newItems", js.Array(value :_*))
      
      @scala.inline
      def setOldItems(value: js.Array[_]): Self = StObject.set(x, "oldItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldItemsUndefined: Self = StObject.set(x, "oldItems", js.undefined)
      
      @scala.inline
      def setOldItemsVarargs(value: js.Any*): Self = StObject.set(x, "oldItems", js.Array(value :_*))
      
      @scala.inline
      def setSelectedItems(value: js.Array[_]): Self = StObject.set(x, "selectedItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemsUndefined: Self = StObject.set(x, "selectedItems", js.undefined)
      
      @scala.inline
      def setSelectedItemsVarargs(value: js.Any*): Self = StObject.set(x, "selectedItems", js.Array(value :_*))
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  @js.native
  trait SerializationSettings extends StObject {
    
    /** defines whether the default diagram properties can be serialized or not.
      * @Default {false}
      */
    var preventDefaultValues: js.UndefOr[Boolean] = js.native
  }
  object SerializationSettings {
    
    @scala.inline
    def apply(): SerializationSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializationSettings]
    }
    
    @scala.inline
    implicit class SerializationSettingsMutableBuilder[Self <: SerializationSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreventDefaultValues(value: Boolean): Self = StObject.set(x, "preventDefaultValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultValuesUndefined: Self = StObject.set(x, "preventDefaultValues", js.undefined)
    }
  }
  
  @js.native
  trait SetToolEventArgs extends StObject {
    
    /** Defines the tool to be activated.
      */
    var action: js.UndefOr[ActiveTool] = js.native
    
    /** Returns the port when mouse move over on it
      */
    var source: js.UndefOr[js.Any] = js.native
  }
  object SetToolEventArgs {
    
    @scala.inline
    def apply(): SetToolEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetToolEventArgs]
    }
    
    @scala.inline
    implicit class SetToolEventArgsMutableBuilder[Self <: SetToolEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: ActiveTool): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  @js.native
  trait SizeChangeEventArgs extends StObject {
    
    /** parameter to cancel the size change
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the direction of the node is resized
      */
    var direction: js.UndefOr[String] = js.native
    
    /** parameter returns node that was resized
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the new width, height, offsetX and offsetY values of the element that is being resized
      */
    var newValue: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the difference between new and old value
      */
    var offset: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the previous width,height,offsetX and offsetY values of the element that is being resized
      */
    var oldValue: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the state of resizing(starting,resizing,completed)
      */
    var resizeState: js.UndefOr[String] = js.native
  }
  object SizeChangeEventArgs {
    
    @scala.inline
    def apply(): SizeChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeChangeEventArgs]
    }
    
    @scala.inline
    implicit class SizeChangeEventArgsMutableBuilder[Self <: SizeChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setNewValue(value: js.Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      @scala.inline
      def setOffset(value: js.Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOldValue(value: js.Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      @scala.inline
      def setResizeState(value: String): Self = StObject.set(x, "resizeState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeStateUndefined: Self = StObject.set(x, "resizeState", js.undefined)
    }
  }
  
  @js.native
  trait SnapSettings extends StObject {
    
    /** Enables or disables snapping nodes/connectors to objects
      * @Default {true}
      */
    var enableSnapToObject: js.UndefOr[Boolean] = js.native
    
    /** Defines the appearance of horizontal gridlines
      */
    var horizontalGridLines: js.UndefOr[SnapSettingsHorizontalGridLines] = js.native
    
    /** Defines the angle by which the object needs to be snapped
      * @Default {5}
      */
    var snapAngle: js.UndefOr[Double] = js.native
    
    /** Defines and sets the snapConstraints
      */
    var snapConstraints: js.UndefOr[SnapConstraints | String] = js.native
    
    /** Defines the minimum distance between the selected object and the nearest object
      * @Default {5}
      */
    var snapObjectDistance: js.UndefOr[Double] = js.native
    
    /** Defines the appearance of horizontal gridlines
      */
    var verticalGridLines: js.UndefOr[SnapSettingsVerticalGridLines] = js.native
  }
  object SnapSettings {
    
    @scala.inline
    def apply(): SnapSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapSettings]
    }
    
    @scala.inline
    implicit class SnapSettingsMutableBuilder[Self <: SnapSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableSnapToObject(value: Boolean): Self = StObject.set(x, "enableSnapToObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSnapToObjectUndefined: Self = StObject.set(x, "enableSnapToObject", js.undefined)
      
      @scala.inline
      def setHorizontalGridLines(value: SnapSettingsHorizontalGridLines): Self = StObject.set(x, "horizontalGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalGridLinesUndefined: Self = StObject.set(x, "horizontalGridLines", js.undefined)
      
      @scala.inline
      def setSnapAngle(value: Double): Self = StObject.set(x, "snapAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapAngleUndefined: Self = StObject.set(x, "snapAngle", js.undefined)
      
      @scala.inline
      def setSnapConstraints(value: SnapConstraints | String): Self = StObject.set(x, "snapConstraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapConstraintsUndefined: Self = StObject.set(x, "snapConstraints", js.undefined)
      
      @scala.inline
      def setSnapObjectDistance(value: Double): Self = StObject.set(x, "snapObjectDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapObjectDistanceUndefined: Self = StObject.set(x, "snapObjectDistance", js.undefined)
      
      @scala.inline
      def setVerticalGridLines(value: SnapSettingsVerticalGridLines): Self = StObject.set(x, "verticalGridLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalGridLinesUndefined: Self = StObject.set(x, "verticalGridLines", js.undefined)
    }
  }
  
  @js.native
  trait SnapSettingsHorizontalGridLines extends StObject {
    
    /** Defines the line color of horizontal grid lines
      * @Default {lightgray}
      */
    var lineColor: js.UndefOr[String] = js.native
    
    /** Specifies the pattern of dashes and gaps used to stroke horizontal grid lines
      */
    var lineDashArray: js.UndefOr[String] = js.native
    
    /** A pattern of lines and gaps that defines a set of horizontal gridlines
      * @Default {[1.25, 18.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75]}
      */
    var linesInterval: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies a set of intervals to snap the objects
      * @Default {[20]}
      */
    var snapInterval: js.UndefOr[js.Array[_]] = js.native
  }
  object SnapSettingsHorizontalGridLines {
    
    @scala.inline
    def apply(): SnapSettingsHorizontalGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapSettingsHorizontalGridLines]
    }
    
    @scala.inline
    implicit class SnapSettingsHorizontalGridLinesMutableBuilder[Self <: SnapSettingsHorizontalGridLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      @scala.inline
      def setLineDashArray(value: String): Self = StObject.set(x, "lineDashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashArrayUndefined: Self = StObject.set(x, "lineDashArray", js.undefined)
      
      @scala.inline
      def setLinesInterval(value: js.Array[_]): Self = StObject.set(x, "linesInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesIntervalUndefined: Self = StObject.set(x, "linesInterval", js.undefined)
      
      @scala.inline
      def setLinesIntervalVarargs(value: js.Any*): Self = StObject.set(x, "linesInterval", js.Array(value :_*))
      
      @scala.inline
      def setSnapInterval(value: js.Array[_]): Self = StObject.set(x, "snapInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapIntervalUndefined: Self = StObject.set(x, "snapInterval", js.undefined)
      
      @scala.inline
      def setSnapIntervalVarargs(value: js.Any*): Self = StObject.set(x, "snapInterval", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SnapSettingsVerticalGridLines extends StObject {
    
    /** Defines the line color of horizontal grid lines
      * @Default {lightgray}
      */
    var lineColor: js.UndefOr[String] = js.native
    
    /** Specifies the pattern of dashes and gaps used to stroke horizontal grid lines
      */
    var lineDashArray: js.UndefOr[String] = js.native
    
    /** A pattern of lines and gaps that defines a set of horizontal gridlines
      * @Default {[1.25, 18.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75]}
      */
    var linesInterval: js.UndefOr[js.Array[_]] = js.native
    
    /** Specifies a set of intervals to snap the objects
      * @Default {[20]}
      */
    var snapInterval: js.UndefOr[js.Array[_]] = js.native
  }
  object SnapSettingsVerticalGridLines {
    
    @scala.inline
    def apply(): SnapSettingsVerticalGridLines = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnapSettingsVerticalGridLines]
    }
    
    @scala.inline
    implicit class SnapSettingsVerticalGridLinesMutableBuilder[Self <: SnapSettingsVerticalGridLines] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      @scala.inline
      def setLineDashArray(value: String): Self = StObject.set(x, "lineDashArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashArrayUndefined: Self = StObject.set(x, "lineDashArray", js.undefined)
      
      @scala.inline
      def setLinesInterval(value: js.Array[_]): Self = StObject.set(x, "linesInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesIntervalUndefined: Self = StObject.set(x, "linesInterval", js.undefined)
      
      @scala.inline
      def setLinesIntervalVarargs(value: js.Any*): Self = StObject.set(x, "linesInterval", js.Array(value :_*))
      
      @scala.inline
      def setSnapInterval(value: js.Array[_]): Self = StObject.set(x, "snapInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapIntervalUndefined: Self = StObject.set(x, "snapInterval", js.undefined)
      
      @scala.inline
      def setSnapIntervalVarargs(value: js.Any*): Self = StObject.set(x, "snapInterval", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TextChangeEventArgs extends StObject {
    
    /** parameter to specify whether or not to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** parameter returns the id of the diagram
      */
    var diagramId: js.UndefOr[String] = js.native
    
    /** parameter returns the node that contains the text being edited
      */
    var element: js.UndefOr[js.Any] = js.native
    
    /** parameter returns the keyCode of the key entered
      */
    var keyCode: js.UndefOr[String] = js.native
    
    /** parameter returns the new text
      */
    var value: js.UndefOr[String] = js.native
  }
  object TextChangeEventArgs {
    
    @scala.inline
    def apply(): TextChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextChangeEventArgs]
    }
    
    @scala.inline
    implicit class TextChangeEventArgsMutableBuilder[Self <: TextChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setDiagramId(value: String): Self = StObject.set(x, "diagramId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiagramIdUndefined: Self = StObject.set(x, "diagramId", js.undefined)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setKeyCode(value: String): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyCodeUndefined: Self = StObject.set(x, "keyCode", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait Tooltip extends StObject {
    
    /** Aligns the tooltip around nodes/connectors
      */
    var alignment: js.UndefOr[TooltipAlignment] = js.native
    
    /** Sets the margin of the tooltip
      * @Default {{ left: 5, right: 5, top: 5, bottom: 5 }}
      */
    var margin: js.UndefOr[js.Any] = js.native
    
    /** Defines whether the tooltip should be shown at the mouse position or around node.
      * @Default {ej.datavisualization.Diagram.RelativeMode.Object}
      */
    var relativeMode: js.UndefOr[RelativeMode | String] = js.native
    
    /** Sets the svg/html template to be bound with tooltip
      */
    var templateId: js.UndefOr[String] = js.native
  }
  object Tooltip {
    
    @scala.inline
    def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: TooltipAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setMargin(value: js.Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setRelativeMode(value: RelativeMode | String): Self = StObject.set(x, "relativeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeModeUndefined: Self = StObject.set(x, "relativeMode", js.undefined)
      
      @scala.inline
      def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    }
  }
  
  @js.native
  trait TooltipAlignment extends StObject {
    
    /** Defines the horizontal alignment of tooltip.
      * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
      */
    var horizontal: js.UndefOr[HorizontalAlignment | String] = js.native
    
    /** Defines the vertical alignment of tooltip.
      * @Default {ej.datavisualization.Diagram.VerticalAlignment.Bottom}
      */
    var vertical: js.UndefOr[VerticalAlignment | String] = js.native
  }
  object TooltipAlignment {
    
    @scala.inline
    def apply(): TooltipAlignment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipAlignment]
    }
    
    @scala.inline
    implicit class TooltipAlignmentMutableBuilder[Self <: TooltipAlignment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: HorizontalAlignment | String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: VerticalAlignment | String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait Zoom extends StObject {
    
    /** Used to zoom-in or zoom-out the diagram based on the point.
      */
    var focusPoint: js.UndefOr[ConnectorsSourcePoint] = js.native
    
    /** Used to zoom-in or zoom-out the diagram.
      */
    var zoomCommand: js.UndefOr[ZoomCommand] = js.native
    
    /** Used to increase the zoom-in or zoom-out based on the zoom factor value.
      */
    var zoomFactor: js.UndefOr[Double] = js.native
  }
  object Zoom {
    
    @scala.inline
    def apply(): Zoom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Zoom]
    }
    
    @scala.inline
    implicit class ZoomMutableBuilder[Self <: Zoom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusPoint(value: ConnectorsSourcePoint): Self = StObject.set(x, "focusPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusPointUndefined: Self = StObject.set(x, "focusPoint", js.undefined)
      
      @scala.inline
      def setZoomCommand(value: ZoomCommand): Self = StObject.set(x, "zoomCommand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomCommandUndefined: Self = StObject.set(x, "zoomCommand", js.undefined)
      
      @scala.inline
      def setZoomFactor(value: Double): Self = StObject.set(x, "zoomFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomFactorUndefined: Self = StObject.set(x, "zoomFactor", js.undefined)
    }
  }
}
