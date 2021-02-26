package typingsSlinky.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the client-side ASPxClientScheduler.ActiveViewChanging event.
  */
@JSGlobal("ActiveViewChangingEventArgs")
@js.native
class ActiveViewChangingEventArgs protected ()
  extends typingsSlinky.devexpressWeb.ActiveViewChangingEventArgs {
  /**
    * Provides data for the client-side ActiveViewChanging event.
    * @param oldView Represents the new View used by the Scheduler to show its data.
    * @param newView Represents the previous View used by the Scheduler to show its data.
    */
  def this(
    oldView: typingsSlinky.devexpressWeb.ASPxSchedulerViewType,
    newView: typingsSlinky.devexpressWeb.ASPxSchedulerViewType
  ) = this()
}
