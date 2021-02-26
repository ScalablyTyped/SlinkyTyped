package typingsSlinky.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageScanFinding extends StObject {
  
  /**
    * A collection of attributes of the host from which the finding is generated.
    */
  var attributes: js.UndefOr[AttributeList] = js.native
  
  /**
    * The description of the finding.
    */
  var description: js.UndefOr[FindingDescription] = js.native
  
  /**
    * The name associated with the finding, usually a CVE number.
    */
  var name: js.UndefOr[FindingName] = js.native
  
  /**
    * The finding severity.
    */
  var severity: js.UndefOr[FindingSeverity] = js.native
  
  /**
    * A link containing additional details about the security vulnerability.
    */
  var uri: js.UndefOr[Url] = js.native
}
object ImageScanFinding {
  
  @scala.inline
  def apply(): ImageScanFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageScanFinding]
  }
  
  @scala.inline
  implicit class ImageScanFindingMutableBuilder[Self <: ImageScanFinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: AttributeList): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: FindingDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: FindingName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSeverity(value: FindingSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setUri(value: Url): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
