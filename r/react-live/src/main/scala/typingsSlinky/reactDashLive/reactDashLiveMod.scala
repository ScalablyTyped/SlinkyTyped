package typingsSlinky.reactDashLive

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLPreElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.HTMLProps
import typingsSlinky.reactDashLive.reactDashLiveMod.DivProps
import typingsSlinky.reactDashLive.reactDashLiveMod.EditorProps
import typingsSlinky.reactDashLive.reactDashLiveMod.LiveEditorProps
import typingsSlinky.reactDashLive.reactDashLiveMod.LiveProviderProps
import typingsSlinky.reactDashLive.reactDashLiveMod.Omit
import typingsSlinky.reactDashLive.reactDashLiveMod.PreProps
import typingsSlinky.reactDashLive.reactDashLiveStrings.onChange
import typingsSlinky.reactDashLive.reactDashLiveStrings.scope
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-live", JSImport.Namespace)
@js.native
object reactDashLiveMod extends js.Object {
  @js.native
  class Editor protected ()
    extends Component[EditorProps, ComponentState, js.Any] {
    def this(props: EditorProps) = this()
    def this(props: EditorProps, context: js.Any) = this()
  }
  
  @js.native
  class LiveEditor protected ()
    extends Component[LiveEditorProps, ComponentState, js.Any] {
    def this(props: LiveEditorProps) = this()
    def this(props: LiveEditorProps, context: js.Any) = this()
  }
  
  @js.native
  class LiveError protected ()
    extends Component[DivProps, ComponentState, js.Any] {
    def this(props: DivProps) = this()
    def this(props: DivProps, context: js.Any) = this()
  }
  
  @js.native
  class LivePreview protected ()
    extends Component[DivProps, ComponentState, js.Any] {
    def this(props: DivProps) = this()
    def this(props: DivProps, context: js.Any) = this()
  }
  
  @js.native
  class LiveProvider protected ()
    extends Component[LiveProviderProps, ComponentState, js.Any] {
    def this(props: LiveProviderProps) = this()
    def this(props: LiveProviderProps, context: js.Any) = this()
  }
  
  val Editor: ReactComponentClass[EditorProps] = js.native
  val LiveEditor: ReactComponentClass[LiveEditorProps] = js.native
  val LiveError: ReactComponentClass[DivProps] = js.native
  val LivePreview: ReactComponentClass[DivProps] = js.native
  val LiveProvider: ReactComponentClass[LiveProviderProps] = js.native
  def withLive[P](wrappedComponent: ReactComponentClass[P]): ReactComponentClass[P] = js.native
  // React Element Props
  type DivProps = HTMLProps[HTMLDivElement]
  type EditorProps = (Omit[PreProps, onChange]) with Anon_CodeDisabled
  type LiveEditorProps = EditorProps
  type LiveProviderProps = (Omit[DivProps, scope]) with Anon_Code
  // Helper types
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type PreProps = HTMLProps[HTMLPreElement]
}

