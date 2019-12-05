package typingsSlinky.phaser.phaserMod.GameObjects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextStyle class manages all of the style settings for a Text object.
  * 
  * Text Game Objects create a TextStyle instance automatically, which is
  * accessed via the `Text.style` property. You do not normally need to
  * instantiate one yourself.
  */
@JSImport("phaser", "GameObjects.TextStyle")
@js.native
class TextStyle protected ()
  extends typingsSlinky.phaser.Phaser.GameObjects.TextStyle {
  /**
    * 
    * @param text The Text object that this TextStyle is styling.
    * @param style The style settings to set.
    */
  def this(
    text: typingsSlinky.phaser.Phaser.GameObjects.Text,
    style: typingsSlinky.phaser.Phaser.Types.GameObjects.Text.TextStyle
  ) = this()
}

