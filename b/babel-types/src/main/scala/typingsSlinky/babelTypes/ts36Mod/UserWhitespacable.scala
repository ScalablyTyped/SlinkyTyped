package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.ObjectMethod
import typingsSlinky.babelTypes.babelTypesStrings.ObjectProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeCallProperty
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeIndexer
import typingsSlinky.babelTypes.babelTypesStrings.ObjectTypeProperty
import typingsSlinky.babelTypes.babelTypesStrings.get
import typingsSlinky.babelTypes.babelTypesStrings.method
import typingsSlinky.babelTypes.babelTypesStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.ObjectMethod_
  - typingsSlinky.babelTypes.ts36Mod.ObjectProperty_
  - typingsSlinky.babelTypes.ts36Mod.ObjectTypeCallProperty_
  - typingsSlinky.babelTypes.ts36Mod.ObjectTypeIndexer_
  - typingsSlinky.babelTypes.ts36Mod.ObjectTypeProperty_
*/
trait UserWhitespacable extends StObject
object UserWhitespacable {
  
  @scala.inline
  def ObjectMethod_(
    async: Boolean,
    body: BlockStatement_,
    computed: Boolean,
    end: Double,
    generator: Boolean,
    id: Identifier_,
    key: Expression,
    kind: get | set | method,
    loc: SourceLocation,
    params: js.Array[LVal],
    shorthand: Boolean,
    start: Double,
    `type`: ObjectMethod,
    value: Expression
  ): typingsSlinky.babelTypes.ts36Mod.ObjectMethod_ = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ObjectMethod_]
  }
  
  @scala.inline
  def ObjectProperty_(
    computed: Boolean,
    end: Double,
    key: Expression,
    loc: SourceLocation,
    shorthand: Boolean,
    start: Double,
    `type`: ObjectProperty,
    value: Expression
  ): typingsSlinky.babelTypes.ts36Mod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ObjectProperty_]
  }
  
  @scala.inline
  def ObjectTypeCallProperty_(
    end: Double,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeCallProperty,
    value: FlowTypeAnnotation
  ): typingsSlinky.babelTypes.ts36Mod.ObjectTypeCallProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ObjectTypeCallProperty_]
  }
  
  @scala.inline
  def ObjectTypeIndexer_(
    end: Double,
    id: Expression,
    key: FlowTypeAnnotation,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeIndexer,
    value: FlowTypeAnnotation
  ): typingsSlinky.babelTypes.ts36Mod.ObjectTypeIndexer_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ObjectTypeIndexer_]
  }
  
  @scala.inline
  def ObjectTypeProperty_(
    end: Double,
    key: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: ObjectTypeProperty,
    value: FlowTypeAnnotation
  ): typingsSlinky.babelTypes.ts36Mod.ObjectTypeProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.ts36Mod.ObjectTypeProperty_]
  }
}
