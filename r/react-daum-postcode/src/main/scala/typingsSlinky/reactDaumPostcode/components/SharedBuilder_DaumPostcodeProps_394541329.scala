package typingsSlinky.reactDaumPostcode.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDaumPostcode.mod.SearchData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_DaumPostcodeProps_394541329[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def alwaysShowEngAddr(value: Boolean): this.type = set("alwaysShowEngAddr", value.asInstanceOf[js.Any])
  
  @scala.inline
  def animation(value: Boolean): this.type = set("animation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoClose(value: Boolean): this.type = set("autoClose", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoMapping(value: Boolean): this.type = set("autoMapping", value.asInstanceOf[js.Any])
  
  @scala.inline
  def autoResize(value: Boolean): this.type = set("autoResize", value.asInstanceOf[js.Any])
  
  @scala.inline
  def defaultQuery(value: String): this.type = set("defaultQuery", value.asInstanceOf[js.Any])
  
  @scala.inline
  def errorMessage(value: ReactElement): this.type = set("errorMessage", value.asInstanceOf[js.Any])
  
  @scala.inline
  def focusContent(value: Boolean): this.type = set("focusContent", value.asInstanceOf[js.Any])
  
  @scala.inline
  def focusInput(value: Boolean): this.type = set("focusInput", value.asInstanceOf[js.Any])
  
  @scala.inline
  def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hideEngBtn(value: Boolean): this.type = set("hideEngBtn", value.asInstanceOf[js.Any])
  
  @scala.inline
  def hideMapBtn(value: Boolean): this.type = set("hideMapBtn", value.asInstanceOf[js.Any])
  
  @scala.inline
  def maxSuggestItems(value: Double): this.type = set("maxSuggestItems", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onSearch(value: /* data */ SearchData => Unit): this.type = set("onSearch", js.Any.fromFunction1(value))
  
  @scala.inline
  def pleaseReadGuide(value: Double): this.type = set("pleaseReadGuide", value.asInstanceOf[js.Any])
  
  @scala.inline
  def pleaseReadGuideTimer(value: Double): this.type = set("pleaseReadGuideTimer", value.asInstanceOf[js.Any])
  
  @scala.inline
  def scriptUrl(value: String): this.type = set("scriptUrl", value.asInstanceOf[js.Any])
  
  @scala.inline
  def shorthand(value: Boolean): this.type = set("shorthand", value.asInstanceOf[js.Any])
  
  @scala.inline
  def showMoreHName(value: Boolean): this.type = set("showMoreHName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
  
  @scala.inline
  def submitMode(value: Boolean): this.type = set("submitMode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def theme(value: js.Object): this.type = set("theme", value.asInstanceOf[js.Any])
  
  @scala.inline
  def useSuggest(value: Boolean): this.type = set("useSuggest", value.asInstanceOf[js.Any])
  
  @scala.inline
  def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
}
