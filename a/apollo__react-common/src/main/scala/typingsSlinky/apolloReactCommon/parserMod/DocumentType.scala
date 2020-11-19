package typingsSlinky.apolloReactCommon.parserMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentType extends js.Object
@JSImport("@apollo/react-common/lib/parser/parser", "DocumentType")
@js.native
object DocumentType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentType with Double] = js.native
  
  @js.native
  sealed trait Mutation extends DocumentType
  /* 1 */ @js.native
  object Mutation extends TopLevel[Mutation with Double]
  
  @js.native
  sealed trait Query extends DocumentType
  /* 0 */ @js.native
  object Query extends TopLevel[Query with Double]
  
  @js.native
  sealed trait Subscription extends DocumentType
  /* 2 */ @js.native
  object Subscription extends TopLevel[Subscription with Double]
}
