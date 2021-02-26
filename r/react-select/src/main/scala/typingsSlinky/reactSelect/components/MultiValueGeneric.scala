package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSelect.anon.ClassName
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueGenericProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiValueGeneric {
  
  @scala.inline
  def apply(data: js.Any, innerProps: ClassName, selectProps: js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], innerProps = innerProps.asInstanceOf[js.Any], selectProps = selectProps.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[MultiValueGenericProps[js.Any]]))
  }
  
  @JSImport("react-select/src/components/MultiValue", "MultiValueGeneric")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MultiValueGenericProps[js.Any]): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
