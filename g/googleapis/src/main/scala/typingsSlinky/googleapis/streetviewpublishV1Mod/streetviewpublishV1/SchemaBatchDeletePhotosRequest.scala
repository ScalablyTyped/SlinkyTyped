package typingsSlinky.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to delete multiple Photos.
  */
@js.native
trait SchemaBatchDeletePhotosRequest extends js.Object {
  /**
    * Required. IDs of the Photos. HTTP GET requests require the following
    * syntax for the URL query parameter:
    * `photoIds=&lt;id1&gt;&amp;photoIds=&lt;id2&gt;&amp;...`.
    */
  var photoIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaBatchDeletePhotosRequest {
  @scala.inline
  def apply(): SchemaBatchDeletePhotosRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchDeletePhotosRequest]
  }
  @scala.inline
  implicit class SchemaBatchDeletePhotosRequestOps[Self <: SchemaBatchDeletePhotosRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhotoIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhotoIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photoIds")(js.undefined)
        ret
    }
  }
  
}

