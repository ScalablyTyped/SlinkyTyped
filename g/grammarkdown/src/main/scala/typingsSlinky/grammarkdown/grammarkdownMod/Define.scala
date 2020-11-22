package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.DefineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown/dist/grammarkdown", "Define")
@js.native
class Define protected ()
  extends MetaElementBase[typingsSlinky.grammarkdown.grammarkdownMod.SyntaxKind.Define] {
  def this(atToken: Token[AtToken], defineKeyword: Token[DefineKeyword], key: Identifier) = this()
  def this(
    atToken: Token[AtToken],
    defineKeyword: Token[DefineKeyword],
    key: Identifier,
    valueToken: Token[BooleanKind]
  ) = this()
  
  val defineKeyword: Token[DefineKeyword] = js.native
  
  val key: Identifier = js.native
  
  val valueToken: js.UndefOr[Token[BooleanKind]] = js.native
}
