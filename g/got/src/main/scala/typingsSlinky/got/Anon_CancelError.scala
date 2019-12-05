package typingsSlinky.got

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.got.gotMod.GotBodyFn
import typingsSlinky.got.gotMod.GotBodyOptions
import typingsSlinky.got.gotMod.GotEmitter
import typingsSlinky.got.gotMod.GotExtend
import typingsSlinky.got.gotMod.GotFormFn
import typingsSlinky.got.gotMod.GotFormOptions
import typingsSlinky.got.gotMod.GotInstance
import typingsSlinky.got.gotMod.GotJSONFn
import typingsSlinky.got.gotMod.GotJSONOptions
import typingsSlinky.got.gotMod.GotOptions
import typingsSlinky.got.gotMod.GotStreamFn
import typingsSlinky.got.gotMod.GotUrl
import typingsSlinky.got.gotStrings.delete_
import typingsSlinky.got.gotStrings.get_
import typingsSlinky.got.gotStrings.head_
import typingsSlinky.got.gotStrings.patch
import typingsSlinky.got.gotStrings.post_
import typingsSlinky.got.gotStrings.put_
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CancelError extends js.Object {
  var CancelError: Instantiable0[typingsSlinky.got.gotMod.CancelError] = js.native
  var HTTPError: Instantiable0[typingsSlinky.got.gotMod.HTTPError] = js.native
  var MaxRedirectsError: Instantiable0[typingsSlinky.got.gotMod.MaxRedirectsError] = js.native
  var ParseError: Instantiable0[typingsSlinky.got.gotMod.ParseError] = js.native
  var ReadError: Instantiable0[typingsSlinky.got.gotMod.ReadError] = js.native
  var RequestError: Instantiable0[typingsSlinky.got.gotMod.RequestError] = js.native
  var TimeoutError: Instantiable0[typingsSlinky.got.gotMod.TimeoutError] = js.native
  var UnsupportedProtocolError: Instantiable0[typingsSlinky.got.gotMod.UnsupportedProtocolError] = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with (Record[get_ | post_ | put_ | patch | head_ | delete_, GotStreamFn]) = js.native
  def extend(options: GotBodyOptions[Null | String]): GotInstance[GotBodyFn[String]] = js.native
  def extend(options: GotFormOptions[Null | String]): GotInstance[GotFormFn[String]] = js.native
  def extend(options: GotJSONOptions): GotInstance[GotJSONFn] = js.native
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
}

