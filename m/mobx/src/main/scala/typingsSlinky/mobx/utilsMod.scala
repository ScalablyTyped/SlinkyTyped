package typingsSlinky.mobx

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.mobx.mobxBooleans.`false`
import typingsSlinky.mobx.mobxBooleans.`true`
import typingsSlinky.std.Map
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/utils/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  
  val EMPTY_ARRAY: js.Array[scala.Nothing] = js.native
  
  val OBFUSCATED_ERROR: /* "An invariant failed, however the error is obfuscated because this is a production build." */ String = js.native
  
  def addHiddenFinalProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = js.native
  
  def addHiddenProp(`object`: js.Any, propName: PropertyKey, value: js.Any): Unit = js.native
  
  def assertPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Unit = js.native
  
  def convertToMap(dataStructure: js.Any): Map[_, _] = js.native
  
  def createInstanceofPredicate[T](name: String, clazz: Instantiable1[/* args (repeated) */ js.Any, T]): js.Function1[/* x */ js.Any, /* is T */ Boolean] = js.native
  
  def deprecated(msg: String): Boolean = js.native
  def deprecated(thing: String, replacement: String): Boolean = js.native
  
  def fail(message: String): scala.Nothing = js.native
  def fail(message: Boolean): scala.Nothing = js.native
  
  def getNextId(): Double = js.native
  
  def getPlainObjectKeys(`object`: js.Any): js.Array[String | Double | js.Symbol] = js.native
  
  def invariant(check: js.Any): Unit = js.native
  def invariant(check: js.Any, message: String): Unit = js.native
  def invariant(check: js.Any, message: Boolean): Unit = js.native
  @JSName("invariant")
  def invariant_false(check: `false`): scala.Nothing = js.native
  @JSName("invariant")
  def invariant_false(check: `false`, message: String): scala.Nothing = js.native
  @JSName("invariant")
  def invariant_false(check: `false`, message: Boolean): scala.Nothing = js.native
  @JSName("invariant")
  def invariant_true(check: `true`): Unit = js.native
  @JSName("invariant")
  def invariant_true(check: `true`, message: String): Unit = js.native
  @JSName("invariant")
  def invariant_true(check: `true`, message: Boolean): Unit = js.native
  
  def isArrayLike(x: js.Any): Boolean = js.native
  
  def isES6Map(thing: js.Any): Boolean = js.native
  
  def isES6Set(thing: js.Any): /* is std.Set<any> */ Boolean = js.native
  
  def isObject(value: js.Any): Boolean = js.native
  
  def isPlainObject(value: js.Any): Boolean = js.native
  
  def isPropertyConfigurable(`object`: js.Any, prop: PropertyKey): Boolean = js.native
  
  def makeNonEnumerable(`object`: js.Any, propNames: js.Array[PropertyKey]): Unit = js.native
  
  def noop(): Unit = js.native
  
  def once(func: Lambda): Lambda = js.native
  
  def ownKeys(target: js.Any): js.Array[PropertyKey] = js.native
  
  def stringifyKey(key: js.Any): String = js.native
  
  def toPrimitive(value: js.Any): js.Any = js.native
  
  def unique[T](list: js.Array[T]): js.Array[T] = js.native
  
  @js.native
  trait Lambda extends js.Object {
    
    def apply(): Unit = js.native
    
    var name: js.UndefOr[String] = js.native
  }
}
