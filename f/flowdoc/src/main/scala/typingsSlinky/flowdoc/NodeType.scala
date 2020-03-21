package typingsSlinky.flowdoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.flowdoc.flowdocStrings.DOCUMENT
  - typingsSlinky.flowdoc.flowdocStrings.PAGE
  - typingsSlinky.flowdoc.flowdocStrings.SCREEN
  - typingsSlinky.flowdoc.flowdocStrings.IMAGE
  - typingsSlinky.flowdoc.flowdocStrings.RECT
  - typingsSlinky.flowdoc.flowdocStrings.ELLIPSE
  - typingsSlinky.flowdoc.flowdocStrings.DIAMOND
  - typingsSlinky.flowdoc.flowdocStrings.HOTSPOT
  - typingsSlinky.flowdoc.flowdocStrings.LAYER
*/
trait NodeType extends js.Object

object NodeType {
  @scala.inline
  def DIAMOND: typingsSlinky.flowdoc.flowdocStrings.DIAMOND = this.cast("DIAMOND")
  @scala.inline
  def DOCUMENT: typingsSlinky.flowdoc.flowdocStrings.DOCUMENT = this.cast("DOCUMENT")
  @scala.inline
  def ELLIPSE: typingsSlinky.flowdoc.flowdocStrings.ELLIPSE = this.cast("ELLIPSE")
  @scala.inline
  def HOTSPOT: typingsSlinky.flowdoc.flowdocStrings.HOTSPOT = this.cast("HOTSPOT")
  @scala.inline
  def IMAGE: typingsSlinky.flowdoc.flowdocStrings.IMAGE = this.cast("IMAGE")
  @scala.inline
  def LAYER: typingsSlinky.flowdoc.flowdocStrings.LAYER = this.cast("LAYER")
  @scala.inline
  def PAGE: typingsSlinky.flowdoc.flowdocStrings.PAGE = this.cast("PAGE")
  @scala.inline
  def RECT: typingsSlinky.flowdoc.flowdocStrings.RECT = this.cast("RECT")
  @scala.inline
  def SCREEN: typingsSlinky.flowdoc.flowdocStrings.SCREEN = this.cast("SCREEN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

