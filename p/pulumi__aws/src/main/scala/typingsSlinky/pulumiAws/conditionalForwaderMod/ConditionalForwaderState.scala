package typingsSlinky.pulumiAws.conditionalForwaderMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalForwaderState extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: js.UndefOr[Input[String]] = js.native
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: js.UndefOr[Input[String]] = js.native
}

object ConditionalForwaderState {
  @scala.inline
  def apply(): ConditionalForwaderState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalForwaderState]
  }
  @scala.inline
  implicit class ConditionalForwaderStateOps[Self <: ConditionalForwaderState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirectoryId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directoryId")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsIps(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsIps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsIps")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoteDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoteDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteDomainName")(js.undefined)
        ret
    }
  }
  
}

