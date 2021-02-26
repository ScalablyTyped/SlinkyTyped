package typingsSlinky.minecraftScriptingTypesServer

import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonarmor_container
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonattack
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColoncollision_box
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColondamage_sensor
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonequipment
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonequippable
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonexplode
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonhand_container
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonhealable
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonhealth
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonhotbar_container
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColoninteract
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColoninventory
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColoninventory_container
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonlookat
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonnameable
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonposition
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonrotation
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonshooter
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonspawn_entity
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonteleport
import typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColontick_world
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonarmor_container
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonattack
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColoncollision_box
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColondamage_sensor
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonequipment
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonequippable
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonexplode
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonhand_container
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonhealable
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonhealth
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonhotbar_container
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColoninteract
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColoninventory
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColoninventory_container
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonlookat
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonnameable
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonposition
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonrotation
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonshooter
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonspawn_entity
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColonteleport
  - typingsSlinky.minecraftScriptingTypesServer.minecraftScriptingTypesServerStrings.minecraftColontick_world
*/
trait MinecraftComponent extends StObject
object MinecraftComponent {
  
  /**
    * This component represents the armor contents of an entity. The component contains an array of ItemStack JS API Objects representing each slot in the armor container. NOTE: Currently items and containers are read-only. Slots are ordered from head to feet.
    */
  @scala.inline
  def ArmorContainer: minecraftColonarmor_container = "minecraft:armor_container".asInstanceOf[minecraftColonarmor_container]
  
  /**
    * This component controls the Attack Damage attribute from the entity. It allows you to change the current minimum and maximum values. Once the changes are applied, the current attack of the entity will be reset to the minimum specified. With the minimum and maximum changed to the values specified. Any buffs or debuffs will be left intact.
    */
  @scala.inline
  def Attack: minecraftColonattack = "minecraft:attack".asInstanceOf[minecraftColonattack]
  
  /**
    * Controls the collision box of the entity. When changes to the component are applied the entity's collision box is immediately updated to reflect the new dimensions. WARNING: If the change of the collision box dimensions would cause the entity to be inside a block, the entity might become stuck there and start suffocating.
    */
  @scala.inline
  def CollisionBox: minecraftColoncollision_box = "minecraft:collision_box".asInstanceOf[minecraftColoncollision_box]
  
  /**
    * Defines an array of damages and how the entity reacts to them - including whether the entity ignores that damage or not. Currently Minecraft triggers can't be properly serialized so any existing triggers will be completely replaced when applyComponentChanges().
    */
  @scala.inline
  def DamageSensor: minecraftColondamage_sensor = "minecraft:damage_sensor".asInstanceOf[minecraftColondamage_sensor]
  
  /**
    * Defines the loot table the entity uses to defines its equipment. Once the changes are applied, the equipment is re-rolled and a new set of equipment is chosen for the entity.
    */
  @scala.inline
  def Equipment: minecraftColonequipment = "minecraft:equipment".asInstanceOf[minecraftColonequipment]
  
  /**
    * Defines how many and what items the entity can be equipped with.
    */
  @scala.inline
  def Equippable: minecraftColonequippable = "minecraft:equippable".asInstanceOf[minecraftColonequippable]
  
  /**
    * Controls the entity's explosion, timer until the explosion, and whether the timer is counting down or not.
    */
  @scala.inline
  def Explode: minecraftColonexplode = "minecraft:explode".asInstanceOf[minecraftColonexplode]
  
  /**
    * This component represents the contents of an entity's hands. The component contains an array of ItemStack JS API Objects representing each slot in the hand container. NOTE: Currently items and containers are read-only. Slot 0 is main-hand Slot 1 is off-hand.
    */
  @scala.inline
  def HandContainer: minecraftColonhand_container = "minecraft:hand_container".asInstanceOf[minecraftColonhand_container]
  
  /**
    * Defines how the entity can be healed by the player. This doesn't control how much health the entity can have; you must use the Health component for that instead.
    */
  @scala.inline
  def Healable: minecraftColonhealable = "minecraft:healable".asInstanceOf[minecraftColonhealable]
  
