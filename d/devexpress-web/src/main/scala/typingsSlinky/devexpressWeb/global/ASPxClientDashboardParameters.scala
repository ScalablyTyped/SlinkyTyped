package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A collection of ASPxClientDashboardParameter objects.
  */
@JSGlobal("ASPxClientDashboardParameters")
@js.native
class ASPxClientDashboardParameters ()
  extends typingsSlinky.devexpressWeb.ASPxClientDashboardParameters {
  /**
    * Returns a dashboard parameter by its index in the ASPxClientDashboardParameters collection. A ASPxClientDashboardParameter object that is the client-side dashboard parameter.
    * @param index An integer value that specifies the parameter index.
    */
  /* CompleteClass */
  override def GetParameterByIndex(index: Double): typingsSlinky.devexpressWeb.ASPxClientDashboardParameter = js.native
  /**
    * Returns a dashboard parameter by its name. A ASPxClientDashboardParameter object that is the client-side dashboard parameter.
    * @param name A String object that specifies the parameter name.
    */
  /* CompleteClass */
  override def GetParameterByName(name: String): typingsSlinky.devexpressWeb.ASPxClientDashboardParameter = js.native
  /**
    * Returns an array of dashboard parameters from the ASPxClientDashboardParameters collection.
    */
  /* CompleteClass */
  override def GetParameterList(): js.Array[typingsSlinky.devexpressWeb.ASPxClientDashboardParameter] = js.native
}

