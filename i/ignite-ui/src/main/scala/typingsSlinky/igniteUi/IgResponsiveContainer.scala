package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgResponsiveContainer
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * The time between two resize checks in milliseconds.
    */
  var pollingInterval: js.UndefOr[Double] = js.native
}
object IgResponsiveContainer {
  
  @scala.inline
  def apply(): IgResponsiveContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgResponsiveContainer]
  }
  
  @scala.inline
  implicit class IgResponsiveContainerMutableBuilder[Self <: IgResponsiveContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPollingInterval(value: Double): Self = StObject.set(x, "pollingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingIntervalUndefined: Self = StObject.set(x, "pollingInterval", js.undefined)
  }
}
