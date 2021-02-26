package typingsSlinky.filesystem

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Metadata extends StObject {
  
  /**
    * This is the time at which the file or directory was last modified.
    * @readonly
    */
  var modificationTime: js.Date = js.native
  
  /**
    * The size of the file, in bytes. This must return 0 for directories.
    * @readonly
    */
  var size: Double = js.native
}
object Metadata {
  
  @scala.inline
  def apply(modificationTime: js.Date, size: Double): Metadata = {
    val __obj = js.Dynamic.literal(modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit class MetadataMutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setModificationTime(value: js.Date): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
