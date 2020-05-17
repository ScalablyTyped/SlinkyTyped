package typingsSlinky.googleEarth.google.earth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GEAbstractBalloon extends js.Object {
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  def getCloseButtonEnabled(): Boolean = js.native
  /**
    * Determines what the balloon is attached to.
    */
  def getFeature(): KmlFeature = js.native
  /**
    * The ID of the balloon.
    */
  def getId(): String = js.native
  /**
    * Maximum height of the balloon.
    */
  def getMaxHeight(): Double = js.native
  /**
    * Maximum width of the balloon.
    */
  def getMaxWidth(): Double = js.native
  /**
    * Minimum height of the balloon.
    */
  def getMinHeight(): Double = js.native
  /**
    * Minimum width of the balloon.
    */
  def getMinWidth(): Double = js.native
  /**
    * When true, the balloon frame is displayed with a button that the user
    * can click to close the balloon. When false, the balloon frame is just 
    * a plain frame.  
    *
    * Default is true.
    */
  def setCloseButtonEnabled(closeButtonEnabled: Boolean): Unit = js.native
  /**
    * Determines what the balloon is attached to.
    */
  def setFeature(feature: KmlFeature): Unit = js.native
  /**
    * The ID of the balloon.
    */
  def setId(id: String): Unit = js.native
  /**
    * Maximum height of the balloon.
    */
  def setMaxHeight(maxHeight: Double): Unit = js.native
  /**
    * Maximum width of the balloon.
    */
  def setMaxWidth(maxWidth: Double): Unit = js.native
  /**
    * Minimum height of the balloon.
    */
  def setMinHeight(minHeight: Double): Unit = js.native
  /**
    * Minimum width of the balloon.
    */
  def setMinWidth(minWidth: Double): Unit = js.native
}

object GEAbstractBalloon {
  @scala.inline
  def apply(
    getCloseButtonEnabled: () => Boolean,
    getFeature: () => KmlFeature,
    getId: () => String,
    getMaxHeight: () => Double,
    getMaxWidth: () => Double,
    getMinHeight: () => Double,
    getMinWidth: () => Double,
    setCloseButtonEnabled: Boolean => Unit,
    setFeature: KmlFeature => Unit,
    setId: String => Unit,
    setMaxHeight: Double => Unit,
    setMaxWidth: Double => Unit,
    setMinHeight: Double => Unit,
    setMinWidth: Double => Unit
  ): GEAbstractBalloon = {
    val __obj = js.Dynamic.literal(getCloseButtonEnabled = js.Any.fromFunction0(getCloseButtonEnabled), getFeature = js.Any.fromFunction0(getFeature), getId = js.Any.fromFunction0(getId), getMaxHeight = js.Any.fromFunction0(getMaxHeight), getMaxWidth = js.Any.fromFunction0(getMaxWidth), getMinHeight = js.Any.fromFunction0(getMinHeight), getMinWidth = js.Any.fromFunction0(getMinWidth), setCloseButtonEnabled = js.Any.fromFunction1(setCloseButtonEnabled), setFeature = js.Any.fromFunction1(setFeature), setId = js.Any.fromFunction1(setId), setMaxHeight = js.Any.fromFunction1(setMaxHeight), setMaxWidth = js.Any.fromFunction1(setMaxWidth), setMinHeight = js.Any.fromFunction1(setMinHeight), setMinWidth = js.Any.fromFunction1(setMinWidth))
    __obj.asInstanceOf[GEAbstractBalloon]
  }
  @scala.inline
  implicit class GEAbstractBalloonOps[Self <: GEAbstractBalloon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCloseButtonEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCloseButtonEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFeature(value: () => KmlFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeature")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMaxWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMaxWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinHeight(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinHeight")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinWidth(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMinWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCloseButtonEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCloseButtonEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFeature(value: KmlFeature => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFeature")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetId(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaxHeight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMaxWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMaxWidth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinHeight(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinHeight")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinWidth(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinWidth")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

