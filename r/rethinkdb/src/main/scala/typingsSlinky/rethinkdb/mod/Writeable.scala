package typingsSlinky.rethinkdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Writeable extends js.Object {
  
  def delete(): Operation[WriteResult] = js.native
  def delete(options: UpdateOptions): Operation[WriteResult] = js.native
  
  def replace(expr: ExpressionFunction[_]): Operation[WriteResult] = js.native
  def replace(obj: js.Object): Operation[WriteResult] = js.native
  def replace(obj: js.Object, options: UpdateOptions): Operation[WriteResult] = js.native
  
  def update(obj: js.Object): Operation[WriteResult] = js.native
  def update(obj: js.Object, options: UpdateOptions): Operation[WriteResult] = js.native
}
