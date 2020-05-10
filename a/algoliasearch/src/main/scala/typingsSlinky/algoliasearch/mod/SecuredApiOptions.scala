package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the options used when generating new api keys
  *
  * @see https://www.algolia.com/doc/api-reference/api-methods/generate-secured-api-key/
  */
@js.native
trait SecuredApiOptions extends QueryParameters {
  /**
    * Restricts the key to a list of index names allowed for the secured API key
    */
  var restrictIndices: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Defines the expiration date of the API key
    */
  var validUntil: js.UndefOr[Double] = js.native
}

object SecuredApiOptions {
  @scala.inline
  def apply(): SecuredApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecuredApiOptions]
  }
  @scala.inline
  implicit class SecuredApiOptionsOps[Self <: SecuredApiOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestrictIndices(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withValidUntil(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntil")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validUntil")(js.undefined)
        ret
    }
  }
  
}

