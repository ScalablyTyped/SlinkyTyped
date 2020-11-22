package typingsSlinky.rcSwipeout

import slinky.core.facade.ReactElement
import typingsSlinky.rcSwipeout.anon.AutoClose
import typingsSlinky.rcSwipeout.propTypesMod.IPropTypes
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-swipeout/lib/Swipeout", JSImport.Namespace)
@js.native
object swipeoutMod extends js.Object {
  
  @js.native
  trait Swipeout
    extends Component[IPropTypes, js.Any, js.Any] {
    
    def _getContentEasing(value: js.Any, limit: js.Any): js.Any = js.native
    
    def _setStyle(value: js.Any): Unit = js.native
    
    var btnsLeftWidth: Double = js.native
    
    var btnsRightWidth: Double = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MSwipeout(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MSwipeout(): Unit = js.native
    
    var content: js.Any = js.native
    
    var cover: js.Any = js.native
    
    def doOpenLeft(): Unit = js.native
    
    def doOpenRight(): Unit = js.native
    
    var left: js.Any = js.native
    
    var needShowLeft: Boolean = js.native
    
    var needShowRight: Boolean = js.native
    
    def onBtnClick(ev: js.Any, btn: js.Any): Unit = js.native
    
    def onCloseSwipe(ev: js.Any): Unit = js.native
    
    def onPanEnd(e: js.Any): Unit = js.native
    
    def onPanMove(e: js.Any): Unit = js.native
    
    def onPanStart(e: js.Any): Unit = js.native
    
    def onTouchMove(e: js.Any): Unit = js.native
    
    def open(value: js.Any, openedLeft: js.Any, openedRight: js.Any): Unit = js.native
    
    var openedLeft: Boolean = js.native
    
    var openedRight: Boolean = js.native
    
    def renderButtons(buttons: js.Any, ref: js.Any): ReactElement | Null = js.native
    
    var right: js.Any = js.native
    
    var swiping: Boolean = js.native
  }
  
  @js.native
  class default protected () extends Swipeout {
    def this(props: js.Any) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: AutoClose = js.native
  }
}
