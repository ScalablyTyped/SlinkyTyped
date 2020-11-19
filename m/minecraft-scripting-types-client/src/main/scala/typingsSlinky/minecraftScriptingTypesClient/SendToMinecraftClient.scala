package typingsSlinky.minecraftScriptingTypesClient

import typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColondisplay_chat_event
import typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonload_ui
import typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonscript_logger_config
import typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonsend_ui_event
import typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonspawn_particle_attached_entity
import typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonspawn_particle_in_world
import typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonunload_ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColondisplay_chat_event
  - typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonload_ui
  - typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonscript_logger_config
  - typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonsend_ui_event
  - typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonspawn_particle_attached_entity
  - typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonspawn_particle_in_world
  - typingsSlinky.minecraftScriptingTypesClient.minecraftScriptingTypesClientStrings.minecraftColonunload_ui
*/
trait SendToMinecraftClient extends js.Object
object SendToMinecraftClient {
  
  /**
    * This event is used to display a chat message to the specific player that is running the client script. The event data is the message to be displayed in plain text. Special formatting is supported the same way it would be if a player was sending the message.
    */
  @scala.inline
  def DisplayChat: minecraftColondisplay_chat_event = "minecraft:display_chat_event".asInstanceOf[minecraftColondisplay_chat_event]
  
  /**
    * This event is used to show a UI screen to the specific player running the client script. This event will add the UI screen to the top of the UI screen stack. The screen will be shown immediately after the event is triggered. Only screens defined in a HTML file can be shown using this event.
    */
  @scala.inline
  def LoadUI: minecraftColonload_ui = "minecraft:load_ui".asInstanceOf[minecraftColonload_ui]
  
  /**
    * This event is used to turn various levels of logging on and off for client scripts. Note that turning logging on/off is not limited to the script that broadcasted the event. It will affect ALL client scripts including those in other Behavior Packs that are applied to the world. See the Debugging section for more information on logging.
    */
  @scala.inline
  def ScriptLoggerConfig: minecraftColonscript_logger_config = "minecraft:script_logger_config".asInstanceOf[minecraftColonscript_logger_config]
  
  /**
    * This event is used to send UI events to the UI Engine for the specific player running the script. After the event is triggered, the UI event will be sent immediately.
    * Custom UI is based on HTML 5. Review the scripting demo for an example of a custom UI file.
    */
  @scala.inline
  def SendUIEvent: minecraftColonsend_ui_event = "minecraft:send_ui_event".asInstanceOf[minecraftColonsend_ui_event]
  
  /**
    * This event is used to create a particle effect that will follow an entity around. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. MoLang variables defined in the JSON of the effect can then be used to control that effect by changing them in the entity to which it is attached.
    */
  @scala.inline
  def SpawnParticleAttachedEntity: minecraftColonspawn_particle_attached_entity = "minecraft:spawn_particle_attached_entity".asInstanceOf[minecraftColonspawn_particle_attached_entity]
  
  /**
    * This event is used to create a static particle effect in the world. This particle effect is only visible to the specific player that is running the client script where you fired the event. Any effect defined in a JSON file (both in your resource pack and in Minecraft) can be used here. Once the effect is spawned you won't be able to control it further. Unlike the server version of the event, the client version will spawn the particle in the dimension the player is currently in.
    */
  @scala.inline
  def SpawnParticleInWorld: minecraftColonspawn_particle_in_world = "minecraft:spawn_particle_in_world".asInstanceOf[minecraftColonspawn_particle_in_world]
  
  /**
    * This event is used to remove a UI screen from the stack of the specific player running the client script. The event data contains the name of the screen to remove as a string. After the event is triggered the screen will be scheduled to be removed from the stack the next time the UI Engine can do so. Only screens defined in a HTML file can be removed using this event.
    */
  @scala.inline
  def UnloadUI: minecraftColonunload_ui = "minecraft:unload_ui".asInstanceOf[minecraftColonunload_ui]
}
