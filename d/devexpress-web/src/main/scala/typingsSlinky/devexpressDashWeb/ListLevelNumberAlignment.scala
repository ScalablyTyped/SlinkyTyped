package typingsSlinky.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListLevelNumberAlignment extends js.Object

/**
  * Lists values that specify the paragraph text alignment within numbered list levels.
  */
@JSGlobal("ListLevelNumberAlignment")
@js.native
object ListLevelNumberAlignment extends js.Object {
  /**
    * Text is aligned to the center of the list level's paragraph.
    */
  @js.native
  sealed trait Center extends ListLevelNumberAlignment
  
  /**
    * Text is aligned to the left of the list level's paragraph.
    */
  @js.native
  sealed trait Left extends ListLevelNumberAlignment
  
  /**
    * Text is aligned to the right of the list level's paragraph.
    */
  @js.native
  sealed trait Right extends ListLevelNumberAlignment
  
  /* 1 */ val Center: typingsSlinky.devexpressDashWeb.ListLevelNumberAlignment.Center with Double = js.native
  /* 0 */ val Left: typingsSlinky.devexpressDashWeb.ListLevelNumberAlignment.Left with Double = js.native
  /* 2 */ val Right: typingsSlinky.devexpressDashWeb.ListLevelNumberAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ListLevelNumberAlignment with Double] = js.native
}

