package typingsSlinky.nodePgMigrate.anon

import typingsSlinky.nodePgMigrate.generalTypesMod.IfExistsOption
import typingsSlinky.nodePgMigrate.typesTypesMod.AddTypeAttributeFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReverseAddTypeAttributeFn extends StObject {
  
  def reverse(
    typeName: typingsSlinky.nodePgMigrate.generalTypesMod.Name,
    attributeName: String,
    attributeType: typingsSlinky.nodePgMigrate.generalTypesMod.Type with IfExistsOption
  ): String | js.Array[String] = js.native
  @JSName("reverse")
  var reverse_Original: AddTypeAttributeFn = js.native
}
