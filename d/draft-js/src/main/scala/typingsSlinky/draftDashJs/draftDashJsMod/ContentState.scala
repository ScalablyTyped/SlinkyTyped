package typingsSlinky.draftDashJs.draftDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "ContentState")
@js.native
class ContentState ()
  extends typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState

/* static members */
@JSImport("draft-js", "ContentState")
@js.native
object ContentState extends js.Object {
  def createFromBlockArray(blocks: js.Array[typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock]): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromBlockArray(
    blocks: js.Array[typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentBlock],
    entityMap: js.Any
  ): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String, delimiter: String): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.ContentState = js.native
}

