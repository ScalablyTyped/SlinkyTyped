package typingsSlinky.awsSdk.efsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PosixUser extends StObject {
  
  /**
    * The POSIX group ID used for all file system operations using this access point.
    */
  var Gid: typingsSlinky.awsSdk.efsMod.Gid = js.native
  
  /**
    * Secondary POSIX group IDs used for all file system operations using this access point.
    */
  var SecondaryGids: js.UndefOr[typingsSlinky.awsSdk.efsMod.SecondaryGids] = js.native
  
  /**
    * The POSIX user ID used for all file system operations using this access point.
    */
  var Uid: typingsSlinky.awsSdk.efsMod.Uid = js.native
}
object PosixUser {
  
  @scala.inline
  def apply(Gid: Gid, Uid: Uid): PosixUser = {
    val __obj = js.Dynamic.literal(Gid = Gid.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosixUser]
  }
  
  @scala.inline
  implicit class PosixUserMutableBuilder[Self <: PosixUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGid(value: Gid): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryGids(value: SecondaryGids): Self = StObject.set(x, "SecondaryGids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryGidsUndefined: Self = StObject.set(x, "SecondaryGids", js.undefined)
    
    @scala.inline
    def setSecondaryGidsVarargs(value: Gid*): Self = StObject.set(x, "SecondaryGids", js.Array(value :_*))
    
    @scala.inline
    def setUid(value: Uid): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
  }
}
