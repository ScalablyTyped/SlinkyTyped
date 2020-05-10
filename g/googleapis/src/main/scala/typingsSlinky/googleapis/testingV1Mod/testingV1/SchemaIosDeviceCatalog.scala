package typingsSlinky.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The currently supported iOS devices.
  */
@js.native
trait SchemaIosDeviceCatalog extends js.Object {
  /**
    * The set of supported iOS device models.
    */
  var models: js.UndefOr[js.Array[SchemaIosModel]] = js.native
  /**
    * The set of supported runtime configurations.
    */
  var runtimeConfiguration: js.UndefOr[SchemaIosRuntimeConfiguration] = js.native
  /**
    * The set of supported iOS software versions.
    */
  var versions: js.UndefOr[js.Array[SchemaIosVersion]] = js.native
  /**
    * The set of supported Xcode versions.
    */
  var xcodeVersions: js.UndefOr[js.Array[SchemaXcodeVersion]] = js.native
}

object SchemaIosDeviceCatalog {
  @scala.inline
  def apply(): SchemaIosDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIosDeviceCatalog]
  }
  @scala.inline
  implicit class SchemaIosDeviceCatalogOps[Self <: SchemaIosDeviceCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModels(value: js.Array[SchemaIosModel]): Self = {
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
    def withRuntimeConfiguration(value: SchemaIosRuntimeConfiguration): Self = {
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
    def withVersions(value: js.Array[SchemaIosVersion]): Self = {
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
    @scala.inline
    def withXcodeVersions(value: js.Array[SchemaXcodeVersion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xcodeVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXcodeVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xcodeVersions")(js.undefined)
        ret
    }
  }
  
}

