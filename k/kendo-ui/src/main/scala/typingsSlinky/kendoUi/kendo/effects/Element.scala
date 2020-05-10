package typingsSlinky.kendoUi.kendo.effects

import typingsSlinky.kendoUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def expand(direction: String): Expand = js.native
  def expandHorizontal(): Expand = js.native
  def expandVertical(): Expand = js.native
  def fade(direction: String): Fade = js.native
  def fadeIn(): Fade = js.native
  def fadeOut(): Fade = js.native
  def flip(axis: String, face: JQuery, back: JQuery): Flip = js.native
  def flipHorizontal(face: JQuery, back: JQuery): Flip = js.native
  def flipVertical(face: JQuery, back: JQuery): Flip = js.native
  def pageturn(axis: String, face: JQuery, back: JQuery): PageTurn = js.native
  def pageturnHorizontal(face: JQuery, back: JQuery): PageTurn = js.native
  def pageturnVertical(face: JQuery, back: JQuery): PageTurn = js.native
  def slideIn(direction: String): SlideIn = js.native
  def slideInDown(): SlideIn = js.native
  def slideInLeft(): SlideIn = js.native
  def slideInRight(): SlideIn = js.native
  def slideInUp(): SlideIn = js.native
  def tile(direction: String, previous: JQuery): Tile = js.native
  def tileDown(previous: JQuery): Tile = js.native
  def tileLeft(previous: JQuery): Tile = js.native
  def tileRight(previous: JQuery): Tile = js.native
  def tileUp(previous: JQuery): Tile = js.native
  def transfer(target: JQuery): Transfer = js.native
  def zoom(direction: String): Zoom = js.native
  def zoomIn(): Zoom = js.native
  def zoomOut(): Zoom = js.native
}

object Element {
  @scala.inline
  def apply(
    expand: String => Expand,
    expandHorizontal: () => Expand,
    expandVertical: () => Expand,
    fade: String => Fade,
    fadeIn: () => Fade,
    fadeOut: () => Fade,
    flip: (String, JQuery, JQuery) => Flip,
    flipHorizontal: (JQuery, JQuery) => Flip,
    flipVertical: (JQuery, JQuery) => Flip,
    pageturn: (String, JQuery, JQuery) => PageTurn,
    pageturnHorizontal: (JQuery, JQuery) => PageTurn,
    pageturnVertical: (JQuery, JQuery) => PageTurn,
    slideIn: String => SlideIn,
    slideInDown: () => SlideIn,
    slideInLeft: () => SlideIn,
    slideInRight: () => SlideIn,
    slideInUp: () => SlideIn,
    tile: (String, JQuery) => Tile,
    tileDown: JQuery => Tile,
    tileLeft: JQuery => Tile,
    tileRight: JQuery => Tile,
    tileUp: JQuery => Tile,
    transfer: JQuery => Transfer,
    zoom: String => Zoom,
    zoomIn: () => Zoom,
    zoomOut: () => Zoom
  ): Element = {
    val __obj = js.Dynamic.literal(expand = js.Any.fromFunction1(expand), expandHorizontal = js.Any.fromFunction0(expandHorizontal), expandVertical = js.Any.fromFunction0(expandVertical), fade = js.Any.fromFunction1(fade), fadeIn = js.Any.fromFunction0(fadeIn), fadeOut = js.Any.fromFunction0(fadeOut), flip = js.Any.fromFunction3(flip), flipHorizontal = js.Any.fromFunction2(flipHorizontal), flipVertical = js.Any.fromFunction2(flipVertical), pageturn = js.Any.fromFunction3(pageturn), pageturnHorizontal = js.Any.fromFunction2(pageturnHorizontal), pageturnVertical = js.Any.fromFunction2(pageturnVertical), slideIn = js.Any.fromFunction1(slideIn), slideInDown = js.Any.fromFunction0(slideInDown), slideInLeft = js.Any.fromFunction0(slideInLeft), slideInRight = js.Any.fromFunction0(slideInRight), slideInUp = js.Any.fromFunction0(slideInUp), tile = js.Any.fromFunction2(tile), tileDown = js.Any.fromFunction1(tileDown), tileLeft = js.Any.fromFunction1(tileLeft), tileRight = js.Any.fromFunction1(tileRight), tileUp = js.Any.fromFunction1(tileUp), transfer = js.Any.fromFunction1(transfer), zoom = js.Any.fromFunction1(zoom), zoomIn = js.Any.fromFunction0(zoomIn), zoomOut = js.Any.fromFunction0(zoomOut))
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpand(value: String => Expand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpandHorizontal(value: () => Expand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandHorizontal")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpandVertical(value: () => Expand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandVertical")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFade(value: String => Fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFadeIn(value: () => Fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFadeOut(value: () => Fade): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeOut")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlip(value: (String, JQuery, JQuery) => Flip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withFlipHorizontal(value: (JQuery, JQuery) => Flip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipHorizontal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFlipVertical(value: (JQuery, JQuery) => Flip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flipVertical")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPageturn(value: (String, JQuery, JQuery) => PageTurn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageturn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPageturnHorizontal(value: (JQuery, JQuery) => PageTurn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageturnHorizontal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPageturnVertical(value: (JQuery, JQuery) => PageTurn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageturnVertical")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSlideIn(value: String => SlideIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSlideInDown(value: () => SlideIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideInDown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSlideInLeft(value: () => SlideIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideInLeft")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSlideInRight(value: () => SlideIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideInRight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSlideInUp(value: () => SlideIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideInUp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTile(value: (String, JQuery) => Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTileDown(value: JQuery => Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileDown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTileLeft(value: JQuery => Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTileRight(value: JQuery => Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileRight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTileUp(value: JQuery => Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileUp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransfer(value: JQuery => Transfer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transfer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withZoom(value: String => Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withZoomIn(value: () => Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withZoomOut(value: () => Zoom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

