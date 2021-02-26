package typingsSlinky.babylonjs.mod

import typingsSlinky.babylonjs.spriteManagerMod.ISpriteManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Sprite")
@js.native
class Sprite protected ()
  extends typingsSlinky.babylonjs.legacyMod.Sprite {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: String, manager: ISpriteManager) = this()
}
/* static members */
object Sprite {
  
  /**
    * Parses a JSON object to create a new sprite
    * @param parsedSprite The JSON object to parse
    * @param manager defines the hosting manager
    * @returns the new sprite
    */
  @JSImport("babylonjs", "Sprite.Parse")
  @js.native
  def Parse(parsedSprite: js.Any, manager: typingsSlinky.babylonjs.spriteManagerMod.SpriteManager): typingsSlinky.babylonjs.spriteMod.Sprite = js.native
}
