package typingsSlinky.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewStatic extends js.Object {
  def navigate(date: js.Date, action: NavigateAction, props: js.Any): js.Date
  def title(date: js.Date, options: TitleOptions): String
}

object ViewStatic {
  @scala.inline
  def apply(navigate: (js.Date, NavigateAction, js.Any) => js.Date, title: (js.Date, TitleOptions) => String): ViewStatic = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction3(navigate), title = js.Any.fromFunction2(title))
    __obj.asInstanceOf[ViewStatic]
  }
}

