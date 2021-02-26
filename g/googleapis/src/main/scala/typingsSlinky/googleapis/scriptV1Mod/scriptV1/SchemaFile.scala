package typingsSlinky.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An individual file within a script project. A file is a third-party source
  * code created by one or more developers. It can be a server-side JS code,
  * HTML, or a configuration file. Each script project can contain multiple
  * files.
  */
@js.native
trait SchemaFile extends StObject {
  
  /**
    * Creation date timestamp. This read-only field is only visible to users
    * who have WRITER permission for the script project.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The defined set of functions in the script file, if any.
    */
  var functionSet: js.UndefOr[SchemaGoogleAppsScriptTypeFunctionSet] = js.native
  
  /**
    * The user who modified the file most recently. This read-only field is
    * only visible to users who have WRITER permission for the script project.
    */
  var lastModifyUser: js.UndefOr[SchemaGoogleAppsScriptTypeUser] = js.native
  
  /**
    * The name of the file. The file extension is not part of the file name,
    * which can be identified from the type field.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The file content.
    */
  var source: js.UndefOr[String] = js.native
  
  /**
    * The type of the file.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Last modified date timestamp. This read-only field is only visible to
    * users who have WRITER permission for the script project.
    */
  var updateTime: js.UndefOr[String] = js.native
}
object SchemaFile {
  
  @scala.inline
  def apply(): SchemaFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFile]
  }
  
  @scala.inline
  implicit class SchemaFileMutableBuilder[Self <: SchemaFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setFunctionSet(value: SchemaGoogleAppsScriptTypeFunctionSet): Self = StObject.set(x, "functionSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionSetUndefined: Self = StObject.set(x, "functionSet", js.undefined)
    
    @scala.inline
    def setLastModifyUser(value: SchemaGoogleAppsScriptTypeUser): Self = StObject.set(x, "lastModifyUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifyUserUndefined: Self = StObject.set(x, "lastModifyUser", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
