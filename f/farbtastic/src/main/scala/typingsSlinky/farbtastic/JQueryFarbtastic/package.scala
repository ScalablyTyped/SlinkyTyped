package typingsSlinky.farbtastic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JQueryFarbtastic {
  type Callback = typingsSlinky.farbtastic.JQueryFarbtastic.CallbackFunction | typingsSlinky.farbtastic.JQueryFarbtastic.Placeholder
  type CallbackFunction = js.Function1[/* color */ java.lang.String, js.Any]
  type Placeholder = java.lang.String | org.scalajs.dom.raw.Element | typingsSlinky.farbtastic.JQuery
}
