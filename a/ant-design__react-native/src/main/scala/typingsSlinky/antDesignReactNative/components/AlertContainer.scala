package typingsSlinky.antDesignReactNative.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignReactNative.alertContainerMod.AlertContainerProps
import typingsSlinky.antDesignReactNative.alertContainerMod.default
import typingsSlinky.antDesignReactNative.modalPropsTypeMod.Action
import typingsSlinky.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AlertContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@ant-design/react-native/lib/modal/AlertContainer", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    actions: js.Array[Action[TextStyle]],
    content: TagMod[Any],
    title: TagMod[Any],
    onAnimationEnd: /* visible */ Boolean => Unit = null,
    onBackHandler: () => Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onBackHandler != null) __obj.updateDynamic("onBackHandler")(js.Any.fromFunction0(onBackHandler))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AlertContainerProps
}

