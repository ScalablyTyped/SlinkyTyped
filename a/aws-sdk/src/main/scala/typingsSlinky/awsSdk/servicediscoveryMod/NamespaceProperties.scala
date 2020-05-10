package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamespaceProperties extends js.Object {
  /**
    * A complex type that contains the ID for the Route 53 hosted zone that AWS Cloud Map creates when you create a namespace.
    */
  var DnsProperties: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.DnsProperties] = js.native
  /**
    * A complex type that contains the name of an HTTP namespace.
    */
  var HttpProperties: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.HttpProperties] = js.native
}

object NamespaceProperties {
  @scala.inline
  def apply(): NamespaceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceProperties]
  }
  @scala.inline
  implicit class NamespacePropertiesOps[Self <: NamespaceProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsProperties(value: DnsProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpProperties(value: HttpProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpProperties")(js.undefined)
        ret
    }
  }
  
}

