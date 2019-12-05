package typingsSlinky.phaser.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AttachmentType extends js.Object

@JSGlobal("spine.AttachmentType")
@js.native
object AttachmentType extends js.Object {
  @js.native
  sealed trait BoundingBox extends AttachmentType
  
  @js.native
  sealed trait Clipping extends AttachmentType
  
  @js.native
  sealed trait LinkedMesh extends AttachmentType
  
  @js.native
  sealed trait Mesh extends AttachmentType
  
  @js.native
  sealed trait Path extends AttachmentType
  
  @js.native
  sealed trait Point extends AttachmentType
  
  @js.native
  sealed trait Region extends AttachmentType
  
  /* 1 */ val BoundingBox: typingsSlinky.phaser.spine.AttachmentType.BoundingBox with Double = js.native
  /* 6 */ val Clipping: typingsSlinky.phaser.spine.AttachmentType.Clipping with Double = js.native
  /* 3 */ val LinkedMesh: typingsSlinky.phaser.spine.AttachmentType.LinkedMesh with Double = js.native
  /* 2 */ val Mesh: typingsSlinky.phaser.spine.AttachmentType.Mesh with Double = js.native
  /* 4 */ val Path: typingsSlinky.phaser.spine.AttachmentType.Path with Double = js.native
  /* 5 */ val Point: typingsSlinky.phaser.spine.AttachmentType.Point with Double = js.native
  /* 0 */ val Region: typingsSlinky.phaser.spine.AttachmentType.Region with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AttachmentType with Double] = js.native
}

