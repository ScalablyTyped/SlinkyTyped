package typingsSlinky.awsSdk.eventStreamMod

import typingsSlinky.awsSdk.awsSdkStrings.data_
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamingEventStream[Events]
  extends ReadableStream
     with EventStream[Events] {
  def on(event: String, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_data(event: data_, listener: js.Function1[/* event */ Events, Unit]): this.type = js.native
}

