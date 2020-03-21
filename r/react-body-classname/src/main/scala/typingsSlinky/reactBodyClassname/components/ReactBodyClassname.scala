package typingsSlinky.reactBodyClassname.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBodyClassname.AnonClassName
import typingsSlinky.reactBodyClassname.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactBodyClassname
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-body-classname", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(className: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonClassName
}

