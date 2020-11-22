package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.BooleanKind
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.DefaultKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.DefineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Define")
@js.native
class Define protected ()
  extends typingsSlinky.grammarkdown.nodesMod.Define {
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    defineKeyword: typingsSlinky.grammarkdown.nodesMod.Token[DefineKeyword],
    key: typingsSlinky.grammarkdown.nodesMod.Identifier
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    defineKeyword: typingsSlinky.grammarkdown.nodesMod.Token[DefineKeyword],
    key: typingsSlinky.grammarkdown.nodesMod.Identifier,
    valueToken: typingsSlinky.grammarkdown.nodesMod.Token[BooleanKind | DefaultKeyword]
  ) = this()
}
