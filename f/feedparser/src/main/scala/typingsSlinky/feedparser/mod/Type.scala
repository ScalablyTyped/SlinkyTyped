package typingsSlinky.feedparser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.feedparser.feedparserStrings.atom
  - typingsSlinky.feedparser.feedparserStrings.rss
  - typingsSlinky.feedparser.feedparserStrings.rdf
*/
trait Type extends js.Object

object Type {
  @scala.inline
  def atom: typingsSlinky.feedparser.feedparserStrings.atom = this.cast("atom")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rdf: typingsSlinky.feedparser.feedparserStrings.rdf = this.cast("rdf")
  @scala.inline
  def rss: typingsSlinky.feedparser.feedparserStrings.rss = this.cast("rss")
}

