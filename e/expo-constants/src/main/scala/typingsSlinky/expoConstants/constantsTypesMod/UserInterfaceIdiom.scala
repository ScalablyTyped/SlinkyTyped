package typingsSlinky.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait UserInterfaceIdiom extends js.Object
@JSImport("expo-constants/build/Constants.types", "UserInterfaceIdiom")
@js.native
object UserInterfaceIdiom extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UserInterfaceIdiom with String] = js.native
  
  @js.native
  sealed trait Handset extends UserInterfaceIdiom
  /* "handset" */ @js.native
  object Handset extends TopLevel[Handset with String]
  
  @js.native
  sealed trait Tablet extends UserInterfaceIdiom
  /* "tablet" */ @js.native
  object Tablet extends TopLevel[Tablet with String]
  
  @js.native
  sealed trait Unsupported extends UserInterfaceIdiom
  /* "unsupported" */ @js.native
  object Unsupported extends TopLevel[Unsupported with String]
}
