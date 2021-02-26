package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.LineCallout3D
import typingsSlinky.arcgisJsApi.esri.LineCallout3DConstructor
import typingsSlinky.arcgisJsApi.esri.LineCallout3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineCallout3DMod extends Shortcut {
  
  @JSImport("esri/symbols/callouts/LineCallout3D", JSImport.Namespace)
  @js.native
  val ^ : LineCallout3DConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/callouts/LineCallout3D", JSImport.Namespace)
  @js.native
  /**
    * This type of callout displays a line to connect a symbol or a label with its actual location in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html)
    */
  class Class () extends LineCallout3D {
    def this(properties: LineCallout3DProperties) = this()
  }
  
  type _To = LineCallout3DConstructor
  
  /* This means you don't have to write `^`, but can instead just say `lineCallout3DMod.foo` */
  override def _to: LineCallout3DConstructor = ^
}
