package typingsSlinky.got.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.got.mod.GotBodyOptions
import typingsSlinky.got.mod.GotEmitter
import typingsSlinky.got.mod.GotExtend
import typingsSlinky.got.mod.GotFormFn
import typingsSlinky.got.mod.GotFormOptions
import typingsSlinky.got.mod.GotJSONOptions
import typingsSlinky.got.mod.GotOptions
import typingsSlinky.got.mod.GotPromise
import typingsSlinky.got.mod.GotStreamFn
import typingsSlinky.got.mod.GotUrl
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined got.got.GotInstance<got.got.GotFormFn<string>> */
@js.native
trait GotInstanceGotFormFnstrin extends js.Object {
  var CancelError: Instantiable0[typingsSlinky.got.mod.CancelError] = js.native
  var HTTPError: Instantiable0[typingsSlinky.got.mod.HTTPError] = js.native
  var MaxRedirectsError: Instantiable0[typingsSlinky.got.mod.MaxRedirectsError] = js.native
  var ParseError: Instantiable0[typingsSlinky.got.mod.ParseError] = js.native
  var ReadError: Instantiable0[typingsSlinky.got.mod.ReadError] = js.native
  var RequestError: Instantiable0[typingsSlinky.got.mod.RequestError] = js.native
  var TimeoutError: Instantiable0[typingsSlinky.got.mod.TimeoutError] = js.native
  var UnsupportedProtocolError: Instantiable0[typingsSlinky.got.mod.UnsupportedProtocolError] = js.native
  @JSName("delete")
  var delete_Original: GotFormFn[String] = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  @JSName("get")
  var get_Original: GotFormFn[String] = js.native
  @JSName("head")
  var head_Original: GotFormFn[String] = js.native
  @JSName("patch")
  var patch_Original: GotFormFn[String] = js.native
  @JSName("post")
  var post_Original: GotFormFn[String] = js.native
  @JSName("put")
  var put_Original: GotFormFn[String] = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
  def apply(url: GotUrl): GotPromise[String | Buffer] = js.native
  def apply(url: GotUrl, options: PartialGotFormOptionsstri): GotPromise[String | Buffer] = js.native
  def delete(url: GotUrl): GotPromise[String | Buffer] = js.native
  def delete(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
  def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
  def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
  @JSName("extend")
  def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  @JSName("extend")
  def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
  def get(url: GotUrl): GotPromise[String | Buffer] = js.native
  def get(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
  def head(url: GotUrl): GotPromise[String | Buffer] = js.native
  def head(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
  def patch(url: GotUrl): GotPromise[String | Buffer] = js.native
  def patch(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
  def post(url: GotUrl): GotPromise[String | Buffer] = js.native
  def post(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
  def put(url: GotUrl): GotPromise[String | Buffer] = js.native
  def put(url: GotUrl, options: Partial[GotFormOptions[String]]): GotPromise[String | Buffer] = js.native
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
}

