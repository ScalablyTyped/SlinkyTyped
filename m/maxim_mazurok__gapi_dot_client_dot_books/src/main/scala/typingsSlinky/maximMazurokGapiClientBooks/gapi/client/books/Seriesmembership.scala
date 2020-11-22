package typingsSlinky.maximMazurokGapiClientBooks.gapi.client.books

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seriesmembership extends js.Object {
  
  /** Resorce type. */
  var kind: js.UndefOr[String] = js.native
  
  var member: js.UndefOr[js.Array[Volume]] = js.native
  
  var nextPageToken: js.UndefOr[String] = js.native
}
object Seriesmembership {
  
  @scala.inline
  def apply(): Seriesmembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seriesmembership]
  }
  
  @scala.inline
  implicit class SeriesmembershipOps[Self <: Seriesmembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setMemberVarargs(value: Volume*): Self = this.set("member", js.Array(value :_*))
    
    @scala.inline
    def setMember(value: js.Array[Volume]): Self = this.set("member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMember: Self = this.set("member", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
