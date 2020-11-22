package typingsSlinky.realm.Realm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This describes the local app, sent to the server when a user authenticates.
  */
@js.native
trait LocalAppConfiguration extends js.Object {
  
  /**
    * The name / id of the local app.
    * Note: This should be the name or a bundle id of your app, not the MongoDB Realm app.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The version of the local app.
    */
  var version: js.UndefOr[String] = js.native
}
object LocalAppConfiguration {
  
  @scala.inline
  def apply(): LocalAppConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalAppConfiguration]
  }
  
  @scala.inline
  implicit class LocalAppConfigurationOps[Self <: LocalAppConfiguration] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
