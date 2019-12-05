package typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorType extends js.Object

/**
  * The types of Colors
  */
@JSGlobal("GoogleAppsScript.Base.ColorType")
@js.native
object ColorType extends js.Object {
  @js.native
  sealed trait RGB extends ColorType
  
  @js.native
  sealed trait THEME extends ColorType
  
  @js.native
  sealed trait UNSUPPORTED extends ColorType
  
  /* 1 */ val RGB: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Base.ColorType.RGB with Double = js.native
  /* 2 */ val THEME: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Base.ColorType.THEME with Double = js.native
  /* 0 */ val UNSUPPORTED: typingsSlinky.googleDashAppsDashScript.GoogleAppsScript.Base.ColorType.UNSUPPORTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ColorType with Double] = js.native
}

