package typingsSlinky.androiduix.android.text

import typingsSlinky.androiduix.android.graphics.Canvas
import typingsSlinky.androiduix.android.graphics.Paint.FontMetricsInt
import typingsSlinky.androiduix.android.text.Layout.Directions
import typingsSlinky.androiduix.android.text.Layout.TabStops
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextLine extends js.Object {
  var mCharacterStyleSpanSet: js.Any = js.native
  var mChars: js.Any = js.native
  var mCharsValid: js.Any = js.native
  var mDir: js.Any = js.native
  var mDirections: js.Any = js.native
  var mHasTabs: js.Any = js.native
  var mLen: js.Any = js.native
  var mMetricAffectingSpanSpanSet: js.Any = js.native
  var mPaint: js.Any = js.native
  var mReplacementSpanSpanSet: js.Any = js.native
  var mSpanned: js.Any = js.native
  var mStart: js.Any = js.native
  var mTabs: js.Any = js.native
  var mText: js.Any = js.native
  var mWorkPaint: js.Any = js.native
  def ascent(pos: Double): Double = js.native
  def draw(c: Canvas, x: Double, top: Double, y: Double, bottom: Double): Unit = js.native
  /* private */ def drawRun(
    c: js.Any,
    start: js.Any,
    limit: js.Any,
    runIsRtl: js.Any,
    x: js.Any,
    top: js.Any,
    y: js.Any,
    bottom: js.Any,
    needWidth: js.Any
  ): js.Any = js.native
  /* private */ def drawTextRun(
    c: js.Any,
    wp: js.Any,
    start: js.Any,
    end: js.Any,
    contextStart: js.Any,
    contextEnd: js.Any,
    runIsRtl: js.Any,
    x: js.Any,
    y: js.Any
  ): js.Any = js.native
  /* private */ def getOffsetBeforeAfter(
    runIndex: js.Any,
    runStart: js.Any,
    runLimit: js.Any,
    runIsRtl: js.Any,
    offset: js.Any,
    after: js.Any
  ): js.Any = js.native
  def getOffsetToLeftRightOf(cursor: Double, toLeft: Boolean): Double = js.native
  /* private */ def handleReplacement(
    replacement: js.Any,
    wp: js.Any,
    start: js.Any,
    limit: js.Any,
    runIsRtl: js.Any,
    c: js.Any,
    x: js.Any,
    top: js.Any,
    y: js.Any,
    bottom: js.Any,
    fmi: js.Any,
    needWidth: js.Any
  ): js.Any = js.native
  /* private */ def handleRun(
    start: js.Any,
    measureLimit: js.Any,
    limit: js.Any,
    runIsRtl: js.Any,
    c: js.Any,
    x: js.Any,
    top: js.Any,
    y: js.Any,
    bottom: js.Any,
    fmi: js.Any,
    needWidth: js.Any
  ): js.Any = js.native
  /* private */ def handleText(
    wp: js.Any,
    start: js.Any,
    end: js.Any,
    contextStart: js.Any,
    contextEnd: js.Any,
    runIsRtl: js.Any,
    c: js.Any,
    x: js.Any,
    top: js.Any,
    y: js.Any,
    bottom: js.Any,
    fmi: js.Any,
    needWidth: js.Any
  ): js.Any = js.native
  def measure(offset: Double, trailing: Boolean, fmi: FontMetricsInt): Double = js.native
  /* private */ def measureRun(start: js.Any, offset: js.Any, limit: js.Any, runIsRtl: js.Any, fmi: js.Any): js.Any = js.native
  def metrics(fmi: FontMetricsInt): Double = js.native
  def nextTab(h: Double): Double = js.native
  def set(
    paint: TextPaint,
    text: String,
    start: Double,
    limit: Double,
    dir: Double,
    directions: Directions,
    hasTabs: Boolean,
    tabStops: TabStops
  ): Unit = js.native
}

