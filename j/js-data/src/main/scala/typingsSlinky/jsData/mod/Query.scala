package typingsSlinky.jsData.mod

import typingsSlinky.jsData.anon._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("js-data", "Query")
@js.native
class Query () extends Component {
  def this(collection: Collection) = this()
  
  def between(leftKeys: js.Any, rightKeys: js.Any): this.type = js.native
  def between(leftKeys: js.Any, rightKeys: js.Any, opts: js.Any): this.type = js.native
  
  var collection: Collection | LinkedCollection = js.native
  
  def compare(orderBy: js.Any, index: js.Any, a: js.Any, b: js.Any): js.Any = js.native
  
  var data: js.Array[_] = js.native
  
  def evaluate(value: js.Any, op: String, predicate: js.Any): Boolean = js.native
  
  def filter(query: js.Any): this.type = js.native
  def filter(query: js.Any, thisArg: js.Any): this.type = js.native
  
  def forEach(forEachFn: js.Function): this.type = js.native
  def forEach(forEachFn: js.Function, thisArg: js.Any): this.type = js.native
  
  def get(): this.type = js.native
  def get(keyList: js.UndefOr[scala.Nothing], opts: js.Any): this.type = js.native
  def get(keyList: js.Array[_]): this.type = js.native
  def get(keyList: js.Array[_], opts: js.Any): this.type = js.native
  
  def getAll(args: js.Any*): this.type = js.native
  
  def getData(): js.Array[_] = js.native
  
  def like(pattern: js.Any, flags: js.Any): js.RegExp = js.native
  
  def limit(num: Double): this.type = js.native
  
  def map(mapFn: js.Function): this.type = js.native
  def map(mapFn: js.Function, thisArg: js.Any): this.type = js.native
  
  def mapCall(funcName: String, args: js.Any*): this.type = js.native
  
  def run(): js.Array[_] = js.native
  
  def skip(num: Double): this.type = js.native
}
/* static members */
@JSImport("js-data", "Query")
@js.native
object Query extends js.Object {
  
  var ops: _empty = js.native
}
