package typingsSlinky.chrome.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.chrome.chrome.declarativeContent.PageChangedEvent
import typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcher
import typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties
import typingsSlinky.chrome.chrome.declarativeContent.SetIcon
import typingsSlinky.chrome.chrome.declarativeContent.ShowPageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofdeclarativeContent extends js.Object {
  
  var PageStateMatcher: Instantiable1[
    /* options */ PageStateMatcherProperties, 
    typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcher
  ] = js.native
  
  var PageStateMatcherProperties: Instantiable0[typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties] = js.native
  
  var SetIcon: Instantiable1[
    /* options */ js.UndefOr[ImageData], 
    typingsSlinky.chrome.chrome.declarativeContent.SetIcon
  ] = js.native
  
  var ShowPageAction: Instantiable0[typingsSlinky.chrome.chrome.declarativeContent.ShowPageAction] = js.native
  
  var onPageChanged: PageChangedEvent = js.native
}
object TypeofdeclarativeContent {
  
  @scala.inline
  def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[PageStateMatcherProperties],
    SetIcon: Instantiable1[/* options */ js.UndefOr[ImageData], SetIcon],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher.asInstanceOf[js.Any], PageStateMatcherProperties = PageStateMatcherProperties.asInstanceOf[js.Any], SetIcon = SetIcon.asInstanceOf[js.Any], ShowPageAction = ShowPageAction.asInstanceOf[js.Any], onPageChanged = onPageChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
  
  @scala.inline
  implicit class TypeofdeclarativeContentOps[Self <: TypeofdeclarativeContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPageStateMatcher(value: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher]): Self = this.set("PageStateMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageStateMatcherProperties(value: Instantiable0[PageStateMatcherProperties]): Self = this.set("PageStateMatcherProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetIcon(value: Instantiable1[/* options */ js.UndefOr[ImageData], SetIcon]): Self = this.set("SetIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPageAction(value: Instantiable0[ShowPageAction]): Self = this.set("ShowPageAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnPageChanged(value: PageChangedEvent): Self = this.set("onPageChanged", value.asInstanceOf[js.Any])
  }
}
