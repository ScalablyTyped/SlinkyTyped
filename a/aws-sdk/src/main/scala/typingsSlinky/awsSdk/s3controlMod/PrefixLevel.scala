package typingsSlinky.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrefixLevel extends StObject {
  
  /**
    * A container for the prefix-level storage metrics for S3 Storage Lens.
    */
  var StorageMetrics: PrefixLevelStorageMetrics = js.native
}
object PrefixLevel {
  
  @scala.inline
  def apply(StorageMetrics: PrefixLevelStorageMetrics): PrefixLevel = {
    val __obj = js.Dynamic.literal(StorageMetrics = StorageMetrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixLevel]
  }
  
  @scala.inline
  implicit class PrefixLevelMutableBuilder[Self <: PrefixLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageMetrics(value: PrefixLevelStorageMetrics): Self = StObject.set(x, "StorageMetrics", value.asInstanceOf[js.Any])
  }
}
