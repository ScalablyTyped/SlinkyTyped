package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s nickname.
  */
@js.native
trait SchemaNickname extends js.Object {
  
  /**
    * Metadata about the nickname.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  
  /**
    * The type of the nickname.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * The nickname.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaNickname {
  
  @scala.inline
  def apply(): SchemaNickname = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNickname]
  }
  
  @scala.inline
  implicit class SchemaNicknameOps[Self <: SchemaNickname] (val x: Self) extends AnyVal {
    
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
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
