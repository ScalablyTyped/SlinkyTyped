package typingsSlinky.reapop.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reapop.mod.Notification
import typingsSlinky.reapop.mod.NotificationSystemProps
import typingsSlinky.reapop.mod.NotificationSystemTheme
import typingsSlinky.reapop.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Reapop
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("reapop", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    theme: NotificationSystemTheme,
    filter: /* notification */ Notification => Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NotificationSystemProps
}

