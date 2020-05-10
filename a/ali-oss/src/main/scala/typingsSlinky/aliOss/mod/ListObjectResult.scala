package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectResult extends js.Object {
  var isTruncated: Boolean = js.native
  var nextMarker: String = js.native
  var objects: js.Array[ObjectMeta] = js.native
  var prefixes: js.Array[String] = js.native
  var res: NormalSuccessResponse = js.native
}

object ListObjectResult {
  @scala.inline
  def apply(
    isTruncated: Boolean,
    nextMarker: String,
    objects: js.Array[ObjectMeta],
    prefixes: js.Array[String],
    res: NormalSuccessResponse
  ): ListObjectResult = {
    val __obj = js.Dynamic.literal(isTruncated = isTruncated.asInstanceOf[js.Any], nextMarker = nextMarker.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectResult]
  }
  @scala.inline
  implicit class ListObjectResultOps[Self <: ListObjectResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsTruncated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTruncated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: js.Array[ObjectMeta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: NormalSuccessResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

