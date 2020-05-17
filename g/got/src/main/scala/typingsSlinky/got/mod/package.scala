package typingsSlinky.got

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
  /**
    * @param options Unnormalized request options.
    */
  type InitHook[Options] = js.Function1[/* options */ Options, scala.Unit]
  type RetryFunction = js.Function2[/* retry */ scala.Double, /* error */ js.Any, scala.Double]
}
