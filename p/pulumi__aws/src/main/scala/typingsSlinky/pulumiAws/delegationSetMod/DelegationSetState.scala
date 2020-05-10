package typingsSlinky.pulumiAws.delegationSetMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelegationSetState extends js.Object {
  /**
    * A list of authoritative name servers for the hosted zone
    * (effectively a list of NS records).
    */
  val nameServers: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * This is a reference name used in Caller Reference
    * (helpful for identifying single delegation set amongst others)
    */
  val referenceName: js.UndefOr[Input[String]] = js.native
}

object DelegationSetState {
  @scala.inline
  def apply(): DelegationSetState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelegationSetState]
  }
  @scala.inline
  implicit class DelegationSetStateOps[Self <: DelegationSetState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNameServers(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameServers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameServers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameServers")(js.undefined)
        ret
    }
    @scala.inline
    def withReferenceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceName")(js.undefined)
        ret
    }
  }
  
}

