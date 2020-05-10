package typingsSlinky.draftJs.mod

import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadataConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("draft-js", "CharacterMetadata")
@js.native
class CharacterMetadata ()
  extends typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata

/* static members */
@JSImport("draft-js", "CharacterMetadata")
@js.native
object CharacterMetadata extends js.Object {
  def applyEntity(record: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def applyEntity(record: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, entityKey: String): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def applyStyle(record: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  /**
    * Use this function instead of the `CharacterMetadata` constructor.
    * Since most content generally uses only a very small number of
    * style/entity permutations, we can reuse these objects as often as
    * possible.
    */
  def create(): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def create(config: CharacterMetadataConfig): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  def removeStyle(record: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
}

