package typingsSlinky.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidDeviceCatalog extends js.Object {
  /**
    * The set of supported Android device models.
    * @OutputOnly
    */
  var models: js.UndefOr[js.Array[AndroidModel]] = js.native
  /**
    * The set of supported runtime configurations.
    * @OutputOnly
    */
  var runtimeConfiguration: js.UndefOr[AndroidRuntimeConfiguration] = js.native
  /**
    * The set of supported Android OS versions.
    * @OutputOnly
    */
  var versions: js.UndefOr[js.Array[AndroidVersion]] = js.native
}

object AndroidDeviceCatalog {
  @scala.inline
  def apply(): AndroidDeviceCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDeviceCatalog]
  }
  @scala.inline
  implicit class AndroidDeviceCatalogOps[Self <: AndroidDeviceCatalog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModels(value: js.Array[AndroidModel]): Self = {
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
    def withRuntimeConfiguration(value: AndroidRuntimeConfiguration): Self = {
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
    def withVersions(value: js.Array[AndroidVersion]): Self = {
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

