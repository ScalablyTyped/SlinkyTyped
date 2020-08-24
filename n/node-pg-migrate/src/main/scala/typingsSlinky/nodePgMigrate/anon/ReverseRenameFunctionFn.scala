package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionParam
import typingsSlinky.nodePgMigrate.functionsTypesMod.RenameFunctionFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseRenameFunctionFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: RenameFunctionFn = js.native
  def reverse(
    oldFunctionName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    functionParams: js.Array[FunctionParam],
    newFunctionName: typingsSlinky.nodePgMigrate.generalTypesMod.Name
  ): String | js.Array[String] = js.native
}

