package typingsSlinky.ionic.anon

import typingsSlinky.ionicCliFramework.definitionsMod.MetadataGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Footnotes extends js.Object {
  
  var description: String = js.native
  
  var footnotes: js.Array[Id] = js.native
  
  var groups: js.Array[MetadataGroup] = js.native
  
  var name: String = js.native
  
  var summary: String = js.native
}
object Footnotes {
  
  @scala.inline
  def apply(
    description: String,
    footnotes: js.Array[Id],
    groups: js.Array[MetadataGroup],
    name: String,
    summary: String
  ): Footnotes = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], footnotes = footnotes.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Footnotes]
  }
  
  @scala.inline
  implicit class FootnotesOps[Self <: Footnotes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotesVarargs(value: Id*): Self = this.set("footnotes", js.Array(value :_*))
    
    @scala.inline
    def setFootnotes(value: js.Array[Id]): Self = this.set("footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsVarargs(value: MetadataGroup*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[MetadataGroup]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
  }
}
