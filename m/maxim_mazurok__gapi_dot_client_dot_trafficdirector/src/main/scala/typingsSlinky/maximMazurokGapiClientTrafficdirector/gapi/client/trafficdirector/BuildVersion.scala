package typingsSlinky.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildVersion extends StObject {
  
  /** Free-form build information. Envoy defines several well known keys in the source/common/version/version.h file */
  var metadata: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typingsSlinky.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.BuildVersion with TopLevel[js.Any]
  ] = js.native
  
  /** SemVer version of extension. */
  var version: js.UndefOr[SemanticVersion] = js.native
}
object BuildVersion {
  
  @scala.inline
  def apply(): BuildVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildVersion]
  }
  
  @scala.inline
  implicit class BuildVersionMutableBuilder[Self <: BuildVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetadata(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typingsSlinky.maximMazurokGapiClientTrafficdirector.maximMazurokGapiClientTrafficdirectorStrings.BuildVersion with TopLevel[js.Any]
    ): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setVersion(value: SemanticVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
