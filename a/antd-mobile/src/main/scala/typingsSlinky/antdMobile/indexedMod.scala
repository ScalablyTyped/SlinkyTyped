package typingsSlinky.antdMobile

import slinky.core.facade.ReactElement
import typingsSlinky.antdMobile.anon.Label
import typingsSlinky.antdMobile.anon.ListViewPrefixCls
import typingsSlinky.antdMobile.listViewPropsTypeMod.ListViewPropsType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/list-view/Indexed", JSImport.Namespace)
@js.native
object indexedMod extends js.Object {
  
  @js.native
  trait MIndexedList
    extends Component[MIndexedListProps, js.Any, js.Any] {
    
    var indexedListRef: js.Any = js.native
  }
  
  @js.native
  trait MIndexedListProps extends ListViewPropsType {
    
    var delayActivityIndicator: js.UndefOr[ReactElement] = js.native
    
    var delayTime: js.UndefOr[Double] = js.native
    
    var onQuickSearch: js.UndefOr[js.Function2[/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any], Unit]] = js.native
    
    var quickSearchBarStyle: js.UndefOr[CSSProperties] = js.native
    
    var quickSearchBarTop: js.UndefOr[Label] = js.native
  }
  
  @js.native
  class default () extends MIndexedList
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: ListViewPrefixCls = js.native
  }
}
