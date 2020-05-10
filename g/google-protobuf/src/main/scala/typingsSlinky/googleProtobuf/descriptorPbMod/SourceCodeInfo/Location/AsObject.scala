package typingsSlinky.googleProtobuf.descriptorPbMod.SourceCodeInfo.Location

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var leadingComments: js.UndefOr[String] = js.native
  var leadingDetachedCommentsList: js.Array[String] = js.native
  var pathList: js.Array[Double] = js.native
  var spanList: js.Array[Double] = js.native
  var trailingComments: js.UndefOr[String] = js.native
}

object AsObject {
  @scala.inline
  def apply(
    leadingDetachedCommentsList: js.Array[String],
    pathList: js.Array[Double],
    spanList: js.Array[Double]
  ): AsObject = {
    val __obj = js.Dynamic.literal(leadingDetachedCommentsList = leadingDetachedCommentsList.asInstanceOf[js.Any], pathList = pathList.asInstanceOf[js.Any], spanList = spanList.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeadingDetachedCommentsList(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingDetachedCommentsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpanList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spanList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeadingComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingComments")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingComments(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingComments")(js.undefined)
        ret
    }
  }
  
}

