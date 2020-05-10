package typingsSlinky.gapiClientBooks.gapi.client.books

import typingsSlinky.gapiClientBooks.AnonAccessViewStatus
import typingsSlinky.gapiClientBooks.AnonAcquiredTime
import typingsSlinky.gapiClientBooks.AnonAllowAnonLogging
import typingsSlinky.gapiClientBooks.AnonBuyLink
import typingsSlinky.gapiClientBooks.AnonExplanation
import typingsSlinky.gapiClientBooks.AnonLayers
import typingsSlinky.gapiClientBooks.AnonTextSnippet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Volume extends js.Object {
  /**
    * Any information about a volume related to reading or obtaining that volume text. This information can depend on country (books may be public domain in
    * one country but not in another, e.g.).
    */
  var accessInfo: js.UndefOr[AnonAccessViewStatus] = js.native
  /** Opaque identifier for a specific version of a volume resource. (In LITE projection) */
  var etag: js.UndefOr[String] = js.native
  /** Unique identifier for a volume. (In LITE projection.) */
  var id: js.UndefOr[String] = js.native
  /** Resource type for a volume. (In LITE projection.) */
  var kind: js.UndefOr[String] = js.native
  /** What layers exist in this volume and high level information about them. */
  var layerInfo: js.UndefOr[AnonLayers] = js.native
  /** Recommendation related information for this volume. */
  var recommendedInfo: js.UndefOr[AnonExplanation] = js.native
  /**
    * Any information about a volume related to the eBookstore and/or purchaseability. This information can depend on the country where the request
    * originates from (i.e. books may not be for sale in certain countries).
    */
  var saleInfo: js.UndefOr[AnonBuyLink] = js.native
  /** Search result information related to this volume. */
  var searchInfo: js.UndefOr[AnonTextSnippet] = js.native
  /** URL to this resource. (In LITE projection.) */
  var selfLink: js.UndefOr[String] = js.native
  /** User specific information related to this volume. (e.g. page this user last read or whether they purchased this book) */
  var userInfo: js.UndefOr[AnonAcquiredTime] = js.native
  /** General volume information. */
  var volumeInfo: js.UndefOr[AnonAllowAnonLogging] = js.native
}

object Volume {
  @scala.inline
  def apply(): Volume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Volume]
  }
  @scala.inline
  implicit class VolumeOps[Self <: Volume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessInfo(value: AnonAccessViewStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withEtag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEtag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("etag")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerInfo(value: AnonLayers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendedInfo(value: AnonExplanation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendedInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendedInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recommendedInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSaleInfo(value: AnonBuyLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaleInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saleInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchInfo(value: AnonTextSnippet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withUserInfo(value: AnonAcquiredTime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeInfo(value: AnonAllowAnonLogging): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeInfo")(js.undefined)
        ret
    }
  }
  
}

