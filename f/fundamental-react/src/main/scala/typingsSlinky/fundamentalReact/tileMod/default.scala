package typingsSlinky.fundamentalReact.tileMod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.FunctionComponentTileActi
import typingsSlinky.fundamentalReact.FunctionComponentTileCont
import typingsSlinky.fundamentalReact.FunctionComponentTileMedi
import typingsSlinky.fundamentalReact.PartialTileProps
import typingsSlinky.fundamentalReact.WeakValidationMapTileProp
import typingsSlinky.fundamentalReact.fundamentalReactStrings.Tile
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react/lib/Tile/Tile", JSImport.Default)
@js.native
object default extends js.Object {
  var Actions: FunctionComponentTileActi = js.native
  var Content: FunctionComponentTileCont = js.native
  var Media: FunctionComponentTileMedi = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileProps] = js.native
  var displayName: js.UndefOr[String | Tile] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
  def apply(props: PropsWithChildren[TileProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TileProps], context: js.Any): ReactElement | Null = js.native
}

