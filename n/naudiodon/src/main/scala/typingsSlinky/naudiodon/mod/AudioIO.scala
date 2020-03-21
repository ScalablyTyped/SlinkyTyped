package typingsSlinky.naudiodon.mod

import typingsSlinky.naudiodon.AnonInOptions
import typingsSlinky.naudiodon.AnonInOptionsOutOptions
import typingsSlinky.naudiodon.AnonOutOptions
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("naudiodon", "AudioIO")
@js.native
object AudioIO extends js.Object {
  def apply(options: AnonInOptions): Readable with AudioStream = js.native
  def apply(options: AnonInOptionsOutOptions): Duplex with AudioStream = js.native
  def apply(options: AnonOutOptions): Writable with AudioStream = js.native
}

