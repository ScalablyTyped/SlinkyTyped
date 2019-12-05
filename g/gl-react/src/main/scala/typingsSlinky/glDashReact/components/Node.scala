package typingsSlinky.glDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.glDashReact.Anon_Color
import typingsSlinky.glDashReact.Anon_Dst
import typingsSlinky.glDashReact.glDashReactMod.NodeProps
import typingsSlinky.glDashReact.glDashReactMod.ShaderDefinition
import typingsSlinky.glDashReact.glDashReactMod.ShaderIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Node
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.glDashReact.glDashReactMod.Node] {
  @JSImport("gl-react", "Node")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    shader: ShaderIdentifier | ShaderDefinition,
    backbuffering: js.UndefOr[Boolean] = js.undefined,
    blendFunc: Anon_Dst = null,
    clear: Anon_Color = null,
    height: Int | Double = null,
    ignoreUnusedUniforms: js.Array[String] | Boolean = null,
    onDraw: () => Unit = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    uniforms: StringDictionary[js.Any] = null,
    uniformsOptions: js.Any = null,
    width: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.glDashReact.glDashReactMod.Node] = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    if (!js.isUndefined(backbuffering)) __obj.updateDynamic("backbuffering")(backbuffering.asInstanceOf[js.Any])
    if (blendFunc != null) __obj.updateDynamic("blendFunc")(blendFunc.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ignoreUnusedUniforms != null) __obj.updateDynamic("ignoreUnusedUniforms")(ignoreUnusedUniforms.asInstanceOf[js.Any])
    if (onDraw != null) __obj.updateDynamic("onDraw")(js.Any.fromFunction0(onDraw))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    if (uniformsOptions != null) __obj.updateDynamic("uniformsOptions")(uniformsOptions.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NodeProps
}

