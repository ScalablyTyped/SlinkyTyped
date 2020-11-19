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
     with PortalLayer {
  
  /**
    * Loads all the externally loadable resources associated with the group layer. For the group layer this will load all the layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#loadAll)
    *
    *
    */
  def loadAll(): js.Promise[GroupLayer] = js.native
  
  @JSName("type")
  val type_GroupLayer: group = js.native
  
  /**
    * Indicates how to manage the visibility of the children layers. Possible values are described in the table below.
    *
    * Value | Description
    * ------|------------
    * independent | Each child layer manages its visibility independent from other layers.
    * inherited | Each child layer's visibility matches the [GroupLayer’s visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visible).
    * exclusive | Only one child layer is visible at a time.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: independent | inherited | exclusive = js.native
}
