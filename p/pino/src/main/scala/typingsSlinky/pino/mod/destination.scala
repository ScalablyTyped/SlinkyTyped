package typingsSlinky.pino.mod

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pino", "destination")
@js.native
object destination extends js.Object {
  /**
    * Create a Pino Destination instance: a stream-like object with significantly more throughput (over 30%) than a standard Node.js stream.
    * @param [dest]: The `destination` parameter, at a minimum must be an object with a `write` method. An ordinary Node.js
    *                `stream` can be passed as the destination (such as the result of `fs.createWriteStream`) but for peak log
    *                writing performance it is strongly recommended to use `pino.destination` to create the destination stream.
    * @returns A Sonic-Boom  stream to be used as destination for the pino function
    */
  def apply(): typingsSlinky.sonicBoom.mod.^ = js.native
  def apply(dest: String): typingsSlinky.sonicBoom.mod.^ = js.native
  def apply(dest: Double): typingsSlinky.sonicBoom.mod.^ = js.native
  def apply(dest: WritableStream): typingsSlinky.sonicBoom.mod.^ = js.native
  def apply(dest: DestinationObjectOptions): typingsSlinky.sonicBoom.mod.^ = js.native
  def apply(dest: DestinationStream): typingsSlinky.sonicBoom.mod.^ = js.native
}

