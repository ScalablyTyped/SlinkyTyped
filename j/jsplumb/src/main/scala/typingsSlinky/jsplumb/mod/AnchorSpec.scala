package typingsSlinky.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.mod.AnchorStaticSpec
  - typingsSlinky.jsplumb.mod.AnchorDynamicSpec
  - typingsSlinky.jsplumb.mod.AnchorPerimeterSpec
  - typingsSlinky.jsplumb.mod.AnchorContinuousSpec
*/
trait AnchorSpec extends js.Object

object AnchorSpec {
  @scala.inline
  implicit def apply(value: AnchorContinuousSpec): AnchorSpec = value.asInstanceOf[AnchorSpec]
  @scala.inline
  implicit def apply(value: AnchorDynamicSpec): AnchorSpec = value.asInstanceOf[AnchorSpec]
  @scala.inline
  implicit def apply(value: AnchorPerimeterSpec): AnchorSpec = value.asInstanceOf[AnchorSpec]
  @scala.inline
  implicit def apply(value: AnchorStaticSpec): AnchorSpec = value.asInstanceOf[AnchorSpec]
}

