package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfigurationCatalog extends js.Object {
  var configurations: js.UndefOr[js.Array[NetworkConfiguration]] = js.native
}

object NetworkConfigurationCatalog {
  @scala.inline
  def apply(): NetworkConfigurationCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigurationCatalog]
  }
  @scala.inline
  implicit class NetworkConfigurationCatalogOps[Self <: NetworkConfigurationCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurations(value: js.Array[NetworkConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configurations")(js.undefined)
        ret
    }
  }
  
}

