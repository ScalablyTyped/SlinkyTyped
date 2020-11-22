package typingsSlinky.babylonjs.global.BABYLON

import typingsSlinky.babylonjs.BABYLON.ISpriteManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Sprite")
@js.native
class Sprite protected ()
  extends typingsSlinky.babylonjs.BABYLON.Sprite {
  /**
    * Creates a new Sprite
    * @param name defines the name
    * @param manager defines the manager
    */
  def this(/** defines the name */
  name: String, manager: ISpriteManager) = this()
}
/* static members */
@JSGlobal("BABYLON.Sprite")
@js.native
object Sprite extends js.Object {
  
  /**
    * Parses a JSON object to create a new sprite
    * @param parsedSprite The JSON object to parse
    * @param manager defines the hosting manager
    * @returns the new sprite
    */
  def Parse(parsedSprite: js.Any, manager: typingsSlinky.babylonjs.BABYLON.SpriteManager): typingsSlinky.babylonjs.BABYLON.Sprite = js.native
}
