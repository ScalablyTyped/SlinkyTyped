package typingsSlinky.chrome

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.chrome.chrome.declarativeContent.PageChangedEvent
import typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcher
import typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties
import typingsSlinky.chrome.chrome.declarativeContent.ShowPageAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofdeclarativeContent extends js.Object {
  var PageStateMatcher: Instantiable1[
    /* options */ PageStateMatcherProperties, 
    typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcher
  ] = js.native
  var PageStateMatcherProperties: Instantiable0[typingsSlinky.chrome.chrome.declarativeContent.PageStateMatcherProperties] = js.native
  var ShowPageAction: Instantiable0[typingsSlinky.chrome.chrome.declarativeContent.ShowPageAction] = js.native
  var onPageChanged: PageChangedEvent = js.native
}

object TypeofdeclarativeContent {
  @scala.inline
  def apply(
    PageStateMatcher: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher],
    PageStateMatcherProperties: Instantiable0[PageStateMatcherProperties],
    ShowPageAction: Instantiable0[ShowPageAction],
    onPageChanged: PageChangedEvent
  ): TypeofdeclarativeContent = {
    val __obj = js.Dynamic.literal(PageStateMatcher = PageStateMatcher.asInstanceOf[js.Any], PageStateMatcherProperties = PageStateMatcherProperties.asInstanceOf[js.Any], ShowPageAction = ShowPageAction.asInstanceOf[js.Any], onPageChanged = onPageChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdeclarativeContent]
  }
  @scala.inline
  implicit class TypeofdeclarativeContentOps[Self <: TypeofdeclarativeContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageStateMatcher(value: Instantiable1[/* options */ PageStateMatcherProperties, PageStateMatcher]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageStateMatcher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageStateMatcherProperties(value: Instantiable0[PageStateMatcherProperties]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PageStateMatcherProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPageAction(value: Instantiable0[ShowPageAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowPageAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPageChanged(value: PageChangedEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPageChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

