package typingsSlinky.minio.minioMod

import typingsSlinky.minio.minioStrings.data
import typingsSlinky.minio.minioStrings.end
import typingsSlinky.minio.minioStrings.error
import typingsSlinky.node.streamMod.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketStream[T] extends internal {
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* item */ T, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
}

