package typingsSlinky.glDashReactDashDom.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.WebGLContextAttributes
import org.scalajs.dom.raw.WebGLRenderingContext
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.glDashReactDashDom.gLViewDOMMod.GLViewDOMProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GLViewDOM
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.glDashReactDashDom.gLViewDOMMod.GLViewDOM] {
  @JSImport("gl-react-dom/GLViewDOM", "GLViewDOM")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    height: Double,
    width: Double,
    debug: Int | Double = null,
    onContextCreate: /* gl */ WebGLRenderingContext => Unit = null,
    onContextFailure: /* e */ js.Error => Unit = null,
    onContextLost: () => Unit = null,
    onContextRestored: /* gl */ WebGLRenderingContext => Unit = null,
    pixelRatio: Int | Double = null,
    style: js.Any = null,
    webglContextAttributes: WebGLContextAttributes = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.glDashReactDashDom.gLViewDOMMod.GLViewDOM] = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (debug != null) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (onContextCreate != null) __obj.updateDynamic("onContextCreate")(js.Any.fromFunction1(onContextCreate))
    if (onContextFailure != null) __obj.updateDynamic("onContextFailure")(js.Any.fromFunction1(onContextFailure))
    if (onContextLost != null) __obj.updateDynamic("onContextLost")(js.Any.fromFunction0(onContextLost))
    if (onContextRestored != null) __obj.updateDynamic("onContextRestored")(js.Any.fromFunction1(onContextRestored))
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (webglContextAttributes != null) __obj.updateDynamic("webglContextAttributes")(webglContextAttributes.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = GLViewDOMProps
}