  /**
    * Defines the current and maximum possible health of the entity. Upon applying the component back to the entity the health will change. If it reaches 0 or below the entity will die.
    */
  @scala.inline
  def Health: minecraftColonhealth = "minecraft:health".asInstanceOf[minecraftColonhealth]
  
  /**
    * This component represents the hotbar contents of a player. The component contains an array of ItemStack JS API Objects representing each slot in the hotbar. NOTE: Currently items and containers are read-only. Slots are ordered left to right.
    */
  @scala.inline
  def HotbarContainer: minecraftColonhotbar_container = "minecraft:hotbar_container".asInstanceOf[minecraftColonhotbar_container]
  
  /**
    * Defines the ways the player can interact with the entity to which this component is applied.
    */
  @scala.inline
  def Interact: minecraftColoninteract = "minecraft:interact".asInstanceOf[minecraftColoninteract]
  
  /**
    * Defines the entity's inventory (size, restrictions, etc.). Currently this does not allow changing the entity's inventory contents.
    */
  @scala.inline
  def Inventory: minecraftColoninventory = "minecraft:inventory".asInstanceOf[minecraftColoninventory]
  
  /**
    * This component represents the inventory contents of an entity. The component contains an array of ItemStack JS API Objects representing each slot in the inventory. NOTE: Currently items and containers are read-only.Slot 0-8 is the hotbar, 9-16 is the top row of the player's inventory, 17-24 is the middle row, 25-32 is the bottom row
    */
  @scala.inline
  def InventoryContainer: minecraftColoninventory_container = "minecraft:inventory_container".asInstanceOf[minecraftColoninventory_container]
  
  /**
    * Makes the entity look at another entity. Once applied, if an entity of the specified type is nearby and can be targeted the entity will turn towards it.
    */
  @scala.inline
  def LookAt: minecraftColonlookat = "minecraft:lookat".asInstanceOf[minecraftColonlookat]
  
  /**
    * Nameable component describes an entity's ability to be named using a nametag and whether the name shows up or not once applied. Additionally, scripting allows setting the name of the entity directly with the property 'name'.
    */
  @scala.inline
  def Nameable: minecraftColonnameable = "minecraft:nameable".asInstanceOf[minecraftColonnameable]
  
  /**
    * This component allows you to control an entity's current position in the world. Once applied the entity will be teleported to the new position specified.
    */
  @scala.inline
  def Position: minecraftColonposition = "minecraft:position".asInstanceOf[minecraftColonposition]
  
  /**
    * This component allows you to control an entity's current rotation in the world as well as the entity's head rotation. Once applied, the entity will be rotated as specified.
    */
  @scala.inline
  def Rotation: minecraftColonrotation = "minecraft:rotation".asInstanceOf[minecraftColonrotation]
  
  /**
    * Defines the entity's ranged attacks. This doesn't allow the entity to use a ranged attack: it only defines what kind of projectile it shoots.
    */
  @scala.inline
  def Shooter: minecraftColonshooter = "minecraft:shooter".asInstanceOf[minecraftColonshooter]
  
  /**
    * Controls the entity's ability to spawn an entity or an item. This is similar to the chicken's ability to lay eggs after a set amount of time.
    */
  @scala.inline
  def SpawnEntity: minecraftColonspawn_entity = "minecraft:spawn_entity".asInstanceOf[minecraftColonspawn_entity]
  
  /**
    * This controls the entity's ability to teleport itself (similar to the Enderman). If you wish to teleport the entity once use the Position component instead.
    */
  @scala.inline
  def Teleport: minecraftColonteleport = "minecraft:teleport".asInstanceOf[minecraftColonteleport]
  
  /**
    * The tick world component is a read-only component that allows users to access the ticking areas on entities as well as the ticking area's data.
    */
  @scala.inline
  def TickWorld: minecraftColontick_world = "minecraft:tick_world".asInstanceOf[minecraftColontick_world]
}
