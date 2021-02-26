package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Symbol3D
import typingsSlinky.arcgisJsApi.esri.Symbol3DConstructor
import typingsSlinky.arcgisJsApi.esri.Symbol3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symbol3DMod extends Shortcut {
  
  @JSImport("esri/symbols/Symbol3D", JSImport.Namespace)
  @js.native
  val ^ : Symbol3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/Symbol3D", JSImport.Namespace)
  @js.native
  /**
    * Symbol3D is the base class for all 3D symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html)
    */
  class Class () extends Symbol3D {
    def this(properties: Symbol3DProperties) = this()
  }
  
  type _To = Symbol3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `symbol3DMod.foo` */
  override def _to: Symbol3DConstructor = ^
}
