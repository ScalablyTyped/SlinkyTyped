package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.PrintTemplate
import typingsSlinky.arcgisJsApi.esri.PrintTemplateConstructor
import typingsSlinky.arcgisJsApi.esri.PrintTemplateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printTemplateMod extends Shortcut {
  
  @JSImport("esri/tasks/support/PrintTemplate", JSImport.Namespace)
  @js.native
  val ^ : PrintTemplateConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/PrintTemplate", JSImport.Namespace)
  @js.native
  class Class () extends PrintTemplate {
    def this(properties: PrintTemplateProperties) = this()
  }
  
  type _To = PrintTemplateConstructor
  
  /* This means you don't have to write `^`, but can instead just say `printTemplateMod.foo` */
  override def _to: PrintTemplateConstructor = ^
}
