package typingsSlinky.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about a renametype event.
  */
@js.native
trait SchemaRename extends js.Object {
  
  /**
    * The new title.
    */
  var newTitle: js.UndefOr[String] = js.native
  
  /**
    * The old title.
    */
  var oldTitle: js.UndefOr[String] = js.native
}
object SchemaRename {
  
  @scala.inline
  def apply(): SchemaRename = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRename]
  }
  
  @scala.inline
  implicit class SchemaRenameOps[Self <: SchemaRename] (val x: Self) extends AnyVal {
    
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
    def setNewTitle(value: String): Self = this.set("newTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewTitle: Self = this.set("newTitle", js.undefined)
    
    @scala.inline
    def setOldTitle(value: String): Self = this.set("oldTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldTitle: Self = this.set("oldTitle", js.undefined)
  }
}
