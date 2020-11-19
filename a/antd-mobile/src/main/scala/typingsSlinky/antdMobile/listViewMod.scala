package typingsSlinky.antdMobile

import typingsSlinky.antdMobile.anon.Label
import typingsSlinky.antdMobile.anon.ListPrefixCls
import typingsSlinky.antdMobile.anon.TypeofIndexedList
import typingsSlinky.antdMobile.listViewPropsTypeMod.ListViewPropsType
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile/lib/list-view", JSImport.Namespace)
@js.native
object listViewMod extends js.Object {
  
  @js.native
  trait ListView
    extends Component[ListViewProps, js.Any, js.Any] {
    
    def getInnerViewNode(): js.Any = js.native
    
    var listviewRef: js.Any = js.native
    
    def scrollTo(args: js.Any*): js.Any = js.native
  }
  
  @js.native
  trait ListViewProps extends ListViewPropsType {
    
    var delayActivityIndicator: js.UndefOr[js.Any] = js.native
    
    var delayTime: js.UndefOr[Double] = js.native
    
    var onQuickSearch: js.UndefOr[js.Function2[/* sectionID */ js.Any, /* topId */ js.UndefOr[js.Any], Unit]] = js.native
    
    var quickSearchBarStyle: js.UndefOr[CSSProperties] = js.native
    
    var quickSearchBarTop: js.UndefOr[Label] = js.native
  }
  
  @js.native
  class default () extends ListView
  /* static members */
  @js.native
  object default extends js.Object {
    
    var DataSource: js.Any = js.native
    
    var IndexedList: TypeofIndexedList = js.native
    
    var defaultProps: ListPrefixCls = js.native
  }
}
