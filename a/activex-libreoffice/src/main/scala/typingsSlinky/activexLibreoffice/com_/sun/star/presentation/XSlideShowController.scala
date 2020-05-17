package typingsSlinky.activexLibreoffice.com_.sun.star.presentation

import typingsSlinky.activexLibreoffice.com_.sun.star.drawing.XDrawPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * interface to control a running slide show.
  * @see XPresentation2
  * @since OOo 3.0
  */
@js.native
trait XSlideShowController extends js.Object {
  /** If this attribute is set to `TRUE` , the window of the slide show is always on top of all other windows. */
  var AlwaysOnTop: Boolean = js.native
  /** returns slide that is currently displayed */
  val CurrentSlide: XDrawPage = js.native
  /** returns the index of the current slide. */
  val CurrentSlideIndex: Double = js.native
  /** If this attribute is `TRUE` , the mouse is visible during the slide show. */
  var MouseVisible: Boolean = js.native
  /** the index for the slide that is displayed next. */
  val NextSlideIndex: Double = js.native
  /** This attribute changes the color of the pen. */
  var PenColor: Double = js.native
  /**
    * This attribute changes the width of the pen.
    * @since LibreOffice 4.2
    */
  var PenWidth: Double = js.native
  /**
    * @returns the number of slides in this slide show.
    * @see getSlideByIndex
    */
  val SlideCount: Double = js.native
  /**
    * returns the actual {@link XSlideShow} instance that runs the slide show. ;  Normally all navigation should be done using this controller and not the
    * {@link XSlideShow} itself.
    */
  val SlideShow: XSlideShow = js.native
  /**
    * If this is `TRUE` , a pen is shown during presentation.
    *
    * You can draw on the presentation with this pen.
    */
  var UsePen: Boolean = js.native
  /**
    * activates the user interface of this slide show.
    * @see deactivate()
    * @see isActive()
    */
  def activate(): Unit = js.native
  /** adds a listener that receives events while the slide show is running. */
  def addSlideShowListener(Listener: XSlideShowListener): Unit = js.native
  /**
    * pauses the slide show and blanks the screen in the given color.
    *
    * Change attribute Pause to false to unpause the slide show.
    */
  def blankScreen(Color: Double): Unit = js.native
  /**
    * can be called to deactivate the user interface of this slide show.
    *
    * A deactivated
    * @see activate()
    * @see isActive()
    */
  def deactivate(): Unit = js.native
  /** returns slide that is currently displayed */
  def getCurrentSlide(): XDrawPage = js.native
  /** returns the index of the current slide. */
  def getCurrentSlideIndex(): Double = js.native
  /** the index for the slide that is displayed next. */
  def getNextSlideIndex(): Double = js.native
  /**
    * gives access to the slides that will be shown in this slide show.
    *
    * Slides are returned in the order they will be displayed in the presentation which can be different than the orders of slides in the document. Not all
    * slides must be present and each slide can be used more than once.
    * @param Index specifies the position in the list of slides that are displayed in this slide show. The first index is 0.
    * @returns the slide at the specified index.
    * @throws com::sun::star::lang::IndexOutOfBoundException if the index is not valid.
    */
  def getSlideByIndex(Index: Double): XDrawPage = js.native
  /**
    * @returns the number of slides in this slide show.
    * @see getSlideByIndex
    */
  def getSlideCount(): Double = js.native
  /**
    * returns the actual {@link XSlideShow} instance that runs the slide show. ;  Normally all navigation should be done using this controller and not the
    * {@link XSlideShow} itself.
    */
  def getSlideShow(): XSlideShow = js.native
  /** goto the given textual bookmark */
  def gotoBookmark(Bookmark: String): Unit = js.native
  /** goto and display first slide */
  def gotoFirstSlide(): Unit = js.native
  /**
    * goto and display last slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoLastSlide(): Unit = js.native
  /**
    * start next effects that wait on a generic trigger.
    *
    * If no generic triggers are waiting the next slide will be displayed.
    */
  def gotoNextEffect(): Unit = js.native
  /**
    * goto and display next slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoNextSlide(): Unit = js.native
  /**
    * undo the last effects that where triggered by a generic trigger.
    *
    * If there is no previous effect that can be undone then the previous slide will be displayed.
    */
  def gotoPreviousEffect(): Unit = js.native
  /**
    * goto and display previous slide.
    *
    * Remaining effects on the current slide will be skipped.
    */
  def gotoPreviousSlide(): Unit = js.native
  /**
    * jumps to the given slide.
    *
    * The slide can also be a slide that would normally not be shown during the current slide show.
    * @throws com::sun::star::lang::IllegalArgumentException if the given page is not a valid slide of the document for which this slide show is started. Also
    */
  def gotoSlide(Page: XDrawPage): Unit = js.native
  /** jumps to the slide at the given index. */
  def gotoSlideIndex(Index: Double): Unit = js.native
  /**
    * determines if the slide show is active.
    * @returns `TRUE` for UI active slide show ; `FALSE` otherwise
    */
  def isActive(): Boolean = js.native
  /** returns `TRUE` if the slide show was started to run endlessly. */
  def isEndless(): Boolean = js.native
  /** Returns `TRUE` if the slide show was started in full-screen mode. */
  def isFullScreen(): Boolean = js.native
  /**
    * returns `TRUE` if the slide show is currently paused.
    * @see pause()
    * @see resume()
    */
  def isPaused(): Boolean = js.native
  /**
    * returns true if the slide show is still running. If this returns false, this component is already disposed. You can start a new slide show and get a
    * new instance of {@link XSlideShowController} from {@link XPresentation2}
    */
  def isRunning(): Boolean = js.native
  /**
    * pauses the slide show. All effects are paused.
    *
    * The slide show continues on next user input or if {@link resume()} is called.
    */
  def pause(): Unit = js.native
  /** removes a listener. */
  def removeSlideShowListener(Listener: XSlideShowListener): Unit = js.native
  /** resumes a paused slide show. */
  def resume(): Unit = js.native
  /** stop all currently played sounds */
  def stopSound(): Unit = js.native
}

