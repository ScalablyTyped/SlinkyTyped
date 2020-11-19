package typingsSlinky.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Serves as the base type for all the objects included in the client-side object model.
  */
@JSGlobal("ASPxClientControl")
@js.native
class ASPxClientControl ()
  extends typingsSlinky.devexpressWeb.ASPxClientControl
/* static members */
@JSGlobal("ASPxClientControl")
@js.native
object ASPxClientControl extends js.Object {
  
  /**
    * Modifies the controls size within the specified container.
    * @param container An HTML element that is the container of the controls.
    */
  def AdjustControls(): Unit = js.native
  def AdjustControls(container: js.Any): Unit = js.native
  
  /**
    * Converts the specified object to the current object's type. The converted client object specified by the obj parameter.
    * @param obj The client object to be type cast.
    */
  def Cast(obj: js.Any): typingsSlinky.devexpressWeb.ASPxClientControl = js.native
  
  /**
    * Returns a collection of client web control objects.
    */
  def GetControlCollection(): typingsSlinky.devexpressWeb.ASPxClientControlCollection = js.native
}
