package typingsSlinky.knockout.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.knockout.KnockoutComponentTypes.ViewModelFunction
  - typingsSlinky.knockout.KnockoutComponentTypes.ViewModelSharedInstance
  - typingsSlinky.knockout.KnockoutComponentTypes.ViewModelFactoryFunction
  - typingsSlinky.knockout.KnockoutComponentTypes.AMDModule
*/
trait ViewModel extends js.Object

object ViewModel {
  @scala.inline
  implicit def apply(value: AMDModule): ViewModel = value.asInstanceOf[ViewModel]
  @scala.inline
  implicit def apply(value: ViewModelFactoryFunction): ViewModel = value.asInstanceOf[ViewModel]
  @scala.inline
  implicit def apply(value: ViewModelFunction): ViewModel = value.asInstanceOf[ViewModel]
  @scala.inline
  implicit def apply(value: ViewModelSharedInstance): ViewModel = value.asInstanceOf[ViewModel]
}

