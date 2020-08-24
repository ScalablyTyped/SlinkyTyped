package typingsSlinky.expoConstants

import typingsSlinky.expoConstants.constantsTypesMod.Constants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-constants", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: Constants = js.native
  @js.native
  object AppOwnership extends js.Object {
    /* "expo" */ val Expo: typingsSlinky.expoConstants.constantsTypesMod.AppOwnership.Expo with String = js.native
    /* "guest" */ val Guest: typingsSlinky.expoConstants.constantsTypesMod.AppOwnership.Guest with String = js.native
    /* "standalone" */ val Standalone: typingsSlinky.expoConstants.constantsTypesMod.AppOwnership.Standalone with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expoConstants.constantsTypesMod.AppOwnership with String] = js.native
  }
  
  @js.native
  object UserInterfaceIdiom extends js.Object {
    /* "handset" */ val Handset: typingsSlinky.expoConstants.constantsTypesMod.UserInterfaceIdiom.Handset with String = js.native
    /* "tablet" */ val Tablet: typingsSlinky.expoConstants.constantsTypesMod.UserInterfaceIdiom.Tablet with String = js.native
    /* "unsupported" */ val Unsupported: typingsSlinky.expoConstants.constantsTypesMod.UserInterfaceIdiom.Unsupported with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.expoConstants.constantsTypesMod.UserInterfaceIdiom with String] = js.native
  }
  
}

