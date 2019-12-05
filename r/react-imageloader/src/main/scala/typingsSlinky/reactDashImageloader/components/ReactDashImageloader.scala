package typingsSlinky.reactDashImageloader.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.reactDashImageloader.reactDashImageloaderMod.ImageLoaderProps
import typingsSlinky.reactDashImageloader.reactDashImageloaderMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashImageloader
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-imageloader", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, onError, onLoad, src */
  def apply(
    imgProps: js.Any = null,
    preloader: /* params */ js.Any => ReactElement = null,
    style: CSSProperties = null,
    wrapper: /* props */ js.Any => ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal()
    if (imgProps != null) __obj.updateDynamic("imgProps")(imgProps.asInstanceOf[js.Any])
    if (preloader != null) __obj.updateDynamic("preloader")(js.Any.fromFunction1(preloader))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (wrapper != null) __obj.updateDynamic("wrapper")(js.Any.fromFunction1(wrapper))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ImageLoaderProps
}

