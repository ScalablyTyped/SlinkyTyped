package typingsSlinky.caseless

import typingsSlinky.caseless.caselessBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("caseless", JSImport.Namespace)
  @js.native
  def apply(): Caseless = js.native
  @JSImport("caseless", JSImport.Namespace)
  @js.native
  def apply(dict: RawDict): Caseless = js.native
  
  @JSImport("caseless", "httpify")
  @js.native
  def httpify(resp: js.Object, headers: RawDict): Caseless = js.native
  
  @js.native
  trait Caseless extends StObject {
    
    def del(name: KeyType): Boolean = js.native
    
    def get(name: KeyType): js.UndefOr[ValueType] = js.native
    
    def has(name: KeyType): KeyType | `false` = js.native
    
    def set(dict: RawDict): Unit = js.native
    def set(name: KeyType, value: ValueType): KeyType | `false` = js.native
    def set(name: KeyType, value: ValueType, clobber: Boolean): KeyType | `false` = js.native
    
    def swap(name: KeyType): Unit = js.native
  }
  
  @js.native
  trait Httpified extends StObject {
    
    def getHeader(name: KeyType): js.UndefOr[ValueType] = js.native
    
    def hasHeader(name: KeyType): KeyType | `false` = js.native
    
    var headers: RawDict = js.native
    
    def removeHeader(name: KeyType): Boolean = js.native
    
    def setHeader(dict: RawDict): Unit = js.native
    def setHeader(name: KeyType, value: ValueType): KeyType | `false` = js.native
    def setHeader(name: KeyType, value: ValueType, clobber: Boolean): KeyType | `false` = js.native
  }
  
  type KeyType = String
  
  type RawDict = js.Object
  
  type ValueType = js.Any
}
