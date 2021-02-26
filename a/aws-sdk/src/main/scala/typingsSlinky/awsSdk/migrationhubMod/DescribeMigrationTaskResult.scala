package typingsSlinky.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMigrationTaskResult extends StObject {
  
  /**
    * Object encapsulating information about the migration task.
    */
  var MigrationTask: js.UndefOr[typingsSlinky.awsSdk.migrationhubMod.MigrationTask] = js.native
}
object DescribeMigrationTaskResult {
  
  @scala.inline
  def apply(): DescribeMigrationTaskResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMigrationTaskResult]
  }
  
  @scala.inline
  implicit class DescribeMigrationTaskResultMutableBuilder[Self <: DescribeMigrationTaskResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMigrationTask(value: MigrationTask): Self = StObject.set(x, "MigrationTask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationTaskUndefined: Self = StObject.set(x, "MigrationTask", js.undefined)
  }
}
