package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Custom authenticator credentials.
  */
@js.native
trait SchemaMetadataCredentialsFromPlugin extends js.Object {
  
  /**
    * Plugin name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A text proto that conforms to a Struct type definition interpreted by the
    * plugin.
    */
  var structConfig: js.UndefOr[String] = js.native
}
object SchemaMetadataCredentialsFromPlugin {
  
  @scala.inline
  def apply(): SchemaMetadataCredentialsFromPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetadataCredentialsFromPlugin]
  }
  
  @scala.inline
  implicit class SchemaMetadataCredentialsFromPluginOps[Self <: SchemaMetadataCredentialsFromPlugin] (val x: Self) extends AnyVal {
    
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
    def setStructConfig(value: String): Self = this.set("structConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructConfig: Self = this.set("structConfig", js.undefined)
  }
}
