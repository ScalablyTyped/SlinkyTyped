package typingsSlinky.astTypes.namedTypesMod.namedTypes

import typingsSlinky.astTypes.kindsMod.IdentifierKind
import typingsSlinky.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModuleSpecifier extends Node {
  
  var id: js.UndefOr[IdentifierKind | Null] = js.native
  
  var local: js.UndefOr[IdentifierKind | Null] = js.native
  
  var name: js.UndefOr[IdentifierKind | Null] = js.native
}
object ModuleSpecifier {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ModuleSpecifier")
  @js.native
  val ^ : Type[ModuleSpecifier] = js.native
  
  @scala.inline
  implicit class ModuleSpecifierMutableBuilder[Self <: ModuleSpecifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLocal(value: IdentifierKind): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalNull: Self = StObject.set(x, "local", null)
    
    @scala.inline
    def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
    
    @scala.inline
    def setName(value: IdentifierKind): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
