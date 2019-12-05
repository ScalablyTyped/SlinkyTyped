package typingsSlinky.atApolloReactDashCommon.libParserParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentType extends js.Object

@JSImport("@apollo/react-common/lib/parser/parser", "DocumentType")
@js.native
object DocumentType extends js.Object {
  @js.native
  sealed trait Mutation extends DocumentType
  
  @js.native
  sealed trait Query extends DocumentType
  
  @js.native
  sealed trait Subscription extends DocumentType
  
  /* 1 */ val Mutation: typingsSlinky.atApolloReactDashCommon.libParserParserMod.DocumentType.Mutation with Double = js.native
  /* 0 */ val Query: typingsSlinky.atApolloReactDashCommon.libParserParserMod.DocumentType.Query with Double = js.native
  /* 2 */ val Subscription: typingsSlinky.atApolloReactDashCommon.libParserParserMod.DocumentType.Subscription with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentType with Double] = js.native
}

