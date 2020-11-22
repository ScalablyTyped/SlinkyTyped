package typingsSlinky.elasticElasticsearch.requestParamsMod

import typingsSlinky.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityChangePassword[T] extends Generic {
  
  var body: T = js.native
  
  var refresh: js.UndefOr[wait_for | Boolean] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object SecurityChangePassword {
  
  @scala.inline
  def apply[T](body: T): SecurityChangePassword[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityChangePassword[T]]
  }
  
  @scala.inline
  implicit class SecurityChangePasswordOps[Self <: SecurityChangePassword[_], T] (val x: Self with SecurityChangePassword[T]) extends AnyVal {
    
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: wait_for | Boolean): Self = this.set("refresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
