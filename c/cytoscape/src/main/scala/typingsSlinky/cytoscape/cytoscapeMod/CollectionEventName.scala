package typingsSlinky.cytoscape.cytoscapeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These events are custom to Cytoscape.js. You can bind to these events for collections.
  * http://js.cytoscape.org/#events/collection-events
  */
/* Rewritten from type alias, can be one of: 
  - typings.cytoscape.cytoscapeStrings.add
  - typings.cytoscape.cytoscapeStrings.remove
  - typings.cytoscape.cytoscapeStrings.select
  - typings.cytoscape.cytoscapeStrings.unselect
  - typings.cytoscape.cytoscapeStrings.lock
  - typings.cytoscape.cytoscapeStrings.unlock
  - typings.cytoscape.cytoscapeStrings.grabon
  - typings.cytoscape.cytoscapeStrings.grab
  - typings.cytoscape.cytoscapeStrings.drag
  - typings.cytoscape.cytoscapeStrings.free
  - typings.cytoscape.cytoscapeStrings.position
  - typings.cytoscape.cytoscapeStrings.data
  - typings.cytoscape.cytoscapeStrings.scratch
  - typings.cytoscape.cytoscapeStrings.style
*/
trait CollectionEventName extends js.Object

object CollectionEventName {
  @scala.inline
  def add: typingsSlinky.cytoscape.cytoscapeStrings.add = this.cast("add")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def data: typingsSlinky.cytoscape.cytoscapeStrings.data = this.cast("data")
  @scala.inline
  def drag: typingsSlinky.cytoscape.cytoscapeStrings.drag = this.cast("drag")
  @scala.inline
  def free: typingsSlinky.cytoscape.cytoscapeStrings.free = this.cast("free")
  @scala.inline
  def grab: typingsSlinky.cytoscape.cytoscapeStrings.grab = this.cast("grab")
  @scala.inline
  def grabon: typingsSlinky.cytoscape.cytoscapeStrings.grabon = this.cast("grabon")
  @scala.inline
  def lock: typingsSlinky.cytoscape.cytoscapeStrings.lock = this.cast("lock")
  @scala.inline
  def position: typingsSlinky.cytoscape.cytoscapeStrings.position = this.cast("position")
  @scala.inline
  def remove: typingsSlinky.cytoscape.cytoscapeStrings.remove = this.cast("remove")
  @scala.inline
  def scratch: typingsSlinky.cytoscape.cytoscapeStrings.scratch = this.cast("scratch")
  @scala.inline
  def select: typingsSlinky.cytoscape.cytoscapeStrings.select = this.cast("select")
  @scala.inline
  def style: typingsSlinky.cytoscape.cytoscapeStrings.style = this.cast("style")
  @scala.inline
  def unlock: typingsSlinky.cytoscape.cytoscapeStrings.unlock = this.cast("unlock")
  @scala.inline
  def unselect: typingsSlinky.cytoscape.cytoscapeStrings.unselect = this.cast("unselect")
}

