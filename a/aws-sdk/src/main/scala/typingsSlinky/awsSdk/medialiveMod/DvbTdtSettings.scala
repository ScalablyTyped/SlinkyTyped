package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvbTdtSettings extends StObject {
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin1000Max30000] = js.native
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
    def setRepInterval(value: integerMin1000Max30000): Self = StObject.set(x, "RepInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepIntervalUndefined: Self = StObject.set(x, "RepInterval", js.undefined)
  }
}
