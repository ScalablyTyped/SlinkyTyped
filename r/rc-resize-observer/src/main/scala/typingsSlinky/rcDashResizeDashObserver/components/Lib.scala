package typingsSlinky.rcDashResizeDashObserver.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rcDashResizeDashObserver.Anon_Height
import typingsSlinky.rcDashResizeDashObserver.libMod.ResizeObserverProps
import typingsSlinky.rcDashResizeDashObserver.libMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-resize-observer/lib", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(onResize: /* size */ Anon_Height => Unit = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (onResize != null) __obj.updateDynamic("onResize")(js.Any.fromFunction1(onResize))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ResizeObserverProps
}

