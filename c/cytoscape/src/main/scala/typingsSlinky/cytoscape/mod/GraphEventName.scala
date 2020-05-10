package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These events are custom to Cytoscape.js, and they occur on the core.
  * http://js.cytoscape.org/#events/graph-events
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.cytoscapeStrings.layoutstart
  - typingsSlinky.cytoscape.cytoscapeStrings.layoutready
  - typingsSlinky.cytoscape.cytoscapeStrings.layoutstop
  - typingsSlinky.cytoscape.cytoscapeStrings.ready
  - typingsSlinky.cytoscape.cytoscapeStrings.destroy
  - typingsSlinky.cytoscape.cytoscapeStrings.render
  - typingsSlinky.cytoscape.cytoscapeStrings.pan
  - typingsSlinky.cytoscape.cytoscapeStrings.zoom
  - typingsSlinky.cytoscape.cytoscapeStrings.resize
*/
trait GraphEventName extends js.Object

object GraphEventName {
  @scala.inline
  def destroy: typingsSlinky.cytoscape.cytoscapeStrings.destroy = "destroy".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.destroy]
  @scala.inline
  def layoutready: typingsSlinky.cytoscape.cytoscapeStrings.layoutready = "layoutready".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.layoutready]
  @scala.inline
  def layoutstart: typingsSlinky.cytoscape.cytoscapeStrings.layoutstart = "layoutstart".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.layoutstart]
  @scala.inline
  def layoutstop: typingsSlinky.cytoscape.cytoscapeStrings.layoutstop = "layoutstop".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.layoutstop]
  @scala.inline
  def pan: typingsSlinky.cytoscape.cytoscapeStrings.pan = "pan".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.pan]
  @scala.inline
  def ready: typingsSlinky.cytoscape.cytoscapeStrings.ready = "ready".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.ready]
  @scala.inline
  def render: typingsSlinky.cytoscape.cytoscapeStrings.render = "render".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.render]
  @scala.inline
  def resize: typingsSlinky.cytoscape.cytoscapeStrings.resize = "resize".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.resize]
  @scala.inline
  def zoom: typingsSlinky.cytoscape.cytoscapeStrings.zoom = "zoom".asInstanceOf[typingsSlinky.cytoscape.cytoscapeStrings.zoom]
}

