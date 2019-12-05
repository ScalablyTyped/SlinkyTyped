package typingsSlinky.charm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object charmMod {
  import typingsSlinky.node.NodeJS.Process
  import typingsSlinky.node.NodeJS.ReadableStream
  import typingsSlinky.node.NodeJS.WritableStream

  type CharmAnyStream = WritableStream | ReadableStream | Process
  type CharmColor = CharmColorName | CharmColorHex
  type CharmColorHex = Double
}
