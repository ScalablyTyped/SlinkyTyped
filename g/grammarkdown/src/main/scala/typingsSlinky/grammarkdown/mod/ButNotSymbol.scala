package typingsSlinky.grammarkdown.mod

import typingsSlinky.grammarkdown.nodesMod.LexicalSymbol
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.ButKeyword
import typingsSlinky.grammarkdown.tokensMod.SyntaxKind.NotKeyword
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "ButNotSymbol")
@js.native
class ButNotSymbol protected ()
  extends typingsSlinky.grammarkdown.nodesMod.ButNotSymbol {
  def this(left: LexicalSymbol) = this()
  def this(left: LexicalSymbol, butKeyword: typingsSlinky.grammarkdown.nodesMod.Token[ButKeyword]) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typingsSlinky.grammarkdown.nodesMod.Token[ButKeyword],
    notKeyword: typingsSlinky.grammarkdown.nodesMod.Token[NotKeyword]
  ) = this()
  def this(
    left: LexicalSymbol,
    butKeyword: typingsSlinky.grammarkdown.nodesMod.Token[ButKeyword],
    notKeyword: typingsSlinky.grammarkdown.nodesMod.Token[NotKeyword],
    right: LexicalSymbol
  ) = this()
}

