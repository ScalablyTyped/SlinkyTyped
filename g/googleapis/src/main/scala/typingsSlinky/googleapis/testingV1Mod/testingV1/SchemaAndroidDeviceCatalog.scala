package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently supported Android devices.
  */
@js.native
trait SchemaAndroidDeviceCatalog extends js.Object {
  /**
    * The set of supported Android device models.
    */
  var models: js.UndefOr[js.Array[SchemaAndroidModel]] = js.native
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaAndroidRuntimeConfiguration] = js.native
  /**
    * The set of supported Android OS versions.
    */
  var versions: js.UndefOr[js.Array[SchemaAndroidVersion]] = js.native
}

object SchemaAndroidDeviceCatalog {
  @scala.inline
  def apply(): SchemaAndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDeviceCatalog]
  }
  @scala.inline
  implicit class SchemaAndroidDeviceCatalogOps[Self <: SchemaAndroidDeviceCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModels(value: js.Array[SchemaAndroidModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("models")(js.undefined)
        ret
    }
    @scala.inline
    def withRuntimeConfiguration(value: SchemaAndroidRuntimeConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuntimeConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtimeConfiguration")(js.undefined)
        ret
    }
    @scala.inline
    def withVersions(value: js.Array[SchemaAndroidVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versions")(js.undefined)
        ret
    }
  }
  
}

