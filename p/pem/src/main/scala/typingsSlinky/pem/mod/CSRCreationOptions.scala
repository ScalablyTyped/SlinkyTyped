package typingsSlinky.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSRCreationOptions extends js.Object {
  /**
    * A list of subjectAltNames in the subjectAltName field
    */
  var altNames: js.UndefOr[js.Array[String]] = js.native
  /**
    *  Optional client key to use
    */
  var clientKey: js.UndefOr[String] = js.native
  var clientKeyPassword: js.UndefOr[String] = js.native
  /**
    * CSR common name field, defaults to 'localhost'
    */
  var commonName: js.UndefOr[String] = js.native
  /**
    * CSR country field
    */
  var country: js.UndefOr[String] = js.native
  /**
    * CSR config file
    */
  var csrConfigFile: js.UndefOr[String] = js.native
  /**
    * CSR email address field
    */
  var emailAddress: js.UndefOr[String] = js.native
  /**
    * Hash function to use, defaults to sha256
    */
  var hash: js.UndefOr[HashFunction] = js.native
  /**
    * If clientKey is undefined, bit size to use for generating a new key (defaults to 2048)
    */
  var keyBitsize: js.UndefOr[Double] = js.native
  /**
    * CSR locality field
    */
  var locality: js.UndefOr[String] = js.native
  /**
    * CSR organization field
    */
  var organization: js.UndefOr[String] = js.native
  /**
    * CSR organizational unit field
    */
  var organizationUnit: js.UndefOr[String] = js.native
  /**
    * CSR state field
    */
  var state: js.UndefOr[String] = js.native
}

object CSRCreationOptions {
  @scala.inline
  def apply(): CSRCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSRCreationOptions]
  }
  @scala.inline
  implicit class CSRCreationOptionsOps[Self <: CSRCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altNames")(js.undefined)
        ret
    }
    @scala.inline
    def withClientKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKey")(js.undefined)
        ret
    }
    @scala.inline
    def withClientKeyPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKeyPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientKeyPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientKeyPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withCommonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonName")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withCsrConfigFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csrConfigFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCsrConfigFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csrConfigFile")(js.undefined)
        ret
    }
    @scala.inline
    def withEmailAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmailAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emailAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withHash(value: HashFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyBitsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBitsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyBitsize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyBitsize")(js.undefined)
        ret
    }
    @scala.inline
    def withLocality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locality")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organization")(js.undefined)
        ret
    }
    @scala.inline
    def withOrganizationUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrganizationUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("organizationUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

