package typingsSlinky.ionic.anon

import typingsSlinky.ionicCliFramework.definitionsMod.MetadataGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Summary extends StObject {
  
  var groups: js.Array[MetadataGroup] = js.native
  
  var name: String = js.native
  
  var summary: String = js.native
}
object Summary {
  
  @scala.inline
  def apply(groups: js.Array[MetadataGroup], name: String, summary: String): Summary = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
  
  @scala.inline
  implicit class SummaryMutableBuilder[Self <: Summary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: js.Array[MetadataGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: MetadataGroup*): Self = StObject.set(x, "groups", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
