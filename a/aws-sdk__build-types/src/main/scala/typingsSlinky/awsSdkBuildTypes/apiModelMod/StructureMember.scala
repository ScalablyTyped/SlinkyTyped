package typingsSlinky.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructureMember extends Member {
  
  var location: js.UndefOr[MemberLocation] = js.native
  
  var streaming: js.UndefOr[scala.Boolean] = js.native
  
  var xmlNamespace: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XmlNamespace */ js.Any) | java.lang.String
  ] = js.native
}
object StructureMember {
  
  @scala.inline
  def apply(shape: java.lang.String): StructureMember = {
    val __obj = js.Dynamic.literal(shape = shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructureMember]
  }
  
  @scala.inline
  implicit class StructureMemberMutableBuilder[Self <: StructureMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: MemberLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setStreaming(value: scala.Boolean): Self = StObject.set(x, "streaming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingUndefined: Self = StObject.set(x, "streaming", js.undefined)
    
    @scala.inline
    def setXmlNamespace(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify XmlNamespace */ js.Any) | java.lang.String
    ): Self = StObject.set(x, "xmlNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlNamespaceUndefined: Self = StObject.set(x, "xmlNamespace", js.undefined)
  }
}
