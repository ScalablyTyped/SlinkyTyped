package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Portal
import typingsSlinky.arcgisJsApi.esri.PortalConstructor
import typingsSlinky.arcgisJsApi.esri.PortalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object portalMod extends Shortcut {
  
  @JSImport("esri/portal/Portal", JSImport.Namespace)
  @js.native
  val ^ : PortalConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/portal/Portal", JSImport.Namespace)
  @js.native
  /**
    * The Portal class is part of the [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/) that provides a way to build applications that work with content from [ArcGIS Online](https://www.arcgis.com/home/) or an [ArcGIS Enterprise portal](https://enterprise.arcgis.com/en/portal/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html)
    */
  class Class () extends Portal {
    def this(properties: PortalProperties) = this()
  }
  
  type _To = PortalConstructor
  
  /* This means you don't have to write `^`, but can instead just say `portalMod.foo` */
  override def _to: PortalConstructor = ^
}
