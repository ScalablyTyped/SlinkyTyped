package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEnvironmentCatalog extends js.Object {
  /** Android devices suitable for running Android Instrumentation Tests. */
  var androidDeviceCatalog: js.UndefOr[AndroidDeviceCatalog] = js.native
  /** Supported network configurations */
  var networkConfigurationCatalog: js.UndefOr[NetworkConfigurationCatalog] = js.native
}

object TestEnvironmentCatalog {
  @scala.inline
  def apply(): TestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestEnvironmentCatalog]
  }
  @scala.inline
  implicit class TestEnvironmentCatalogOps[Self <: TestEnvironmentCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidDeviceCatalog(value: AndroidDeviceCatalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceCatalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroidDeviceCatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("androidDeviceCatalog")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkConfigurationCatalog(value: NetworkConfigurationCatalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkConfigurationCatalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkConfigurationCatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkConfigurationCatalog")(js.undefined)
        ret
    }
  }
  
}

