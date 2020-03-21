package typingsSlinky.phaser

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.phaser.spine.AttachmentLoader
import typingsSlinky.phaser.spine.BlendMode
import typingsSlinky.phaser.spine.PositionMode
import typingsSlinky.phaser.spine.RotateMode
import typingsSlinky.phaser.spine.SkeletonJson
import typingsSlinky.phaser.spine.SpacingMode
import typingsSlinky.phaser.spine.TransformMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofSkeletonJson extends Instantiable1[/* attachmentLoader */ AttachmentLoader, SkeletonJson] {
  def blendModeFromString(str: String): BlendMode = js.native
  def positionModeFromString(str: String): PositionMode = js.native
  def rotateModeFromString(str: String): RotateMode = js.native
  def spacingModeFromString(str: String): SpacingMode = js.native
  def transformModeFromString(str: String): TransformMode = js.native
}

