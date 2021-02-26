package typingsSlinky.fsJetpack.typesMod

import typingsSlinky.fsJetpack.fsJetpackStrings.dir
import typingsSlinky.fsJetpack.fsJetpackStrings.file
import typingsSlinky.fsJetpack.fsJetpackStrings.symlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectResult extends StObject {
  
  var absolutePath: js.UndefOr[String] = js.native
  
  var accessTime: js.UndefOr[js.Date] = js.native
  
  var changeTime: js.UndefOr[js.Date] = js.native
  
  var md5: js.UndefOr[String] = js.native
  
  var mode: js.UndefOr[Double] = js.native
  
  var modifyTime: js.UndefOr[js.Date] = js.native
  
  var name: String = js.native
  
  var sha1: js.UndefOr[String] = js.native
  
  var sha256: js.UndefOr[String] = js.native
  
  var sha512: js.UndefOr[String] = js.native
  
  var size: Double = js.native
  
  var `type`: file | dir | symlink = js.native
}
object InspectResult {
  
  @scala.inline
  def apply(name: String, size: Double, `type`: file | dir | symlink): InspectResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectResult]
  }
  
  @scala.inline
  implicit class InspectResultMutableBuilder[Self <: InspectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolutePath(value: String): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    @scala.inline
    def setAccessTime(value: js.Date): Self = StObject.set(x, "accessTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTimeUndefined: Self = StObject.set(x, "accessTime", js.undefined)
    
    @scala.inline
    def setChangeTime(value: js.Date): Self = StObject.set(x, "changeTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTimeUndefined: Self = StObject.set(x, "changeTime", js.undefined)
    
    @scala.inline
    def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5Undefined: Self = StObject.set(x, "md5", js.undefined)
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setModifyTime(value: js.Date): Self = StObject.set(x, "modifyTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifyTimeUndefined: Self = StObject.set(x, "modifyTime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha1Undefined: Self = StObject.set(x, "sha1", js.undefined)
    
    @scala.inline
    def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
    
    @scala.inline
    def setSha512(value: String): Self = StObject.set(x, "sha512", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSha512Undefined: Self = StObject.set(x, "sha512", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: file | dir | symlink): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
