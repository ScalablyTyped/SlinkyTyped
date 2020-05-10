package typingsSlinky.pulumiAws.outputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceHttpConfig extends js.Object {
  /**
    * HTTP URL.
    */
  var endpoint: String = js.native
}

object DataSourceHttpConfig {
  @scala.inline
  def apply(endpoint: String): DataSourceHttpConfig = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceHttpConfig]
  }
  @scala.inline
  implicit class DataSourceHttpConfigOps[Self <: DataSourceHttpConfig] (val x: Self) extends AnyVal {
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
  }
  
}

