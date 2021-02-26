package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotWordcloudRotationOptions extends StObject {
  
  /**
    * (Highcharts) The smallest degree of rotation for a word.
    */
  var from: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The number of possible orientations for a word, within the
    * range of `rotation.from` and `rotation.to`. Must be a number larger than
    * 0.
    */
  var orientations: js.UndefOr[Double] = js.native
  
  /**
    * (Highcharts) The largest degree of rotation for a word.
    */
  var to: js.UndefOr[Double] = js.native
}
object PlotWordcloudRotationOptions {
  
  @scala.inline
  def apply(): PlotWordcloudRotationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotWordcloudRotationOptions]
  }
  
  @scala.inline
  implicit class PlotWordcloudRotationOptionsMutableBuilder[Self <: PlotWordcloudRotationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setOrientations(value: Double): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    @scala.inline
    def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
