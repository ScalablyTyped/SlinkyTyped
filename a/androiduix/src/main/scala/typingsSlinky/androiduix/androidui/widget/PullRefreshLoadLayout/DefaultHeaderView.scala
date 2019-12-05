package typingsSlinky.androiduix.androidui.widget.PullRefreshLoadLayout

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.androiduix.android.content.Context
import typingsSlinky.androiduix.android.widget.ProgressBar
import typingsSlinky.androiduix.android.widget.TextView
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("androidui.widget.PullRefreshLoadLayout.DefaultHeaderView")
@js.native
class DefaultHeaderView protected () extends HeaderView {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  var progressBar: ProgressBar = js.native
  var textView: TextView = js.native
}

