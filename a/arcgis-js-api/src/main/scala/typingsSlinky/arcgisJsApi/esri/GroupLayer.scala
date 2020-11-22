package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.exclusive
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.group
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.independent
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.inherited
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupLayer
  extends Layer
     with LayersMixin
     with TablesMixin
     with PortalLayer
     with BlendLayer {
  
  /**
    * Loads all the externally loadable resources associated with the group layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#loadAll)
    */
  def loadAll(): js.Promise[GroupLayer] = js.native
  
  @JSName("type")
  val type_GroupLayer: group = js.native
  
  /**
    * Indicates how to manage the visibility of the children layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: independent | inherited | exclusive = js.native
}
