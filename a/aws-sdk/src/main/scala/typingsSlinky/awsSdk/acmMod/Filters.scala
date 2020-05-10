package typingsSlinky.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filters extends js.Object {
  /**
    * Specify one or more ExtendedKeyUsage extension values.
    */
  var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageFilterList] = js.native
  /**
    * Specify one or more algorithms that can be used to generate key pairs. Default filtering returns only RSA_2048 certificates. To return other certificate types, provide the desired type signatures in a comma-separated list. For example, "keyTypes": ["RSA_2048,RSA_4096"] returns both RSA_2048 and RSA_4096 certificates.
    */
  var keyTypes: js.UndefOr[KeyAlgorithmList] = js.native
  /**
    * Specify one or more KeyUsage extension values.
    */
  var keyUsage: js.UndefOr[KeyUsageFilterList] = js.native
}

object Filters {
  @scala.inline
  def apply(): Filters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filters]
  }
  @scala.inline
  implicit class FiltersOps[Self <: Filters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtendedKeyUsage(value: ExtendedKeyUsageFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedKeyUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtendedKeyUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extendedKeyUsage")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyTypes(value: KeyAlgorithmList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyUsage(value: KeyUsageFilterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUsage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyUsage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyUsage")(js.undefined)
        ret
    }
  }
  
}

