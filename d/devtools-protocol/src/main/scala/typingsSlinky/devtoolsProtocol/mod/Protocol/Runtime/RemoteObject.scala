package typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.array
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.arraybuffer
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.dataview
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.date
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.externref
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.f32
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.f64
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.function
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.generator
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.i32
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.i64
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.iterator
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.map
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.node
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.number
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.promise
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.proxy_
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.regexp
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.set
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.string
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.symbol
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.typedarray
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.undefined
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.v128
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.wasm
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.weakmap
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.weakset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteObject extends StObject {
  
  /**
    * Object class (constructor) name. Specified for `object` type values only.
    */
  var className: js.UndefOr[String] = js.native
  
  var customPreview: js.UndefOr[CustomPreview] = js.native
  
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Unique object identifier (for non-primitive values).
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  
  /**
    * Preview containing abbreviated property values. Specified for `object` type values only.
    */
  var preview: js.UndefOr[ObjectPreview] = js.native
  
  /**
    * Object subtype hint. Specified for `object` or `wasm` type values only. (RemoteObjectSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | i32 | i64 | f32 | f64 | v128 | externref
  ] = js.native
  
  /**
    * Object type. (RemoteObjectType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | bigint | wasm = js.native
  
  /**
    * Primitive value which can not be JSON-stringified does not have `value`, but gets this
    * property.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.native
  
  /**
    * Remote object value in case of primitive values or JSON values (if it was requested).
    */
  var value: js.UndefOr[js.Any] = js.native
}
object RemoteObject {
  
  @scala.inline
  def apply(`type`: `object` | function | undefined | string | number | boolean | symbol | bigint | wasm): RemoteObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteObject]
  }
  
  @scala.inline
  implicit class RemoteObjectMutableBuilder[Self <: RemoteObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCustomPreview(value: CustomPreview): Self = StObject.set(x, "customPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPreviewUndefined: Self = StObject.set(x, "customPreview", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPreview(value: ObjectPreview): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error | proxy_ | promise | typedarray | arraybuffer | dataview | i32 | i64 | f32 | f64 | v128 | externref
    ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    @scala.inline
    def setType(value: `object` | function | undefined | string | number | boolean | symbol | bigint | wasm): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnserializableValue(value: UnserializableValue): Self = StObject.set(x, "unserializableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnserializableValueUndefined: Self = StObject.set(x, "unserializableValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
