package typingsSlinky.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kubernetes Engine service configuration.
  */
@js.native
trait SchemaServerConfig extends js.Object {
  /**
    * Version of Kubernetes the service deploys by default.
    */
  var defaultClusterVersion: js.UndefOr[String] = js.native
  /**
    * Default image type.
    */
  var defaultImageType: js.UndefOr[String] = js.native
  /**
    * List of valid image types.
    */
  var validImageTypes: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of valid master versions.
    */
  var validMasterVersions: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of valid node upgrade target versions.
    */
  var validNodeVersions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaServerConfig {
  @scala.inline
  def apply(): SchemaServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServerConfig]
  }
  @scala.inline
  implicit class SchemaServerConfigOps[Self <: SchemaServerConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultClusterVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClusterVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultClusterVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultClusterVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultImageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultImageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultImageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultImageType")(js.undefined)
        ret
    }
    @scala.inline
    def withValidImageTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validImageTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidImageTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validImageTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withValidMasterVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validMasterVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidMasterVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validMasterVersions")(js.undefined)
        ret
    }
    @scala.inline
    def withValidNodeVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validNodeVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidNodeVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validNodeVersions")(js.undefined)
        ret
    }
  }
  
}

