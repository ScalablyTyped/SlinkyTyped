package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response when listing course aliases.
  */
@js.native
trait SchemaListCourseAliasesResponse extends StObject {
  
  /**
    * The course aliases.
    */
  var aliases: js.UndefOr[js.Array[SchemaCourseAlias]] = js.native
  
  /**
    * Token identifying the next page of results to return. If empty, no
    * further results are available.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListCourseAliasesResponse {
  
  @scala.inline
  def apply(): SchemaListCourseAliasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCourseAliasesResponse]
  }
  
  @scala.inline
  implicit class SchemaListCourseAliasesResponseMutableBuilder[Self <: SchemaListCourseAliasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[SchemaCourseAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: SchemaCourseAlias*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
