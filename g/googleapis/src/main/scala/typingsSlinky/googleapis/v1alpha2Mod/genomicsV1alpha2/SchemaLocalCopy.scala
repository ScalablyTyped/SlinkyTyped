package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LocalCopy defines how a remote file should be copied to and from the VM.
  */
@js.native
trait SchemaLocalCopy extends StObject {
  
  /**
    * Required. The name of the disk where this parameter is located. Can be
    * the name of one of the disks specified in the Resources field, or
    * &quot;boot&quot;, which represents the Docker instance&#39;s boot disk
    * and has a mount point of `/`.
    */
  var disk: js.UndefOr[String] = js.native
  
  /**
    * Required. The path within the user&#39;s docker container where this
    * input should be localized to and from, relative to the specified
    * disk&#39;s mount point. For example: file.txt,
    */
  var path: js.UndefOr[String] = js.native
}
object SchemaLocalCopy {
  
  @scala.inline
  def apply(): SchemaLocalCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalCopy]
  }
  
  @scala.inline
  implicit class SchemaLocalCopyMutableBuilder[Self <: SchemaLocalCopy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisk(value: String): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
