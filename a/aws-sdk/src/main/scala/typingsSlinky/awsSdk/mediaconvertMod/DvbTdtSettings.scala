package typingsSlinky.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvbTdtSettings extends StObject {
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var TdtInterval: js.UndefOr[integerMin1000Max30000] = js.native
}
object DvbTdtSettings {
  
  @scala.inline
  def apply(): DvbTdtSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbTdtSettings]
  }
  
  @scala.inline
  implicit class DvbTdtSettingsMutableBuilder[Self <: DvbTdtSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTdtInterval(value: integerMin1000Max30000): Self = StObject.set(x, "TdtInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTdtIntervalUndefined: Self = StObject.set(x, "TdtInterval", js.undefined)
  }
}
