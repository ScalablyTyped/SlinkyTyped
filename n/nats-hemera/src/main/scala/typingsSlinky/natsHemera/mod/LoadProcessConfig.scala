package typingsSlinky.natsHemera.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadProcessConfig extends StObject {
  
  var sampleInterval: js.UndefOr[Double] = js.native
}
object LoadProcessConfig {
  
  @scala.inline
  def apply(): LoadProcessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadProcessConfig]
  }
  
  @scala.inline
  implicit class LoadProcessConfigMutableBuilder[Self <: LoadProcessConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
  }
}
