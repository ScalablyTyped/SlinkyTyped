package typingsSlinky.minio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BucketItemCopy extends js.Object {
  var etag: String
  var lastModified: js.Date
}

object BucketItemCopy {
  @scala.inline
  def apply(etag: String, lastModified: js.Date): BucketItemCopy = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BucketItemCopy]
  }
}

