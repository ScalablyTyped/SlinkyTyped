package typingsSlinky.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectTextWrapType extends js.Object

/**
  * Lists values specifying how text is wrapped around a floating object.
  */
@JSGlobal("FloatingObjectTextWrapType")
@js.native
object FloatingObjectTextWrapType extends js.Object {
  /**
    * The text does not wrap around the shape.
    */
  @js.native
  sealed trait None extends FloatingObjectTextWrapType
  
  /**
    * The text wraps around the rectangular borders of the shape.
    */
  @js.native
  sealed trait Square extends FloatingObjectTextWrapType
  
  /**
    * The text wraps tightly around the shape and can fill in the transparent background space inside the shape.
    */
  @js.native
  sealed trait Through extends FloatingObjectTextWrapType
  
  /**
    * The text wraps tightly around the shape.
    */
  @js.native
  sealed trait Tight extends FloatingObjectTextWrapType
  
  /**
    * The text is displayed above and below the shape and does not wrap around the sides.
    */
  @js.native
  sealed trait TopAndBottom extends FloatingObjectTextWrapType
  
  /* 0 */ val None: typingsSlinky.devexpressDashWeb.FloatingObjectTextWrapType.None with Double = js.native
  /* 4 */ val Square: typingsSlinky.devexpressDashWeb.FloatingObjectTextWrapType.Square with Double = js.native
  /* 3 */ val Through: typingsSlinky.devexpressDashWeb.FloatingObjectTextWrapType.Through with Double = js.native
  /* 2 */ val Tight: typingsSlinky.devexpressDashWeb.FloatingObjectTextWrapType.Tight with Double = js.native
  /* 1 */ val TopAndBottom: typingsSlinky.devexpressDashWeb.FloatingObjectTextWrapType.TopAndBottom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectTextWrapType with Double] = js.native
}

