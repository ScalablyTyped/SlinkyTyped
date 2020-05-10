package typingsSlinky.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contributor extends js.Object {
  /**
    * The name of the contributor. This is dependent on the AttackPropertyIdentifier. For example, if the AttackPropertyIdentifier is SOURCE_COUNTRY, the Name could be United States.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The contribution of this contributor expressed in Protection units. For example 10,000.
    */
  var Value: js.UndefOr[Long] = js.native
}

object Contributor {
  @scala.inline
  def apply(): Contributor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contributor]
  }
  @scala.inline
  implicit class ContributorOps[Self <: Contributor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(js.undefined)
        ret
    }
  }
  
}

