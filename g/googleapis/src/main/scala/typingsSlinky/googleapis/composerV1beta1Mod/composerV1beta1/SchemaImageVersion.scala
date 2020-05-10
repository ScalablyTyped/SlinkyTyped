package typingsSlinky.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Image Version information
  */
@js.native
trait SchemaImageVersion extends js.Object {
  /**
    * The string identifier of the ImageVersion, in the form:
    * &quot;composer-x.y.z-airflow-a.b(.c)&quot;
    */
  var imageVersionId: js.UndefOr[String] = js.native
  /**
    * Whether this is the default ImageVersion used by Composer during
    * environment creation if no input ImageVersion is specified.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * supported python versions
    */
  var supportedPythonVersions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaImageVersion {
  @scala.inline
  def apply(): SchemaImageVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageVersion]
  }
  @scala.inline
  implicit class SchemaImageVersionOps[Self <: SchemaImageVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedPythonVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPythonVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedPythonVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedPythonVersions")(js.undefined)
        ret
    }
  }
  
}

