package typingsSlinky.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Any nested object descriptor. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.protobufjs.mod.IEnum
  - typingsSlinky.protobufjs.mod.IType
  - typingsSlinky.protobufjs.mod.IService
  - typingsSlinky.protobufjs.mod.AnyExtensionField
  - typingsSlinky.protobufjs.mod.INamespace
*/
trait AnyNestedObject extends StObject
object AnyNestedObject {
  
  @scala.inline
  def IEnum(values: StringDictionary[Double]): typingsSlinky.protobufjs.mod.IEnum = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.protobufjs.mod.IEnum]
  }
  
  @scala.inline
  def IExtensionField(extend: String, id: Double, `type`: String): typingsSlinky.protobufjs.mod.IExtensionField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.protobufjs.mod.IExtensionField]
  }
  
  @scala.inline
  def IExtensionMapField(extend: String, id: Double, keyType: String, `type`: String): typingsSlinky.protobufjs.mod.IExtensionMapField = {
    val __obj = js.Dynamic.literal(extend = extend.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.protobufjs.mod.IExtensionMapField]
  }
  
  @scala.inline
  def INamespace(): typingsSlinky.protobufjs.mod.INamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typingsSlinky.protobufjs.mod.INamespace]
  }
  
  @scala.inline
  def IService(methods: StringDictionary[IMethod]): typingsSlinky.protobufjs.mod.IService = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.protobufjs.mod.IService]
  }
  
  @scala.inline
  def IType(fields: StringDictionary[IField]): typingsSlinky.protobufjs.mod.IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.protobufjs.mod.IType]
  }
}
