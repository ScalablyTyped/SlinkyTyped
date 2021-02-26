package typingsSlinky.fluentuiReactComponentRef.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_RefProps762588771[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def innerRef(value: typingsSlinky.react.mod.Ref[HTMLElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def innerRefFunction1(value: /* instance */ HTMLElement | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def innerRefNull: this.type = set("innerRef", null)
  
  @scala.inline
  def innerRefRefObject(value: ReactRef[HTMLElement]): this.type = set("innerRef", value.asInstanceOf[js.Any])
}
