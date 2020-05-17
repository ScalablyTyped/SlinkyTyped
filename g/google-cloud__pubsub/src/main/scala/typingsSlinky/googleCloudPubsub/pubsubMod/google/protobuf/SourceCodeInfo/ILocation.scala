package typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf.SourceCodeInfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a Location. */
@js.native
trait ILocation extends js.Object {
  /** Location leadingComments */
  var leadingComments: js.UndefOr[String | Null] = js.native
  /** Location leadingDetachedComments */
  var leadingDetachedComments: js.UndefOr[js.Array[String] | Null] = js.native
  /** Location path */
  var path: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Location span */
  var span: js.UndefOr[js.Array[Double] | Null] = js.native
  /** Location trailingComments */
  var trailingComments: js.UndefOr[String | Null] = js.native
}

object ILocation {
  @scala.inline
  def apply(): ILocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ILocation]
  }
  @scala.inline
  implicit class ILocationOps[Self <: ILocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLeadingCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingComments")(null)
        ret
    }
    @scala.inline
    def withLeadingDetachedComments(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingDetachedComments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeadingDetachedComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingDetachedComments")(js.undefined)
        ret
    }
    @scala.inline
    def withLeadingDetachedCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leadingDetachedComments")(null)
        ret
    }
    @scala.inline
    def withPath(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPathNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(null)
        ret
    }
    @scala.inline
    def withSpan(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(js.undefined)
        ret
    }
    @scala.inline
    def withSpanNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("span")(null)
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
    @scala.inline
    def withTrailingCommentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingComments")(null)
        ret
    }
  }
  
}

