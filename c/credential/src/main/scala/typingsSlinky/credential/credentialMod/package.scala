package typingsSlinky.credential

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object credentialMod {
  type HashCallback = js.Function2[/* err */ js.Error, /* hash */ String, Unit]
  type VerifyCallback = js.Function2[/* err */ js.Error, /* isValid */ Boolean, Unit]
}
