package typingsSlinky.googleCloudPubsub.anon

import typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback
import typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply[T, R](config: RequestConfig, callback: RequestCallback[T, R]): Unit = js.native
}

