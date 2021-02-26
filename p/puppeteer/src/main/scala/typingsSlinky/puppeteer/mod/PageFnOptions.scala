package typingsSlinky.puppeteer.mod

import typingsSlinky.puppeteer.puppeteerStrings.mutation
import typingsSlinky.puppeteer.puppeteerStrings.raf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PageFnOptions extends Timeoutable {
  
  var polling: js.UndefOr[raf | mutation | Double] = js.native
}
object PageFnOptions {
  
  @scala.inline
  def apply(): PageFnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageFnOptions]
  }
  
  @scala.inline
  implicit class PageFnOptionsMutableBuilder[Self <: PageFnOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolling(value: raf | mutation | Double): Self = StObject.set(x, "polling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollingUndefined: Self = StObject.set(x, "polling", js.undefined)
  }
}
