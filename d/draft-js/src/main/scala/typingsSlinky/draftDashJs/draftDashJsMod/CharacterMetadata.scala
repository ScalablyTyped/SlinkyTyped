package typingsSlinky.draftDashJs.draftDashJsMod

import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadataConfig
import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.DraftInlineStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "CharacterMetadata")
@js.native
class CharacterMetadata ()
  extends typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata {
  /* CompleteClass */
  override def getEntity(): String = js.native
  /* CompleteClass */
  override def getStyle(): DraftInlineStyle = js.native
  /* CompleteClass */
  override def hasStyle(style: String): Boolean = js.native
}

/* static members */
@JSImport("draft-js", "CharacterMetadata")
@js.native
object CharacterMetadata extends js.Object {
  def applyEntity(record: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def applyEntity(
    record: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata,
    entityKey: String
  ): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def applyStyle(
    record: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata,
    style: String
  ): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  /**
    * Use this function instead of the `CharacterMetadata` constructor.
    * Since most content generally uses only a very small number of
    * style/entity permutations, we can reuse these objects as often as
    * possible.
    */
  def create(): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def create(config: CharacterMetadataConfig): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def removeStyle(
    record: typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata,
    style: String
  ): typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.CharacterMetadata = js.native
}

