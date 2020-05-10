package typingsSlinky.pulumiAws.lbListenerCertificateMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerCertificateState extends js.Object {
  /**
    * The ARN of the certificate to attach to the listener.
    */
  val certificateArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the listener to which to attach the certificate.
    */
  val listenerArn: js.UndefOr[Input[String]] = js.native
}

object ListenerCertificateState {
  @scala.inline
  def apply(): ListenerCertificateState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenerCertificateState]
  }
  @scala.inline
  implicit class ListenerCertificateStateOps[Self <: ListenerCertificateState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCertificateArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateArn")(js.undefined)
        ret
    }
    @scala.inline
    def withListenerArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListenerArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listenerArn")(js.undefined)
        ret
    }
  }
  
}

