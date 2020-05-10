package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a test environment.
  */
@js.native
trait SchemaTestEnvironmentCatalog extends js.Object {
  /**
    * Supported Android devices.
    */
  var androidDeviceCatalog: js.UndefOr[SchemaAndroidDeviceCatalog] = js.native
  /**
    * Supported iOS devices.
    */
  var iosDeviceCatalog: js.UndefOr[SchemaIosDeviceCatalog] = js.native
  /**
    * Supported network configurations.
    */
  var networkConfigurationCatalog: js.UndefOr[SchemaNetworkConfigurationCatalog] = js.native
  /**
    * The software test environment provided by TestExecutionService.
    */
  var softwareCatalog: js.UndefOr[SchemaProvidedSoftwareCatalog] = js.native
}

object SchemaTestEnvironmentCatalog {
  @scala.inline
  def apply(): SchemaTestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestEnvironmentCatalog]
  }
  @scala.inline
  implicit class SchemaTestEnvironmentCatalogOps[Self <: SchemaTestEnvironmentCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAndroidDeviceCatalog(value: SchemaAndroidDeviceCatalog): Self = {
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
    def withIosDeviceCatalog(value: SchemaIosDeviceCatalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDeviceCatalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosDeviceCatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosDeviceCatalog")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkConfigurationCatalog(value: SchemaNetworkConfigurationCatalog): Self = {
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
    @scala.inline
    def withSoftwareCatalog(value: SchemaProvidedSoftwareCatalog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareCatalog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoftwareCatalog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("softwareCatalog")(js.undefined)
        ret
    }
  }
  
}

