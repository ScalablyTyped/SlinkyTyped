package typingsSlinky.enzyme.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.enzyme.mod.StatelessComponent[js.Any]
  - typingsSlinky.enzyme.mod.ComponentClass[js.Any]
  - typingsSlinky.enzyme.mod.EnzymePropSelector
*/
trait EnzymeSelector extends js.Object

object EnzymeSelector {
  @scala.inline
  implicit def apply(value: ComponentClass[js.Any]): EnzymeSelector = value.asInstanceOf[EnzymeSelector]
  @scala.inline
  implicit def apply(value: EnzymePropSelector): EnzymeSelector = value.asInstanceOf[EnzymeSelector]
  @scala.inline
  implicit def apply(value: StatelessComponent[js.Any]): EnzymeSelector = value.asInstanceOf[EnzymeSelector]
  @scala.inline
  implicit def apply(value: String): EnzymeSelector = value.asInstanceOf[EnzymeSelector]
}

