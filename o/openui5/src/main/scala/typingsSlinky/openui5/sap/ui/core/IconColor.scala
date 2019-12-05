package typingsSlinky.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IconColor extends js.Object

/**
  * Semantic Colors of an icon.
  */
@JSGlobal("sap.ui.core.IconColor")
@js.native
object IconColor extends js.Object {
  @js.native
  sealed trait Critical extends IconColor
  
  @js.native
  sealed trait Default extends IconColor
  
  @js.native
  sealed trait Negative extends IconColor
  
  @js.native
  sealed trait Neutral extends IconColor
  
  @js.native
  sealed trait Positive extends IconColor
  
  /* 0 */ val Critical: typingsSlinky.openui5.sap.ui.core.IconColor.Critical with Double = js.native
  /* 1 */ val Default: typingsSlinky.openui5.sap.ui.core.IconColor.Default with Double = js.native
  /* 2 */ val Negative: typingsSlinky.openui5.sap.ui.core.IconColor.Negative with Double = js.native
  /* 3 */ val Neutral: typingsSlinky.openui5.sap.ui.core.IconColor.Neutral with Double = js.native
  /* 4 */ val Positive: typingsSlinky.openui5.sap.ui.core.IconColor.Positive with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IconColor with Double] = js.native
}

