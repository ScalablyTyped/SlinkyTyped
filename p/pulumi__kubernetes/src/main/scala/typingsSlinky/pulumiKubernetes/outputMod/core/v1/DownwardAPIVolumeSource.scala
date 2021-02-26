package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
  */
@js.native
trait DownwardAPIVolumeSource extends StObject {
  
  /**
    * Optional: mode bits to use on created files by default. Must be a Optional: mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
    */
  var defaultMode: Double = js.native
  
  /**
    * Items is a list of downward API volume file
    */
  var items: js.Array[DownwardAPIVolumeFile] = js.native
}
object DownwardAPIVolumeSource {
  
  @scala.inline
  def apply(defaultMode: Double, items: js.Array[DownwardAPIVolumeFile]): DownwardAPIVolumeSource = {
    val __obj = js.Dynamic.literal(defaultMode = defaultMode.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownwardAPIVolumeSource]
  }
  
  @scala.inline
  implicit class DownwardAPIVolumeSourceMutableBuilder[Self <: DownwardAPIVolumeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultMode(value: Double): Self = StObject.set(x, "defaultMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[DownwardAPIVolumeFile]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: DownwardAPIVolumeFile*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
