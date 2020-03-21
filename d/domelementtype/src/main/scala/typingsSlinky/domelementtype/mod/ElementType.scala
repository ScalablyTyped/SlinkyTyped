package typingsSlinky.domelementtype.mod

import typingsSlinky.domelementtype.domelementtypeStrings.cdata
import typingsSlinky.domelementtype.domelementtypeStrings.comment
import typingsSlinky.domelementtype.domelementtypeStrings.directive
import typingsSlinky.domelementtype.domelementtypeStrings.doctype
import typingsSlinky.domelementtype.domelementtypeStrings.script
import typingsSlinky.domelementtype.domelementtypeStrings.style
import typingsSlinky.domelementtype.domelementtypeStrings.tag
import typingsSlinky.domelementtype.domelementtypeStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.domelementtype.domelementtypeStrings.text
  - typingsSlinky.domelementtype.domelementtypeStrings.directive
  - typingsSlinky.domelementtype.domelementtypeStrings.comment
  - typingsSlinky.domelementtype.domelementtypeStrings.script
  - typingsSlinky.domelementtype.domelementtypeStrings.style
  - typingsSlinky.domelementtype.domelementtypeStrings.tag
  - typingsSlinky.domelementtype.domelementtypeStrings.cdata
  - typingsSlinky.domelementtype.domelementtypeStrings.doctype
*/
trait ElementType extends js.Object

object ElementType {
  @scala.inline
  def CDATA: cdata = this.cast("cdata")
  @scala.inline
  def Comment: comment = this.cast("comment")
  @scala.inline
  def Directive: directive = this.cast("directive")
  @scala.inline
  def Doctype: doctype = this.cast("doctype")
  @scala.inline
  def Script: script = this.cast("script")
  @scala.inline
  def Style: style = this.cast("style")
  @scala.inline
  def Tag: tag = this.cast("tag")
  @scala.inline
  def Text: text = this.cast("text")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

