package typingsSlinky.reactIntl.components

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactNodeArray
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_Props_589732436[R <: js.Object, V /* <: Record[String, js.Any] */] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def children(value: /* nodes */ ReactNodeArray => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
  
  @scala.inline
  def tagNameFunctionComponent(value: ReactComponentClass[_]): this.type = set("tagName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tagNameComponentClass(value: ReactComponentClass[_]): this.type = set("tagName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def tagName(value: ReactElement): this.type = set("tagName", value.asInstanceOf[js.Any])
  
  @scala.inline
  def values(value: V): this.type = set("values", value.asInstanceOf[js.Any])
}
