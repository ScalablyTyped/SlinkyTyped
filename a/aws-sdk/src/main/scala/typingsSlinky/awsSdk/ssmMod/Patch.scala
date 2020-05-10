package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Patch extends js.Object {
  /**
    * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
    */
  var Classification: js.UndefOr[PatchClassification] = js.native
  /**
    * The URL where more information can be obtained about the patch.
    */
  var ContentUrl: js.UndefOr[PatchContentUrl] = js.native
  /**
    * The description of the patch.
    */
  var Description: js.UndefOr[PatchDescription] = js.native
  /**
    * The ID of the patch (this is different than the Microsoft Knowledge Base ID).
    */
  var Id: js.UndefOr[PatchId] = js.native
  /**
    * The Microsoft Knowledge Base ID of the patch.
    */
  var KbNumber: js.UndefOr[PatchKbNumber] = js.native
  /**
    * The language of the patch if it's language-specific.
    */
  var Language: js.UndefOr[PatchLanguage] = js.native
  /**
    * The ID of the MSRC bulletin the patch is related to.
    */
  var MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.native
  /**
    * The severity of the patch (for example Critical, Important, Moderate).
    */
  var MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.native
  /**
    * The specific product the patch is applicable for (for example, WindowsServer2016).
    */
  var Product: js.UndefOr[PatchProduct] = js.native
  /**
    * The product family the patch is applicable for (for example, Windows).
    */
  var ProductFamily: js.UndefOr[PatchProductFamily] = js.native
  /**
    * The date the patch was released.
    */
  var ReleaseDate: js.UndefOr[js.Date] = js.native
  /**
    * The title of the patch.
    */
  var Title: js.UndefOr[PatchTitle] = js.native
  /**
    * The name of the vendor providing the patch.
    */
  var Vendor: js.UndefOr[PatchVendor] = js.native
}

object Patch {
  @scala.inline
  def apply(): Patch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Patch]
  }
  @scala.inline
  implicit class PatchOps[Self <: Patch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassification(value: PatchClassification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Classification")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUrl(value: PatchContentUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: PatchDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: PatchId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withKbNumber(value: PatchKbNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KbNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKbNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KbNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: PatchLanguage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(js.undefined)
        ret
    }
    @scala.inline
    def withMsrcNumber(value: PatchMsrcNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsrcNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsrcNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsrcNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withMsrcSeverity(value: PatchMsrcSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsrcSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsrcSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MsrcSeverity")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: PatchProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Product")(js.undefined)
        ret
    }
    @scala.inline
    def withProductFamily(value: PatchProductFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProductFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReleaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: PatchTitle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(js.undefined)
        ret
    }
    @scala.inline
    def withVendor(value: PatchVendor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vendor")(js.undefined)
        ret
    }
  }
  
}

