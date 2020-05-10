package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttackProperty extends js.Object {
  /**
    * The type of distributed denial of service (DDoS) event that was observed. NETWORK indicates layer 3 and layer 4 events and APPLICATION indicates layer 7 events.
    */
  var AttackLayer: js.UndefOr[typingsSlinky.awsSdk.shieldMod.AttackLayer] = js.native
  /**
    * Defines the DDoS attack property information that is provided. The WORDPRESS_PINGBACK_REFLECTOR and WORDPRESS_PINGBACK_SOURCE values are valid only for WordPress reflective pingback DDoS attacks.
    */
  var AttackPropertyIdentifier: js.UndefOr[typingsSlinky.awsSdk.shieldMod.AttackPropertyIdentifier] = js.native
  /**
    * The array of Contributor objects that includes the top five contributors to an attack. 
    */
  var TopContributors: js.UndefOr[typingsSlinky.awsSdk.shieldMod.TopContributors] = js.native
  /**
    * The total contributions made to this attack by all contributors, not just the five listed in the TopContributors list.
    */
  var Total: js.UndefOr[Long] = js.native
  /**
    * The unit of the Value of the contributions.
    */
  var Unit: js.UndefOr[typingsSlinky.awsSdk.shieldMod.Unit] = js.native
}

object AttackProperty {
  @scala.inline
  def apply(): AttackProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttackProperty]
  }
  @scala.inline
  implicit class AttackPropertyOps[Self <: AttackProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttackLayer(value: AttackLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttackLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withAttackPropertyIdentifier(value: AttackPropertyIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackPropertyIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttackPropertyIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttackPropertyIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withTopContributors(value: TopContributors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopContributors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopContributors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopContributors")(js.undefined)
        ret
    }
    @scala.inline
    def withTotal(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Total")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unit")(js.undefined)
        ret
    }
  }
  
}

