package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.FunctionComponentTileActi
import typingsSlinky.fundamentalReact.anon.FunctionComponentTileCont
import typingsSlinky.fundamentalReact.anon.FunctionComponentTileMedi
import typingsSlinky.fundamentalReact.anon.PartialTileProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapTileProp
import typingsSlinky.fundamentalReact.tileMod.TileProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fundamental-react", "Tile")
@js.native
object Tile extends js.Object {
  var Actions: FunctionComponentTileActi = js.native
  var Content: FunctionComponentTileCont = js.native
  var Media: FunctionComponentTileMedi = js.native
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  var defaultProps: js.UndefOr[PartialTileProps] = js.native
  var displayName: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Tile] = js.native
  var propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
  def apply(props: PropsWithChildren[TileProps]): ReactElement | Null = js.native
  def apply(props: PropsWithChildren[TileProps], context: js.Any): ReactElement | Null = js.native
}

