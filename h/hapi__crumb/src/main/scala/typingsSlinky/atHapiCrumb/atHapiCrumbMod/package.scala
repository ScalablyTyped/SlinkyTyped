package typingsSlinky.atHapiCrumb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiCrumbMod {
  import typingsSlinky.atHapiHapi.atHapiHapiMod.Request
  import typingsSlinky.atHapiHapi.atHapiHapiMod.ResponseToolkit

  type SkipFunction = js.Function2[/* request */ js.UndefOr[Request], /* h */ js.UndefOr[ResponseToolkit], Boolean]
}
