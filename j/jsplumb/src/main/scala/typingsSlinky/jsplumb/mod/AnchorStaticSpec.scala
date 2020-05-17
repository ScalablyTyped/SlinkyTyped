package typingsSlinky.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.mod.AnchorStaticId
  - typingsSlinky.jsplumb.mod.AnchorArraySpec
*/
trait AnchorStaticSpec extends AnchorSpec

object AnchorStaticSpec {
  @scala.inline
  implicit def apply(value: AnchorArraySpec): AnchorStaticSpec = value.asInstanceOf[AnchorStaticSpec]
  @scala.inline
  implicit def apply(value: AnchorStaticId): AnchorStaticSpec = value.asInstanceOf[AnchorStaticSpec]
}

