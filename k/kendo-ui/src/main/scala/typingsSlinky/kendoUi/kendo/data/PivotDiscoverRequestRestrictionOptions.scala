package typingsSlinky.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotDiscoverRequestRestrictionOptions extends js.Object {
  var catalogName: String = js.native
  var cubeName: String = js.native
}

object PivotDiscoverRequestRestrictionOptions {
  @scala.inline
  def apply(catalogName: String, cubeName: String): PivotDiscoverRequestRestrictionOptions = {
    val __obj = js.Dynamic.literal(catalogName = catalogName.asInstanceOf[js.Any], cubeName = cubeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotDiscoverRequestRestrictionOptions]
  }
  @scala.inline
  implicit class PivotDiscoverRequestRestrictionOptionsOps[Self <: PivotDiscoverRequestRestrictionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCatalogName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalogName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCubeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

