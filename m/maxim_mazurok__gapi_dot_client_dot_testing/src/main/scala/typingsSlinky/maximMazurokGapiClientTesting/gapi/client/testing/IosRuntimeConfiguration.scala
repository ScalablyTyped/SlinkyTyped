package typingsSlinky.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosRuntimeConfiguration extends StObject {
  
  /** The set of available locales. */
  var locales: js.UndefOr[js.Array[Locale]] = js.native
  
  /** The set of available orientations. */
  var orientations: js.UndefOr[js.Array[Orientation]] = js.native
}
object IosRuntimeConfiguration {
  
  @scala.inline
  def apply(): IosRuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosRuntimeConfiguration]
  }
  
  @scala.inline
  implicit class IosRuntimeConfigurationMutableBuilder[Self <: IosRuntimeConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocales(value: js.Array[Locale]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: Locale*): Self = StObject.set(x, "locales", js.Array(value :_*))
    
    @scala.inline
    def setOrientations(value: js.Array[Orientation]): Self = StObject.set(x, "orientations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationsUndefined: Self = StObject.set(x, "orientations", js.undefined)
    
    @scala.inline
    def setOrientationsVarargs(value: Orientation*): Self = StObject.set(x, "orientations", js.Array(value :_*))
  }
}
