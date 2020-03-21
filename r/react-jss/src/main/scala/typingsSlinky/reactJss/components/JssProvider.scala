package typingsSlinky.reactJss.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.jss.mod.CreateGenerateIdOptions
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.Rule
import typingsSlinky.jss.mod.SheetsRegistry
import typingsSlinky.jss.mod.StyleSheet
import typingsSlinky.reactJss.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object JssProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactJss.mod.JssProvider] {
  @JSImport("react-jss", "JssProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    classNamePrefix: String = null,
    disableStylesGeneration: js.UndefOr[Boolean] = js.undefined,
    generateId: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String = null,
    id: CreateGenerateIdOptions = null,
    jss: Jss = null,
    registry: SheetsRegistry = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactJss.mod.JssProvider] = {
    val __obj = js.Dynamic.literal()
    if (classNamePrefix != null) __obj.updateDynamic("classNamePrefix")(classNamePrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStylesGeneration)) __obj.updateDynamic("disableStylesGeneration")(disableStylesGeneration.asInstanceOf[js.Any])
    if (generateId != null) __obj.updateDynamic("generateId")(js.Any.fromFunction2(generateId))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (jss != null) __obj.updateDynamic("jss")(jss.asInstanceOf[js.Any])
    if (registry != null) __obj.updateDynamic("registry")(registry.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactJss.mod.JssProvider] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactJss.mod.JssProvider](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = AnonChildren
}

