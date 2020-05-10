package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpProperties extends js.Object {
  /**
    * The name of an HTTP namespace.
    */
  var HttpName: js.UndefOr[NamespaceName] = js.native
}

object HttpProperties {
  @scala.inline
  def apply(): HttpProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProperties]
  }
  @scala.inline
  implicit class HttpPropertiesOps[Self <: HttpProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpName(value: NamespaceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpName")(js.undefined)
        ret
    }
  }
  
}

