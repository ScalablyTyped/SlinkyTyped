package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.functionsTypesMod.CreateFunctionFn
import typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionOptions
import typingsSlinky.nodePgMigrate.functionsTypesMod.FunctionParam
import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateFunctionFn extends js.Object {
  
  def reverse(
    functionName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    functionParams: js.Array[FunctionParam],
    functionOptions: FunctionOptions with DropOptions,
    definition: Value
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateFunctionFn = js.native
}
