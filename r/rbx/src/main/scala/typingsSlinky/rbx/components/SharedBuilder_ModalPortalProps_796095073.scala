package typingsSlinky.rbx.components

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactType
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_ModalPortalProps_796095073[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def as(value: ReactType[_]): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def asComponentClass(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def asFunctionComponent(value: ReactComponentClass[_]): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  @scala.inline
  def clipped(value: Boolean): this.type = set("clipped", value.asInstanceOf[js.Any])
  
  @scala.inline
  def closeOnBlur(value: Boolean): this.type = set("closeOnBlur", value.asInstanceOf[js.Any])
  
  @scala.inline
  def closeOnEsc(value: Boolean): this.type = set("closeOnEsc", value.asInstanceOf[js.Any])
  
  @scala.inline
  def innerRef(value: Ref[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def innerRefFunction1(value: /* instance */ HTMLElement | SVGElement | ReactComponentClass[js.Object] | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def innerRefNull: this.type = set("innerRef", null)
  
  @scala.inline
  def innerRefRefObject(value: ReactRef[HTMLElement | SVGElement | ReactComponentClass[js.Object]]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onClose(value: () => Unit): this.type = set("onClose", js.Any.fromFunction0(value))
}
