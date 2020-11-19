package typingsSlinky.nodeSql2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column[Name, T] extends js.Object {
  
  def as[OtherName](name: OtherName): Column[OtherName, T] = js.native
  
  var asc: OrderByValueNode = js.native
  
  var ascending: OrderByValueNode = js.native
  
  def count(): Column[_, Double] = js.native
  def count(name: String): Column[_, Double] = js.native
  
  var desc: OrderByValueNode = js.native
  
  var descending: OrderByValueNode = js.native
  
  def distinct(): Column[Name, T] = js.native
  
  def equals(node: Column[_, T]): BinaryNode = js.native
  
  def gt(node: T): BinaryNode = js.native
  def gt(node: Column[_, T]): BinaryNode = js.native
  
  def gte(node: T): BinaryNode = js.native
  def gte(node: Column[_, T]): BinaryNode = js.native
  
  def in(arr: js.Array[T]): BinaryNode = js.native
  def in(subQuery: SubQuery[T]): BinaryNode = js.native
  
  def isNotNull(): BinaryNode = js.native
  
  def isNull(): BinaryNode = js.native
  
  def like(str: String): BinaryNode = js.native
  
  def lt(node: T): BinaryNode = js.native
  def lt(node: Column[_, T]): BinaryNode = js.native
  
  def lte(node: T): BinaryNode = js.native
  def lte(node: Column[_, T]): BinaryNode = js.native
  
  def multiply(node: Column[_, T]): Column[_, T] = js.native
  def multiply(n: Double): Column[_, Double] = js.native
  
  var name: Name = js.native
  
  def notEquals(node: T): BinaryNode = js.native
  def notEquals(node: Column[_, T]): BinaryNode = js.native
  
  def notIn(arr: js.Array[T]): BinaryNode = js.native
  
  //todo check column names
  def sum(): Column[_, Double] = js.native
}
