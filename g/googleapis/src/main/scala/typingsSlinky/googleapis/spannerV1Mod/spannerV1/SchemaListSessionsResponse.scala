package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for ListSessions.
  */
@js.native
trait SchemaListSessionsResponse extends js.Object {
  
  /**
    * `next_page_token` can be sent in a subsequent ListSessions call to fetch
    * more of the matching sessions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * The list of requested sessions.
    */
  var sessions: js.UndefOr[js.Array[SchemaSession]] = js.native
}
object SchemaListSessionsResponse {
  
  @scala.inline
  def apply(): SchemaListSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSessionsResponse]
  }
  
  @scala.inline
  implicit class SchemaListSessionsResponseOps[Self <: SchemaListSessionsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setSessionsVarargs(value: SchemaSession*): Self = this.set("sessions", js.Array(value :_*))
    
    @scala.inline
    def setSessions(value: js.Array[SchemaSession]): Self = this.set("sessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessions: Self = this.set("sessions", js.undefined)
  }
}
