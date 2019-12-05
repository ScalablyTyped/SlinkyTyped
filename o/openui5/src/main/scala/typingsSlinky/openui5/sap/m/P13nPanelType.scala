package typingsSlinky.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait P13nPanelType extends js.Object

/**
  * Type of panels used in the personalization dialog.
  */
@JSGlobal("sap.m.P13nPanelType")
@js.native
object P13nPanelType extends js.Object {
  @js.native
  sealed trait columns extends P13nPanelType
  
  @js.native
  sealed trait dimeasure extends P13nPanelType
  
  @js.native
  sealed trait filter extends P13nPanelType
  
  @js.native
  sealed trait group extends P13nPanelType
  
  @js.native
  sealed trait sort extends P13nPanelType
  
  /* 0 */ val columns: typingsSlinky.openui5.sap.m.P13nPanelType.columns with Double = js.native
  /* 1 */ val dimeasure: typingsSlinky.openui5.sap.m.P13nPanelType.dimeasure with Double = js.native
  /* 2 */ val filter: typingsSlinky.openui5.sap.m.P13nPanelType.filter with Double = js.native
  /* 3 */ val group: typingsSlinky.openui5.sap.m.P13nPanelType.group with Double = js.native
  /* 4 */ val sort: typingsSlinky.openui5.sap.m.P13nPanelType.sort with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[P13nPanelType with Double] = js.native
}

