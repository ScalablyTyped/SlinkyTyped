package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Type representing a set of TNodes that can have local refs (`#foo`) placed on them.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.mod.TContainerNode
  - typingsSlinky.angularCore.mod.ɵangularPackagesCoreCoreBf
  - typingsSlinky.angularCore.mod.TElementContainerNode
*/
trait TNodeWithLocalRefs extends js.Object

object TNodeWithLocalRefs {
  @scala.inline
  implicit def apply(value: TContainerNode): TNodeWithLocalRefs = value.asInstanceOf[TNodeWithLocalRefs]
  @scala.inline
  implicit def apply(value: TElementContainerNode): TNodeWithLocalRefs = value.asInstanceOf[TNodeWithLocalRefs]
  @scala.inline
  implicit def apply(value: ɵangularPackagesCoreCoreBf): TNodeWithLocalRefs = value.asInstanceOf[TNodeWithLocalRefs]
}

