package typingsSlinky.reactImageloader.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.reactImageloader.mod.ImageLoaderProps
import typingsSlinky.reactImageloader.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactImageloader
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("react-imageloader", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    src: String,
    imgProps: js.Any = null,
    onError: /* event */ js.Any => Unit = null,
    onLoad: /* event */ js.Any => Unit = null,
    preloader: /* params */ js.Any => ReactElement = null,
    wrapper: /* props */ js.Any => ReactElement = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ^] = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    if (imgProps != null) __obj.updateDynamic("imgProps")(imgProps.asInstanceOf[js.Any])
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onLoad != null) __obj.updateDynamic("onLoad")(js.Any.fromFunction1(onLoad))
    if (preloader != null) __obj.updateDynamic("preloader")(js.Any.fromFunction1(preloader))
    if (wrapper != null) __obj.updateDynamic("wrapper")(js.Any.fromFunction1(wrapper))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ImageLoaderProps
}

