package typingsSlinky.nodeHueApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BridgeApi = typingsSlinky.nodeHueApi.mod.HueApi
  
  type api = typingsSlinky.nodeHueApi.mod.HueApi
  
  @scala.inline
  def nupnpSearch(): js.Promise[js.Array[typingsSlinky.nodeHueApi.mod.IUpnpSearchResultItem]] = typingsSlinky.nodeHueApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("nupnpSearch")().asInstanceOf[js.Promise[js.Array[typingsSlinky.nodeHueApi.mod.IUpnpSearchResultItem]]]
  
  @scala.inline
  def upnpSearch(timeout: scala.Double): js.Array[typingsSlinky.nodeHueApi.mod.IUpnpSearchResultItem] = typingsSlinky.nodeHueApi.mod.^.asInstanceOf[js.Dynamic].applyDynamic("upnpSearch")(timeout.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsSlinky.nodeHueApi.mod.IUpnpSearchResultItem]]
}
