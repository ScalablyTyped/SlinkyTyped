package typingsSlinky.awsSdk.qldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueHolder extends js.Object {
  /**
    * An Amazon Ion binary value contained in a ValueHolder structure. 
    */
  var IonBinary: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.IonBinary] = js.native
  /**
    * An Amazon Ion plaintext value contained in a ValueHolder structure. 
    */
  var IonText: js.UndefOr[typingsSlinky.awsSdk.qldbsessionMod.IonText] = js.native
}

object ValueHolder {
  @scala.inline
  def apply(): ValueHolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueHolder]
  }
  @scala.inline
  implicit class ValueHolderOps[Self <: ValueHolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIonBinaryUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IonBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIonBinary(value: IonBinary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IonBinary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIonBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IonBinary")(js.undefined)
        ret
    }
    @scala.inline
    def withIonText(value: IonText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IonText")(js.undefined)
        ret
    }
  }
  
}

