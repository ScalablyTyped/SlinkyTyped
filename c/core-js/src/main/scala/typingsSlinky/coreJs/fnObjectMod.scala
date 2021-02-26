package typingsSlinky.coreJs

import typingsSlinky.std.PropertyDescriptorMap
import typingsSlinky.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof core.Object` */
object fnObjectMod {
  
  @JSImport("core-js/fn/object", "assign")
  @js.native
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  
  @JSImport("core-js/fn/object", "classof")
  @js.native
  def classof(value: js.Any): java.lang.String = js.native
  
  @JSImport("core-js/fn/object", "create")
  @js.native
  def create(o: js.Any): js.Any = js.native
  @JSImport("core-js/fn/object", "create")
  @js.native
  def create(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
  
  @JSImport("core-js/fn/object", "define")
  @js.native
  def define[T](target: T, mixin: js.Any): T = js.native
  
  @JSImport("core-js/fn/object", "defineProperties")
  @js.native
  def defineProperties(o: js.Any, properties: PropertyDescriptorMap): js.Any = js.native
  
  @JSImport("core-js/fn/object", "defineProperty")
  @js.native
  def defineProperty(o: js.Any, propertyKey: PropertyKey, attributes: js.PropertyDescriptor): js.Any = js.native
  
  @JSImport("core-js/fn/object", "entries")
  @js.native
  def entries(`object`: js.Any): Array[_] = js.native
  
  @JSImport("core-js/fn/object", "freeze")
  @js.native
  def freeze[T](o: T): T = js.native
  
  @JSImport("core-js/fn/object", "getOwnPropertyDescriptor")
  @js.native
  def getOwnPropertyDescriptor(o: js.Any, propertyKey: PropertyKey): js.PropertyDescriptor = js.native
  
  @JSImport("core-js/fn/object", "getOwnPropertyDescriptors")
  @js.native
  def getOwnPropertyDescriptors(`object`: js.Any): PropertyDescriptorMap = js.native
  
  @JSImport("core-js/fn/object", "getOwnPropertyNames")
  @js.native
  def getOwnPropertyNames(o: js.Any): Array[java.lang.String] = js.native
  
  @JSImport("core-js/fn/object", "getOwnPropertySymbols")
  @js.native
  def getOwnPropertySymbols(o: js.Any): Array[js.Symbol] = js.native
  
  @JSImport("core-js/fn/object", "getPrototypeOf")
  @js.native
  def getPrototypeOf(o: js.Any): js.Any = js.native
  
  @JSImport("core-js/fn/object", "is")
  @js.native
  def is(value1: js.Any, value2: js.Any): Boolean = js.native
  
  @JSImport("core-js/fn/object", "isExtensible")
  @js.native
  def isExtensible(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/fn/object", "isFrozen")
  @js.native
  def isFrozen(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/fn/object", "isObject")
  @js.native
  def isObject(value: js.Any): Boolean = js.native
  
  @JSImport("core-js/fn/object", "isSealed")
  @js.native
  def isSealed(o: js.Any): Boolean = js.native
  
  @JSImport("core-js/fn/object", "keys")
  @js.native
  def keys(o: js.Any): Array[java.lang.String] = js.native
  
  @JSImport("core-js/fn/object", "make")
  @js.native
  def make[T](proto: T): T = js.native
  @JSImport("core-js/fn/object", "make")
  @js.native
  def make[T](proto: T, mixin: js.Any): T = js.native
  
  @JSImport("core-js/fn/object", "preventExtensions")
  @js.native
  def preventExtensions[T](o: T): T = js.native
  
  @JSImport("core-js/fn/object", "seal")
  @js.native
  def seal[T](o: T): T = js.native
  
  @JSImport("core-js/fn/object", "setPrototypeOf")
  @js.native
  def setPrototypeOf(o: js.Any, proto: js.Any): js.Any = js.native
  
  @JSImport("core-js/fn/object", "values")
  @js.native
  def values(`object`: js.Any): Array[_] = js.native
}