object TextLine {
  @scala.inline
  def apply(
    ascent: Double => Double,
    draw: (Canvas, Double, Double, Double, Double) => Unit,
    drawRun: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    drawTextRun: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    getOffsetBeforeAfter: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    getOffsetToLeftRightOf: (Double, Boolean) => Double,
    handleReplacement: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    handleRun: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    handleText: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    mCharacterStyleSpanSet: js.Any,
    mChars: js.Any,
    mCharsValid: js.Any,
    mDir: js.Any,
    mDirections: js.Any,
    mHasTabs: js.Any,
    mLen: js.Any,
    mMetricAffectingSpanSpanSet: js.Any,
    mPaint: js.Any,
    mReplacementSpanSpanSet: js.Any,
    mSpanned: js.Any,
    mStart: js.Any,
    mTabs: js.Any,
    mText: js.Any,
    mWorkPaint: js.Any,
    measure: (Double, Boolean, FontMetricsInt) => Double,
    measureRun: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any,
    metrics: FontMetricsInt => Double,
    nextTab: Double => Double,
    set: (TextPaint, String, Double, Double, Double, Directions, Boolean, TabStops) => Unit
  ): TextLine = {
    val __obj = js.Dynamic.literal(ascent = js.Any.fromFunction1(ascent), draw = js.Any.fromFunction5(draw), drawRun = js.Any.fromFunction9(drawRun), drawTextRun = js.Any.fromFunction9(drawTextRun), getOffsetBeforeAfter = js.Any.fromFunction6(getOffsetBeforeAfter), getOffsetToLeftRightOf = js.Any.fromFunction2(getOffsetToLeftRightOf), handleReplacement = js.Any.fromFunction12(handleReplacement), handleRun = js.Any.fromFunction11(handleRun), handleText = js.Any.fromFunction13(handleText), mCharacterStyleSpanSet = mCharacterStyleSpanSet.asInstanceOf[js.Any], mChars = mChars.asInstanceOf[js.Any], mCharsValid = mCharsValid.asInstanceOf[js.Any], mDir = mDir.asInstanceOf[js.Any], mDirections = mDirections.asInstanceOf[js.Any], mHasTabs = mHasTabs.asInstanceOf[js.Any], mLen = mLen.asInstanceOf[js.Any], mMetricAffectingSpanSpanSet = mMetricAffectingSpanSpanSet.asInstanceOf[js.Any], mPaint = mPaint.asInstanceOf[js.Any], mReplacementSpanSpanSet = mReplacementSpanSpanSet.asInstanceOf[js.Any], mSpanned = mSpanned.asInstanceOf[js.Any], mStart = mStart.asInstanceOf[js.Any], mTabs = mTabs.asInstanceOf[js.Any], mText = mText.asInstanceOf[js.Any], mWorkPaint = mWorkPaint.asInstanceOf[js.Any], measure = js.Any.fromFunction3(measure), measureRun = js.Any.fromFunction5(measureRun), metrics = js.Any.fromFunction1(metrics), nextTab = js.Any.fromFunction1(nextTab), set = js.Any.fromFunction8(set))
    __obj.asInstanceOf[TextLine]
  }
  @scala.inline
  implicit class TextLineOps[Self <: TextLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscent(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDraw(value: (Canvas, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draw")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withDrawRun(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawRun")(js.Any.fromFunction9(value))
        ret
    }
    @scala.inline
    def withDrawTextRun(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawTextRun")(js.Any.fromFunction9(value))
        ret
    }
    @scala.inline
    def withGetOffsetBeforeAfter(value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetBeforeAfter")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withGetOffsetToLeftRightOf(value: (Double, Boolean) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOffsetToLeftRightOf")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHandleReplacement(
      value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleReplacement")(js.Any.fromFunction12(value))
        ret
    }
    @scala.inline
    def withHandleRun(
      value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleRun")(js.Any.fromFunction11(value))
        ret
    }
    @scala.inline
    def withHandleText(
      value: (js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleText")(js.Any.fromFunction13(value))
        ret
    }
    @scala.inline
    def withMCharacterStyleSpanSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCharacterStyleSpanSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMChars(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mChars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCharsValid(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCharsValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDir(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDirections(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHasTabs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHasTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMetricAffectingSpanSpanSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMetricAffectingSpanSpanSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPaint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPaint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMReplacementSpanSpanSet(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mReplacementSpanSpanSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSpanned(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSpanned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTabs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTabs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMWorkPaint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mWorkPaint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeasure(value: (Double, Boolean, FontMetricsInt) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measure")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMeasureRun(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measureRun")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withMetrics(value: FontMetricsInt => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNextTab(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: (TextPaint, String, Double, Double, Double, Directions, Boolean, TabStops) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction8(value))
        ret
    }
  }
  
}

