package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.Presentation
import typingsSlinky.arcgisJsApi.esri.PresentationConstructor
import typingsSlinky.arcgisJsApi.esri.PresentationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object presentationMod extends Shortcut {
  
  @JSImport("esri/webscene/Presentation", JSImport.Namespace)
  @js.native
  val ^ : PresentationConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/webscene/Presentation", JSImport.Namespace)
  @js.native
  class Class () extends Presentation {
    def this(properties: PresentationProperties) = this()
  }
  
  type _To = PresentationConstructor
  
  /* This means you don't have to write `^`, but can instead just say `presentationMod.foo` */
  override def _to: PresentationConstructor = ^
}
