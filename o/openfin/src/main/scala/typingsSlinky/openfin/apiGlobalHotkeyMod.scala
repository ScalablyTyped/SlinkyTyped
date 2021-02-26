package typingsSlinky.openfin

import typingsSlinky.openfin.baseMod.EmitterBase
import typingsSlinky.openfin.globalHotkeyMod.GlobalHotkeyEvents
import typingsSlinky.openfin.openfinStrings.registered
import typingsSlinky.openfin.openfinStrings.unregistered
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiGlobalHotkeyMod {
  
  @JSImport("openfin/_v2/api/global-hotkey", JSImport.Default)
  @js.native
  class default protected () extends GlobalHotkey {
    def this(wire: typingsSlinky.openfin.transportMod.default) = this()
  }
  
  @js.native
  trait GlobalHotkey extends EmitterBase[GlobalHotkeyEvents] {
    
    /**
      * Checks if a given hotkey has been registered
      * @param { string } hotkey a hotkey string
      * @return {Promise.<boolean>}
      * @tutorial GlobalHotkey.isRegistered
      */
    def isRegistered(hotkey: String): js.Promise[Boolean] = js.native
    
    /**
      * Registers a global hotkey with the operating system.
      * @param { string } hotkey a hotkey string
      * @param { Function } listener called when the registered hotkey is pressed by the user.
      * @return {Promise.<void>}
      * @tutorial GlobalHotkey.register
      */
    def register(hotkey: String, listener: js.Function1[/* repeated */ js.Any, Unit]): js.Promise[Unit] = js.native
    
    /**
      * Unregisters a global hotkey with the operating system.
      * @param { string } hotkey a hotkey string
      * @return {Promise.<void>}
      * @tutorial GlobalHotkey.unregister
      */
    def unregister(hotkey: String): js.Promise[Unit] = js.native
    
    /**
      * Unregisters all global hotkeys for the current application.
      * @return {Promise.<void>}
      * @tutorial GlobalHotkey.unregisterAll
      */
    def unregisterAll(): js.Promise[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.openfin.openfinStrings.registered
    - typingsSlinky.openfin.openfinStrings.unregistered
  */
  trait nonHotkeyEvents extends StObject
  object nonHotkeyEvents {
    
    @scala.inline
    def REGISTERED: registered = "registered".asInstanceOf[registered]
    
    @scala.inline
    def UNREGISTERED: unregistered = "unregistered".asInstanceOf[unregistered]
  }
}
