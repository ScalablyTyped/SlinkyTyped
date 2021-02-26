package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.puppeteerStrings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BinaryScreenShotOptions extends ScreenshotOptions {
  
  @JSName("encoding")
  var encoding_BinaryScreenShotOptions: js.UndefOr[binary] = js.native
}
object BinaryScreenShotOptions {
  
  @scala.inline
  def apply(): BinaryScreenShotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinaryScreenShotOptions]
  }
  
  @scala.inline
  implicit class BinaryScreenShotOptionsMutableBuilder[Self <: BinaryScreenShotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
