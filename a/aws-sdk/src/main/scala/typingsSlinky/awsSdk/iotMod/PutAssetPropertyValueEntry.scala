package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAssetPropertyValueEntry extends js.Object {
  /**
    * The ID of the AWS IoT SiteWise asset. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var assetId: js.UndefOr[AssetId] = js.native
  /**
    * Optional. A unique identifier for this entry that you can define to better track which message caused an error in case of failure. Accepts substitution templates. Defaults to a new UUID.
    */
  var entryId: js.UndefOr[AssetPropertyEntryId] = js.native
  /**
    * The name of the property alias associated with your asset property. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var propertyAlias: js.UndefOr[AssetPropertyAlias] = js.native
  /**
    * The ID of the asset's property. You must specify either a propertyAlias or both an aliasId and a propertyId. Accepts substitution templates.
    */
  var propertyId: js.UndefOr[AssetPropertyId] = js.native
  /**
    * A list of property values to insert that each contain timestamp, quality, and value (TQV) information.
    */
  var propertyValues: AssetPropertyValueList = js.native
}

object PutAssetPropertyValueEntry {
  @scala.inline
  def apply(propertyValues: AssetPropertyValueList): PutAssetPropertyValueEntry = {
    val __obj = js.Dynamic.literal(propertyValues = propertyValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAssetPropertyValueEntry]
  }
  @scala.inline
  implicit class PutAssetPropertyValueEntryOps[Self <: PutAssetPropertyValueEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropertyValues(value: AssetPropertyValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssetId(value: AssetId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assetId")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryId(value: AssetPropertyEntryId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryId")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyAlias(value: AssetPropertyAlias): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withPropertyId(value: AssetPropertyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propertyId")(js.undefined)
        ret
    }
  }
  
}

