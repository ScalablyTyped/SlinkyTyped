package typingsSlinky.box2d.Box2D.Dynamics

import org.scalajs.dom.raw.CanvasRenderingContext2D
import typingsSlinky.box2d.Box2D.Common.Math.b2Transform
import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import typingsSlinky.box2d.Box2D.Common.b2Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2DebugDraw extends js.Object {
  /**
  		* Append flags to the current flags.
  		* @param flags Flags to add.
  		**/
  def AppendFlags(flags: Double): Unit = js.native
  /**
  		* Clear flags from the current flags.
  		* @param flags flags to clear.
  		**/
  def ClearFlags(flags: Double): Unit = js.native
  /**
  		* Draw a circle.
  		* @param center Circle center point.
  		* @param radius Circle radius.
  		* @param color Circle draw color.
  		**/
  def DrawCircle(center: b2Vec2, radius: Double, color: b2Color): Unit = js.native
  /**
  		* Draw a closed polygon provided in CCW order.
  		* @param vertices Polygon verticies.
  		* @param vertexCount Number of vertices in the polygon, usually vertices.length.
  		* @param color Polygon draw color.
  		**/
  def DrawPolygon(vertices: js.Array[b2Vec2], vertexCount: Double, color: b2Color): Unit = js.native
  /**
  		* Draw a line segment.
  		* @param p1 Line beginpoint.
  		* @param p2 Line endpoint.
  		* @param color Line color.
  		**/
  def DrawSegment(p1: b2Vec2, p2: b2Vec2, color: b2Color): Unit = js.native
  /**
  		* Draw a solid circle.
  		* @param center Circle center point.
  		* @param radius Circle radius.
  		* @param axis Circle axis.
  		* @param color Circle color.
  		**/
  def DrawSolidCircle(center: b2Vec2, radius: Double, axis: b2Vec2, color: b2Color): Unit = js.native
  /**
  		* Draw a solid closed polygon provided in CCW order.
  		* @param vertices Polygon verticies.
  		* @param vertexCount Number of vertices in the polygon, usually vertices.length.
  		* @param color Polygon draw color.
  		**/
  def DrawSolidPolygon(vertices: js.Array[b2Vec2], vertexCount: Double, color: b2Color): Unit = js.native
  /**
  		* Draw a transform. Choose your own length scale.
  		* @param xf Transform to draw.
  		**/
  def DrawTransform(xf: b2Transform): Unit = js.native
  /**
  		* Get the alpha value used for lines.
  		* @return Alpha value used for drawing lines.
  		**/
  def GetAlpha(): Double = js.native
  /**
  		* Get the draw scale.
  		* @return Draw scale ratio.
  		**/
  def GetDrawScale(): Double = js.native
  /**
  		* Get the alpha value used for fills.
  		* @return Alpha value used for drawing fills.
  		**/
  def GetFillAlpha(): Double = js.native
  /**
  		* Get the drawing flags.
  		* @return Drawing flags.
  		**/
  def GetFlags(): Double = js.native
  /**
  		* Get the line thickness.
  		* @return Line thickness.
  		**/
  def GetLineThickness(): Double = js.native
  /**
  		* Get the HTML Canvas Element for drawing.
  		* @note box2dflash uses Sprite object, box2dweb uses CanvasRenderingContext2D, that is why this function is called GetSprite().
  		* @return The HTML Canvas Element used for debug drawing.
  		**/
  def GetSprite(): CanvasRenderingContext2D = js.native
  /**
  		* Get the scale used for drawing XForms.
  		* @return Scale for drawing transforms.
  		**/
  def GetXFormScale(): Double = js.native
  /**
  		* Set the alpha value used for lines.
  		* @param alpha Alpha value for drawing lines.
  		**/
  def SetAlpha(alpha: Double): Unit = js.native
  /**
  		* Set the draw scale.
  		* @param drawScale Draw scale ratio.
  		**/
  def SetDrawScale(drawScale: Double): Unit = js.native
  /**
  		* Set the alpha value used for fills.
  		* @param alpha Alpha value for drawing fills.
  		**/
  def SetFillAlpha(alpha: Double): Unit = js.native
  /**
  		* Set the drawing flags.
  		* @param flags Sets the drawing flags.
  		**/
  def SetFlags(flags: Double): Unit = js.native
  /**
  		* Set the line thickness.
  		* @param lineThickness The new line thickness.
  		**/
  def SetLineThickness(lineThickness: Double): Unit = js.native
  /**
  		* Set the HTML Canvas Element for drawing.
  		* @note box2dflash uses Sprite object, box2dweb uses CanvasRenderingContext2D, that is why this function is called SetSprite().
  		* @param canvas HTML Canvas Element to draw debug information to.
  		**/
  def SetSprite(canvas: CanvasRenderingContext2D): Unit = js.native
  /**
  		* Set the scale used for drawing XForms.
  		* @param xformScale The transform scale.
  		**/
  def SetXFormScale(xformScale: Double): Unit = js.native
}

