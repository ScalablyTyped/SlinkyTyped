package typingsSlinky.reactAutosuggest.mod

import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autosuggest[T, T2]
  extends Component[AutosuggestProps[T, T2], AutosuggestState[T], js.Any] {
  /**
    * Autosuggest exposes these class properties to the parent component.
    * They can be accessed through `ref`.
    */
  var input: js.UndefOr[HTMLInputElement] = js.native
}

