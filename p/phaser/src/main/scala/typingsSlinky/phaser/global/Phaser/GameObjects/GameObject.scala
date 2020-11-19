package typingsSlinky.phaser.global.Phaser.GameObjects

import typingsSlinky.phaser.Phaser.Scene
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The base class that all Game Objects extend.
  * You don't create GameObjects directly and they cannot be added to the display list.
  * Instead, use them as the base for your own custom classes.
  */
@JSGlobal("Phaser.GameObjects.GameObject")
@js.native
class GameObject protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.GameObject {
  /**
    * 
    * @param scene The Scene to which this Game Object belongs.
    * @param type A textual representation of the type of Game Object, i.e. `sprite`.
    */
  def this(scene: Scene, `type`: String) = this()
}
/* static members */
@JSGlobal("Phaser.GameObjects.GameObject")
@js.native
object GameObject extends js.Object {
  
  /**
    * The bitmask that `GameObject.renderFlags` is compared against to determine if the Game Object will render or not.
    */
  val RENDER_MASK: integer = js.native
}
