package typingsSlinky.apolloClient.typesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FetchType extends js.Object
@JSImport("apollo-client/core/types", "FetchType")
@js.native
object FetchType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FetchType with Double] = js.native
  
  @js.native
  sealed trait normal extends FetchType
  /* 1 */ @js.native
  object normal extends TopLevel[normal with Double]
  
  @js.native
  sealed trait poll extends FetchType
  /* 3 */ @js.native
  object poll extends TopLevel[poll with Double]
  
  @js.native
  sealed trait refetch extends FetchType
  /* 2 */ @js.native
  object refetch extends TopLevel[refetch with Double]
}
