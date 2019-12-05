package typingsSlinky.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nunjucksMod {
  import typingsSlinky.nunjucks.nunjucksMod.lib.TemplateError

  type Callback[E, T] = js.Function2[/* err */ E | Null, /* res */ T | Null, Unit]
  type TemplateCallback[T] = js.Function2[/* err */ TemplateError | Null, /* res */ T | Null, Unit]
}
