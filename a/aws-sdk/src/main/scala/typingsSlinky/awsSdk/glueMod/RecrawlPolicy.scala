package typingsSlinky.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecrawlPolicy extends StObject {
  
  /**
    * Specifies whether to crawl the entire dataset again or to crawl only folders that were added since the last crawler run. A value of CRAWL_EVERYTHING specifies crawling the entire dataset again. A value of CRAWL_NEW_FOLDERS_ONLY specifies crawling only folders that were added since the last crawler run.
    */
  var RecrawlBehavior: js.UndefOr[typingsSlinky.awsSdk.glueMod.RecrawlBehavior] = js.native
}
object RecrawlPolicy {
  
  @scala.inline
  def apply(): RecrawlPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecrawlPolicy]
  }
  
  @scala.inline
  implicit class RecrawlPolicyMutableBuilder[Self <: RecrawlPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecrawlBehavior(value: RecrawlBehavior): Self = StObject.set(x, "RecrawlBehavior", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecrawlBehaviorUndefined: Self = StObject.set(x, "RecrawlBehavior", js.undefined)
  }
}
