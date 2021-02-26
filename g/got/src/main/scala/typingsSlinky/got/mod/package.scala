package typingsSlinky.got

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def apply(url: typingsSlinky.got.mod.GotUrl): typingsSlinky.got.mod.GotPromise[java.lang.String] = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def apply(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotBodyOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def apply(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotFormOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def apply(url: typingsSlinky.got.mod.GotUrl, options: typingsSlinky.got.mod.GotJSONOptions): typingsSlinky.got.mod.GotPromise[_] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[_]]
  
  /**
    * @param response Response object.
    * @param retryWithMergedOptions Retries request with the updated options.
    */
  type AfterResponseHook[Options, Body /* <: typingsSlinky.node.Buffer | java.lang.String | js.Object */] = js.Function2[
    /* response */ typingsSlinky.got.mod.Response[Body], 
    /* retryWithMergedOptions */ js.Function1[/* updateOptions */ Options, typingsSlinky.got.mod.GotPromise[Body]], 
    typingsSlinky.got.mod.Response[Body] | js.Promise[typingsSlinky.got.mod.Response[Body]]
  ]
  
  type BeforeErrorHook = js.Function1[/* error */ typingsSlinky.got.mod.GotError, js.Error | js.Promise[js.Error]]
  
  /**
    * @param options Normalized request options.
    */
  type BeforeRedirectHook[Options] = js.Function1[/* options */ Options, js.Any]
  
  /**
    * @param options Normalized request options.
    */
  type BeforeRequestHook[Options] = js.Function1[/* options */ Options, js.Any]
  
  /**
    * @param options Normalized request options.
    * @param error Request error.
    * @param retryCount Number of retry.
    */
  type BeforeRetryHook[Options] = js.Function3[
    /* options */ Options, 
    /* error */ typingsSlinky.got.mod.GotError, 
    /* retryCount */ scala.Double, 
    js.Any
  ]
  
  type GotInstance[T] = T with (typingsSlinky.std.Record[
    typingsSlinky.got.gotStrings.get_ | typingsSlinky.got.gotStrings.post_ | typingsSlinky.got.gotStrings.put_ | typingsSlinky.got.gotStrings.patch | typingsSlinky.got.gotStrings.head_ | typingsSlinky.got.gotStrings.delete_, 
    T
  ]) with typingsSlinky.got.anon.CancelError
  
  type GotStreamFn = js.Function2[
    /* url */ typingsSlinky.got.mod.GotUrl, 
    /* options */ js.UndefOr[typingsSlinky.got.mod.GotOptions[java.lang.String | scala.Null]], 
    typingsSlinky.got.mod.GotEmitter with typingsSlinky.node.streamMod.Duplex
  ]
  
  type GotUrl = java.lang.String | typingsSlinky.node.httpsMod.RequestOptions | typingsSlinky.node.urlMod.Url | typingsSlinky.node.urlMod.URL_
  
  /**
    * @param options Unnormalized request options.
    */
  type InitHook[Options] = js.Function1[/* options */ Options, scala.Unit]
  
  type RetryFunction = js.Function2[/* retry */ scala.Double, /* error */ js.Any, scala.Double]
  
  @scala.inline
  def delete: typingsSlinky.got.mod.GotFn = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].selectDynamic("delete").asInstanceOf[typingsSlinky.got.mod.GotFn]
  @scala.inline
  def delete(url: typingsSlinky.got.mod.GotUrl): typingsSlinky.got.mod.GotPromise[java.lang.String] = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def delete(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotBodyOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def delete(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotFormOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def delete(url: typingsSlinky.got.mod.GotUrl, options: typingsSlinky.got.mod.GotJSONOptions): typingsSlinky.got.mod.GotPromise[_] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[_]]
  @scala.inline
  def delete_=(x: typingsSlinky.got.mod.GotFn): scala.Unit = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].updateDynamic("delete")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extend: typingsSlinky.got.mod.GotExtend = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].selectDynamic("extend").asInstanceOf[typingsSlinky.got.mod.GotExtend]
  @scala.inline
  def extend(options: typingsSlinky.got.mod.GotBodyOptions[scala.Null]): typingsSlinky.got.anon.GotInstanceGotBodyFnnull = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.anon.GotInstanceGotBodyFnnull]
  @scala.inline
  def extend(options: typingsSlinky.got.mod.GotFormOptions[java.lang.String]): typingsSlinky.got.anon.GotInstanceGotFormFnstrin = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.anon.GotInstanceGotFormFnstrin]
  @scala.inline
  def extend(options: typingsSlinky.got.mod.GotJSONOptions): typingsSlinky.got.anon.GotInstanceGotJSONFn = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.anon.GotInstanceGotJSONFn]
  @scala.inline
  def extend_=(x: typingsSlinky.got.mod.GotExtend): scala.Unit = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].updateDynamic("extend")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def extend_GotInstanceGotBodyFnstrin(options: typingsSlinky.got.mod.GotBodyOptions[java.lang.String]): typingsSlinky.got.anon.GotInstanceGotBodyFnstrin = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.anon.GotInstanceGotBodyFnstrin]
  
  @scala.inline
  def extend_GotInstanceGotFormFnnull(options: typingsSlinky.got.mod.GotFormOptions[scala.Null]): typingsSlinky.got.anon.GotInstanceGotFormFnnull = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extend")(options.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.anon.GotInstanceGotFormFnnull]
  
  @scala.inline
  def get: typingsSlinky.got.mod.GotFn = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].selectDynamic("get").asInstanceOf[typingsSlinky.got.mod.GotFn]
  @scala.inline
  def get(url: typingsSlinky.got.mod.GotUrl): typingsSlinky.got.mod.GotPromise[java.lang.String] = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def get(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotBodyOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def get(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotFormOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def get(url: typingsSlinky.got.mod.GotUrl, options: typingsSlinky.got.mod.GotJSONOptions): typingsSlinky.got.mod.GotPromise[_] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[_]]
  @scala.inline
  def get_=(x: typingsSlinky.got.mod.GotFn): scala.Unit = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def head: typingsSlinky.got.mod.GotFn = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].selectDynamic("head").asInstanceOf[typingsSlinky.got.mod.GotFn]
  @scala.inline
  def head(url: typingsSlinky.got.mod.GotUrl): typingsSlinky.got.mod.GotPromise[java.lang.String] = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def head(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotBodyOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def head(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotFormOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def head(url: typingsSlinky.got.mod.GotUrl, options: typingsSlinky.got.mod.GotJSONOptions): typingsSlinky.got.mod.GotPromise[_] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[_]]
  @scala.inline
  def head_=(x: typingsSlinky.got.mod.GotFn): scala.Unit = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def patch: typingsSlinky.got.mod.GotFn = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].selectDynamic("patch").asInstanceOf[typingsSlinky.got.mod.GotFn]
  @scala.inline
  def patch(url: typingsSlinky.got.mod.GotUrl): typingsSlinky.got.mod.GotPromise[java.lang.String] = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def patch(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotBodyOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def patch(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotFormOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def patch(url: typingsSlinky.got.mod.GotUrl, options: typingsSlinky.got.mod.GotJSONOptions): typingsSlinky.got.mod.GotPromise[_] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[_]]
  @scala.inline
  def patch_=(x: typingsSlinky.got.mod.GotFn): scala.Unit = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].updateDynamic("patch")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def post: typingsSlinky.got.mod.GotFn = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].selectDynamic("post").asInstanceOf[typingsSlinky.got.mod.GotFn]
  @scala.inline
  def post(url: typingsSlinky.got.mod.GotUrl): typingsSlinky.got.mod.GotPromise[java.lang.String] = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def post(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotBodyOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def post(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotFormOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def post(url: typingsSlinky.got.mod.GotUrl, options: typingsSlinky.got.mod.GotJSONOptions): typingsSlinky.got.mod.GotPromise[_] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[_]]
  @scala.inline
  def post_=(x: typingsSlinky.got.mod.GotFn): scala.Unit = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].updateDynamic("post")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def put: typingsSlinky.got.mod.GotFn = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].selectDynamic("put").asInstanceOf[typingsSlinky.got.mod.GotFn]
  @scala.inline
  def put(url: typingsSlinky.got.mod.GotUrl): typingsSlinky.got.mod.GotPromise[java.lang.String] = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def put(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotBodyOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def put(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotFormOptions[scala.Null | java.lang.String]
  ): typingsSlinky.got.mod.GotPromise[java.lang.String] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[java.lang.String]]
  @scala.inline
  def put(url: typingsSlinky.got.mod.GotUrl, options: typingsSlinky.got.mod.GotJSONOptions): typingsSlinky.got.mod.GotPromise[_] = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotPromise[_]]
  @scala.inline
  def put_=(x: typingsSlinky.got.mod.GotFn): scala.Unit = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].updateDynamic("put")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def stream: typingsSlinky.got.mod.GotStreamFn with typingsSlinky.got.anon.Recordgetpostputpatchhead = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].selectDynamic("stream").asInstanceOf[typingsSlinky.got.mod.GotStreamFn with typingsSlinky.got.anon.Recordgetpostputpatchhead]
  @scala.inline
  def stream(url: typingsSlinky.got.mod.GotUrl): typingsSlinky.got.mod.GotEmitter with typingsSlinky.node.streamMod.Duplex = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any]).asInstanceOf[typingsSlinky.got.mod.GotEmitter with typingsSlinky.node.streamMod.Duplex]
  @scala.inline
  def stream(
    url: typingsSlinky.got.mod.GotUrl,
    options: typingsSlinky.got.mod.GotOptions[java.lang.String | scala.Null]
  ): typingsSlinky.got.mod.GotEmitter with typingsSlinky.node.streamMod.Duplex = (typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].applyDynamic("stream")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.got.mod.GotEmitter with typingsSlinky.node.streamMod.Duplex]
  @scala.inline
  def stream_=(x: typingsSlinky.got.mod.GotStreamFn with typingsSlinky.got.anon.Recordgetpostputpatchhead): scala.Unit = typingsSlinky.got.mod.^.asInstanceOf[js.Dynamic].updateDynamic("stream")(x.asInstanceOf[js.Any])
}
