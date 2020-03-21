package typingsSlinky.reactMathquill.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.edtrIoMathquill.mod.Config
import typingsSlinky.edtrIoMathquill.mod.MQ
import typingsSlinky.reactMathquill.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactMathquill
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-mathquill", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    config: Config = null,
    latex: String = null,
    mathquillDidMount: /* mathField */ MQ => Unit = null,
    onChange: /* mathField */ MQ => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (latex != null) __obj.updateDynamic("latex")(latex.asInstanceOf[js.Any])
    if (mathquillDidMount != null) __obj.updateDynamic("mathquillDidMount")(js.Any.fromFunction1(mathquillDidMount))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactMathquill.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.reactMathquill.mod.Props
}

