package typingsSlinky.got

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gotMod {
  import typingsSlinky.got.Anon_Cancel
  import typingsSlinky.got.Anon_CancelError
  import typingsSlinky.got.gotStrings.delete_
  import typingsSlinky.got.gotStrings.get_
  import typingsSlinky.got.gotStrings.head_
  import typingsSlinky.got.gotStrings.patch
  import typingsSlinky.got.gotStrings.post_
  import typingsSlinky.got.gotStrings.put_
  import typingsSlinky.node.Buffer
  import typingsSlinky.node.httpsMod.RequestOptions
  import typingsSlinky.node.streamMod.Duplex
  import typingsSlinky.node.urlMod.URL
  import typingsSlinky.node.urlMod.Url
  import typingsSlinky.std.Record

  /**
    * @param response Response object.
    * @param retryWithMergedOptions Retries request with the updated options.
    */
  type AfterResponseHook[Options, Body /* <: Buffer | String | js.Object */] = js.Function2[
    /* response */ Response[Body], 
    /* retryWithMergedOptions */ js.Function1[/* updateOptions */ Options, GotPromise[Body]], 
    Response[Body] | js.Promise[Response[Body]]
  ]
  type BeforeErrorHook = js.Function1[/* error */ GotError, js.Error | js.Promise[js.Error]]
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
  type BeforeRetryHook[Options] = js.Function3[/* options */ Options, /* error */ GotError, /* retryCount */ Double, js.Any]
  type GotInstance[T] = T with (Record[get_ | post_ | put_ | patch | head_ | delete_, T]) with Anon_CancelError
  type GotPromise[B /* <: Buffer | String | js.Object */] = js.Promise[Response[B]] with Anon_Cancel
  type GotStreamFn = js.Function2[
    /* url */ GotUrl, 
    /* options */ js.UndefOr[GotOptions[String | Null]], 
    GotEmitter with Duplex
  ]
  type GotUrl = String | RequestOptions | Url | URL
  /**
    * @param options Unnormalized request options.
    */
  type InitHook[Options] = js.Function1[/* options */ Options, Unit]
  type RetryFunction = js.Function2[/* retry */ Double, /* error */ js.Any, Double]
}
