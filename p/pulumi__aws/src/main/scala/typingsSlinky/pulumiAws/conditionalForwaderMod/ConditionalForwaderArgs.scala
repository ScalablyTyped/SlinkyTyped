package typingsSlinky.pulumiAws.conditionalForwaderMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalForwaderArgs extends js.Object {
  /**
    * The id of directory.
    */
  val directoryId: Input[String] = js.native
  /**
    * A list of forwarder IP addresses.
    */
  val dnsIps: Input[js.Array[Input[String]]] = js.native
  /**
    * The fully qualified domain name of the remote domain for which forwarders will be used.
    */
  val remoteDomainName: Input[String] = js.native
}

object ConditionalForwaderArgs {
  @scala.inline
  def apply(
    directoryId: Input[String],
    dnsIps: Input[js.Array[Input[String]]],
    remoteDomainName: Input[String]
  ): ConditionalForwaderArgs = {
    val __obj = js.Dynamic.literal(directoryId = directoryId.asInstanceOf[js.Any], dnsIps = dnsIps.asInstanceOf[js.Any], remoteDomainName = remoteDomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalForwaderArgs]
  }
  @scala.inline
  implicit class ConditionalForwaderArgsOps[Self <: ConditionalForwaderArgs] (val x: Self) extends AnyVal {
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
    def withDnsIps(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsIps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteDomainName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteDomainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

