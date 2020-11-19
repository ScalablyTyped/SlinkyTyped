package typingsSlinky.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppList extends js.Object {
  
  var defaultAppIds: js.UndefOr[js.Array[String]] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[App]] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var selfLink: js.UndefOr[String] = js.native
}
object AppList {
  
  @scala.inline
  def apply(): AppList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppList]
  }
  
  @scala.inline
  implicit class AppListOps[Self <: AppList] (val x: Self) extends AnyVal {
    
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
    def setDefaultAppIdsVarargs(value: String*): Self = this.set("defaultAppIds", js.Array(value :_*))
    
    @scala.inline
    def setDefaultAppIds(value: js.Array[String]): Self = this.set("defaultAppIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAppIds: Self = this.set("defaultAppIds", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: App*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[App]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
  }
}
