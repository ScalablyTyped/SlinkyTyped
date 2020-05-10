package typingsSlinky.googleapis.booksV1Mod.booksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDownloadAccesses extends js.Object {
  /**
    * A list of download access responses.
    */
  var downloadAccessList: js.UndefOr[js.Array[SchemaDownloadAccessRestriction]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaDownloadAccesses {
  @scala.inline
  def apply(): SchemaDownloadAccesses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDownloadAccesses]
  }
  @scala.inline
  implicit class SchemaDownloadAccessesOps[Self <: SchemaDownloadAccesses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadAccessList(value: js.Array[SchemaDownloadAccessRestriction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAccessList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadAccessList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadAccessList")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

