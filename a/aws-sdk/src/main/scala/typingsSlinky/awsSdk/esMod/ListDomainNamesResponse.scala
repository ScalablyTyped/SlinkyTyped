package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainNamesResponse extends js.Object {
  /**
    * List of Elasticsearch domain names.
    */
  var DomainNames: js.UndefOr[DomainInfoList] = js.native
}

object ListDomainNamesResponse {
  @scala.inline
  def apply(): ListDomainNamesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainNamesResponse]
  }
  @scala.inline
  implicit class ListDomainNamesResponseOps[Self <: ListDomainNamesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainNames(value: DomainInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainNames")(js.undefined)
        ret
    }
  }
  
}

