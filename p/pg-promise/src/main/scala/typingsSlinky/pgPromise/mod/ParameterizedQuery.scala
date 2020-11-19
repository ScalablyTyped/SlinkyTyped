package typingsSlinky.pgPromise.mod

import typingsSlinky.pgPromise.mod.errors.ParameterizedQueryError
import typingsSlinky.pgPromise.pgPromiseStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ParameterizedQuery class;
// API: http://vitaly-t.github.io/pg-promise/ParameterizedQuery.html
@JSImport("pg-promise", "ParameterizedQuery")
@js.native
class ParameterizedQuery () extends _QueryParam {
  def this(options: String) = this()
  def this(options: IParameterizedQuery) = this()
  def this(options: QueryFile) = this()
  
  // advanced properties:
  var binary: Boolean = js.native
  
  def parse(): IParameterizedParsed | ParameterizedQueryError = js.native
  
  var rowMode: Unit | array = js.native
  
  // standard properties:
  var text: String | QueryFile = js.native
  
  def toString(level: Double): String = js.native
  
  var values: js.Array[_] = js.native
}
