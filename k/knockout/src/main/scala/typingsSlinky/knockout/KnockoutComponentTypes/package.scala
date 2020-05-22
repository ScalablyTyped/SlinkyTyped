package typingsSlinky.knockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object KnockoutComponentTypes {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.knockout.KnockoutComponentTypes.ViewModelFunction
    - typingsSlinky.knockout.KnockoutComponentTypes.ViewModelSharedInstance
    - typingsSlinky.knockout.KnockoutComponentTypes.ViewModelFactoryFunction
    - typingsSlinky.knockout.KnockoutComponentTypes.AMDModule
  */
  type ViewModel = typingsSlinky.knockout.KnockoutComponentTypes._ViewModel | typingsSlinky.knockout.KnockoutComponentTypes.ViewModelFunction
  // viewmodel types
  type ViewModelFunction = js.Function1[/* params */ js.UndefOr[js.Any], js.Any]
}
