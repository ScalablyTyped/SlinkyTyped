package typingsSlinky.reactCodemirror

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.react.mod.Component
import typingsSlinky.reactCodemirror.ReactCodeMirror.ReactCodeMirrorClass
import typingsSlinky.reactCodemirror.ReactCodeMirror.ReactCodeMirrorProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-codemirror", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends Component[ReactCodeMirrorProps, js.Object, js.Any] {
    def this(props: ReactCodeMirrorProps) = this()
    def this(props: ReactCodeMirrorProps, context: js.Any) = this()
  }
  @JSImport("react-codemirror", JSImport.Namespace)
  @js.native
  val ^ : ReactCodeMirrorClass = js.native
  
  type _To = ReactCodeMirrorClass
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ReactCodeMirrorClass = ^
}
