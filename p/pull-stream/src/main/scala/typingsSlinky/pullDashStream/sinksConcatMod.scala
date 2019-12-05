package typingsSlinky.pullDashStream

import typingsSlinky.pullDashStream.pullDashStreamMod.Sink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pull-stream/sinks/concat", JSImport.Namespace)
@js.native
object sinksConcatMod extends js.Object {
  /**
    * Concat stream of strings into single string, then call `cb`.
    */
  def apply(): Sink[String] = js.native
  def apply(cb: js.Function2[/* err */ js.Error | Null, /* result */ String, _]): Sink[String] = js.native
}

