package typingsSlinky.astTypes.buildersMod

import typingsSlinky.astTypes.anon.Pattern
import typingsSlinky.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegExpLiteralBuilder extends js.Object {
  
  def apply(pattern: String, flags: String): RegExpLiteral = js.native
  
  def from(params: Pattern): RegExpLiteral = js.native
}
