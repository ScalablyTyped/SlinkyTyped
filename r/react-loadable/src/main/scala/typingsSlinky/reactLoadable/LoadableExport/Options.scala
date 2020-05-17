package typingsSlinky.reactLoadable.LoadableExport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactLoadable.LoadableExport.OptionsWithoutRender[Props]
  - typingsSlinky.reactLoadable.LoadableExport.OptionsWithRender[Props, Exports]
*/
trait Options[Props, Exports /* <: js.Object */] extends js.Object

object Options {
  @scala.inline
  implicit def apply[Props, Exports](value: OptionsWithRender[Props, Exports]): Options[Props, Exports] = value.asInstanceOf[Options[Props, Exports]]
  @scala.inline
  implicit def apply[Props, Exports](value: OptionsWithoutRender[Props]): Options[Props, Exports] = value.asInstanceOf[Options[Props, Exports]]
}

