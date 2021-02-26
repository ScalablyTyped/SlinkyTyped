package typingsSlinky.promiseSftp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** From the [statvfs struct](http://linux.die.net/man/2/statvfs). */
@js.native
trait Statvfs extends StObject {
  
  /** free blocks for unprivileged users */
  var f_bavail: Double = js.native
  
  /** free blocks */
  var f_bfree: Double = js.native
  
  /** size of fs in f_frsize units */
  var f_blocks: Double = js.native
  
  /** file system block size */
  var f_bsize: Double = js.native
  
  /** free inodes for unprivileged users */
  var f_favail: Double = js.native
  
  /** free inodes */
  var f_ffree: Double = js.native
  
  /** inodes */
  var f_files: Double = js.native
  
  /** mount flags */
  var f_flag: Double = js.native
  
  /** fragment size */
  var f_frsize: Double = js.native
  
  /** file system ID */
  var f_fsid: Double = js.native
  
  /** maximum filename length */
  var f_namemax: Double = js.native
}
object Statvfs {
  
  @scala.inline
  def apply(
    f_bavail: Double,
    f_bfree: Double,
    f_blocks: Double,
    f_bsize: Double,
    f_favail: Double,
    f_ffree: Double,
    f_files: Double,
    f_flag: Double,
    f_frsize: Double,
    f_fsid: Double,
    f_namemax: Double
  ): Statvfs = {
    val __obj = js.Dynamic.literal(f_bavail = f_bavail.asInstanceOf[js.Any], f_bfree = f_bfree.asInstanceOf[js.Any], f_blocks = f_blocks.asInstanceOf[js.Any], f_bsize = f_bsize.asInstanceOf[js.Any], f_favail = f_favail.asInstanceOf[js.Any], f_ffree = f_ffree.asInstanceOf[js.Any], f_files = f_files.asInstanceOf[js.Any], f_flag = f_flag.asInstanceOf[js.Any], f_frsize = f_frsize.asInstanceOf[js.Any], f_fsid = f_fsid.asInstanceOf[js.Any], f_namemax = f_namemax.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statvfs]
  }
  
  @scala.inline
  implicit class StatvfsMutableBuilder[Self <: Statvfs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setF_bavail(value: Double): Self = StObject.set(x, "f_bavail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_bfree(value: Double): Self = StObject.set(x, "f_bfree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_blocks(value: Double): Self = StObject.set(x, "f_blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_bsize(value: Double): Self = StObject.set(x, "f_bsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_favail(value: Double): Self = StObject.set(x, "f_favail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_ffree(value: Double): Self = StObject.set(x, "f_ffree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_files(value: Double): Self = StObject.set(x, "f_files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_flag(value: Double): Self = StObject.set(x, "f_flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_frsize(value: Double): Self = StObject.set(x, "f_frsize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_fsid(value: Double): Self = StObject.set(x, "f_fsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setF_namemax(value: Double): Self = StObject.set(x, "f_namemax", value.asInstanceOf[js.Any])
  }
}
