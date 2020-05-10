package typingsSlinky.googleapis.cloudprivatecatalogproducerV1beta1Mod.cloudprivatecatalogproducerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The producer representation of a version, which is a child resource under a
  * `Product` with asset data.
  */
@js.native
trait SchemaGoogleCloudPrivatecatalogproducerV1beta1Version extends js.Object {
  /**
    * Output only. The asset which has been validated and is ready to be
    * provisioned. See Version.original_asset for the schema.
    */
  var asset: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The time when the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The user-supplied description of the version. Maximum of 256 characters.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The resource name of the version, in the format
    * `catalogs/{catalog_id}/products/{product_id}/versions/a-z*[a-z0-9]&#39;.
    * A unique identifier for the version under a product, which can&#39;t be
    * changed after the version is created. The final segment of the name must
    * between 1 and 63 characters in length.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The user-supplied asset payload. The maximum size of the payload is 2MB.
    * The JSON schema of the payload is defined as:  ``` type: object
    * properties:   mainTemplate:     type: string     description: The file
    * name of the main template and name prefix of     schema file. The content
    * of the main template should be set in the     imports list. The schema
    * file name is expected to be     &lt;mainTemplate&gt;.schema in the
    * imports list. required: true   imports:     type: array     description:
    * Import template and schema file contents. Required to have     both
    * &lt;mainTemplate&gt; and &lt;mainTemplate&gt;.schema files. required:
    * true     minItems: 2     items:       type: object       properties:
    * name:           type: string         content:           type: string ```
    */
  var originalAsset: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Output only. The time when the version was last updated.
    */
  var updateTime: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudPrivatecatalogproducerV1beta1Version {
  @scala.inline
  def apply(): SchemaGoogleCloudPrivatecatalogproducerV1beta1Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPrivatecatalogproducerV1beta1Version]
  }
  @scala.inline
  implicit class SchemaGoogleCloudPrivatecatalogproducerV1beta1VersionOps[Self <: SchemaGoogleCloudPrivatecatalogproducerV1beta1Version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsset(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asset")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalAsset(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalAsset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalAsset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalAsset")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTime")(js.undefined)
        ret
    }
  }
  
}

