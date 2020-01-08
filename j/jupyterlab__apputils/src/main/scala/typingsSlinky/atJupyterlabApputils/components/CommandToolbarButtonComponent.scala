package typingsSlinky.atJupyterlabApputils.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atJupyterlabApputils.libToolbarMod.CommandToolbarButtonComponent.IProps
import typingsSlinky.atPhosphorCommands.atPhosphorCommandsMod.CommandRegistry
import typingsSlinky.atPhosphorCoreutils.libJsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CommandToolbarButtonComponent
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@jupyterlab/apputils/lib/toolbar", "CommandToolbarButtonComponent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    commands: CommandRegistry,
    id: String,
    args: ReadonlyJSONObject = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IProps
}

