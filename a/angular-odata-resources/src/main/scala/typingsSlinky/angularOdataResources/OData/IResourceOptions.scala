package typingsSlinky.angularOdataResources.OData

import typingsSlinky.angularOdataResources.anon.Method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Currently supported options for the $resource factory options argument.
  */
@js.native
trait IResourceOptions extends js.Object {
  var isodatav4: js.UndefOr[Boolean] = js.native
  var odata: js.UndefOr[Method] = js.native
  /**
    * If true then the trailing slashes from any calculated URL will be stripped (defaults to true)
    */
  var stripTrailingSlashes: js.UndefOr[Boolean] = js.native
}

object IResourceOptions {
  @scala.inline
  def apply(): IResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IResourceOptions]
  }
  @scala.inline
  implicit class IResourceOptionsOps[Self <: IResourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsodatav4(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isodatav4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsodatav4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isodatav4")(js.undefined)
        ret
    }
    @scala.inline
    def withOdata(value: Method): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOdata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("odata")(js.undefined)
        ret
    }
    @scala.inline
    def withStripTrailingSlashes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripTrailingSlashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripTrailingSlashes")(js.undefined)
        ret
    }
  }
  
}

