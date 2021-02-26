package typingsSlinky.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A workspace entity that may represent a tag, trigger, variable, or folder
  * in addition to its status in the workspace.
  */
@js.native
trait SchemaEntity extends StObject {
  
  /**
    * Represents how the entity has been changed in the workspace.
    */
  var changeStatus: js.UndefOr[String] = js.native
  
  /**
    * The Folder being represented by the entity.
    */
  var folder: js.UndefOr[SchemaFolder] = js.native
  
  /**
    * The tag being represented by the entity.
    */
  var tag: js.UndefOr[SchemaTag] = js.native
  
  /**
    * The trigger being represented by the entity.
    */
  var trigger: js.UndefOr[SchemaTrigger] = js.native
  
  /**
    * The variable being represented by the entity.
    */
  var variable: js.UndefOr[SchemaVariable] = js.native
}
object SchemaEntity {
  
  @scala.inline
  def apply(): SchemaEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEntity]
  }
  
  @scala.inline
  implicit class SchemaEntityMutableBuilder[Self <: SchemaEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeStatus(value: String): Self = StObject.set(x, "changeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeStatusUndefined: Self = StObject.set(x, "changeStatus", js.undefined)
    
    @scala.inline
    def setFolder(value: SchemaFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setTag(value: SchemaTag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setTrigger(value: SchemaTrigger): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    @scala.inline
    def setVariable(value: SchemaVariable): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableUndefined: Self = StObject.set(x, "variable", js.undefined)
  }
}
