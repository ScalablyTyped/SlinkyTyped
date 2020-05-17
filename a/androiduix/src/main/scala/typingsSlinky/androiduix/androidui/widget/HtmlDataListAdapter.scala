package typingsSlinky.androiduix.androidui.widget

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.widget.BaseAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlDataListAdapter
  extends BaseAdapter
     with HtmlDataAdapter {
  var bindElementData: HTMLElement = js.native
  var mContext: Context = js.native
  /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
  def notifyDataSizeWillChange(): Unit = js.native
  /* private */ def registerHtmlDataObserver(): js.Any = js.native
  /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
}

