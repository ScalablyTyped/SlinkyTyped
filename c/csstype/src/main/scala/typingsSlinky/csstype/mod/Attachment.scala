package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.csstypeStrings.fixed
  - typingsSlinky.csstype.csstypeStrings.local
  - typingsSlinky.csstype.csstypeStrings.scroll
*/
trait Attachment
  extends _FinalBgLayer[js.Any]
     with _BackgroundAttachmentProperty
     with _WebkitMaskAttachmentProperty

object Attachment {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fixed: typingsSlinky.csstype.csstypeStrings.fixed = this.cast("fixed")
  @scala.inline
  def local: typingsSlinky.csstype.csstypeStrings.local = this.cast("local")
  @scala.inline
  def scroll: typingsSlinky.csstype.csstypeStrings.scroll = this.cast("scroll")
}

