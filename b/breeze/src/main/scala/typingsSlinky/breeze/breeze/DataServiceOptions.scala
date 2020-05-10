package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataServiceOptions extends js.Object {
  var adapterName: js.UndefOr[String] = js.native
  var hasServerMetadata: js.UndefOr[Boolean] = js.native
  var jsonResultsAdapter: js.UndefOr[JsonResultsAdapter] = js.native
  var serviceName: js.UndefOr[String] = js.native
  var uriBuilderName: js.UndefOr[String] = js.native
  var useJsonp: js.UndefOr[Boolean] = js.native
}

object DataServiceOptions {
  @scala.inline
  def apply(): DataServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataServiceOptions]
  }
  @scala.inline
  implicit class DataServiceOptionsOps[Self <: DataServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdapterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterName")(js.undefined)
        ret
    }
    @scala.inline
    def withHasServerMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasServerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasServerMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasServerMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonResultsAdapter(value: JsonResultsAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonResultsAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonResultsAdapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonResultsAdapter")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withUriBuilderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriBuilderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUriBuilderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriBuilderName")(js.undefined)
        ret
    }
    @scala.inline
    def withUseJsonp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJsonp")(js.undefined)
        ret
    }
  }
  
}

