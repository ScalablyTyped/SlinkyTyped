package typingsSlinky.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HorizontalAlign extends js.Object

/**
  * Configuration options for horizontal alignments of controls
  */
@JSGlobal("sap.ui.core.HorizontalAlign")
@js.native
object HorizontalAlign extends js.Object {
  @js.native
  sealed trait Begin extends HorizontalAlign
  
  @js.native
  sealed trait Center extends HorizontalAlign
  
  @js.native
  sealed trait End extends HorizontalAlign
  
  @js.native
  sealed trait Left extends HorizontalAlign
  
  @js.native
  sealed trait Right extends HorizontalAlign
  
  /* 0 */ val Begin: typingsSlinky.openui5.sap.ui.core.HorizontalAlign.Begin with Double = js.native
  /* 1 */ val Center: typingsSlinky.openui5.sap.ui.core.HorizontalAlign.Center with Double = js.native
  /* 2 */ val End: typingsSlinky.openui5.sap.ui.core.HorizontalAlign.End with Double = js.native
  /* 3 */ val Left: typingsSlinky.openui5.sap.ui.core.HorizontalAlign.Left with Double = js.native
  /* 4 */ val Right: typingsSlinky.openui5.sap.ui.core.HorizontalAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HorizontalAlign with Double] = js.native
}

