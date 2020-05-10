package typingsSlinky.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostData extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.native
  /** Mime type of posted data. */
  var mimeType: String = js.native
  /**
    * List of posted parameters (in case of URL encoded parameters).
    *
    * _`text` and `params` fields are mutually exclusive._
    */
  var params: js.Array[Param] = js.native
  /**
    * Plain text posted data
    *
    * _`params` and `text` fields are mutually exclusive._
    */
  var text: String = js.native
}

object PostData {
  @scala.inline
  def apply(mimeType: String, params: js.Array[Param], text: String): PostData = {
    val __obj = js.Dynamic.literal(mimeType = mimeType.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostData]
  }
  @scala.inline
  implicit class PostDataOps[Self <: PostData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Array[Param]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comment")(js.undefined)
        ret
    }
  }
  
}

