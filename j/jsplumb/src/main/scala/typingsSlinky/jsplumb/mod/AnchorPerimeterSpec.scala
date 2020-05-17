package typingsSlinky.jsplumb.mod

import typingsSlinky.jsplumb.anon.AnchorCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.mod.AnchorPerimeterId
  - js.Tuple2[
typingsSlinky.jsplumb.mod.AnchorPerimeterId, 
typingsSlinky.jsplumb.anon.AnchorCount]
*/
trait AnchorPerimeterSpec extends AnchorSpec

object AnchorPerimeterSpec {
  @scala.inline
  implicit def apply(value: AnchorPerimeterId): AnchorPerimeterSpec = value.asInstanceOf[AnchorPerimeterSpec]
  @scala.inline
  implicit def apply(value: js.Tuple2[AnchorPerimeterId, AnchorCount]): AnchorPerimeterSpec = value.asInstanceOf[AnchorPerimeterSpec]
}

