package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for events which concern manipulations on tabs.
  */
@JSGlobal("ASPxClientTabControlTabEventArgs")
@js.native
class ASPxClientTabControlTabEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ASPxClientTabControlTabEventArgs {
  /**
    * Initializes a new object of the ASPxClientTabControlTabEventArgs type with the specified value.
    * @param tab An ASPxClientTab object representing the tab related to the event.
    */
  def this(tab: typingsSlinky.devexpressWeb.ASPxClientTab) = this()
  /**
    * Gets the tab object related to the event.
    */
  /* CompleteClass */
  override var tab: typingsSlinky.devexpressWeb.ASPxClientTab = js.native
}

