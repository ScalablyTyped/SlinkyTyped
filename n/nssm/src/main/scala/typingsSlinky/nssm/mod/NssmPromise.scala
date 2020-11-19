package typingsSlinky.nssm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NssmPromise[T]
  extends js.Promise[T] {
  
  def `catch`[TResult](): NssmPromise[T | TResult] = js.native
  def `catch`[TResult](
    onrejected: js.Function2[/* reason */ js.Error, /* stderr */ String, TResult | js.Thenable[TResult]]
  ): NssmPromise[T | TResult] = js.native
  @JSName("catch")
  var catch_Original: NssmCatch[T] = js.native
  
  def `then`[TResult1, TResult2](): NssmPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function2[/* reason */ js.Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
  ): NssmPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]]): NssmPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function2[/* reason */ js.Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
  ): NssmPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: Null,
    onrejected: js.Function2[/* reason */ js.Error, /* stderr */ String, TResult2 | js.Thenable[TResult2]]
  ): NssmPromise[TResult1 | TResult2] = js.native
  @JSName("then")
  var then_Original: NssmThen[T] = js.native
}
