package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.RelationParameters
import typingsSlinky.arcgisJsApi.esri.RelationParametersConstructor
import typingsSlinky.arcgisJsApi.esri.RelationParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationParametersMod extends Shortcut {
  
  @JSImport("esri/tasks/support/RelationParameters", JSImport.Namespace)
  @js.native
  val ^ : RelationParametersConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/RelationParameters", JSImport.Namespace)
  @js.native
  class Class () extends RelationParameters {
    def this(properties: RelationParametersProperties) = this()
  }
  
  type _To = RelationParametersConstructor
  
  /* This means you don't have to write `^`, but can instead just say `relationParametersMod.foo` */
  override def _to: RelationParametersConstructor = ^
}
