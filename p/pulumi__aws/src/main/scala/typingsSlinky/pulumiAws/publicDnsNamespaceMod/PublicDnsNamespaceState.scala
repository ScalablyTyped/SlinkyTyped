package typingsSlinky.pulumiAws.publicDnsNamespaceMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicDnsNamespaceState extends js.Object {
  /**
    * The ARN that Amazon Route 53 assigns to the namespace when you create it.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
    */
  val hostedZone: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the namespace.
    */
  val name: js.UndefOr[Input[String]] = js.native
}

object PublicDnsNamespaceState {
  @scala.inline
  def apply(): PublicDnsNamespaceState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicDnsNamespaceState]
  }
  @scala.inline
  implicit class PublicDnsNamespaceStateOps[Self <: PublicDnsNamespaceState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withHostedZone(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostedZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostedZone")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

