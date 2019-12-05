package typingsSlinky.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These events are custom to Cytoscape.js, and they occur on the core.
  * http://js.cytoscape.org/#events/graph-events
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.layoutstart
  - typings.cytoscape.cytoscapeStrings.layoutready
  - typings.cytoscape.cytoscapeStrings.layoutstop
  - typings.cytoscape.cytoscapeStrings.ready
  - typings.cytoscape.cytoscapeStrings.destroy
  - typings.cytoscape.cytoscapeStrings.render
  - typings.cytoscape.cytoscapeStrings.pan
  - typings.cytoscape.cytoscapeStrings.zoom
  - typings.cytoscape.cytoscapeStrings.resize
*/
trait GraphEventName extends js.Object

object GraphEventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def destroy: typingsSlinky.cytoscape.cytoscapeStrings.destroy = this.cast("destroy")
  @scala.inline
  def layoutready: typingsSlinky.cytoscape.cytoscapeStrings.layoutready = this.cast("layoutready")
  @scala.inline
  def layoutstart: typingsSlinky.cytoscape.cytoscapeStrings.layoutstart = this.cast("layoutstart")
  @scala.inline
  def layoutstop: typingsSlinky.cytoscape.cytoscapeStrings.layoutstop = this.cast("layoutstop")
  @scala.inline
  def pan: typingsSlinky.cytoscape.cytoscapeStrings.pan = this.cast("pan")
  @scala.inline
  def ready: typingsSlinky.cytoscape.cytoscapeStrings.ready = this.cast("ready")
  @scala.inline
  def render: typingsSlinky.cytoscape.cytoscapeStrings.render = this.cast("render")
  @scala.inline
  def resize: typingsSlinky.cytoscape.cytoscapeStrings.resize = this.cast("resize")
  @scala.inline
  def zoom: typingsSlinky.cytoscape.cytoscapeStrings.zoom = this.cast("zoom")
}

