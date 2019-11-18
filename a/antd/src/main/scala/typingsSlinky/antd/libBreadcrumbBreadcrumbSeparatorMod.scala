package typingsSlinky.antd

import slinky.core.facade.ReactElement
import typingsSlinky.antd.libBreadcrumbBreadcrumbSeparatorMod.BreadcrumbSeparator
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/breadcrumb/BreadcrumbSeparator", JSImport.Namespace)
@js.native
object libBreadcrumbBreadcrumbSeparatorMod extends js.Object {
  @js.native
  trait BreadcrumbSeparator
    extends Component[js.Any, js.Object, js.Any] {
    def renderSeparator(hasGetPrefixCls: ConfigConsumerProps): ReactElement = js.native
  }
  
  @js.native
  class default () extends BreadcrumbSeparator
  
  /* static members */
  @js.native
  object default extends js.Object {
    var __ANT_BREADCRUMB_SEPARATOR: Boolean = js.native
  }
  
}

