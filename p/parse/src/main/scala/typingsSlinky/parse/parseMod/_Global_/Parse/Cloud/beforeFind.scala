package typingsSlinky.parse.parseMod._Global_.Parse.Cloud

import typingsSlinky.parse.parseMod._Global_.Parse.Attributes
import typingsSlinky.parse.parseMod._Global_.Parse.Object
import typingsSlinky.parse.parseMod._Global_.Parse.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

