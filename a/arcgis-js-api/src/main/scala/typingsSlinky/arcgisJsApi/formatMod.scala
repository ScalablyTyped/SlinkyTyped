package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Format
import typingsSlinky.arcgisJsApi.esri.FormatConstructor
import typingsSlinky.arcgisJsApi.esri.FormatProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatMod extends Shortcut {
  
  @JSImport("esri/widgets/CoordinateConversion/support/Format", JSImport.Namespace)
  @js.native
  val ^ : FormatConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/CoordinateConversion/support/Format", JSImport.Namespace)
  @js.native
  class Class () extends Format {
    def this(properties: FormatProperties) = this()
  }
  
  type _To = FormatConstructor
  
  /* This means you don't have to write `^`, but can instead just say `formatMod.foo` */
  override def _to: FormatConstructor = ^
}
