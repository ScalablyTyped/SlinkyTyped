package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteBuildsOutput extends StObject {
  
  /**
    * The IDs of the builds that were successfully deleted.
    */
  var buildsDeleted: js.UndefOr[BuildIds] = js.native
  
  /**
    * Information about any builds that could not be successfully deleted.
    */
  var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.native
}
object BatchDeleteBuildsOutput {
  
  @scala.inline
  def apply(): BatchDeleteBuildsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteBuildsOutput]
  }
  
  @scala.inline
  implicit class BatchDeleteBuildsOutputMutableBuilder[Self <: BatchDeleteBuildsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildsDeleted(value: BuildIds): Self = StObject.set(x, "buildsDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsDeletedUndefined: Self = StObject.set(x, "buildsDeleted", js.undefined)
    
    @scala.inline
    def setBuildsDeletedVarargs(value: NonEmptyString*): Self = StObject.set(x, "buildsDeleted", js.Array(value :_*))
    
    @scala.inline
    def setBuildsNotDeleted(value: BuildsNotDeleted): Self = StObject.set(x, "buildsNotDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildsNotDeletedUndefined: Self = StObject.set(x, "buildsNotDeleted", js.undefined)
    
    @scala.inline
    def setBuildsNotDeletedVarargs(value: BuildNotDeleted*): Self = StObject.set(x, "buildsNotDeleted", js.Array(value :_*))
  }
}
