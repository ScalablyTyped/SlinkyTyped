package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataService extends js.Object {
  var adapterInstance: DataServiceAdapter = js.native
  var adapterName: String = js.native
  var hasServerMetadata: Boolean = js.native
  var jsonResultsAdapter: JsonResultsAdapter = js.native
  var serviceName: String = js.native
  var uriBuilderName: String = js.native
  var useJsonp: Boolean = js.native
  def using(config: DataServiceOptions): DataService = js.native
}

object DataService {
  @scala.inline
  def apply(
    adapterInstance: DataServiceAdapter,
    adapterName: String,
    hasServerMetadata: Boolean,
    jsonResultsAdapter: JsonResultsAdapter,
    serviceName: String,
    uriBuilderName: String,
    useJsonp: Boolean,
    using: DataServiceOptions => DataService
  ): DataService = {
    val __obj = js.Dynamic.literal(adapterInstance = adapterInstance.asInstanceOf[js.Any], adapterName = adapterName.asInstanceOf[js.Any], hasServerMetadata = hasServerMetadata.asInstanceOf[js.Any], jsonResultsAdapter = jsonResultsAdapter.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], uriBuilderName = uriBuilderName.asInstanceOf[js.Any], useJsonp = useJsonp.asInstanceOf[js.Any], using = js.Any.fromFunction1(using))
    __obj.asInstanceOf[DataService]
  }
  @scala.inline
  implicit class DataServiceOps[Self <: DataService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdapterInstance(value: DataServiceAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdapterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adapterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasServerMetadata(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasServerMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsonResultsAdapter(value: JsonResultsAdapter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonResultsAdapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUriBuilderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uriBuilderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseJsonp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsing(value: DataServiceOptions => DataService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("using")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

