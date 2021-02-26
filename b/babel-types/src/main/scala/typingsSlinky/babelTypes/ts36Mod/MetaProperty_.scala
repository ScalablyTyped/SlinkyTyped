package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.MetaProperty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetaProperty_
  extends Node
     with Expression {
  
  var meta: Identifier_ = js.native
  
  var property: Identifier_ = js.native
  
  @JSName("type")
  var type_MetaProperty_ : MetaProperty = js.native
}
object MetaProperty_ {
  
  @scala.inline
  def apply(
    end: Double,
    loc: SourceLocation,
    meta: Identifier_,
    property: Identifier_,
    start: Double,
    `type`: MetaProperty
  ): MetaProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaProperty_]
  }
  
  @scala.inline
  implicit class MetaProperty_MutableBuilder[Self <: MetaProperty_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: Identifier_): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Identifier_): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MetaProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
