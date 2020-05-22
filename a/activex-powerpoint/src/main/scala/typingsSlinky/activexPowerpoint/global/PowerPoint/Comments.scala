package typingsSlinky.activexPowerpoint.global.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Comments")
@js.native
class Comments protected ()
  extends typingsSlinky.activexPowerpoint.PowerPoint.Comments {
  /* CompleteClass */
  override val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Comments_typekey")
  override var PowerPointDotComments_typekey: typingsSlinky.activexPowerpoint.PowerPoint.Comments = js.native
  /* CompleteClass */
  override def Add(Left: Double, Top: Double, Author: String, AuthorInitials: String, Text: String): typingsSlinky.activexPowerpoint.PowerPoint.Comment = js.native
  /* CompleteClass */
  override def Item(Index: Double): typingsSlinky.activexPowerpoint.PowerPoint.Comment = js.native
}

