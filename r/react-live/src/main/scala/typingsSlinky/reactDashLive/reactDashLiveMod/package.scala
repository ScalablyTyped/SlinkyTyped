package typingsSlinky.reactDashLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashLiveMod {
  import org.scalajs.dom.raw.HTMLDivElement
  import org.scalajs.dom.raw.HTMLPreElement
  import typingsSlinky.react.reactMod.HTMLProps
  import typingsSlinky.reactDashLive.Anon_Code
  import typingsSlinky.reactDashLive.Anon_CodeDisabled
  import typingsSlinky.reactDashLive.reactDashLiveStrings.onChange
  import typingsSlinky.reactDashLive.reactDashLiveStrings.scope
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  // React Element Props
  type DivProps = HTMLProps[HTMLDivElement]
  type EditorProps = (Omit[PreProps, onChange]) with Anon_CodeDisabled
  type LiveEditorProps = EditorProps
  type LiveProviderProps = (Omit[DivProps, scope]) with Anon_Code
  // Helper types
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PreProps = HTMLProps[HTMLPreElement]
}
