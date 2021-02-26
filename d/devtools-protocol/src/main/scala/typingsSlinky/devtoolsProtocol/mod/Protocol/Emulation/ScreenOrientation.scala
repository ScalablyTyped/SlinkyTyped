package typingsSlinky.devtoolsProtocol.mod.Protocol.Emulation

import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.landscapePrimary
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.landscapeSecondary
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.portraitPrimary
import typingsSlinky.devtoolsProtocol.devtoolsProtocolStrings.portraitSecondary
import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenOrientation extends StObject {
  
  /**
    * Orientation angle.
    */
  var angle: integer = js.native
  
  /**
    * Orientation type. (ScreenOrientationType enum)
    */
  var `type`: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary = js.native
}
object ScreenOrientation {
  
  @scala.inline
  def apply(
    angle: integer,
    `type`: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary
  ): ScreenOrientation = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenOrientation]
  }
  
  @scala.inline
  implicit class ScreenOrientationMutableBuilder[Self <: ScreenOrientation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAngle(value: integer): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: portraitPrimary | portraitSecondary | landscapePrimary | landscapeSecondary): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
