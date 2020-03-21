package typingsSlinky.draftJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "ContentState")
@js.native
class ContentState ()
  extends typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState

/* static members */
@JSImport("draft-js", "ContentState")
@js.native
object ContentState extends js.Object {
  def createFromBlockArray(blocks: js.Array[typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentBlock]): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromBlockArray(
    blocks: js.Array[typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentBlock],
    entityMap: js.Any
  ): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
  def createFromText(text: String, delimiter: String): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.ContentState = js.native
}

