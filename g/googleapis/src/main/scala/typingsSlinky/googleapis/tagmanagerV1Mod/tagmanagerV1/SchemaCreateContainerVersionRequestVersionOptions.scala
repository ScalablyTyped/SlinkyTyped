package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for new container versions.
  */
@js.native
trait SchemaCreateContainerVersionRequestVersionOptions extends StObject {
  
  /**
    * The name of the container version to be created.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The notes of the container version to be created.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * The creation of this version may be for quick preview and shouldn&#39;t
    * be saved.
    */
  var quickPreview: js.UndefOr[Boolean] = js.native
}
object SchemaCreateContainerVersionRequestVersionOptions {
  
  @scala.inline
  def apply(): SchemaCreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContainerVersionRequestVersionOptions]
  }
  
  @scala.inline
  implicit class SchemaCreateContainerVersionRequestVersionOptionsMutableBuilder[Self <: SchemaCreateContainerVersionRequestVersionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setQuickPreview(value: Boolean): Self = StObject.set(x, "quickPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuickPreviewUndefined: Self = StObject.set(x, "quickPreview", js.undefined)
  }
}
