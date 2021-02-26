package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPutUser[T] extends Generic {
  
  var body: T = js.native
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.native
  
  var username: String = js.native
}
object SecurityPutUser {
  
  @scala.inline
  def apply[T](body: T, username: String): SecurityPutUser[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityPutUser[T]]
  }
  
  @scala.inline
  implicit class SecurityPutUserMutableBuilder[Self <: SecurityPutUser[_], T] (val x: Self with SecurityPutUser[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = StObject.set(x, "refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshUndefined: Self = StObject.set(x, "refresh", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
