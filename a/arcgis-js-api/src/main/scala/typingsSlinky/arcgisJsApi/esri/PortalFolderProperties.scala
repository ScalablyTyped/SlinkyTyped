package typingsSlinky.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalFolderProperties extends StObject {
  
  /**
    * The date the folder was created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#created)
    */
  var created: js.UndefOr[DateProperties] = js.native
  
  /**
    * The unique id of the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#id)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The portal associated with the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#portal)
    */
  var portal: js.UndefOr[PortalProperties] = js.native
  
  /**
    * The title of the folder.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalFolder.html#title)
    */
  var title: js.UndefOr[String] = js.native
}
object PortalFolderProperties {
  
  @scala.inline
  def apply(): PortalFolderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalFolderProperties]
  }
  
  @scala.inline
  implicit class PortalFolderPropertiesMutableBuilder[Self <: PortalFolderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: DateProperties): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDate(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
