package typingsSlinky.googleapis.v2betaMod.deploymentmanagerV2beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * BaseType that describes a service-backed Type.
  */
@js.native
trait SchemaBaseType extends js.Object {
  /**
    * Allows resource handling overrides for specific collections
    */
  var collectionOverrides: js.UndefOr[js.Array[SchemaCollectionOverride]] = js.native
  /**
    * Credential used when interacting with this type.
    */
  var credential: js.UndefOr[SchemaCredential] = js.native
  /**
    * Descriptor Url for the this type.
    */
  var descriptorUrl: js.UndefOr[String] = js.native
  /**
    * Options to apply when handling any resources in this service.
    */
  var options: js.UndefOr[SchemaOptions] = js.native
}

object SchemaBaseType {
  @scala.inline
  def apply(): SchemaBaseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBaseType]
  }
  @scala.inline
  implicit class SchemaBaseTypeOps[Self <: SchemaBaseType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectionOverrides(value: js.Array[SchemaCollectionOverride]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withCredential(value: SchemaCredential): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredential: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credential")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptorUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptorUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptorUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptorUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: SchemaOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

