package typingsSlinky.naudiodon.mod

import typingsSlinky.naudiodon.anon.InOptions
import typingsSlinky.naudiodon.anon.InOptionsOutOptions
import typingsSlinky.naudiodon.anon.OutOptions
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("naudiodon", "AudioIO")
@js.native
object AudioIO extends js.Object {
  
  def apply(options: InOptions): Readable with AudioStream = js.native
  def apply(options: InOptionsOutOptions): Duplex with AudioStream = js.native
  def apply(options: OutOptions): Writable with AudioStream = js.native
}
