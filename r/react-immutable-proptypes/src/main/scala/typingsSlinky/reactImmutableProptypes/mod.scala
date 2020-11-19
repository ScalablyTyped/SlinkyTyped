package typingsSlinky.reactImmutableProptypes

import typingsSlinky.immutable.Immutable.List
import typingsSlinky.immutable.Immutable.Map
import typingsSlinky.immutable.Immutable.OrderedMap
import typingsSlinky.immutable.Immutable.OrderedSet
import typingsSlinky.immutable.Immutable.Seq
import typingsSlinky.immutable.Immutable.Set
import typingsSlinky.immutable.Immutable.Stack
import typingsSlinky.propTypes.mod.Requireable
import typingsSlinky.propTypes.mod.ValidationMap
import typingsSlinky.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-immutable-proptypes", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def contains(`type`: ValidationMap[_]): Requireable[js.Iterable[_]] = js.native
  
  val iterable: Requireable[js.Iterable[js.Any]] = js.native
  
  def iterableOf[V](`type`: Validator[V]): Requireable[js.Iterable[_]] = js.native
  
  val list: Requireable[List[js.Any]] = js.native
  
  def listOf[V](`type`: Validator[V]): Requireable[List[V]] = js.native
  
  val map: Requireable[Map[js.Any, js.Any]] = js.native
  
  def mapContains(`type`: ValidationMap[_]): Requireable[Map[_, _]] = js.native
  
  def mapOf[V, K](valueType: Validator[V]): Requireable[Map[K, V]] = js.native
  def mapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[Map[K, V]] = js.native
  
  val orderedMap: Requireable[OrderedMap[js.Any, js.Any]] = js.native
  
  def orderedMapOf[V, K](valueType: Validator[V]): Requireable[OrderedMap[K, V]] = js.native
  def orderedMapOf[V, K](valueType: Validator[V], keyType: Validator[K]): Requireable[OrderedMap[K, V]] = js.native
  
  val orderedSet: Requireable[OrderedSet[js.Any]] = js.native
  
  def orderedSetOf[V](`type`: Validator[V]): Requireable[OrderedSet[V]] = js.native
  
  val record: Requireable[Map[String, js.Any]] = js.native
  
  def recordOf(`type`: ValidationMap[_]): Requireable[Map[String, _]] = js.native
  
  val seq: Requireable[Seq[js.Any, js.Any]] = js.native
  
  val set: Requireable[Set[js.Any]] = js.native
  
  def setOf[V](`type`: Validator[V]): Requireable[Set[V]] = js.native
  
  def shape(`type`: ValidationMap[_]): Requireable[js.Iterable[_]] = js.native
  
  val stack: Requireable[Stack[js.Any]] = js.native
  
  def stackOf[V](`type`: Validator[V]): Requireable[Stack[V]] = js.native
}
