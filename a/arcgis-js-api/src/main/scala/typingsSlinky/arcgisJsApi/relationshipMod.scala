package typingsSlinky.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.arcgisJsApi.esri.RelationshipConstructor
import typingsSlinky.arcgisJsApi.esri.RelationshipProperties
import typingsSlinky.arcgisJsApi.esri.Relationship_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object relationshipMod extends Shortcut {
  
  @JSImport("esri/layers/support/Relationship", JSImport.Namespace)
  @js.native
  val ^ : RelationshipConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/Relationship", JSImport.Namespace)
  @js.native
  class Class () extends Relationship_ {
    def this(properties: RelationshipProperties) = this()
  }
  
  type _To = RelationshipConstructor
  
  /* This means you don't have to write `^`, but can instead just say `relationshipMod.foo` */
  override def _to: RelationshipConstructor = ^
}
