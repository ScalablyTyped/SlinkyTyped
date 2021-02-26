package typingsSlinky.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Ad extensions
@js.native
trait AccountExtensions extends StObject {
  
  def callouts(): AdWordsSelector[Callout] = js.native
  
  def message(): AdWordsSelector[Message] = js.native
  
  def mobileApps(): AdWordsSelector[MobileApp] = js.native
  
  def reviews(): AdWordsSelector[Review] = js.native
  
  def sitelinks(): AdWordsSelector[Sitelink] = js.native
  
  def snippets(): AdWordsSelector[Snippet] = js.native
}
object AccountExtensions {
  
  @scala.inline
  def apply(
    callouts: () => AdWordsSelector[Callout],
    message: () => AdWordsSelector[Message],
    mobileApps: () => AdWordsSelector[MobileApp],
    reviews: () => AdWordsSelector[Review],
    sitelinks: () => AdWordsSelector[Sitelink],
    snippets: () => AdWordsSelector[Snippet]
  ): AccountExtensions = {
    val __obj = js.Dynamic.literal(callouts = js.Any.fromFunction0(callouts), message = js.Any.fromFunction0(message), mobileApps = js.Any.fromFunction0(mobileApps), reviews = js.Any.fromFunction0(reviews), sitelinks = js.Any.fromFunction0(sitelinks), snippets = js.Any.fromFunction0(snippets))
    __obj.asInstanceOf[AccountExtensions]
  }
  
  @scala.inline
  implicit class AccountExtensionsMutableBuilder[Self <: AccountExtensions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallouts(value: () => AdWordsSelector[Callout]): Self = StObject.set(x, "callouts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessage(value: () => AdWordsSelector[Message]): Self = StObject.set(x, "message", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMobileApps(value: () => AdWordsSelector[MobileApp]): Self = StObject.set(x, "mobileApps", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReviews(value: () => AdWordsSelector[Review]): Self = StObject.set(x, "reviews", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSitelinks(value: () => AdWordsSelector[Sitelink]): Self = StObject.set(x, "sitelinks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSnippets(value: () => AdWordsSelector[Snippet]): Self = StObject.set(x, "snippets", js.Any.fromFunction0(value))
  }
}
