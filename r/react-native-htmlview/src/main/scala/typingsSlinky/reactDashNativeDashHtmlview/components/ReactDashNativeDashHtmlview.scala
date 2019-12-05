package typingsSlinky.reactDashNativeDashHtmlview.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ImageStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
import typingsSlinky.reactDashNative.reactDashNativeMod.TextProperties
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewProperties
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashHtmlview.reactDashNativeDashHtmlviewMod.HTMLViewNode
import typingsSlinky.reactDashNativeDashHtmlview.reactDashNativeDashHtmlviewMod.HTMLViewProps
import typingsSlinky.reactDashNativeDashHtmlview.reactDashNativeDashHtmlviewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashNativeDashHtmlview
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-native-htmlview", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    value: String,
    NodeComponent: ReactComponentClass[js.Object] = null,
    RootComponent: ReactComponentClass[js.Object] = null,
    TextComponent: ReactComponentClass[js.Object] = null,
    addLineBreaks: js.UndefOr[Boolean] = js.undefined,
    bullet: String = null,
    lineBreak: String = null,
    nodeComponentProps: TextProperties = null,
    onLinkLongPress: /* url */ String => Unit = null,
    onLinkPress: /* url */ String => Unit = null,
    paragraphBreak: String = null,
    renderNode: (/* node */ HTMLViewNode, /* index */ Double, /* siblings */ HTMLViewNode, /* parent */ HTMLViewNode, /* defaultRenderer */ js.Function2[/* node */ HTMLViewNode, /* parent */ HTMLViewNode, TagMod[Any]]) => TagMod[Any] = null,
    rootComponentProps: ViewProperties = null,
    stylesheet: StringDictionary[StyleProp[ViewStyle | TextStyle | ImageStyle]] = null,
    textComponentProps: TextProperties = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (NodeComponent != null) __obj.updateDynamic("NodeComponent")(NodeComponent.asInstanceOf[js.Any])
    if (RootComponent != null) __obj.updateDynamic("RootComponent")(RootComponent.asInstanceOf[js.Any])
    if (TextComponent != null) __obj.updateDynamic("TextComponent")(TextComponent.asInstanceOf[js.Any])
    if (!js.isUndefined(addLineBreaks)) __obj.updateDynamic("addLineBreaks")(addLineBreaks.asInstanceOf[js.Any])
    if (bullet != null) __obj.updateDynamic("bullet")(bullet.asInstanceOf[js.Any])
    if (lineBreak != null) __obj.updateDynamic("lineBreak")(lineBreak.asInstanceOf[js.Any])
    if (nodeComponentProps != null) __obj.updateDynamic("nodeComponentProps")(nodeComponentProps.asInstanceOf[js.Any])
    if (onLinkLongPress != null) __obj.updateDynamic("onLinkLongPress")(js.Any.fromFunction1(onLinkLongPress))
    if (onLinkPress != null) __obj.updateDynamic("onLinkPress")(js.Any.fromFunction1(onLinkPress))
    if (paragraphBreak != null) __obj.updateDynamic("paragraphBreak")(paragraphBreak.asInstanceOf[js.Any])
    if (renderNode != null) __obj.updateDynamic("renderNode")(js.Any.fromFunction5(renderNode))
    if (rootComponentProps != null) __obj.updateDynamic("rootComponentProps")(rootComponentProps.asInstanceOf[js.Any])
    if (stylesheet != null) __obj.updateDynamic("stylesheet")(stylesheet.asInstanceOf[js.Any])
    if (textComponentProps != null) __obj.updateDynamic("textComponentProps")(textComponentProps.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HTMLViewProps
}

