package typingsSlinky.draftJs.mod

import typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadataConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("draft-js", "CharacterMetadata")
@js.native
class CharacterMetadata ()
  extends typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata
object CharacterMetadata {
  
  /* static member */
  @JSImport("draft-js", "CharacterMetadata.applyEntity")
  @js.native
  def applyEntity(record: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  @JSImport("draft-js", "CharacterMetadata.applyEntity")
  @js.native
  def applyEntity(record: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, entityKey: String): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  
  /* static member */
  @JSImport("draft-js", "CharacterMetadata.applyStyle")
  @js.native
  def applyStyle(record: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  
  /**
    * Use this function instead of the `CharacterMetadata` constructor.
    * Since most content generally uses only a very small number of
    * style/entity permutations, we can reuse these objects as often as
    * possible.
    */
  /* static member */
  @JSImport("draft-js", "CharacterMetadata.create")
  @js.native
  def create(): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  @JSImport("draft-js", "CharacterMetadata.create")
  @js.native
  def create(config: CharacterMetadataConfig): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
  
  /* static member */
  @JSImport("draft-js", "CharacterMetadata.removeStyle")
  @js.native
  def removeStyle(record: typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata, style: String): typingsSlinky.draftJs.mod.Draft.Model.ImmutableData.CharacterMetadata = js.native
}
