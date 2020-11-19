package typingsSlinky.got.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.got.mod.GotBodyOptions
import typingsSlinky.got.mod.GotEmitter
import typingsSlinky.got.mod.GotExtend
import typingsSlinky.got.mod.GotFormOptions
import typingsSlinky.got.mod.GotJSONFn
import typingsSlinky.got.mod.GotJSONOptions
import typingsSlinky.got.mod.GotOptions
import typingsSlinky.got.mod.GotPromise
import typingsSlinky.got.mod.GotStreamFn
import typingsSlinky.got.mod.GotUrl
import typingsSlinky.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined got.got.GotInstance<got.got.GotJSONFn> */
@js.native
trait GotInstanceGotJSONFn extends js.Object {
  
  def apply(url: GotUrl): GotPromise[_] = js.native
  def apply(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  
  var CancelError: Instantiable0[typingsSlinky.got.mod.CancelError] = js.native
  
  var HTTPError: Instantiable0[typingsSlinky.got.mod.HTTPError] = js.native
  
  var MaxRedirectsError: Instantiable0[typingsSlinky.got.mod.MaxRedirectsError] = js.native
  
  var ParseError: Instantiable0[typingsSlinky.got.mod.ParseError] = js.native
  
  var ReadError: Instantiable0[typingsSlinky.got.mod.ReadError] = js.native
  
  var RequestError: Instantiable0[typingsSlinky.got.mod.RequestError] = js.native
  
  var TimeoutError: Instantiable0[typingsSlinky.got.mod.TimeoutError] = js.native
  
  var UnsupportedProtocolError: Instantiable0[typingsSlinky.got.mod.UnsupportedProtocolError] = js.native
  
  def delete(url: GotUrl): GotPromise[_] = js.native
  def delete(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  @JSName("delete")
  var delete_Original: GotJSONFn = js.native
  
  def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
  def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
  def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
  @JSName("extend")
  def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
  @JSName("extend")
  def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
  @JSName("extend")
  var extend_Original: GotExtend = js.native
  
  def get(url: GotUrl): GotPromise[_] = js.native
  def get(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  @JSName("get")
  var get_Original: GotJSONFn = js.native
  
  def head(url: GotUrl): GotPromise[_] = js.native
  def head(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  @JSName("head")
  var head_Original: GotJSONFn = js.native
  
  def patch(url: GotUrl): GotPromise[_] = js.native
  def patch(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  @JSName("patch")
  var patch_Original: GotJSONFn = js.native
  
  def post(url: GotUrl): GotPromise[_] = js.native
  def post(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  @JSName("post")
  var post_Original: GotJSONFn = js.native
  
  def put(url: GotUrl): GotPromise[_] = js.native
  def put(url: GotUrl, options: PartialGotJSONOptions): GotPromise[_] = js.native
  @JSName("put")
  var put_Original: GotJSONFn = js.native
  
  def stream(url: GotUrl): GotEmitter with Duplex = js.native
  def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter with Duplex = js.native
  @JSName("stream")
  var stream_Original: GotStreamFn with Recordgetpostputpatchhead = js.native
}
