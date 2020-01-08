package typingsSlinky.fundamentalDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.fundamentalDashReact.fundamentalDashReactStrings.Tile
import typingsSlinky.fundamentalDashReact.libTileTileMod.TileActionsProps
import typingsSlinky.fundamentalDashReact.libTileTileMod.TileContentProps
import typingsSlinky.fundamentalDashReact.libTileTileMod.TileMediaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionsContent extends js.Object {
  var Actions: ReactComponentClass[TileActionsProps] with Anon_DisplayNameTileActions
  var Content: ReactComponentClass[TileContentProps] with Anon_DisplayNameTileContent
  var Media: ReactComponentClass[TileMediaProps] with Anon_DisplayNameTileMedia
  var displayName: Tile
}

object Anon_ActionsContent {
  @scala.inline
  def apply(
    Actions: ReactComponentClass[TileActionsProps] with Anon_DisplayNameTileActions,
    Content: ReactComponentClass[TileContentProps] with Anon_DisplayNameTileContent,
    Media: ReactComponentClass[TileMediaProps] with Anon_DisplayNameTileMedia,
    displayName: Tile
  ): Anon_ActionsContent = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], Media = Media.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActionsContent]
  }
}

