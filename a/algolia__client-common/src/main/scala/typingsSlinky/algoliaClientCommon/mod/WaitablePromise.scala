package typingsSlinky.algoliaClientCommon.mod

import typingsSlinky.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<TResponse>> & {readonly wait (requestOptions : @algolia/transporter.@algolia/transporter.RequestOptions | undefined): std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<TResponse>>} */
@js.native
trait WaitablePromise[TResponse] extends js.Object {
  
  def `catch`[TResult](): js.Promise[TResponse | TResult] = js.native
  
  def `finally`(): js.Promise[TResponse] = js.native
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
  
  def wait(requestOptions: RequestOptions): WaitablePromise[TResponse] = js.native
}