object XSlideShowController {
  @scala.inline
  def apply(
    AlwaysOnTop: Boolean,
    CurrentSlide: XDrawPage,
    CurrentSlideIndex: Double,
    MouseVisible: Boolean,
    NextSlideIndex: Double,
    PenColor: Double,
    PenWidth: Double,
    SlideCount: Double,
    SlideShow: XSlideShow,
    UsePen: Boolean,
    activate: () => Unit,
    addSlideShowListener: XSlideShowListener => Unit,
    blankScreen: Double => Unit,
    deactivate: () => Unit,
    getCurrentSlide: () => XDrawPage,
    getCurrentSlideIndex: () => Double,
    getNextSlideIndex: () => Double,
    getSlideByIndex: Double => XDrawPage,
    getSlideCount: () => Double,
    getSlideShow: () => XSlideShow,
    gotoBookmark: String => Unit,
    gotoFirstSlide: () => Unit,
    gotoLastSlide: () => Unit,
    gotoNextEffect: () => Unit,
    gotoNextSlide: () => Unit,
    gotoPreviousEffect: () => Unit,
    gotoPreviousSlide: () => Unit,
    gotoSlide: XDrawPage => Unit,
    gotoSlideIndex: Double => Unit,
    isActive: () => Boolean,
    isEndless: () => Boolean,
    isFullScreen: () => Boolean,
    isPaused: () => Boolean,
    isRunning: () => Boolean,
    pause: () => Unit,
    removeSlideShowListener: XSlideShowListener => Unit,
    resume: () => Unit,
    stopSound: () => Unit
  ): XSlideShowController = {
    val __obj = js.Dynamic.literal(AlwaysOnTop = AlwaysOnTop.asInstanceOf[js.Any], CurrentSlide = CurrentSlide.asInstanceOf[js.Any], CurrentSlideIndex = CurrentSlideIndex.asInstanceOf[js.Any], MouseVisible = MouseVisible.asInstanceOf[js.Any], NextSlideIndex = NextSlideIndex.asInstanceOf[js.Any], PenColor = PenColor.asInstanceOf[js.Any], PenWidth = PenWidth.asInstanceOf[js.Any], SlideCount = SlideCount.asInstanceOf[js.Any], SlideShow = SlideShow.asInstanceOf[js.Any], UsePen = UsePen.asInstanceOf[js.Any], activate = js.Any.fromFunction0(activate), addSlideShowListener = js.Any.fromFunction1(addSlideShowListener), blankScreen = js.Any.fromFunction1(blankScreen), deactivate = js.Any.fromFunction0(deactivate), getCurrentSlide = js.Any.fromFunction0(getCurrentSlide), getCurrentSlideIndex = js.Any.fromFunction0(getCurrentSlideIndex), getNextSlideIndex = js.Any.fromFunction0(getNextSlideIndex), getSlideByIndex = js.Any.fromFunction1(getSlideByIndex), getSlideCount = js.Any.fromFunction0(getSlideCount), getSlideShow = js.Any.fromFunction0(getSlideShow), gotoBookmark = js.Any.fromFunction1(gotoBookmark), gotoFirstSlide = js.Any.fromFunction0(gotoFirstSlide), gotoLastSlide = js.Any.fromFunction0(gotoLastSlide), gotoNextEffect = js.Any.fromFunction0(gotoNextEffect), gotoNextSlide = js.Any.fromFunction0(gotoNextSlide), gotoPreviousEffect = js.Any.fromFunction0(gotoPreviousEffect), gotoPreviousSlide = js.Any.fromFunction0(gotoPreviousSlide), gotoSlide = js.Any.fromFunction1(gotoSlide), gotoSlideIndex = js.Any.fromFunction1(gotoSlideIndex), isActive = js.Any.fromFunction0(isActive), isEndless = js.Any.fromFunction0(isEndless), isFullScreen = js.Any.fromFunction0(isFullScreen), isPaused = js.Any.fromFunction0(isPaused), isRunning = js.Any.fromFunction0(isRunning), pause = js.Any.fromFunction0(pause), removeSlideShowListener = js.Any.fromFunction1(removeSlideShowListener), resume = js.Any.fromFunction0(resume), stopSound = js.Any.fromFunction0(stopSound))
    __obj.asInstanceOf[XSlideShowController]
  }
  @scala.inline
  implicit class XSlideShowControllerOps[Self <: XSlideShowController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlwaysOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlwaysOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSlide(value: XDrawPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSlide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSlideIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSlideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMouseVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MouseVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextSlideIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextSlideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPenColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PenColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPenWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PenWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideShow(value: XSlideShow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsePen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UsePen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddSlideShowListener(value: XSlideShowListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSlideShowListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBlankScreen(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankScreen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeactivate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deactivate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentSlide(value: () => XDrawPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSlide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentSlideIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSlideIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNextSlideIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNextSlideIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSlideByIndex(value: Double => XDrawPage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlideByIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetSlideCount(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlideCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSlideShow(value: () => XSlideShow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSlideShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotoBookmark(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoBookmark")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGotoFirstSlide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoFirstSlide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotoLastSlide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoLastSlide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotoNextEffect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoNextEffect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotoNextSlide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoNextSlide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotoPreviousEffect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoPreviousEffect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotoPreviousSlide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoPreviousSlide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGotoSlide(value: XDrawPage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoSlide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGotoSlideIndex(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gotoSlideIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsActive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isActive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEndless(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEndless")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFullScreen(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFullScreen")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsPaused(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPaused")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRunning(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPause(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pause")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveSlideShowListener(value: XSlideShowListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSlideShowListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResume(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resume")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStopSound(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopSound")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

