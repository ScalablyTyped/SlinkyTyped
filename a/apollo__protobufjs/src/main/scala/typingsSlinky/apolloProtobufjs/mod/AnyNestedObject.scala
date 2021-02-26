package typingsSlinky.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.apolloProtobufjs.mod.IEnum
  - typingsSlinky.apolloProtobufjs.mod.IType
  - typingsSlinky.apolloProtobufjs.mod.IService
  - typingsSlinky.apolloProtobufjs.mod.AnyExtensionField
  - typingsSlinky.apolloProtobufjs.mod.INamespace
*/
trait AnyNestedObject extends StObject
object AnyNestedObject {
  
  @scala.inline
  def IEnum(values: StringDictionary[js.UndefOr[Double]]): typingsSlinky.apolloProtobufjs.mod.IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IEnum]
  }
  
  @scala.inline
  def IExtensionField(extend: String, id: Double, `type`: String): typingsSlinky.apolloProtobufjs.mod.IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IExtensionField]
  }
  
  @scala.inline
  def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): typingsSlinky.apolloProtobufjs.mod.IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IExtensionMapField]
  }
  
  @scala.inline
  def INamespace(): typingsSlinky.apolloProtobufjs.mod.INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.apolloProtobufjs.mod.INamespace]
  }
  
  @scala.inline
  def IService(methods: StringDictionary[js.UndefOr[IMethod]]): typingsSlinky.apolloProtobufjs.mod.IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IService]
  }
  
  @scala.inline
  def IType(fields: StringDictionary[js.UndefOr[IField]]): typingsSlinky.apolloProtobufjs.mod.IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.apolloProtobufjs.mod.IType]
  }
}
