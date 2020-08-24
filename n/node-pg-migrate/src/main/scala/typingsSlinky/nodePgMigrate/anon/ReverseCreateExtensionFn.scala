package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.extensionsTypesMod.CreateExtensionFn
import typingsSlinky.nodePgMigrate.extensionsTypesMod.CreateExtensionOptions
import typingsSlinky.nodePgMigrate.extensionsTypesMod.Extension
import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReverseCreateExtensionFn extends js.Object {
  @JSName("reverse")
  var reverse_Original: CreateExtensionFn = js.native
  def reverse(extension: js.Array[LiteralUnion[Extension, String]]): String | js.Array[String] = js.native
  def reverse(
    extension: js.Array[LiteralUnion[Extension, String]],
    options: CreateExtensionOptions with DropOptions
  ): String | js.Array[String] = js.native
  def reverse(extension: LiteralUnion[Extension, String]): String | js.Array[String] = js.native
  def reverse(extension: LiteralUnion[Extension, String], options: CreateExtensionOptions with DropOptions): String | js.Array[String] = js.native
}

