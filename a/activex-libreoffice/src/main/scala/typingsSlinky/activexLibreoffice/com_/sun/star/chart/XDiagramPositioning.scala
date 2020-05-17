package typingsSlinky.activexLibreoffice.com_.sun.star.chart

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allow for different positioning options for a diagram
  * @see Diagram
  */
@js.native
trait XDiagramPositioning extends XInterface {
  /** @returns the position rectangle of the inner diagram part excluding any axes, labels and titles. Position and size are given in 100/th mm. It might be nec */
  def calculateDiagramPositionExcludingAxes(): Rectangle = js.native
  /** @returns the position rectangle of the diagram including the axes and axes labels, but excluding the axes titles. Position and size are given in 100/th mm */
  def calculateDiagramPositionIncludingAxes(): Rectangle = js.native
  /** @returns the position rectangle of the diagram including the axes, axes labels and axes titles. Position and size are given in 100/th mm. It might be nece */
  def calculateDiagramPositionIncludingAxesAndAxisTitles(): Rectangle = js.native
  /** @returns whether the diagram is placed automatically */
  def isAutomaticDiagramPositioning(): Boolean = js.native
  /** @returns true in case the diagram position was set with method setDiagramPositionExcludingAxes */
  def isExcludingDiagramPositioning(): Boolean = js.native
  /** the diagram will be placed automatically */
  def setAutomaticDiagramPositioning(): Unit = js.native
  /**
    * place the inner diagram part excluding any axes, labels and titles
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionExcludingAxes(PositionRect: Rectangle): Unit = js.native
  /**
    * place the outer diagram part including the axes and axes labels, but excluding the axes titles.
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionIncludingAxes(PositionRect: Rectangle): Unit = js.native
  /**
    * place the diagram including the axes, axes labels and axes titles. For the placement the current axis titles are taken into account, so the titles
    * must be initialized properly before this method is called.
    * @param PositionRect specifies the position and size in 100/th mm
    */
  def setDiagramPositionIncludingAxesAndAxisTitles(PositionRect: Rectangle): Unit = js.native
}

object XDiagramPositioning {
  @scala.inline
  def apply(
    acquire: () => Unit,
    calculateDiagramPositionExcludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxes: () => Rectangle,
    calculateDiagramPositionIncludingAxesAndAxisTitles: () => Rectangle,
    isAutomaticDiagramPositioning: () => Boolean,
    isExcludingDiagramPositioning: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAutomaticDiagramPositioning: () => Unit,
    setDiagramPositionExcludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxes: Rectangle => Unit,
    setDiagramPositionIncludingAxesAndAxisTitles: Rectangle => Unit
  ): XDiagramPositioning = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), calculateDiagramPositionExcludingAxes = js.Any.fromFunction0(calculateDiagramPositionExcludingAxes), calculateDiagramPositionIncludingAxes = js.Any.fromFunction0(calculateDiagramPositionIncludingAxes), calculateDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction0(calculateDiagramPositionIncludingAxesAndAxisTitles), isAutomaticDiagramPositioning = js.Any.fromFunction0(isAutomaticDiagramPositioning), isExcludingDiagramPositioning = js.Any.fromFunction0(isExcludingDiagramPositioning), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAutomaticDiagramPositioning = js.Any.fromFunction0(setAutomaticDiagramPositioning), setDiagramPositionExcludingAxes = js.Any.fromFunction1(setDiagramPositionExcludingAxes), setDiagramPositionIncludingAxes = js.Any.fromFunction1(setDiagramPositionIncludingAxes), setDiagramPositionIncludingAxesAndAxisTitles = js.Any.fromFunction1(setDiagramPositionIncludingAxesAndAxisTitles))
    __obj.asInstanceOf[XDiagramPositioning]
  }
  @scala.inline
  implicit class XDiagramPositioningOps[Self <: XDiagramPositioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateDiagramPositionExcludingAxes(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDiagramPositionExcludingAxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCalculateDiagramPositionIncludingAxes(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDiagramPositionIncludingAxes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCalculateDiagramPositionIncludingAxesAndAxisTitles(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateDiagramPositionIncludingAxesAndAxisTitles")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsAutomaticDiagramPositioning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAutomaticDiagramPositioning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsExcludingDiagramPositioning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExcludingDiagramPositioning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetAutomaticDiagramPositioning(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAutomaticDiagramPositioning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetDiagramPositionExcludingAxes(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDiagramPositionExcludingAxes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDiagramPositionIncludingAxes(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDiagramPositionIncludingAxes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetDiagramPositionIncludingAxesAndAxisTitles(value: Rectangle => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setDiagramPositionIncludingAxesAndAxisTitles")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

