package typingsSlinky.gatsby.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.gatsby.mod.StaticQueryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StaticQuery
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gatsby.mod.StaticQuery[js.Any]] {
  @JSImport("gatsby", "StaticQuery")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](query: js.Any, render: T => TagMod[Any] = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.gatsby.mod.StaticQuery[js.Any]] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.gatsby.mod.StaticQuery[js.Any]]]
  }
  type Props = StaticQueryProps[js.Any]
}

