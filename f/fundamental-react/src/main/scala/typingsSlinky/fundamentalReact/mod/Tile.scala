package typingsSlinky.fundamentalReact.mod

import slinky.core.facade.ReactElement
import typingsSlinky.fundamentalReact.anon.FCTileContentPropsdisplay
import typingsSlinky.fundamentalReact.anon.FCTileFooterPropsdisplayN
import typingsSlinky.fundamentalReact.anon.FCTileHeaderPropsdisplayN
import typingsSlinky.fundamentalReact.anon.PartialTileProps
import typingsSlinky.fundamentalReact.anon.WeakValidationMapTileProp
import typingsSlinky.fundamentalReact.tileMod.TileProps
import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileProps> & {  displayName :'Tile',   Content :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileContentProps> & {  displayName :'Tile.Content'},   Footer :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileFooterProps> & {  displayName :'Tile.Footer'},   Header :react.react.FC<fundamental-react.fundamental-react/lib/Tile/Tile.TileHeaderProps> & {  displayName :'Tile.Header'}} */
object Tile {
  
  @JSImport("fundamental-react", "Tile")
  @js.native
  def apply(props: PropsWithChildren[TileProps]): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Tile")
  @js.native
  def apply(props: PropsWithChildren[TileProps], context: js.Any): ReactElement | Null = js.native
  @JSImport("fundamental-react", "Tile")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fundamental-react", "Tile.Content")
  @js.native
  def Content: FCTileContentPropsdisplay = js.native
  @scala.inline
  def Content_=(x: FCTileContentPropsdisplay): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.Footer")
  @js.native
  def Footer: FCTileFooterPropsdisplayN = js.native
  @scala.inline
  def Footer_=(x: FCTileFooterPropsdisplayN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.Header")
  @js.native
  def Header: FCTileHeaderPropsdisplayN = js.native
  @scala.inline
  def Header_=(x: FCTileHeaderPropsdisplayN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[js.Any]] = js.native
  @scala.inline
  def contextTypes_=(x: js.UndefOr[ValidationMap[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialTileProps] = js.native
  @scala.inline
  def defaultProps_=(x: js.UndefOr[PartialTileProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.displayName")
  @js.native
  def displayName: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Tile] = js.native
  @scala.inline
  def displayName_=(x: js.UndefOr[String | typingsSlinky.fundamentalReact.fundamentalReactStrings.Tile]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("fundamental-react", "Tile.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapTileProp] = js.native
  @scala.inline
  def propTypes_=(x: js.UndefOr[WeakValidationMapTileProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
