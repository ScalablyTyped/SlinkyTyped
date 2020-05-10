package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaPresence
import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Persona/PersonaConsts", JSImport.Namespace)
@js.native
object personaConstsMod extends js.Object {
  def presenceBoolean(presence: PersonaPresence): AnonIsAvailable = js.native
  def sizeBoolean(size: PersonaSize): AnonIsSize10 = js.native
  @js.native
  object personaPresenceSize extends js.Object {
    /**
      * @deprecated This is now unused
      */
    val border: /* "2px" */ String = js.native
    val size12: /* "12px" */ String = js.native
    val size16: /* "16px" */ String = js.native
    val size20: /* "20px" */ String = js.native
    val size28: /* "28px" */ String = js.native
    val size32: /* "32px" */ String = js.native
    val size6: /* "6px" */ String = js.native
    val size8: /* "8px" */ String = js.native
  }
  
  @js.native
  object personaSize extends js.Object {
    val size10: /* "20px" */ String = js.native
    val size100: /* "100px" */ String = js.native
    val size120: /* "120px" */ String = js.native
    val size16: /* "16px" */ String = js.native
    val size24: /* "24px" */ String = js.native
    val size28: /* "28px" */ String = js.native
    val size32: /* "32px" */ String = js.native
    val size40: /* "40px" */ String = js.native
    val size48: /* "48px" */ String = js.native
    val size56: /* "56px" */ String = js.native
    val size72: /* "72px" */ String = js.native
    val size8: /* "20px" */ String = js.native
  }
  
  @js.native
  object sizeToPixels extends /* key */ NumberDictionary[Double]
  
}

