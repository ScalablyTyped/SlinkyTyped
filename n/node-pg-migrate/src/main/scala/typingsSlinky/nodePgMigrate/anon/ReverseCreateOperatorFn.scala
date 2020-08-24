package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorFn
import typingsSlinky.nodePgMigrate.operatorsTypesMod.CreateOperatorOptions
import typingsSlinky.nodePgMigrate.operatorsTypesMod.DropOperatorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateOperatorFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateOperatorFn = js.native
  def reverse(
    operatorName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    options: CreateOperatorOptions with DropOperatorOptions
  ): String | js.Array[String] = js.native
}

