package typingsSlinky.graphqlCompose.graphqlMod

import typingsSlinky.graphql.tokenKindMod.TokenKindEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-compose/lib/graphql", "Token")
@js.native
class Token protected ()
  extends typingsSlinky.graphql.mod.Token {
  def this(kind: TokenKindEnum, start: Double, end: Double, line: Double, column: Double) = this()
  def this(
    kind: TokenKindEnum,
    start: Double,
    end: Double,
    line: Double,
    column: Double,
    prev: typingsSlinky.graphql.astMod.Token
  ) = this()
  def this(
    kind: TokenKindEnum,
    start: Double,
    end: Double,
    line: Double,
    column: Double,
    prev: Null,
    value: String
  ) = this()
  def this(
    kind: TokenKindEnum,
    start: Double,
    end: Double,
    line: Double,
    column: Double,
    prev: typingsSlinky.graphql.astMod.Token,
    value: String
  ) = this()
}
