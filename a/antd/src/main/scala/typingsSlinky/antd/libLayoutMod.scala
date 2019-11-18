package typingsSlinky.antd

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import typingsSlinky.antd.libLayoutLayoutMod.BasicProps
import typingsSlinky.antd.libLayoutSiderMod.SiderProps
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod.GetDerivedStateFromError
import typingsSlinky.react.reactMod.GetDerivedStateFromProps
import typingsSlinky.react.reactMod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/layout", JSImport.Namespace)
@js.native
object libLayoutMod extends js.Object {
  @js.native
  class default protected ()
    extends Component[BasicProps, ComponentState, js.Any] {
    def this(props: BasicProps) = this()
    def this(props: BasicProps, context: js.Any) = this()
  }
  
  @js.native
  object default
    extends Instantiable1[/* props */ BasicProps, Component[BasicProps, ComponentState, js.Any]]
       with Instantiable2[
          /* props */ BasicProps, 
          /* context */ js.Any, 
          Component[BasicProps, ComponentState, js.Any]
        ] {
    var Content: ReactComponentClass[BasicProps] = js.native
    var Footer: ReactComponentClass[BasicProps] = js.native
    var Header: ReactComponentClass[BasicProps] = js.native
    var Sider: ReactComponentClass[SiderProps] = js.native
    var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var contextType: js.UndefOr[Context[_]] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialBasicProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[BasicProps, js.Object]] = js.native
    var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[BasicProps, js.Object]] = js.native
    var propTypes: js.UndefOr[WeakValidationMapBasicProps] = js.native
  }
  
}

