package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Mobile application targeting settings.
  */
@js.native
trait SchemaMobileApplicationTargeting extends js.Object {
  /**
    * Publisher owned apps to be targeted or excluded by the publisher to
    * display the ads in.
    */
  var firstPartyTargeting: js.UndefOr[SchemaFirstPartyMobileApplicationTargeting] = js.native
}

object SchemaMobileApplicationTargeting {
  @scala.inline
  def apply(): SchemaMobileApplicationTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMobileApplicationTargeting]
  }
  @scala.inline
  implicit class SchemaMobileApplicationTargetingOps[Self <: SchemaMobileApplicationTargeting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstPartyTargeting(value: SchemaFirstPartyMobileApplicationTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstPartyTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyTargeting")(js.undefined)
        ret
    }
  }
  
}

