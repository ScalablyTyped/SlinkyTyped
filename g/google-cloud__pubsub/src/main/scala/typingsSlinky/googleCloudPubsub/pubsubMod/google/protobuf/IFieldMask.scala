package typingsSlinky.googleCloudPubsub.pubsubMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FieldMask. */
@js.native
trait IFieldMask extends js.Object {
  /** FieldMask paths */
  var paths: js.UndefOr[js.Array[String] | Null] = js.native
}

object IFieldMask {
  @scala.inline
  def apply(): IFieldMask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldMask]
  }
  @scala.inline
  implicit class IFieldMaskOps[Self <: IFieldMask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
    @scala.inline
    def withPathsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(null)
        ret
    }
  }
  
}

