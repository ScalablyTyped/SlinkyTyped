package typingsSlinky.nodePgMigrate.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodePgMigrate.generalTypesMod.DropOptions
import typingsSlinky.nodePgMigrate.generalTypesMod.Value
import typingsSlinky.nodePgMigrate.typesTypesMod.CreateTypeFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseCreateTypeFn extends js.Object {
  
  def reverse(
    typeName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    values: (js.Array[Value] | StringDictionary[typingsSlinky.nodePgMigrate.generalTypesMod.Type]) with DropOptions
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: CreateTypeFn = js.native
}
