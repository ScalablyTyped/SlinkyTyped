package typingsSlinky.expoAsset.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadPromiseCallbacks extends js.Object {
  def reject(error: js.Error): Unit = js.native
  def resolve(): Unit = js.native
}

object DownloadPromiseCallbacks {
  @scala.inline
  def apply(reject: js.Error => Unit, resolve: () => Unit): DownloadPromiseCallbacks = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[DownloadPromiseCallbacks]
  }
  @scala.inline
  implicit class DownloadPromiseCallbacksOps[Self <: DownloadPromiseCallbacks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReject(value: js.Error => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reject")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResolve(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolve")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

