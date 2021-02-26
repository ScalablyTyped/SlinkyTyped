package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * StaticContentListItem...
  */
@js.native
trait IStaticContentListItem extends StObject {
  
  /**
    * Relative path to the content file. The URL is static.
    * In Qlik Sense Enterprise, content files located:
    *
    * - in the /content/<content library name>/ folder are part of a global content library.
    * - in the /appcontent/ folder are part of the app specific library.
    *
    * The content files are never embedded in the qvf file.
    * In Qlik Sense Desktop, content files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrl: String = js.native
  
  /**
    * Relative path to the content file. The URL is static.
    * In Qlik Sense Enterprise, content files located:
    *
    * - in the /content/<content library name>/ folder are part of a global content library.
    * - in the /appcontent/ folder are part of the app specific library.
    *
    * The content files are never embedded in the qvf file.
    * In Qlik Sense Desktop, content files located:
    *
    * - in the /content/default/ folder are outside the qvf file.
    * - in the /media/ folder are embedded in the qvf file.
    */
  var qUrlDef: String = js.native
}
object IStaticContentListItem {
  
  @scala.inline
  def apply(qUrl: String, qUrlDef: String): IStaticContentListItem = {
    val __obj = js.Dynamic.literal(qUrl = qUrl.asInstanceOf[js.Any], qUrlDef = qUrlDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticContentListItem]
  }
  
  @scala.inline
  implicit class IStaticContentListItemMutableBuilder[Self <: IStaticContentListItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQUrl(value: String): Self = StObject.set(x, "qUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUrlDef(value: String): Self = StObject.set(x, "qUrlDef", value.asInstanceOf[js.Any])
  }
}
