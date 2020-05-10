package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPosDataProviders extends js.Object {
  /**
    * Country code.
    */
  var country: js.UndefOr[String] = js.native
  /**
    * A list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProvidersPosDataProvider]] = js.native
}

object SchemaPosDataProviders {
  @scala.inline
  def apply(): SchemaPosDataProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosDataProviders]
  }
  @scala.inline
  implicit class SchemaPosDataProvidersOps[Self <: SchemaPosDataProviders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPosDataProviders(value: js.Array[SchemaPosDataProvidersPosDataProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosDataProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posDataProviders")(js.undefined)
        ret
    }
  }
  
}

