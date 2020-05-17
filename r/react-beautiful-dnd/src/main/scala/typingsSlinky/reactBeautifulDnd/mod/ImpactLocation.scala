package typingsSlinky.reactBeautifulDnd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactBeautifulDnd.mod.ReorderImpact
  - typingsSlinky.reactBeautifulDnd.mod.CombineImpact
*/
trait ImpactLocation extends js.Object

object ImpactLocation {
  @scala.inline
  implicit def apply(value: CombineImpact): ImpactLocation = value.asInstanceOf[ImpactLocation]
  @scala.inline
  implicit def apply(value: ReorderImpact): ImpactLocation = value.asInstanceOf[ImpactLocation]
}

