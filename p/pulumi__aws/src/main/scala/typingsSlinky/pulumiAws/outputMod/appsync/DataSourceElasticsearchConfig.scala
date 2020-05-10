package typingsSlinky.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceElasticsearchConfig extends js.Object {
  /**
    * HTTP URL.
    */
  var endpoint: String = js.native
  /**
    * AWS region of Elasticsearch domain. Defaults to current region.
    */
  var region: String = js.native
}

object DataSourceElasticsearchConfig {
  @scala.inline
  def apply(endpoint: String, region: String): DataSourceElasticsearchConfig = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceElasticsearchConfig]
  }
  @scala.inline
  implicit class DataSourceElasticsearchConfigOps[Self <: DataSourceElasticsearchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

