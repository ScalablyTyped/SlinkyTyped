package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosVppEBook extends ManagedEBook {
  // The Apple ID associated with Vpp token.
  var appleId: js.UndefOr[String] = js.native
  // Genres.
  var genres: js.UndefOr[js.Array[String]] = js.native
  // Language.
  var language: js.UndefOr[String] = js.native
  // Seller.
  var seller: js.UndefOr[String] = js.native
  // Total license count.
  var totalLicenseCount: js.UndefOr[Double] = js.native
  // Used license count.
  var usedLicenseCount: js.UndefOr[Double] = js.native
  // The Vpp token's organization name.
  var vppOrganizationName: js.UndefOr[String] = js.native
  // The Vpp token ID.
  var vppTokenId: js.UndefOr[String] = js.native
}

object IosVppEBook {
  @scala.inline
  def apply(): IosVppEBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppEBook]
  }
  @scala.inline
  implicit class IosVppEBookOps[Self <: IosVppEBook] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appleId")(js.undefined)
        ret
    }
    @scala.inline
    def withGenres(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenres: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genres")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withSeller(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seller")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalLicenseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLicenseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalLicenseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalLicenseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withUsedLicenseCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedLicenseCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsedLicenseCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usedLicenseCount")(js.undefined)
        ret
    }
    @scala.inline
    def withVppOrganizationName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppOrganizationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVppOrganizationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppOrganizationName")(js.undefined)
        ret
    }
    @scala.inline
    def withVppTokenId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVppTokenId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vppTokenId")(js.undefined)
        ret
    }
  }
  
}

