package typingsSlinky.got.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.got.mod.GotBodyOptions
import typingsSlinky.got.mod.GotEmitter
import typingsSlinky.got.mod.GotExtend
import typingsSlinky.got.mod.GotFormOptions
import typingsSlinky.got.mod.GotJSONOptions
import typingsSlinky.got.mod.GotOptions
import typingsSlinky.got.mod.GotStreamFn
import typingsSlinky.got.mod.GotUrl
import typingsSlinky.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelError extends js.Object {
  var CancelError: Instantiable0[typingsSlinky.got.mod.CancelError] = js.native
  var HTTPError: Instantiable0[typingsSlinky.got.mod.HTTPError] = js.native
  var MaxRedirectsError: Instantiable0[typingsSlinky.got.mod.MaxRedirectsError] = js.native
  var ParseError: Instantiable0[typingsSlinky.got.mod.ParseError] = js.native
  var ReadError: Instantiable0[typingsSlinky.got.mod.ReadError] = js.native
  var RequestError: Instantiable0[typingsSlinky.got.mod.RequestError] = js.native
  var TimeoutError: Instantiable0[typingsSlinky.got.mod.TimeoutError] = js.native
  var UnsupportedProtocolError: Instantiable0[typingsSlinky.got.mod.UnsupportedProtocolError] = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
  def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
  def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
  @JSName("extend")
  def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  @JSName("extend")
  def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
}

