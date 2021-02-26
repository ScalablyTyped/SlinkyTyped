package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.InitialViewProperties
import typingsSlinky.arcgisJsApi.esri.InitialViewPropertiesConstructor
import typingsSlinky.arcgisJsApi.esri.InitialViewPropertiesProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initialViewPropertiesMod extends Shortcut {
  
  @JSImport("esri/webmap/InitialViewProperties", JSImport.Namespace)
  @js.native
  val ^ : InitialViewPropertiesConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webmap/InitialViewProperties", JSImport.Namespace)
  @js.native
  class Class () extends InitialViewProperties {
    def this(properties: InitialViewPropertiesProperties) = this()
  }
  
  type _To = InitialViewPropertiesConstructor
  
  /* This means you don't have to write `^`, but can instead just say `initialViewPropertiesMod.foo` */
  override def _to: InitialViewPropertiesConstructor = ^
}
