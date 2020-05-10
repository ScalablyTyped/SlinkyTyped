package typingsSlinky.googleapis.searchconsoleV1Mod.searchconsoleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Blocked resource.
  */
@js.native
trait SchemaBlockedResource extends js.Object {
  /**
    * URL of the blocked resource.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaBlockedResource {
  @scala.inline
  def apply(): SchemaBlockedResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBlockedResource]
  }
  @scala.inline
  implicit class SchemaBlockedResourceOps[Self <: SchemaBlockedResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

