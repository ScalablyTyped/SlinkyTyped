package typingsSlinky.kue.kueMod

import typingsSlinky.express.expressMod.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kue", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var app: Application = js.native
  var workers: js.Array[Worker] = js.native
}

