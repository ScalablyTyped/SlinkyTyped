package typingsSlinky.androiduix.androidui.widget

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.support.v4.view.PagerAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.HtmlDataPagerAdapter")
@js.native
class HtmlDataPagerAdapter ()
  extends PagerAdapter
     with HtmlDataAdapter {
  var bindElementData: HTMLElement = js.native
  var mContext: Context = js.native
  /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
  def getItem(position: Double): Element = js.native
  def notifyDataSizeWillChange(): Unit = js.native
  /* private */ def registerHtmlDataObserver(): js.Any = js.native
  /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
}

/* static members */
@JSGlobal("androidui.widget.HtmlDataPagerAdapter")
@js.native
object HtmlDataPagerAdapter extends js.Object {
  var BindAdapterProperty: String = js.native
  var RefElementProperty: String = js.native
  var RefElementTag: String = js.native
}

