package typingsSlinky.evernote.mod.Types

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ContactType extends StObject
@JSImport("evernote", "Types.ContactType")
@js.native
object ContactType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContactType with Double] = js.native
  
  @js.native
  sealed trait EMAIL extends ContactType
  /* 4 */ val EMAIL: typingsSlinky.evernote.mod.Types.ContactType.EMAIL with Double = js.native
  
  @js.native
  sealed trait EVERNOTE extends ContactType
  /* 1 */ val EVERNOTE: typingsSlinky.evernote.mod.Types.ContactType.EVERNOTE with Double = js.native
  
  @js.native
  sealed trait FACEBOOK extends ContactType
  /* 3 */ val FACEBOOK: typingsSlinky.evernote.mod.Types.ContactType.FACEBOOK with Double = js.native
  
  @js.native
  sealed trait LINKEDIN extends ContactType
  /* 6 */ val LINKEDIN: typingsSlinky.evernote.mod.Types.ContactType.LINKEDIN with Double = js.native
  
  @js.native
  sealed trait SMS extends ContactType
  /* 2 */ val SMS: typingsSlinky.evernote.mod.Types.ContactType.SMS with Double = js.native
  
  @js.native
  sealed trait TWITTER extends ContactType
  /* 5 */ val TWITTER: typingsSlinky.evernote.mod.Types.ContactType.TWITTER with Double = js.native
}
