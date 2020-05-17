package typingsSlinky.ejWebAll.global.ej

import org.scalajs.dom.raw.Element
import typingsSlinky.ejWebAll.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Tile")
@js.native
class Tile protected ()
  extends typingsSlinky.ejWebAll.ej.Tile {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typingsSlinky.ejWebAll.ej.Tile.Model) = this()
  def this(element: Element, options: typingsSlinky.ejWebAll.ej.Tile.Model) = this()
}

/* static members */
@JSGlobal("ej.Tile")
@js.native
object Tile extends js.Object {
  var Locale: js.Any = js.native
  var fn: typingsSlinky.ejWebAll.ej.Tile = js.native
  @js.native
  object BadgePosition extends js.Object {
    /* 1 */ val Bottomright: typingsSlinky.ejWebAll.ej.Tile.BadgePosition.Bottomright with Double = js.native
    /* 0 */ val Topright: typingsSlinky.ejWebAll.ej.Tile.BadgePosition.Topright with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tile.BadgePosition with Double] = js.native
  }
  
  @js.native
  object CaptionAlignment extends js.Object {
    /* 3 */ val Center: typingsSlinky.ejWebAll.ej.Tile.CaptionAlignment.Center with Double = js.native
    /* 1 */ val Left: typingsSlinky.ejWebAll.ej.Tile.CaptionAlignment.Left with Double = js.native
    /* 0 */ val Normal: typingsSlinky.ejWebAll.ej.Tile.CaptionAlignment.Normal with Double = js.native
    /* 2 */ val Right: typingsSlinky.ejWebAll.ej.Tile.CaptionAlignment.Right with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tile.CaptionAlignment with Double] = js.native
  }
  
  @js.native
  object CaptionPosition extends js.Object {
    /* 1 */ val Innerbottom: typingsSlinky.ejWebAll.ej.Tile.CaptionPosition.Innerbottom with Double = js.native
    /* 0 */ val Innertop: typingsSlinky.ejWebAll.ej.Tile.CaptionPosition.Innertop with Double = js.native
    /* 2 */ val Outer: typingsSlinky.ejWebAll.ej.Tile.CaptionPosition.Outer with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tile.CaptionPosition with Double] = js.native
  }
  
  @js.native
  object ImagePosition extends js.Object {
    /* 2 */ val BottomCenter: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.BottomCenter with Double = js.native
    /* 8 */ val BottomLeft: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.BottomLeft with Double = js.native
    /* 7 */ val BottomRight: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.BottomRight with Double = js.native
    /* 0 */ val Center: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.Center with Double = js.native
    /* 9 */ val Fill: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.Fill with Double = js.native
    /* 4 */ val LeftCenter: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.LeftCenter with Double = js.native
    /* 3 */ val RightCenter: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.RightCenter with Double = js.native
    /* 1 */ val TopCenter: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.TopCenter with Double = js.native
    /* 5 */ val TopLeft: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.TopLeft with Double = js.native
    /* 6 */ val TopRight: typingsSlinky.ejWebAll.ej.Tile.ImagePosition.TopRight with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tile.ImagePosition with Double] = js.native
  }
  
  @js.native
  object TileSize extends js.Object {
    /* 2 */ val Large: typingsSlinky.ejWebAll.ej.Tile.TileSize.Large with Double = js.native
    /* 0 */ val Medium: typingsSlinky.ejWebAll.ej.Tile.TileSize.Medium with Double = js.native
    /* 1 */ val Small: typingsSlinky.ejWebAll.ej.Tile.TileSize.Small with Double = js.native
    /* 3 */ val Wide: typingsSlinky.ejWebAll.ej.Tile.TileSize.Wide with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tile.TileSize with Double] = js.native
  }
  
  @js.native
  object liveTileType extends js.Object {
    /* 2 */ val Carousel: typingsSlinky.ejWebAll.ej.Tile.liveTileType.Carousel with Double = js.native
    /* 0 */ val Flip: typingsSlinky.ejWebAll.ej.Tile.liveTileType.Flip with Double = js.native
    /* 1 */ val Slide: typingsSlinky.ejWebAll.ej.Tile.liveTileType.Slide with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.ejWebAll.ej.Tile.liveTileType with Double] = js.native
  }
  
}

