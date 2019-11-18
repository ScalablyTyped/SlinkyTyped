package typingsSlinky.expoDashConstants.buildConstantsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserInterfaceIdiom extends js.Object

@JSImport("expo-constants/build/Constants.types", "UserInterfaceIdiom")
@js.native
object UserInterfaceIdiom extends js.Object {
  @js.native
  sealed trait Handset extends UserInterfaceIdiom
  
  @js.native
  sealed trait Tablet extends UserInterfaceIdiom
  
  @js.native
  sealed trait Unsupported extends UserInterfaceIdiom
  
  /* "handset" */ val Handset: typingsSlinky.expoDashConstants.buildConstantsDotTypesMod.UserInterfaceIdiom.Handset with String = js.native
  /* "tablet" */ val Tablet: typingsSlinky.expoDashConstants.buildConstantsDotTypesMod.UserInterfaceIdiom.Tablet with String = js.native
  /* "unsupported" */ val Unsupported: typingsSlinky.expoDashConstants.buildConstantsDotTypesMod.UserInterfaceIdiom.Unsupported with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[UserInterfaceIdiom with String] = js.native
}

