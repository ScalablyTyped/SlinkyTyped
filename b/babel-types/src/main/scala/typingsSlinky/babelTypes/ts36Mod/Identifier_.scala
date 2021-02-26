package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identifier_
  extends Node
     with Expression
     with LVal
     with TSEntityName {
  
  var name: String = js.native
  
  var typeAnnotation: js.UndefOr[TypeAnnotation_] = js.native
  
  @JSName("type")
  var type_Identifier_ : Identifier = js.native
}
object Identifier_ {
  
  @scala.inline
  def apply(end: Double, loc: SourceLocation, name: String, start: Double, `type`: Identifier): Identifier_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier_]
  }
  
  @scala.inline
  implicit class Identifier_MutableBuilder[Self <: Identifier_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Identifier): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation_): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
