package typingsSlinky.antd.layoutLayoutMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import slinky.core.ReactComponentClass
import typingsSlinky.antd.PartialBasicProps
import typingsSlinky.antd.WeakValidationMapBasicPro
import typingsSlinky.antd.siderMod.SiderProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.GetDerivedStateFromError
import typingsSlinky.react.mod.GetDerivedStateFromProps
import typingsSlinky.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/layout/layout", JSImport.Default)
@js.native
class default protected ()
  extends Component[BasicProps, js.Object, js.Any] {
  def this(props: BasicProps) = this()
  def this(props: BasicProps, context: js.Any) = this()
}

@JSImport("antd/lib/layout/layout", JSImport.Default)
@js.native
object default
  extends Instantiable1[/* props */ BasicProps, ReactComponentClass[BasicProps]]
     with Instantiable2[/* props */ BasicProps, /* context */ js.Any, ReactComponentClass[BasicProps]] {
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
  var propTypes: js.UndefOr[WeakValidationMapBasicPro] = js.native
}

