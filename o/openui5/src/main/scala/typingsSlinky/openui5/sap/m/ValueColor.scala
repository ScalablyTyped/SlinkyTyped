package typingsSlinky.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueColor extends js.Object

/**
  * Enumeration of possible value color settings.
  */
@JSGlobal("sap.m.ValueColor")
@js.native
object ValueColor extends js.Object {
  @js.native
  sealed trait Critical extends ValueColor
  
  @js.native
  sealed trait Error extends ValueColor
  
  @js.native
  sealed trait Good extends ValueColor
  
  @js.native
  sealed trait Neutral extends ValueColor
  
  /* 0 */ val Critical: typingsSlinky.openui5.sap.m.ValueColor.Critical with Double = js.native
  /* 1 */ val Error: typingsSlinky.openui5.sap.m.ValueColor.Error with Double = js.native
  /* 2 */ val Good: typingsSlinky.openui5.sap.m.ValueColor.Good with Double = js.native
  /* 3 */ val Neutral: typingsSlinky.openui5.sap.m.ValueColor.Neutral with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueColor with Double] = js.native
}

