package typingsSlinky.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CollectionOverride allows resource handling overrides for specific
  * resources within a BaseType
  */
@js.native
trait SchemaCollectionOverride extends js.Object {
  /**
    * The collection that identifies this resource within its service.
    */
  var collection: js.UndefOr[String] = js.native
  /**
    * Custom verb method mappings to support unordered list API mappings.
    */
  var methodMap: js.UndefOr[SchemaMethodMap] = js.native
  /**
    * The options to apply to this resource-level override
    */
  var options: js.UndefOr[SchemaOptions] = js.native
}

object SchemaCollectionOverride {
  @scala.inline
  def apply(): SchemaCollectionOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCollectionOverride]
  }
  @scala.inline
  implicit class SchemaCollectionOverrideOps[Self <: SchemaCollectionOverride] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.undefined)
        ret
    }
    @scala.inline
    def withMethodMap(value: SchemaMethodMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethodMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("methodMap")(js.undefined)
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

