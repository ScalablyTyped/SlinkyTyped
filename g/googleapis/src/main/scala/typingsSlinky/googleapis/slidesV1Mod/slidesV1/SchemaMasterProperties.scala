package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of Page that are only relevant for pages with page_type
  * MASTER.
  */
@js.native
trait SchemaMasterProperties extends js.Object {
  
  /**
    * The human-readable name of the master.
    */
  var displayName: js.UndefOr[String] = js.native
}
object SchemaMasterProperties {
  
  @scala.inline
  def apply(): SchemaMasterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMasterProperties]
  }
  
  @scala.inline
  implicit class SchemaMasterPropertiesOps[Self <: SchemaMasterProperties] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
  }
}
