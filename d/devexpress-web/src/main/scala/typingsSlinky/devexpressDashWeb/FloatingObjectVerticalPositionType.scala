package typingsSlinky.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectVerticalPositionType extends js.Object

/**
  * Lists values specifying to what element the vertical position of a floating object is relative.
  */
@JSGlobal("FloatingObjectVerticalPositionType")
@js.native
object FloatingObjectVerticalPositionType extends js.Object {
  /**
    * Relative to bottom margin.
    */
  @js.native
  sealed trait BottomMargin extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to line.
    */
  @js.native
  sealed trait Line extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to paragraph.
    */
  @js.native
  sealed trait Paragraph extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to top margin.
    */
  @js.native
  sealed trait TopMargin extends FloatingObjectVerticalPositionType
  
  /* 5 */ val BottomMargin: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionType.BottomMargin with Double = js.native
  /* 6 */ val InsideMargin: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionType.InsideMargin with Double = js.native
  /* 1 */ val Line: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionType.Line with Double = js.native
  /* 3 */ val Margin: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionType.Margin with Double = js.native
  /* 7 */ val OutsideMargin: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionType.OutsideMargin with Double = js.native
  /* 0 */ val Page: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionType.Page with Double = js.native
  /* 2 */ val Paragraph: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionType.Paragraph with Double = js.native
  /* 4 */ val TopMargin: typingsSlinky.devexpressDashWeb.FloatingObjectVerticalPositionType.TopMargin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectVerticalPositionType with Double] = js.native
}

