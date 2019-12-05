package typingsSlinky.minio.minioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("minio", "PostPolicy")
@js.native
class PostPolicy () extends js.Object {
  def setBucket(bucketName: String): Unit = js.native
  def setContentLengthRange(min: Double, max: Double): Unit = js.native
  def setContentType(`type`: String): Unit = js.native
  def setExpires(date: js.Date): Unit = js.native
  def setKey(objectName: String): Unit = js.native
  def setKeyStartsWith(prefix: String): Unit = js.native
}

