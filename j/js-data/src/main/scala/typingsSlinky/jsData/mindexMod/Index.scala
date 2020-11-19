package typingsSlinky.jsData.mindexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Index extends js.Object {
  
  def _between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
  
  def between(leftKeys: js.Any, rightKeys: js.Any): js.Array[_] = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): js.Array[_] = js.native
  
  def clear(): Unit = js.native
  
  var fieldGetter: js.Any = js.native
  
  var fieldList: js.Array[_] = js.native
  
  def get(): js.Any = js.native
  def get(keyList: js.Any): js.Any = js.native
  
  def getAll(): js.Array[_] = js.native
  def getAll(opts: js.Any): js.Array[_] = js.native
  
  @JSName("hashCode")
  var hashCode_FIndex: js.Any = js.native
  
  def insertRecord(data: js.Any): Unit = js.native
  
  var isIndex: Boolean = js.native
  
  var keys: js.Array[_] = js.native
  
  def peek(): js.Any = js.native
  
  def removeRecord(data: js.Any): js.Any = js.native
  
  def set(keyList: js.Any, value: js.Any): Unit = js.native
  
  def updateRecord(data: js.Any): Unit = js.native
  
  var values: js.Array[_] = js.native
  
  def visitAll(cb: js.Any): Unit = js.native
  def visitAll(cb: js.Any, thisArg: js.Any): Unit = js.native
}