object b2DebugDraw {
  @scala.inline
  def apply(
    AppendFlags: Double => Unit,
    ClearFlags: Double => Unit,
    DrawCircle: (b2Vec2, Double, b2Color) => Unit,
    DrawPolygon: (js.Array[b2Vec2], Double, b2Color) => Unit,
    DrawSegment: (b2Vec2, b2Vec2, b2Color) => Unit,
    DrawSolidCircle: (b2Vec2, Double, b2Vec2, b2Color) => Unit,
    DrawSolidPolygon: (js.Array[b2Vec2], Double, b2Color) => Unit,
    DrawTransform: b2Transform => Unit,
    GetAlpha: () => Double,
    GetDrawScale: () => Double,
    GetFillAlpha: () => Double,
    GetFlags: () => Double,
    GetLineThickness: () => Double,
    GetSprite: () => CanvasRenderingContext2D,
    GetXFormScale: () => Double,
    SetAlpha: Double => Unit,
    SetDrawScale: Double => Unit,
    SetFillAlpha: Double => Unit,
    SetFlags: Double => Unit,
    SetLineThickness: Double => Unit,
    SetSprite: CanvasRenderingContext2D => Unit,
    SetXFormScale: Double => Unit
  ): b2DebugDraw = {
    val __obj = js.Dynamic.literal(AppendFlags = js.Any.fromFunction1(AppendFlags), ClearFlags = js.Any.fromFunction1(ClearFlags), DrawCircle = js.Any.fromFunction3(DrawCircle), DrawPolygon = js.Any.fromFunction3(DrawPolygon), DrawSegment = js.Any.fromFunction3(DrawSegment), DrawSolidCircle = js.Any.fromFunction4(DrawSolidCircle), DrawSolidPolygon = js.Any.fromFunction3(DrawSolidPolygon), DrawTransform = js.Any.fromFunction1(DrawTransform), GetAlpha = js.Any.fromFunction0(GetAlpha), GetDrawScale = js.Any.fromFunction0(GetDrawScale), GetFillAlpha = js.Any.fromFunction0(GetFillAlpha), GetFlags = js.Any.fromFunction0(GetFlags), GetLineThickness = js.Any.fromFunction0(GetLineThickness), GetSprite = js.Any.fromFunction0(GetSprite), GetXFormScale = js.Any.fromFunction0(GetXFormScale), SetAlpha = js.Any.fromFunction1(SetAlpha), SetDrawScale = js.Any.fromFunction1(SetDrawScale), SetFillAlpha = js.Any.fromFunction1(SetFillAlpha), SetFlags = js.Any.fromFunction1(SetFlags), SetLineThickness = js.Any.fromFunction1(SetLineThickness), SetSprite = js.Any.fromFunction1(SetSprite), SetXFormScale = js.Any.fromFunction1(SetXFormScale))
    __obj.asInstanceOf[b2DebugDraw]
  }
  @scala.inline
  implicit class b2DebugDrawOps[Self <: b2DebugDraw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendFlags(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppendFlags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearFlags(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearFlags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDrawCircle(value: (b2Vec2, Double, b2Color) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawCircle")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDrawPolygon(value: (js.Array[b2Vec2], Double, b2Color) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawPolygon")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDrawSegment(value: (b2Vec2, b2Vec2, b2Color) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawSegment")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDrawSolidCircle(value: (b2Vec2, Double, b2Vec2, b2Color) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawSolidCircle")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withDrawSolidPolygon(value: (js.Array[b2Vec2], Double, b2Color) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawSolidPolygon")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDrawTransform(value: b2Transform => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DrawTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAlpha(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAlpha")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetDrawScale(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDrawScale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFillAlpha(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFillAlpha")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFlags(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetFlags")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLineThickness(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLineThickness")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSprite(value: () => CanvasRenderingContext2D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSprite")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetXFormScale(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetXFormScale")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAlpha(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetAlpha")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDrawScale(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDrawScale")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFillAlpha(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFillAlpha")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFlags(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFlags")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetLineThickness(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetLineThickness")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSprite(value: CanvasRenderingContext2D => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSprite")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetXFormScale(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetXFormScale")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

