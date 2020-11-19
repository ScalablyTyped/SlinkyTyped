package typingsSlinky.antdMobile

import typingsSlinky.antdMobile.anon.AntLocale
import typingsSlinky.antdMobile.anon.PrefixCls
import typingsSlinky.react.mod.Component
import typingsSlinky.rmcPullToRefresh.propsTypeMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/pull-to-refresh", JSImport.Namespace)
@js.native
object pullToRefreshMod extends js.Object {
  
  @js.native
  trait PullToRefresh
    extends Component[PropsType, js.Any, js.Any]
  
  @js.native
  class default () extends PullToRefresh
  /* static members */
  @js.native
  object default extends js.Object {
    
    var contextTypes: AntLocale = js.native
    
    var defaultProps: PrefixCls = js.native
  }
}
