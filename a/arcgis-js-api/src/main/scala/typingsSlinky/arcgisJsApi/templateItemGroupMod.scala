package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.TemplateItemGroup
import typingsSlinky.arcgisJsApi.esri.TemplateItemGroupConstructor
import typingsSlinky.arcgisJsApi.esri.TemplateItemGroupProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object templateItemGroupMod extends Shortcut {
  
  @JSImport("esri/widgets/FeatureTemplates/TemplateItemGroup", JSImport.Namespace)
  @js.native
  val ^ : TemplateItemGroupConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/FeatureTemplates/TemplateItemGroup", JSImport.Namespace)
  @js.native
  class Class () extends TemplateItemGroup {
    def this(properties: TemplateItemGroupProperties) = this()
  }
  
  type _To = TemplateItemGroupConstructor
  
  /* This means you don't have to write `^`, but can instead just say `templateItemGroupMod.foo` */
  override def _to: TemplateItemGroupConstructor = ^
}
