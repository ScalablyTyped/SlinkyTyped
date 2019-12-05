package typingsSlinky.naudiodon.naudiodonMod

import typingsSlinky.naudiodon.Anon_InOptions
import typingsSlinky.naudiodon.Anon_InOptionsOutOptions
import typingsSlinky.naudiodon.Anon_OutOptions
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("naudiodon", "AudioIO")
@js.native
object AudioIO extends js.Object {
  def apply(options: Anon_InOptions): Readable with AudioStream = js.native
  def apply(options: Anon_InOptionsOutOptions): Duplex with AudioStream = js.native
  def apply(options: Anon_OutOptions): Writable with AudioStream = js.native
}

