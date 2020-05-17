package typingsSlinky.elementtree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function1[
js.UndefOr[typingsSlinky.elementtree.mod.ElementText], 
typingsSlinky.elementtree.mod.Element]
  - js.Function2[
/ * target * / typingsSlinky.elementtree.mod.ElementText, 
/ * text * / js.UndefOr[typingsSlinky.elementtree.mod.ElementText], 
typingsSlinky.elementtree.mod.Element]
  - java.lang.String
*/
trait ElementTag extends js.Object

object ElementTag {
  @scala.inline
  implicit def apply(value: js.Function1[js.UndefOr[ElementText], Element]): ElementTag = value.asInstanceOf[ElementTag]
  @scala.inline
  implicit def apply(value: js.Function2[/* target */ ElementText, /* text */ js.UndefOr[ElementText], Element]): ElementTag = value.asInstanceOf[ElementTag]
  @scala.inline
  implicit def apply(value: String): ElementTag = value.asInstanceOf[ElementTag]
}

