package typingsSlinky.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of ASPxClientDashboardParameter objects.
  */
@js.native
trait ASPxClientDashboardParameters extends StObject {
  
  /**
    * Returns a dashboard parameter by its index in the ASPxClientDashboardParameters collection. A ASPxClientDashboardParameter object that is the client-side dashboard parameter.
    * @param index An integer value that specifies the parameter index.
    */
  def GetParameterByIndex(index: Double): ASPxClientDashboardParameter = js.native
  
  /**
    * Returns a dashboard parameter by its name. A ASPxClientDashboardParameter object that is the client-side dashboard parameter.
    * @param name A String object that specifies the parameter name.
    */
  def GetParameterByName(name: String): ASPxClientDashboardParameter = js.native
  
  /**
    * Returns an array of dashboard parameters from the ASPxClientDashboardParameters collection.
    */
  def GetParameterList(): js.Array[ASPxClientDashboardParameter] = js.native
}
object ASPxClientDashboardParameters {
  
  @scala.inline
  def apply(
    GetParameterByIndex: Double => ASPxClientDashboardParameter,
    GetParameterByName: String => ASPxClientDashboardParameter,
    GetParameterList: () => js.Array[ASPxClientDashboardParameter]
  ): ASPxClientDashboardParameters = {
    val __obj = js.Dynamic.literal(GetParameterByIndex = js.Any.fromFunction1(GetParameterByIndex), GetParameterByName = js.Any.fromFunction1(GetParameterByName), GetParameterList = js.Any.fromFunction0(GetParameterList))
    __obj.asInstanceOf[ASPxClientDashboardParameters]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardParametersMutableBuilder[Self <: ASPxClientDashboardParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetParameterByIndex(value: Double => ASPxClientDashboardParameter): Self = StObject.set(x, "GetParameterByIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameterByName(value: String => ASPxClientDashboardParameter): Self = StObject.set(x, "GetParameterByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetParameterList(value: () => js.Array[ASPxClientDashboardParameter]): Self = StObject.set(x, "GetParameterList", js.Any.fromFunction0(value))
  }
}
