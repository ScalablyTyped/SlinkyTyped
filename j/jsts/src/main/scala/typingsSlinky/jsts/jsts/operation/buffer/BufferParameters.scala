package typingsSlinky.jsts.jsts.operation.buffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferParameters extends js.Object {
  /**
    * Computes the maximum distance error due to a given level of approximation to
    * a true arc.
    *
    * @param quadSegs
    *          the number of segments used to approximate a quarter-circle.
    * @return the error of approximation.
    */
  def bufferDistanceError(quadSegs: Double): Double = js.native
  /**
    * Gets the end cap style.
    *
    * @return the end cap style.
    */
  def getEndCapStyle(): Double = js.native
  /**
    * Gets the join style
    *
    * @return the join style code.
    */
  def getJoinStyle(): Double = js.native
  /**
    * Gets the mitre ratio limit.
    *
    * @return the limit value.
    */
  def getMitreLimit(): Double = js.native
  /**
    * Gets the number of quadrant segments which will be used
    *
    * @return the number of quadrant segments.
    */
  def getQuadrantSegments(): Double = js.native
  /**
    * Tests whether the buffer is to be generated on a single side only.
    *
    * @return true if the generated buffer is to be single-sided.
    */
  def isSingleSided(): Boolean = js.native
  /**
    * Specifies the end cap style of the generated buffer. The styles supported are
    * {@link #CAP_ROUND}, {@link #CAP_BUTT}, and {@link #CAP_SQUARE}. The
    * default is CAP_ROUND.
    *
    * @param {int}
    *          endCapStyle the end cap style to specify.
    */
  def setEndCapStyle(endCapStyle: Double): Unit = js.native
  /**
    * Sets the join style for outside (reflex) corners between line segments.
    * Allowable values are {@link JOIN_ROUND} (which is the default),
    * {@link JOIN_MITRE} and {link JOIN_BEVEL}.
    *
    * @param joinStyle
    *          the code for the join style.
    */
  def setJoinStyle(joinStyle: Double): Unit = js.native
  /**
    * Sets the limit on the mitre ratio used for very sharp corners. The mitre
    * ratio is the ratio of the distance from the corner to the end of the mitred
    * offset corner. When two line segments meet at a sharp angle, a miter join
    * will extend far beyond the original geometry. (and in the extreme case will
    * be infinitely far.) To prevent unreasonable geometry, the mitre limit allows
    * controlling the maximum length of the join corner. Corners with a ratio which
    * exceed the limit will be beveled.
    *
    * @param mitreLimit
    *          the mitre ratio limit.
    */
  def setMitreLimit(mitreLimit: Double): Unit = js.native
  /**
    * Sets the number of segments used to approximate a angle fillet
    *
    * @param {int}
    *          quadrantSegments the number of segments in a fillet for a quadrant.
    */
  def setQuadrantSegments(quadrantSegments: Double): Unit = js.native
  /**
    * Sets whether the computed buffer should be single-sided. A single-sided
    * buffer is constructed on only one side of each input line.
    * <p>
    * The side used is determined by the sign of the buffer distance:
    * <ul>
    * <li>a positive distance indicates the left-hand side
    * <li>a negative distance indicates the right-hand side
    * </ul>
    * The single-sided buffer of point geometries is the same as the regular
    * buffer.
    * <p>
    * The End Cap Style for single-sided buffers is always ignored, and forced to
    * the equivalent of <tt>CAP_FLAT</tt>.
    *
    * @param isSingleSided
    *          true if a single-sided buffer should be constructed.
    */
  def setSingleSided(isSingleSided: Boolean): Unit = js.native
}

object BufferParameters {
  @scala.inline
  def apply(
    bufferDistanceError: Double => Double,
    getEndCapStyle: () => Double,
    getJoinStyle: () => Double,
    getMitreLimit: () => Double,
    getQuadrantSegments: () => Double,
    isSingleSided: () => Boolean,
    setEndCapStyle: Double => Unit,
    setJoinStyle: Double => Unit,
    setMitreLimit: Double => Unit,
    setQuadrantSegments: Double => Unit,
    setSingleSided: Boolean => Unit
  ): BufferParameters = {
    val __obj = js.Dynamic.literal(bufferDistanceError = js.Any.fromFunction1(bufferDistanceError), getEndCapStyle = js.Any.fromFunction0(getEndCapStyle), getJoinStyle = js.Any.fromFunction0(getJoinStyle), getMitreLimit = js.Any.fromFunction0(getMitreLimit), getQuadrantSegments = js.Any.fromFunction0(getQuadrantSegments), isSingleSided = js.Any.fromFunction0(isSingleSided), setEndCapStyle = js.Any.fromFunction1(setEndCapStyle), setJoinStyle = js.Any.fromFunction1(setJoinStyle), setMitreLimit = js.Any.fromFunction1(setMitreLimit), setQuadrantSegments = js.Any.fromFunction1(setQuadrantSegments), setSingleSided = js.Any.fromFunction1(setSingleSided))
    __obj.asInstanceOf[BufferParameters]
  }
  @scala.inline
  implicit class BufferParametersOps[Self <: BufferParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferDistanceError(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferDistanceError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetEndCapStyle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEndCapStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetJoinStyle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getJoinStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMitreLimit(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMitreLimit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQuadrantSegments(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getQuadrantSegments")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSingleSided(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSingleSided")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetEndCapStyle(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEndCapStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetJoinStyle(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setJoinStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMitreLimit(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMitreLimit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetQuadrantSegments(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQuadrantSegments")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSingleSided(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setSingleSided")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

