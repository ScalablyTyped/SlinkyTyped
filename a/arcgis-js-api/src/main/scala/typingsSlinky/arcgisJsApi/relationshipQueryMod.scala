package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.RelationshipQuery
import typingsSlinky.arcgisJsApi.esri.RelationshipQueryConstructor
import typingsSlinky.arcgisJsApi.esri.RelationshipQueryProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationshipQueryMod extends Shortcut {
  
  @JSImport("esri/tasks/support/RelationshipQuery", JSImport.Namespace)
  @js.native
  val ^ : RelationshipQueryConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/tasks/support/RelationshipQuery", JSImport.Namespace)
  @js.native
  class Class () extends RelationshipQuery {
    def this(properties: RelationshipQueryProperties) = this()
  }
  
  type _To = RelationshipQueryConstructor
  
  /* This means you don't have to write `^`, but can instead just say `relationshipQueryMod.foo` */
  override def _to: RelationshipQueryConstructor = ^
}
