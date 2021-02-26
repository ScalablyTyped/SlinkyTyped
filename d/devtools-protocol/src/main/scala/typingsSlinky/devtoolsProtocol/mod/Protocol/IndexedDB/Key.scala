package typingsSlinky.devtoolsProtocol.mod.Protocol.IndexedDB

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.array
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.date
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.number
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Key extends StObject {
  
  /**
    * Array value.
    */
  var array: js.UndefOr[js.Array[Key]] = js.native
  
  /**
    * Date value.
    */
  var date: js.UndefOr[Double] = js.native
  
  /**
    * Number value.
    */
  var number: js.UndefOr[Double] = js.native
  
  /**
    * String value.
    */
  var string: js.UndefOr[String] = js.native
  
  /**
    * Key type. (KeyType enum)
    */
  var `type`: number | string | date | array = js.native
}
object Key {
  
  @scala.inline
  def apply(`type`: number | string | date | array): Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  @scala.inline
  implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: js.Array[Key]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    @scala.inline
    def setArrayVarargs(value: Key*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    @scala.inline
    def setType(value: number | string | date | array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
