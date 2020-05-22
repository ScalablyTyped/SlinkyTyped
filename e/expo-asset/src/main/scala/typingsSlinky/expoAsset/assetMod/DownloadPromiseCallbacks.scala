package typingsSlinky.expoAsset.assetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadPromiseCallbacks extends js.Object {
  def reject(error: js.Error): Unit
  def resolve(): Unit
}

object DownloadPromiseCallbacks {
  @scala.inline
  def apply(reject: js.Error => Unit, resolve: () => Unit): DownloadPromiseCallbacks = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[DownloadPromiseCallbacks]
  }
}

