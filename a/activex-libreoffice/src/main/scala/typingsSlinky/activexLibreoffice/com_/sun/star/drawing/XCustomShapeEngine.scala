package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The {@link XCustomShapeEngine} */
@js.native
trait XCustomShapeEngine extends XInterface {
  /** @returns a collection of interaction handles */
  val Interaction: SafeArray[XCustomShapeHandle] = js.native
  /** @returns the line geometry of the object */
  val LineGeometry: PolyPolygonBezierCoords = js.native
  /** @returns the text bound of the shape */
  val TextBounds: Rectangle = js.native
  /** @returns a collection of interaction handles */
  def getInteraction(): SafeArray[XCustomShapeHandle] = js.native
  /** @returns the line geometry of the object */
  def getLineGeometry(): PolyPolygonBezierCoords = js.native
  /** @returns the text bound of the shape */
  def getTextBounds(): Rectangle = js.native
  /** @returns a the shape that is representing the {@link CustomShape} */
  def render(): XShape = js.native
}

object XCustomShapeEngine {
  @scala.inline
  def apply(
    Interaction: SafeArray[XCustomShapeHandle],
    LineGeometry: PolyPolygonBezierCoords,
    TextBounds: Rectangle,
    acquire: () => Unit,
    getInteraction: () => SafeArray[XCustomShapeHandle],
    getLineGeometry: () => PolyPolygonBezierCoords,
    getTextBounds: () => Rectangle,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    render: () => XShape
  ): XCustomShapeEngine = {
    val __obj = js.Dynamic.literal(Interaction = Interaction.asInstanceOf[js.Any], LineGeometry = LineGeometry.asInstanceOf[js.Any], TextBounds = TextBounds.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getInteraction = js.Any.fromFunction0(getInteraction), getLineGeometry = js.Any.fromFunction0(getLineGeometry), getTextBounds = js.Any.fromFunction0(getTextBounds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), render = js.Any.fromFunction0(render))
    __obj.asInstanceOf[XCustomShapeEngine]
  }
  @scala.inline
  implicit class XCustomShapeEngineOps[Self <: XCustomShapeEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteraction(value: SafeArray[XCustomShapeHandle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineGeometry(value: PolyPolygonBezierCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LineGeometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBounds(value: Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetInteraction(value: () => SafeArray[XCustomShapeHandle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getInteraction")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineGeometry(value: () => PolyPolygonBezierCoords): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLineGeometry")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTextBounds(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRender(value: () => XShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

