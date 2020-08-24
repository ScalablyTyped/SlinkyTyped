package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption
import typingsSlinky.nodePgMigrate.typesTypesMod.AddTypeAttributeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseAddTypeAttributeFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: AddTypeAttributeFn = js.native
  def reverse(
    typeName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    attributeName: String,
    attributeType: typingsSlinky.nodePgMigrate.generalTypesMod.Type with IfExistsOption
  ): String | js.Array[String] = js.native
}

