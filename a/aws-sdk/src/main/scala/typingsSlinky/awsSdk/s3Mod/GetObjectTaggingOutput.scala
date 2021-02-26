package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetObjectTaggingOutput extends StObject {
  
  /**
    * Contains the tag set.
    */
  var TagSet: typingsSlinky.awsSdk.s3Mod.TagSet = js.native
  
  /**
    * The versionId of the object for which you got the tagging information.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.native
}
object GetObjectTaggingOutput {
  
  @scala.inline
  def apply(TagSet: TagSet): GetObjectTaggingOutput = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectTaggingOutput]
  }
  
  @scala.inline
  implicit class GetObjectTaggingOutputMutableBuilder[Self <: GetObjectTaggingOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagSet(value: TagSet): Self = StObject.set(x, "TagSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSetVarargs(value: Tag*): Self = StObject.set(x, "TagSet", js.Array(value :_*))
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
