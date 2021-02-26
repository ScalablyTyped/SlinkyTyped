package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaWindowsDetail extends StObject {
  
  /**
    * Required. The CPE URI in [cpe
    * format](https://cpe.mitre.org/specification/) in which the vulnerability
    * manifests. Examples include distro or storage location for vulnerable
    * jar.
    */
  var cpeUri: js.UndefOr[String] = js.native
  
  /**
    * The description of the vulnerability.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Required. The names of the KBs which have hotfixes to mitigate this
    * vulnerability. Note that there may be multiple hotfixes (and thus
    * multiple KBs) that mitigate a given vulnerability. Currently any listed
    * kb&#39;s presence is considered a fix.
    */
  var fixingKbs: js.UndefOr[js.Array[SchemaKnowledgeBase]] = js.native
  
  /**
    * Required. The name of the vulnerability.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaWindowsDetail {
  
  @scala.inline
  def apply(): SchemaWindowsDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWindowsDetail]
  }
  
  @scala.inline
  implicit class SchemaWindowsDetailMutableBuilder[Self <: SchemaWindowsDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpeUri(value: String): Self = StObject.set(x, "cpeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCpeUriUndefined: Self = StObject.set(x, "cpeUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFixingKbs(value: js.Array[SchemaKnowledgeBase]): Self = StObject.set(x, "fixingKbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixingKbsUndefined: Self = StObject.set(x, "fixingKbs", js.undefined)
    
    @scala.inline
    def setFixingKbsVarargs(value: SchemaKnowledgeBase*): Self = StObject.set(x, "fixingKbs", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
