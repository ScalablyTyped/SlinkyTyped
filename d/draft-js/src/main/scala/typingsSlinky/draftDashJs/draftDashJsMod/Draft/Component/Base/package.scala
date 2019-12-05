package typingsSlinky.draftDashJs.draftDashJsMod.Draft.Component

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Base {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftBlockType
  import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.Constants.DraftEditorCommand
  import typingsSlinky.draftDashJs.draftDashJsMod.Draft.Model.ImmutableData.DraftBlockRenderConfig
  import typingsSlinky.immutable.Immutable.Map
  import typingsSlinky.react.reactMod.CSSProperties

  type DraftBlockRenderMap = Map[DraftBlockType, DraftBlockRenderConfig]
  type DraftStyleMap = StringDictionary[CSSProperties]
  type EditorCommand = DraftEditorCommand | String
}
