package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.AtToken
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.DefaultKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.LineKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Line")
@js.native
class Line protected ()
  extends typingsSlinky.grammarkdown.nodesMod.Line {
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LineKeyword]
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LineKeyword],
    number: typingsSlinky.grammarkdown.nodesMod.NumberLiteral
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LineKeyword],
    number: typingsSlinky.grammarkdown.nodesMod.Token[DefaultKeyword]
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LineKeyword],
    number: js.UndefOr[scala.Nothing],
    path: typingsSlinky.grammarkdown.nodesMod.StringLiteral
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LineKeyword],
    number: typingsSlinky.grammarkdown.nodesMod.NumberLiteral,
    path: typingsSlinky.grammarkdown.nodesMod.StringLiteral
  ) = this()
  def this(
    atToken: typingsSlinky.grammarkdown.nodesMod.Token[AtToken],
    lineKeyword: typingsSlinky.grammarkdown.nodesMod.Token[LineKeyword],
    number: typingsSlinky.grammarkdown.nodesMod.Token[DefaultKeyword],
    path: typingsSlinky.grammarkdown.nodesMod.StringLiteral
  ) = this()
}
