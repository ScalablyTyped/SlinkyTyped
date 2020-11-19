package typingsSlinky.googleapis.v1configurationMod.gamesConfigurationV1configuration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an image configuration resource.
  */
@js.native
trait SchemaImageConfiguration extends js.Object {
  
  /**
    * The image type for the image.
    */
  var imageType: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#imageConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The resource ID of resource which the image belongs to.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * The url for this image.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaImageConfiguration {
  
  @scala.inline
  def apply(): SchemaImageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImageConfiguration]
  }
  
  @scala.inline
  implicit class SchemaImageConfigurationOps[Self <: SchemaImageConfiguration] (val x: Self) extends AnyVal {
    
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
    def setImageType(value: String): Self = this.set("imageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageType: Self = this.set("imageType", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
