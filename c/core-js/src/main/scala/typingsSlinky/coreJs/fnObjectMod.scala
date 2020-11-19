package typingsSlinky.coreJs

import typingsSlinky.std.PropertyDescriptorMap
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/object", JSImport.Namespace)
@js.native
object fnObjectMod extends js.Object {
  
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  def classof(value: js.Any): java.lang.String = js.native
  
  def create(o: js.Any): js.Any = js.native
  def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
  
  def define[T](target: T, mixin: js.Any): T = js.native
  
  def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
  
  def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): js.Any = js.native
  
  def entries(`object`: js.Any): Array[_] = js.native
  
  def freeze[T](o: T): T = js.native
  
  def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): js.PropertyDescriptor = js.native
  
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
  
  def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = js.native
  
  def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = js.native
  
  def getPrototypeOf(o: js.Any): js.Any = js.native
  
  def is(value1: js.Any, value2: js.Any): Boolean = js.native
  
  def isExtensible(o: js.Any): Boolean = js.native
  
  def isFrozen(o: js.Any): Boolean = js.native
  
  def isObject(value: js.Any): Boolean = js.native
  
  def isSealed(o: js.Any): Boolean = js.native
  
  def keys(o: js.Any): Array[java.lang.String] = js.native
  
  def make[T](proto: T): T = js.native
  def make[T](proto: T, mixin: js.Any): T = js.native
  
  def preventExtensions[T](o: T): T = js.native
  
  def seal[T](o: T): T = js.native
  
  def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
  
  def values(`object`: js.Any): Array[_] = js.native
}
