package typingsSlinky.reactBootstrapTable.mod

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomFilter[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */] extends StObject {
  
  /**
    * Custom filter parameters to be passed to the generator function
    */
  var customFilterParameters: CustomFilterParameters[FParams] = js.native
  
  /**
    * Function to generate the filter component
    */
  @JSName("getElement")
  def getElement_CustomFilter(
    filterHandler: js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ],
    customFilterParameters: CustomFilterParameters[FParams]
  ): ReactElement = js.native
  
  /**
    * Type must be 'CustomFilter'
    */
  var `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter = js.native
}
object CustomFilter {
  
  @scala.inline
  def apply[FParams /* <: js.Object */, FElement /* <: CustomFilterElement */](
    customFilterParameters: CustomFilterParameters[FParams],
    getElement: (js.Function2[
      /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
      /* type */ js.UndefOr[typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
      Unit
    ], CustomFilterParameters[FParams]) => ReactElement,
    `type`: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter
  ): CustomFilter[FParams, FElement] = {
    val __obj = js.Dynamic.literal(customFilterParameters = customFilterParameters.asInstanceOf[js.Any], getElement = js.Any.fromFunction2(getElement))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomFilter[FParams, FElement]]
  }
  
  @scala.inline
  implicit class CustomFilterMutableBuilder[Self <: CustomFilter[_, _], FParams /* <: js.Object */, FElement /* <: CustomFilterElement */] (val x: Self with (CustomFilter[FParams, FElement])) extends AnyVal {
    
    @scala.inline
    def setCustomFilterParameters(value: CustomFilterParameters[FParams]): Self = StObject.set(x, "customFilterParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetElement(
      value: (js.Function2[
          /* value */ js.UndefOr[CustomFilterParameters[FParams]], 
          /* type */ js.UndefOr[typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter], 
          Unit
        ], CustomFilterParameters[FParams]) => ReactElement
    ): Self = StObject.set(x, "getElement", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: typingsSlinky.reactBootstrapTable.reactBootstrapTableStrings.CustomFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
