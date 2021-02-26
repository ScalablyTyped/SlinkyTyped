package typingsSlinky.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SponsoredGroupRole extends StObject
@JSImport("evernote", "Types.SponsoredGroupRole")
@js.native
object SponsoredGroupRole extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SponsoredGroupRole with Double] = js.native
  
  @js.native
  sealed trait GROUP_ADMIN extends SponsoredGroupRole
  /* 2 */ val GROUP_ADMIN: typingsSlinky.evernote.mod.Types.SponsoredGroupRole.GROUP_ADMIN with Double = js.native
  
  @js.native
  sealed trait GROUP_MEMBER extends SponsoredGroupRole
  /* 1 */ val GROUP_MEMBER: typingsSlinky.evernote.mod.Types.SponsoredGroupRole.GROUP_MEMBER with Double = js.native
  
  @js.native
  sealed trait GROUP_OWNER extends SponsoredGroupRole
  /* 3 */ val GROUP_OWNER: typingsSlinky.evernote.mod.Types.SponsoredGroupRole.GROUP_OWNER with Double = js.native
}
