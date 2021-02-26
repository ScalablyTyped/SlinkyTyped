package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.googleCloudStorage.googleCloudStorageBooleans.`false`
import typingsSlinky.googleCloudStorage.googleCloudStorageBooleans.`true`
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.crc32c
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.md5
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateReadStreamOptions extends StObject {
  
  var decompress: js.UndefOr[Boolean] = js.native
  
  var end: js.UndefOr[Double] = js.native
  
  var start: js.UndefOr[Double] = js.native
  
  var userProject: js.UndefOr[String] = js.native
  
  var validation: js.UndefOr[md5 | crc32c | `false` | `true`] = js.native
}
object CreateReadStreamOptions {
  
  @scala.inline
  def apply(): CreateReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReadStreamOptions]
  }
  
  @scala.inline
  implicit class CreateReadStreamOptionsMutableBuilder[Self <: CreateReadStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
    
    @scala.inline
    def setValidation(value: md5 | crc32c | `false` | `true`): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
