package typingsSlinky.catalog.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.catalog.catalogMod.Config
import typingsSlinky.catalog.catalogMod.ConfigPageOrGroup
import typingsSlinky.catalog.catalogMod.ConfigResponsiveSize
import typingsSlinky.catalog.catalogMod.Theme
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Catalog
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.catalog.catalogMod.Catalog] {
  @JSImport("catalog", "Catalog")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    pages: js.Array[ConfigPageOrGroup],
    title: String,
    basePath: String = null,
    imports: StringDictionary[js.Any] = null,
    logoSrc: String = null,
    responsiveSizes: js.Array[ConfigResponsiveSize] = null,
    scripts: js.Array[String] = null,
    styles: js.Array[String] = null,
    theme: Partial[Theme] = null,
    useBrowserHistory: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.catalog.catalogMod.Catalog] = {
    val __obj = js.Dynamic.literal(pages = pages.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (basePath != null) __obj.updateDynamic("basePath")(basePath.asInstanceOf[js.Any])
    if (imports != null) __obj.updateDynamic("imports")(imports.asInstanceOf[js.Any])
    if (logoSrc != null) __obj.updateDynamic("logoSrc")(logoSrc.asInstanceOf[js.Any])
    if (responsiveSizes != null) __obj.updateDynamic("responsiveSizes")(responsiveSizes.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(useBrowserHistory)) __obj.updateDynamic("useBrowserHistory")(useBrowserHistory.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Config
}

