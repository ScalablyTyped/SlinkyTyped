package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsPaginatorNextPageLinkMod.NextPageLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NextPageLink
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.componentsPaginatorNextPageLinkMod.NextPageLink] {
  @JSImport("primereact/components/paginator/NextPageLink", "NextPageLink")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(onClick: () => Unit = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.primereact.componentsPaginatorNextPageLinkMod.NextPageLink] = {
    val __obj = js.Dynamic.literal()
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.componentsPaginatorNextPageLinkMod.NextPageLink] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.componentsPaginatorNextPageLinkMod.NextPageLink](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = NextPageLinkProps
}

