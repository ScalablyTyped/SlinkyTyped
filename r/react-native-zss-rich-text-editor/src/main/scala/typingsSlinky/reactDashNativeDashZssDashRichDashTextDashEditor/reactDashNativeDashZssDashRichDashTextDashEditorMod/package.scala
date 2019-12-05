package typingsSlinky.reactDashNativeDashZssDashRichDashTextDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashZssDashRichDashTextDashEditorMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.reactDashNative.reactDashNativeMod.ImageProps
  import typingsSlinky.reactDashNative.reactDashNativeMod.ImageSourcePropType
  import typingsSlinky.reactDashNative.reactDashNativeMod.ImageStyle
  import typingsSlinky.reactDashNative.reactDashNativeMod.StyleProp
  import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
  import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle

  type ColorHandler = js.Function1[/* color */ String, Unit]
  type ContentGetHandler = js.Function0[js.Promise[String]]
  type ContentSetHandler = js.Function1[/* html */ String, Unit]
  type ContentStylesHandler = js.Function1[/* styles */ RichTextStyles, Unit]
  type ElementStyles = StyleProp[ViewStyle | TextStyle | ImageStyle]
  type FocusHandler = js.Function1[/* callback */ FunctionWithZeroArgs, Unit]
  type FunctionWithZeroArgs = js.Function0[Unit]
  type IconsMap = StringDictionary[ImageSourcePropType]
  type ImageHandler = js.Function1[/* attributes */ ImageProps, Unit]
  type LinkDialogHandler = js.Function2[/* optionalTitle */ String, /* optionalUrl */ String, Unit]
  type LinkHandler = js.Function2[/* url */ String, /* title */ String, Unit]
  type PlaceHolderHandler = js.Function1[/* placeholder */ String, Unit]
  type RichTextStyles = StringDictionary[ElementStyles]
}
