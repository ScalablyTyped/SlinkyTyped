package typingsSlinky.antDashDesignDashPro.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.horizontal
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.large
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.small
import typingsSlinky.antDashDesignDashPro.antDashDesignDashProStrings.vertical
import typingsSlinky.antDashDesignDashPro.libDescriptionListDescriptionMod.DescriptionProps
import typingsSlinky.antDashDesignDashPro.libDescriptionListMod.DescriptionListProps
import typingsSlinky.antDashDesignDashPro.libDescriptionListMod.default
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DescriptionList
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("ant-design-pro/lib/DescriptionList", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    col: Int | Double = null,
    description: js.Array[DescriptionProps] = null,
    gutter: Int | Double = null,
    layout: horizontal | vertical = null,
    size: large | small = null,
    style: CSSProperties = null,
    title: TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (gutter != null) __obj.updateDynamic("gutter")(gutter.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.antDashDesignDashPro.libDescriptionListMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = DescriptionListProps
}

