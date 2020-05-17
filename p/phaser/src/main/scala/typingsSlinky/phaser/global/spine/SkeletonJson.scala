package typingsSlinky.phaser.global.spine

import typingsSlinky.phaser.spine.AttachmentLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.SkeletonJson")
@js.native
class SkeletonJson protected ()
  extends typingsSlinky.phaser.spine.SkeletonJson {
  def this(attachmentLoader: AttachmentLoader) = this()
}

/* static members */
@JSGlobal("spine.SkeletonJson")
@js.native
object SkeletonJson extends js.Object {
  def blendModeFromString(str: String): typingsSlinky.phaser.spine.BlendMode = js.native
  def positionModeFromString(str: String): typingsSlinky.phaser.spine.PositionMode = js.native
  def rotateModeFromString(str: String): typingsSlinky.phaser.spine.RotateMode = js.native
  def spacingModeFromString(str: String): typingsSlinky.phaser.spine.SpacingMode = js.native
  def transformModeFromString(str: String): typingsSlinky.phaser.spine.TransformMode = js.native
}

