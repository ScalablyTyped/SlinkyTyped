package typingsSlinky.crumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object crumbMod {
  import typingsSlinky.hapi.hapiMod.Request
  import typingsSlinky.hapi.hapiMod.ResponseToolkit

  type SkipFunction = js.Function2[/* request */ js.UndefOr[Request], /* h */ js.UndefOr[ResponseToolkit], Boolean]
}
