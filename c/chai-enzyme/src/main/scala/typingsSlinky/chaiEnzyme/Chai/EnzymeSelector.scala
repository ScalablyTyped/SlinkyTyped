package typingsSlinky.chaiEnzyme.Chai

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.react.mod.StatelessComponent[js.Any]
  - typingsSlinky.react.mod.ComponentClass[js.Any, typingsSlinky.react.mod.ComponentState]
  - org.scalablytyped.runtime.StringDictionary[js.Any]
*/
trait EnzymeSelector extends js.Object

object EnzymeSelector {
  @scala.inline
  implicit def apply(value: ComponentClass[js.Any, js.Object]): EnzymeSelector = value.asInstanceOf[EnzymeSelector]
  @scala.inline
  implicit def apply(value: StatelessComponent[js.Any]): EnzymeSelector = value.asInstanceOf[EnzymeSelector]
  @scala.inline
  implicit def apply(value: String): EnzymeSelector = value.asInstanceOf[EnzymeSelector]
  @scala.inline
  implicit def apply(value: StringDictionary[js.Any]): EnzymeSelector = value.asInstanceOf[EnzymeSelector]
}

