package typingsSlinky.electronNotarize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type NotarizeOptions = typingsSlinky.electronNotarize.mod.NotarizeStartOptions
  type NotarizeStartOptions = typingsSlinky.electronNotarize.mod.NotarizeAppOptions with typingsSlinky.electronNotarize.mod.NotarizeCredentials with typingsSlinky.electronNotarize.mod.TransporterOptions
  type NotarizeWaitOptions = typingsSlinky.electronNotarize.mod.NotarizeResult with typingsSlinky.electronNotarize.mod.NotarizeCredentials
}
