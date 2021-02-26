package typingsSlinky.maximMazurokGapiClientAdsensehost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupOption extends StObject {
  
  /** The backup option to be used in instances where no ad is available. */
  var backupOption: js.UndefOr[Color] = js.native
  
  /** Size of this ad unit. Size values are in the form SIZE_{width}_{height}. */
  var size: js.UndefOr[String] = js.native
  
  /** Type of this ad unit. Possible values are TEXT, TEXT_IMAGE, IMAGE and LINK. */
  var `type`: js.UndefOr[String] = js.native
}
object BackupOption {
  
  @scala.inline
  def apply(): BackupOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupOption]
  }
  
  @scala.inline
  implicit class BackupOptionMutableBuilder[Self <: BackupOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupOption(value: Color): Self = StObject.set(x, "backupOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupOptionUndefined: Self = StObject.set(x, "backupOption", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
