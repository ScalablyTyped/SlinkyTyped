package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkPaint extends SkObject[SkPaint] {
  def getBlendMode(): SkBlendMode = js.native
  def getColor(): SkColor = js.native
  def getFilterQuality(): SkFilterQuality = js.native
  def getStrokeCap(): SkStrokeCap = js.native
  def getStrokeJoin(): SkStrokeJoin = js.native
  def getStrokeMiter(): Double = js.native
  def getStrokeWidth(): Double = js.native
  def setAntiAlias(value: Boolean): Unit = js.native
  def setBlendMode(value: SkBlendMode): Unit = js.native
  def setColor(value: SkColor): Unit = js.native
  def setColorFilter(value: SkColorFilter): Unit = js.native
  def setColorf(fRed: Double, fGreen: Double, fBlue: Double, fAlpha: Double): Unit = js.native
  def setFilterQuality(value: SkFilterQuality): Unit = js.native
  def setImageFilter(value: SkImageFilter): Unit = js.native
  def setMaskFilter(value: SkMaskFilter): Unit = js.native
  def setPathEffect(value: SkPathEffect): Unit = js.native
  def setShader(value: SkShader): Unit = js.native
  def setStrokeCap(value: SkStrokeCap): Unit = js.native
  def setStrokeJoin(value: SkStrokeJoin): Unit = js.native
  def setStrokeMiter(value: Double): Unit = js.native
  def setStrokeWidth(value: Double): Unit = js.native
  def setStyle(value: SkPaintStyle): Unit = js.native
}

object SkPaint {
  @scala.inline
  def apply(
    delete: () => Unit,
    deleteAfter: () => Unit,
    getBlendMode: () => SkBlendMode,
    getColor: () => SkColor,
    getFilterQuality: () => SkFilterQuality,
    getStrokeCap: () => SkStrokeCap,
    getStrokeJoin: () => SkStrokeJoin,
    getStrokeMiter: () => Double,
    getStrokeWidth: () => Double,
    isAliasOf: js.Any => Boolean,
    isDeleted: () => Boolean,
    setAntiAlias: Boolean => Unit,
    setBlendMode: SkBlendMode => Unit,
    setColor: SkColor => Unit,
    setColorFilter: SkColorFilter => Unit,
    setColorf: (Double, Double, Double, Double) => Unit,
    setFilterQuality: SkFilterQuality => Unit,
    setImageFilter: SkImageFilter => Unit,
    setMaskFilter: SkMaskFilter => Unit,
    setPathEffect: SkPathEffect => Unit,
    setShader: SkShader => Unit,
    setStrokeCap: SkStrokeCap => Unit,
    setStrokeJoin: SkStrokeJoin => Unit,
    setStrokeMiter: Double => Unit,
    setStrokeWidth: Double => Unit,
    setStyle: SkPaintStyle => Unit
  ): SkPaint = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteAfter = js.Any.fromFunction0(deleteAfter), getBlendMode = js.Any.fromFunction0(getBlendMode), getColor = js.Any.fromFunction0(getColor), getFilterQuality = js.Any.fromFunction0(getFilterQuality), getStrokeCap = js.Any.fromFunction0(getStrokeCap), getStrokeJoin = js.Any.fromFunction0(getStrokeJoin), getStrokeMiter = js.Any.fromFunction0(getStrokeMiter), getStrokeWidth = js.Any.fromFunction0(getStrokeWidth), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted), setAntiAlias = js.Any.fromFunction1(setAntiAlias), setBlendMode = js.Any.fromFunction1(setBlendMode), setColor = js.Any.fromFunction1(setColor), setColorFilter = js.Any.fromFunction1(setColorFilter), setColorf = js.Any.fromFunction4(setColorf), setFilterQuality = js.Any.fromFunction1(setFilterQuality), setImageFilter = js.Any.fromFunction1(setImageFilter), setMaskFilter = js.Any.fromFunction1(setMaskFilter), setPathEffect = js.Any.fromFunction1(setPathEffect), setShader = js.Any.fromFunction1(setShader), setStrokeCap = js.Any.fromFunction1(setStrokeCap), setStrokeJoin = js.Any.fromFunction1(setStrokeJoin), setStrokeMiter = js.Any.fromFunction1(setStrokeMiter), setStrokeWidth = js.Any.fromFunction1(setStrokeWidth), setStyle = js.Any.fromFunction1(setStyle))
    __obj.asInstanceOf[SkPaint]
  }
  @scala.inline
  implicit class SkPaintOps[Self <: SkPaint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBlendMode(value: () => SkBlendMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBlendMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetColor(value: () => SkColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFilterQuality(value: () => SkFilterQuality): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFilterQuality")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokeCap(value: () => SkStrokeCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokeCap")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokeJoin(value: () => SkStrokeJoin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokeJoin")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokeMiter(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokeMiter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetStrokeWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStrokeWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAntiAlias(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAntiAlias")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBlendMode(value: SkBlendMode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBlendMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetColor(value: SkColor => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetColorFilter(value: SkColorFilter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColorFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetColorf(value: (Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setColorf")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSetFilterQuality(value: SkFilterQuality => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFilterQuality")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetImageFilter(value: SkImageFilter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setImageFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaskFilter(value: SkMaskFilter => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaskFilter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPathEffect(value: SkPathEffect => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPathEffect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetShader(value: SkShader => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setShader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrokeCap(value: SkStrokeCap => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrokeCap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrokeJoin(value: SkStrokeJoin => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrokeJoin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrokeMiter(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrokeMiter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStrokeWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStrokeWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetStyle(value: SkPaintStyle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setStyle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

