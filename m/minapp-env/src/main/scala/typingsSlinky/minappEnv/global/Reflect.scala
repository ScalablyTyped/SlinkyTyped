package typingsSlinky.minappEnv.global

import typingsSlinky.minappEnv.ArrayLike
import typingsSlinky.minappEnv.IterableIterator
import typingsSlinky.minappEnv.PropertyDescriptor
import typingsSlinky.minappEnv.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Reflect")
@js.native
object Reflect extends js.Object {
  
  @JSName("apply")
  def apply(target: typingsSlinky.minappEnv.Function, thisArgument: js.Any, argumentsList: ArrayLike[_]): js.Any = js.native
  
  def construct(target: typingsSlinky.minappEnv.Function, argumentsList: ArrayLike[_]): js.Any = js.native
  def construct(target: typingsSlinky.minappEnv.Function, argumentsList: ArrayLike[_], newTarget: js.Any): js.Any = js.native
  
  def defineProperty(target: js.Object, propertyKey: PropertyKey, attributes: PropertyDescriptor): scala.Boolean = js.native
  
  def deleteProperty(target: js.Object, propertyKey: PropertyKey): scala.Boolean = js.native
  
  def enumerate(target: js.Object): IterableIterator[_] = js.native
  
  def get(target: js.Object, propertyKey: PropertyKey): js.Any = js.native
  def get(target: js.Object, propertyKey: PropertyKey, receiver: js.Any): js.Any = js.native
  
  def getOwnPropertyDescriptor(target: js.Object, propertyKey: PropertyKey): js.UndefOr[PropertyDescriptor] = js.native
  
  def getPrototypeOf(target: js.Object): js.Object = js.native
  
  def has(target: js.Object, propertyKey: PropertyKey): scala.Boolean = js.native
  
  def isExtensible(target: js.Object): scala.Boolean = js.native
  
  def ownKeys(target: js.Object): typingsSlinky.minappEnv.Array[PropertyKey] = js.native
  
  def preventExtensions(target: js.Object): scala.Boolean = js.native
  
  def set(target: js.Object, propertyKey: PropertyKey, value: js.Any): scala.Boolean = js.native
  def set(target: js.Object, propertyKey: PropertyKey, value: js.Any, receiver: js.Any): scala.Boolean = js.native
  
  def setPrototypeOf(target: js.Object, proto: js.Any): scala.Boolean = js.native
}
