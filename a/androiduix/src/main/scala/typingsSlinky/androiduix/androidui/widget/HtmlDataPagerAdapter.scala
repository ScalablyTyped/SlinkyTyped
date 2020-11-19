package typingsSlinky.androiduix.androidui.widget

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.support.v4.view.PagerAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlDataPagerAdapter
  extends PagerAdapter
     with HtmlDataAdapter {
  
  var bindElementData: HTMLElement = js.native
  
  /* private */ def checkReplaceWithRef(element: js.Any): js.Any = js.native
  
  def getItem(position: Double): Element = js.native
  
  var mContext: Context = js.native
  
  def notifyDataSizeWillChange(): Unit = js.native
  
  /* private */ def registerHtmlDataObserver(): js.Any = js.native
  
  /* private */ def removeElementRefAndRestoreToAdapter(childElement: js.Any): js.Any = js.native
}
