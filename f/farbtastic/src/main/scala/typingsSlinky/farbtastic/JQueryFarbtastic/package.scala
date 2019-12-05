package typingsSlinky.farbtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryFarbtastic {
  import org.scalajs.dom.raw.Element
  import typingsSlinky.farbtastic.JQuery

  type Callback = CallbackFunction | Placeholder
  type CallbackFunction = js.Function1[/* color */ String, js.Any]
  type Placeholder = String | Element | JQuery
}
