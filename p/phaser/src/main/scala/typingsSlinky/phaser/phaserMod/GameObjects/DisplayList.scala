package typingsSlinky.phaser.phaserMod.GameObjects

import typingsSlinky.phaser.Phaser.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Display List plugin.
  * 
  * Display Lists belong to a Scene and maintain the list of Game Objects to render every frame.
  * 
  * Some of these Game Objects may also be part of the Scene's [Update List]{@link Phaser.GameObjects.UpdateList}, for updating.
  */
@JSImport("phaser", "GameObjects.DisplayList")
@js.native
class DisplayList protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.DisplayList {
  /**
    * 
    * @param scene The Scene that this Display List belongs to.
    */
  def this(scene: Scene) = this()
}

