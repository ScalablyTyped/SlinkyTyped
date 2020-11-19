package typingsSlinky.geetest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geetest extends js.Object {
  
  def register(): js.Promise[Data] = js.native
  def register(callback: js.Function2[/* error */ js.Error, /* data */ Data, Unit]): Unit = js.native
  
  def validate(result: Result): js.Promise[Success] = js.native
  def validate(result: Result, callback: js.Function2[/* error */ js.Error, /* success */ Success, Unit]): Unit = js.native
}
