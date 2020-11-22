package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.spriteManagerMod.ISpriteManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Sprite")
@js.native
class Sprite protected ()
  extends typingsSlinky.babylonjs.indexMod.Sprite {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: String, manager: ISpriteManager) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "Sprite")
@js.native
object Sprite extends js.Object {
  
  /**
    * Parses a JSON object to create a new sprite
    * @param parsedSprite The JSON object to parse
    * @param manager defines the hosting manager
    * @returns the new sprite
    */
  def Parse(parsedSprite: js.Any, manager: typingsSlinky.babylonjs.spriteManagerMod.SpriteManager): typingsSlinky.babylonjs.spriteMod.Sprite = js.native
}
