package typingsSlinky.babelTypes.indexTs37Mod

import typingsSlinky.babelTypes.babelTypesStrings.ObjectMethod
import typingsSlinky.babelTypes.babelTypesStrings.ObjectProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeIndexer
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeInternalSlot
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeSpreadProperty
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.init
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectMethod_
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectProperty_
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeInternalSlot_
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeCallProperty_
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeIndexer_
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeProperty_
  - typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeSpreadProperty_
*/
trait UserWhitespacable extends _Node
object UserWhitespacable {
  
  @scala.inline
  def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    generator: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    kind: method | get | set,
    params: js.Array[Identifier_ | Pattern | RestElement_ | TSParameterProperty_],
    `type`: ObjectMethod
  ): typingsSlinky.babelTypes.indexTs37Mod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectMethod_]
  }
  
  @scala.inline
  def ObjectProperty_(
    computed: Boolean,
    key: Expression | Identifier_ | StringLiteral_ | NumericLiteral_,
    shorthand: Boolean,
    `type`: ObjectProperty,
    value: Expression | PatternLike
  ): typingsSlinky.babelTypes.indexTs37Mod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectProperty_]
  }
  
  @scala.inline
  def ObjectTypeCallProperty_(static: Boolean, `type`: ObjectTypeCallProperty, value: FlowType): typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeCallProperty_]
  }
  
  @scala.inline
  def ObjectTypeIndexer_(key: FlowType, static: Boolean, `type`: ObjectTypeIndexer, value: FlowType): typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeIndexer_]
  }
  
  @scala.inline
  def ObjectTypeInternalSlot_(
    id: Identifier_,
    method: Boolean,
    optional: Boolean,
    static: Boolean,
    `type`: ObjectTypeInternalSlot,
    value: FlowType
  ): typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeInternalSlot_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeInternalSlot_]
  }
  
  @scala.inline
  def ObjectTypeProperty_(
    key: Identifier_ | StringLiteral_,
    kind: init | get | set,
    optional: Boolean,
    proto: Boolean,
    static: Boolean,
    `type`: ObjectTypeProperty,
    value: FlowType
  ): typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], proto = proto.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeProperty_]
  }
  
  @scala.inline
  def ObjectTypeSpreadProperty_(argument: FlowType, `type`: ObjectTypeSpreadProperty): typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeSpreadProperty_ = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.indexTs37Mod.ObjectTypeSpreadProperty_]
  }
}
