package typingsSlinky.parse.mod.global.Parse.Cloud

import typingsSlinky.parse.mod.global.Parse.Attributes
import typingsSlinky.parse.mod.global.Parse.Object
import typingsSlinky.parse.mod.global.Parse.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Parse.Cloud.beforeFind")
@js.native
object beforeFind extends js.Object {
  
  def apply(arg1: js.Any): Unit = js.native
  def apply(
    arg1: js.Any,
    func: js.Function1[
      /* request */ BeforeFindRequest, 
      (js.Promise[Query[Object[Attributes]] | Unit]) | Query[Object[Attributes]] | Unit
    ]
  ): Unit = js.native
}
