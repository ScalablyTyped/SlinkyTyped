package typingsSlinky.jsplumb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsplumb.mod.AnchorStaticId
  - typingsSlinky.jsplumb.mod.AnchorDynamicId
  - typingsSlinky.jsplumb.mod.AnchorPerimeterId
  - typingsSlinky.jsplumb.mod.AnchorContinuousId
*/
trait AnchorId extends js.Object

object AnchorId {
  @scala.inline
  implicit def apply(value: AnchorContinuousId): AnchorId = value.asInstanceOf[AnchorId]
  @scala.inline
  implicit def apply(value: AnchorDynamicId): AnchorId = value.asInstanceOf[AnchorId]
  @scala.inline
  implicit def apply(value: AnchorPerimeterId): AnchorId = value.asInstanceOf[AnchorId]
  @scala.inline
  implicit def apply(value: AnchorStaticId): AnchorId = value.asInstanceOf[AnchorId]
}

