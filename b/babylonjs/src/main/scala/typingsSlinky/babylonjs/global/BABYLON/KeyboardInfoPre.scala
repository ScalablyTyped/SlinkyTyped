package typingsSlinky.babylonjs.global.BABYLON

import org.scalajs.dom.raw.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.KeyboardInfoPre")
@js.native
class KeyboardInfoPre protected ()
  extends typingsSlinky.babylonjs.BABYLON.KeyboardInfoPre {
  /**
    * Instantiates a new keyboard pre info.
    * This class is used to store keyboard related info for the onPreKeyboardObservable event.
    * @param type Defines the type of event (KeyboardEventTypes)
    * @param event Defines the related dom event
    */
  def this(
    /**
    * Defines the type of event (KeyboardEventTypes)
    */
  `type`: Double,
    /**
    * Defines the related dom event
    */
  event: KeyboardEvent
  ) = this()
}
