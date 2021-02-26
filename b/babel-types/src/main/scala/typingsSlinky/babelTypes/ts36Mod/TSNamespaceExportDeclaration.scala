package typingsSlinky.babelTypes.ts36Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSNamespaceExportDeclaration
  extends Node
     with Statement {
  
  var id: Identifier_ = js.native
  
  @JSName("type")
  var type_TSNamespaceExportDeclaration: typingsSlinky.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration = js.native
}
object TSNamespaceExportDeclaration {
  
  @JSImport("babel-types/ts3.6", "TSNamespaceExportDeclaration")
  @js.native
  def apply(id: Identifier_): TSNamespaceExportDeclaration = js.native
  
  @scala.inline
  implicit class TSNamespaceExportDeclarationMutableBuilder[Self <: TSNamespaceExportDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Identifier_): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.babelTypes.babelTypesStrings.TSNamespaceExportDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
