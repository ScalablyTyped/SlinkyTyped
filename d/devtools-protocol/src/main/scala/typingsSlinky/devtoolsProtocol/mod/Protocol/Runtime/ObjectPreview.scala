package typingsSlinky.devtoolsProtocol.mod.Protocol.Runtime

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`null`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.`object`
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.array
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.bigint
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.boolean
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.date
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.error
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.function
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.generator
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.iterator
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.map
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.node
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.number
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.regexp
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.set
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.string
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.symbol
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.undefined
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.weakmap
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.weakset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectPreview extends StObject {
  
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * List of the entries. Specified for `map` and `set` subtype values only.
    */
  var entries: js.UndefOr[js.Array[EntryPreview]] = js.native
  
  /**
    * True iff some of the properties or entries of the original object did not fit.
    */
  var overflow: Boolean = js.native
  
  /**
    * List of the properties.
    */
  var properties: js.Array[PropertyPreview] = js.native
  
  /**
    * Object subtype hint. Specified for `object` type values only. (ObjectPreviewSubtype enum)
    */
  var subtype: js.UndefOr[
    array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error
  ] = js.native
  
  /**
    * Object type. (ObjectPreviewType enum)
    */
  var `type`: `object` | function | undefined | string | number | boolean | symbol | bigint = js.native
}
object ObjectPreview {
  
  @scala.inline
  def apply(
    overflow: Boolean,
    properties: js.Array[PropertyPreview],
    `type`: `object` | function | undefined | string | number | boolean | symbol | bigint
  ): ObjectPreview = {
    val __obj = js.Dynamic.literal(overflow = overflow.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPreview]
  }
  
  @scala.inline
  implicit class ObjectPreviewMutableBuilder[Self <: ObjectPreview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEntries(value: js.Array[EntryPreview]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: EntryPreview*): Self = StObject.set(x, "entries", js.Array(value :_*))
    
    @scala.inline
    def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Array[PropertyPreview]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(value: PropertyPreview*): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setSubtype(
      value: array | `null` | node | regexp | date | map | set | weakmap | weakset | iterator | generator | error
    ): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    @scala.inline
    def setType(value: `object` | function | undefined | string | number | boolean | symbol | bigint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
