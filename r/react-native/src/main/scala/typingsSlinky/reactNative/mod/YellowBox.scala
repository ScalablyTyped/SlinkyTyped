package typingsSlinky.reactNative.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.GetDerivedStateFromError
import typingsSlinky.react.mod.GetDerivedStateFromProps
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "YellowBox")
@js.native
class YellowBox protected ()
  extends Component[js.Any, js.Any, js.Any] {
  def this(props: js.Any) = this()
  def this(props: js.Any, context: js.Any) = this()
}
@JSImport("react-native", "YellowBox")
@js.native
object YellowBox
  extends Instantiable1[/* props */ js.Any, ReactComponentClass[js.Any]]
     with Instantiable2[/* props */ js.Any, /* context */ js.Any, ReactComponentClass[js.Any]] {
  
  var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var contextType: js.UndefOr[Context[_]] = js.native
  
  var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
  
  var defaultProps: js.UndefOr[Partial[_]] = js.native
  
  var displayName: js.UndefOr[String] = js.native
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[_, _]] = js.native
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[_, _]] = js.native
  
  def ignoreWarnings(warnings: js.Array[String]): Unit = js.native
  
  var propTypes: js.UndefOr[WeakValidationMap[_]] = js.native
}
