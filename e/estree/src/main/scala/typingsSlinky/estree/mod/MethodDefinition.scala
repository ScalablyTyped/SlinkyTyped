package typingsSlinky.estree.mod

import typingsSlinky.estree.estreeStrings.constructor
import typingsSlinky.estree.estreeStrings.get
import typingsSlinky.estree.estreeStrings.method
import typingsSlinky.estree.estreeStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodDefinition
  extends BaseNode
     with Node {
  
  var computed: Boolean = js.native
  
  var key: Expression = js.native
  
  var kind: constructor | method | get | set = js.native
  
  var static: Boolean = js.native
  
  @JSName("type")
  var type_MethodDefinition: typingsSlinky.estree.estreeStrings.MethodDefinition = js.native
  
  var value: FunctionExpression = js.native
}
object MethodDefinition {
  
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typingsSlinky.estree.estreeStrings.MethodDefinition,
    value: FunctionExpression
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDefinition]
  }
  
  @scala.inline
  implicit class MethodDefinitionMutableBuilder[Self <: MethodDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Expression): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: constructor | method | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typingsSlinky.estree.estreeStrings.MethodDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FunctionExpression): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
