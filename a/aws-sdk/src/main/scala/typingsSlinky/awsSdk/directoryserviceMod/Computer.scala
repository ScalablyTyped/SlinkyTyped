package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Computer extends js.Object {
  /**
    * An array of Attribute objects containing the LDAP attributes that belong to the computer account.
    */
  var ComputerAttributes: js.UndefOr[Attributes] = js.native
  /**
    * The identifier of the computer.
    */
  var ComputerId: js.UndefOr[SID] = js.native
  /**
    * The computer name.
    */
  var ComputerName: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.ComputerName] = js.native
}

object Computer {
  @scala.inline
  def apply(): Computer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Computer]
  }
  @scala.inline
  implicit class ComputerOps[Self <: Computer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputerAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputerAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withComputerId(value: SID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerId")(js.undefined)
        ret
    }
    @scala.inline
    def withComputerName(value: ComputerName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComputerName")(js.undefined)
        ret
    }
  }
  
}

