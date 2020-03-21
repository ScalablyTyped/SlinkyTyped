package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * There are also some higher level events that you can use
  * so you don’t have to bind to different events for
  * mouse-input devices and for touch devices.
  * http://js.cytoscape.org/#events/user-input-device-events
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.cytoscape.cytoscapeStrings.tapstart
  - typingsSlinky.cytoscape.cytoscapeStrings.vmousedown
  - typingsSlinky.cytoscape.cytoscapeStrings.tapdrag
  - typingsSlinky.cytoscape.cytoscapeStrings.vmousemove
  - typingsSlinky.cytoscape.cytoscapeStrings.tapdragover
  - typingsSlinky.cytoscape.cytoscapeStrings.tapdragout
  - typingsSlinky.cytoscape.cytoscapeStrings.tapend
  - typingsSlinky.cytoscape.cytoscapeStrings.vmouseup
  - typingsSlinky.cytoscape.cytoscapeStrings.tap
  - typingsSlinky.cytoscape.cytoscapeStrings.vclick
  - typingsSlinky.cytoscape.cytoscapeStrings.taphold
  - typingsSlinky.cytoscape.cytoscapeStrings.cxttapstart
  - typingsSlinky.cytoscape.cytoscapeStrings.cxttapend
  - typingsSlinky.cytoscape.cytoscapeStrings.cxttap
  - typingsSlinky.cytoscape.cytoscapeStrings.cxtdrag
  - typingsSlinky.cytoscape.cytoscapeStrings.cxtdragover
  - typingsSlinky.cytoscape.cytoscapeStrings.cxtdragout
  - typingsSlinky.cytoscape.cytoscapeStrings.boxstart
  - typingsSlinky.cytoscape.cytoscapeStrings.boxend
  - typingsSlinky.cytoscape.cytoscapeStrings.boxselect
  - typingsSlinky.cytoscape.cytoscapeStrings.box
*/
trait UserInputDeviceEventNameExt extends js.Object

object UserInputDeviceEventNameExt {
  @scala.inline
  def box: typingsSlinky.cytoscape.cytoscapeStrings.box = this.cast("box")
  @scala.inline
  def boxend: typingsSlinky.cytoscape.cytoscapeStrings.boxend = this.cast("boxend")
  @scala.inline
  def boxselect: typingsSlinky.cytoscape.cytoscapeStrings.boxselect = this.cast("boxselect")
  @scala.inline
  def boxstart: typingsSlinky.cytoscape.cytoscapeStrings.boxstart = this.cast("boxstart")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cxtdrag: typingsSlinky.cytoscape.cytoscapeStrings.cxtdrag = this.cast("cxtdrag")
  @scala.inline
  def cxtdragout: typingsSlinky.cytoscape.cytoscapeStrings.cxtdragout = this.cast("cxtdragout")
  @scala.inline
  def cxtdragover: typingsSlinky.cytoscape.cytoscapeStrings.cxtdragover = this.cast("cxtdragover")
  @scala.inline
  def cxttap: typingsSlinky.cytoscape.cytoscapeStrings.cxttap = this.cast("cxttap")
  @scala.inline
  def cxttapend: typingsSlinky.cytoscape.cytoscapeStrings.cxttapend = this.cast("cxttapend")
  @scala.inline
  def cxttapstart: typingsSlinky.cytoscape.cytoscapeStrings.cxttapstart = this.cast("cxttapstart")
  @scala.inline
  def tap: typingsSlinky.cytoscape.cytoscapeStrings.tap = this.cast("tap")
  @scala.inline
  def tapdrag: typingsSlinky.cytoscape.cytoscapeStrings.tapdrag = this.cast("tapdrag")
  @scala.inline
  def tapdragout: typingsSlinky.cytoscape.cytoscapeStrings.tapdragout = this.cast("tapdragout")
  @scala.inline
  def tapdragover: typingsSlinky.cytoscape.cytoscapeStrings.tapdragover = this.cast("tapdragover")
  @scala.inline
  def tapend: typingsSlinky.cytoscape.cytoscapeStrings.tapend = this.cast("tapend")
  @scala.inline
  def taphold: typingsSlinky.cytoscape.cytoscapeStrings.taphold = this.cast("taphold")
  @scala.inline
  def tapstart: typingsSlinky.cytoscape.cytoscapeStrings.tapstart = this.cast("tapstart")
  @scala.inline
  def vclick: typingsSlinky.cytoscape.cytoscapeStrings.vclick = this.cast("vclick")
  @scala.inline
  def vmousedown: typingsSlinky.cytoscape.cytoscapeStrings.vmousedown = this.cast("vmousedown")
  @scala.inline
  def vmousemove: typingsSlinky.cytoscape.cytoscapeStrings.vmousemove = this.cast("vmousemove")
  @scala.inline
  def vmouseup: typingsSlinky.cytoscape.cytoscapeStrings.vmouseup = this.cast("vmouseup")
}

