package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ImportSpecifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSpecifier_
  extends Node
     with ModuleSpecifier {
  
  var imported: Identifier_ = js.native
  
  var local: Identifier_ = js.native
  
  @JSName("type")
  var type_ImportSpecifier_ : ImportSpecifier = js.native
}
object ImportSpecifier_ {
  
  @scala.inline
  def apply(
    end: Double,
    imported: Identifier_,
    loc: SourceLocation,
    local: Identifier_,
    start: Double,
    `type`: ImportSpecifier
  ): ImportSpecifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportSpecifier_]
  }
  
  @scala.inline
  implicit class ImportSpecifier_MutableBuilder[Self <: ImportSpecifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImported(value: Identifier_): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal(value: Identifier_): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ImportSpecifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
