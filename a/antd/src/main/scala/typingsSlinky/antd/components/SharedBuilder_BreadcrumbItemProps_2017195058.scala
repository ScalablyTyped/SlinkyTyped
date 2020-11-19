package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLAnchorElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.span.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.dropdownDropdownMod.DropDownProps
import typingsSlinky.antd.dropdownDropdownMod.OverlayFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_BreadcrumbItemProps_2017195058 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def dropdownProps(value: DropDownProps): this.type = set("dropdownProps", value.asInstanceOf[js.Any])
  
  @scala.inline
  def href(value: String): this.type = set("href", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClick(value: SyntheticMouseEvent[HTMLAnchorElement | HTMLSpanElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  
  @scala.inline
  def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
  
  @scala.inline
  def overlay(value: ReactElement | OverlayFunc): this.type = set("overlay", value.asInstanceOf[js.Any])
  
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  @scala.inline
  def separatorReactElement(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
  
  @scala.inline
  def separator(value: ReactElement): this.type = set("separator", value.asInstanceOf[js.Any])
}
