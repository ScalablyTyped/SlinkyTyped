package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestorePlanResponse extends js.Object {
  var backupSetsToRestore: js.Array[DatabaseFileInfo] = js.native
  var canRestore: Boolean = js.native
  var databaseNamesFromBackupSets: js.Array[String] = js.native
  var dbFiles: js.Array[RestoreDatabaseFileInfo] = js.native
  var errorMessage: String = js.native
  var planDetails: StringDictionary[RestorePlanDetailInfo] = js.native
  var sessionId: String = js.native
}

object RestorePlanResponse {
  @scala.inline
  def apply(
    backupSetsToRestore: js.Array[DatabaseFileInfo],
    canRestore: Boolean,
    databaseNamesFromBackupSets: js.Array[String],
    dbFiles: js.Array[RestoreDatabaseFileInfo],
    errorMessage: String,
    planDetails: StringDictionary[RestorePlanDetailInfo],
    sessionId: String
  ): RestorePlanResponse = {
    val __obj = js.Dynamic.literal(backupSetsToRestore = backupSetsToRestore.asInstanceOf[js.Any], canRestore = canRestore.asInstanceOf[js.Any], databaseNamesFromBackupSets = databaseNamesFromBackupSets.asInstanceOf[js.Any], dbFiles = dbFiles.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], planDetails = planDetails.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestorePlanResponse]
  }
  @scala.inline
  implicit class RestorePlanResponseOps[Self <: RestorePlanResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackupSetsToRestore(value: js.Array[DatabaseFileInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backupSetsToRestore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanRestore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canRestore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatabaseNamesFromBackupSets(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseNamesFromBackupSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbFiles(value: js.Array[RestoreDatabaseFileInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlanDetails(value: StringDictionary[RestorePlanDetailInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("planDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

