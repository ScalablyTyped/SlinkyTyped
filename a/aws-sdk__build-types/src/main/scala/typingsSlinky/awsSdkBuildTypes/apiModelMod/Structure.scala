package typingsSlinky.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Structure
  extends ShapeDef
     with ComplexShape
     with Shape {
  
  var error: js.UndefOr[Error] = js.native
  
  var exception: js.UndefOr[scala.Boolean] = js.native
  
  var fault: js.UndefOr[scala.Boolean] = js.native
  
  var members: StringDictionary[StructureMember] = js.native
  
  var payload: js.UndefOr[java.lang.String] = js.native
  
  var required: js.UndefOr[js.Array[java.lang.String]] = js.native
  
  var topLevel: js.UndefOr[input | output] = js.native
  
  @JSName("type")
  val type_Structure: structure = js.native
}
object Structure {
  
  @scala.inline
  def apply(members: StringDictionary[StructureMember], `type`: structure): Structure = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Structure]
  }
  
  @scala.inline
  implicit class StructureMutableBuilder[Self <: Structure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setException(value: scala.Boolean): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setFault(value: scala.Boolean): Self = StObject.set(x, "fault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultUndefined: Self = StObject.set(x, "fault", js.undefined)
    
    @scala.inline
    def setMembers(value: StringDictionary[StructureMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: java.lang.String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setRequired(value: js.Array[java.lang.String]): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    @scala.inline
    def setRequiredVarargs(value: java.lang.String*): Self = StObject.set(x, "required", js.Array(value :_*))
    
    @scala.inline
    def setTopLevel(value: input | output): Self = StObject.set(x, "topLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopLevelUndefined: Self = StObject.set(x, "topLevel", js.undefined)
    
    @scala.inline
    def setType(value: structure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
