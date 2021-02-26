package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The desired state of the Domain Mapping.
  */
@js.native
trait SchemaDomainMappingSpec extends StObject {
  
  /**
    * The mode of the certificate.
    */
  var certificateMode: js.UndefOr[String] = js.native
  
  /**
    * If set, the mapping will override any mapping set before this spec was
    * set. It is recommended that the user leaves this empty to receive an
    * error warning about a potential conflict and only set it once the
    * respective UI has given such a warning.
    */
  var forceOverride: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the Knative Route that this DomainMapping applies to. The
    * route must exist.
    */
  var routeName: js.UndefOr[String] = js.native
}
object SchemaDomainMappingSpec {
  
  @scala.inline
  def apply(): SchemaDomainMappingSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingSpec]
  }
  
  @scala.inline
  implicit class SchemaDomainMappingSpecMutableBuilder[Self <: SchemaDomainMappingSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateMode(value: String): Self = StObject.set(x, "certificateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateModeUndefined: Self = StObject.set(x, "certificateMode", js.undefined)
    
    @scala.inline
    def setForceOverride(value: Boolean): Self = StObject.set(x, "forceOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceOverrideUndefined: Self = StObject.set(x, "forceOverride", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteNameUndefined: Self = StObject.set(x, "routeName", js.undefined)
  }
}
