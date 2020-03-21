package typingsSlinky.gestalt.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.gestalt.AnonEvent
import typingsSlinky.gestalt.gestaltStrings.`null`
import typingsSlinky.gestalt.gestaltStrings.blank
import typingsSlinky.gestalt.gestaltStrings.self
import typingsSlinky.gestalt.mod.LinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Link
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.gestalt.mod.Link] {
  @JSImport("gestalt", "Link")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: href */
  def apply(
    `inline`: js.UndefOr[Boolean] = js.undefined,
    onClick: /* args */ AnonEvent => Unit = null,
    target: `null` | self | blank = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.gestalt.mod.Link] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.gestalt.mod.Link] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.gestalt.mod.Link](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = LinkProps
}

