package typingsSlinky.animejs.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.NodeList
import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Allowing null is necessary because DOM queries may not return anything.
/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Object
  - typingsSlinky.std.HTMLElement
  - typingsSlinky.std.SVGElement
  - typingsSlinky.std.NodeList
  - scala.Null
*/
trait AnimeTarget extends js.Object

object AnimeTarget {
  @scala.inline
  implicit def apply(value: HTMLElement): AnimeTarget = value.asInstanceOf[AnimeTarget]
  @scala.inline
  implicit def apply(value: NodeList): AnimeTarget = value.asInstanceOf[AnimeTarget]
  @scala.inline
  implicit def apply(value: Null): AnimeTarget = value.asInstanceOf[AnimeTarget]
  @scala.inline
  implicit def apply(value: js.Object): AnimeTarget = value.asInstanceOf[AnimeTarget]
  @scala.inline
  implicit def apply(value: SVGElement): AnimeTarget = value.asInstanceOf[AnimeTarget]
  @scala.inline
  implicit def apply(value: String): AnimeTarget = value.asInstanceOf[AnimeTarget]
}

