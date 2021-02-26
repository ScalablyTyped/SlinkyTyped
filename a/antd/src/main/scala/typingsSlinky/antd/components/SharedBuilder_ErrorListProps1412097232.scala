package typingsSlinky.antd.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ErrorListProps1412097232 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  
  @scala.inline
  def errors(value: js.Array[ReactElement]): this.type = set("errors", value.asInstanceOf[js.Any])
  
  @scala.inline
  def errorsVarargs(value: ReactElement*): this.type = set("errors", js.Array(value :_*))
  
  @scala.inline
  def help(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
  
  @scala.inline
  def helpReactElement(value: ReactElement): this.type = set("help", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onDomErrorVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onDomErrorVisibleChange", js.Any.fromFunction1(value))
}
