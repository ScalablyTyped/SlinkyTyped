package typingsSlinky.googleapis.fusiontablesV1Mod.fusiontablesV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceQuerySqlget extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Should column names be included (in the first row)?. Default is true.
    */
  var hdrs: js.UndefOr[Boolean] = js.native
  
  /**
    * An SQL SELECT/SHOW/DESCRIBE statement.
    */
  var sql: js.UndefOr[String] = js.native
  
  /**
    * Should typed values be returned in the (JSON) response -- numbers for
    * numeric values and parsed geometries for KML values? Default is true.
    */
  var typed: js.UndefOr[Boolean] = js.native
}
object ParamsResourceQuerySqlget {
  
  @scala.inline
  def apply(): ParamsResourceQuerySqlget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuerySqlget]
  }
  
  @scala.inline
  implicit class ParamsResourceQuerySqlgetMutableBuilder[Self <: ParamsResourceQuerySqlget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHdrs(value: Boolean): Self = StObject.set(x, "hdrs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHdrsUndefined: Self = StObject.set(x, "hdrs", js.undefined)
    
    @scala.inline
    def setSql(value: String): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlUndefined: Self = StObject.set(x, "sql", js.undefined)
    
    @scala.inline
    def setTyped(value: Boolean): Self = StObject.set(x, "typed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypedUndefined: Self = StObject.set(x, "typed", js.undefined)
  }
}
