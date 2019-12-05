package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LinkType extends js.Object

/**
  * The types of a Link.
  */
@JSGlobal("GoogleAppsScript.Slides.LinkType")
@js.native
object LinkType extends js.Object {
  @js.native
  sealed trait SLIDE_ID extends LinkType
  
  @js.native
  sealed trait SLIDE_INDEX extends LinkType
  
  @js.native
  sealed trait SLIDE_POSITION extends LinkType
  
  @js.native
  sealed trait UNSUPPORTED extends LinkType
  
  @js.native
  sealed trait URL extends LinkType
  
  /* 3 */ val SLIDE_ID: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.LinkType.SLIDE_ID with Double = js.native
  /* 4 */ val SLIDE_INDEX: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.LinkType.SLIDE_INDEX with Double = js.native
  /* 2 */ val SLIDE_POSITION: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.LinkType.SLIDE_POSITION with Double = js.native
  /* 0 */ val UNSUPPORTED: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.LinkType.UNSUPPORTED with Double = js.native
  /* 1 */ val URL: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Slides.LinkType.URL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LinkType with Double] = js.native
}

