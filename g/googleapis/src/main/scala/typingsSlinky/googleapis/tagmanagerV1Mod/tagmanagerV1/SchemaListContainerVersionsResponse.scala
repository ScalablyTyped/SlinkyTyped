package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List container versions response.
  */
@js.native
trait SchemaListContainerVersionsResponse extends js.Object {
  /**
    * All versions of a GTM Container.
    */
  var containerVersion: js.UndefOr[js.Array[SchemaContainerVersion]] = js.native
  /**
    * All container version headers of a GTM Container.
    */
  var containerVersionHeader: js.UndefOr[js.Array[SchemaContainerVersionHeader]] = js.native
}

object SchemaListContainerVersionsResponse {
  @scala.inline
  def apply(): SchemaListContainerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainerVersionsResponse]
  }
  @scala.inline
  implicit class SchemaListContainerVersionsResponseOps[Self <: SchemaListContainerVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerVersion(value: js.Array[SchemaContainerVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerVersionHeader(value: js.Array[SchemaContainerVersionHeader]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersionHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerVersionHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersionHeader")(js.undefined)
        ret
    }
  }
  
}

