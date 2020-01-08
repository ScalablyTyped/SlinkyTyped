package typingsSlinky.reactDashBreadcrumbs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.BreadcrumbsProps
import typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.Crumbs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Breadcrumbs
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.Breadcrumbs] {
  @JSImport("react-breadcrumbs", "Breadcrumbs")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, hidden */
  def apply(
    separator: TagMod[Any] = null,
    setCrumbs: /* crumbs */ Crumbs => TagMod[Any] = null,
    wrapper: ReactComponentClass[js.Object] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.Breadcrumbs] = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (setCrumbs != null) __obj.updateDynamic("setCrumbs")(js.Any.fromFunction1(setCrumbs))
    if (wrapper != null) __obj.updateDynamic("wrapper")(wrapper.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.Breadcrumbs] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBreadcrumbs.reactDashBreadcrumbsMod.Breadcrumbs](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = BreadcrumbsProps
}

