package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeBackupInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) associated with the backup.
    */
  var BackupArn: typingsSlinky.awsSdk.dynamodbMod.BackupArn = js.native
}
object DescribeBackupInput {
  
  @scala.inline
  def apply(BackupArn: BackupArn): DescribeBackupInput = {
    val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupInput]
  }
  
  @scala.inline
  implicit class DescribeBackupInputMutableBuilder[Self <: DescribeBackupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
  }
}
