package typingsSlinky.antd

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_403 extends js.Object {
  def `403`(): ReactElement
  def `404`(): ReactElement
  def `500`(): ReactElement
}

object Anon_403 {
  @scala.inline
  def apply(`403`: () => ReactElement, `404`: () => ReactElement, `500`: () => ReactElement): Anon_403 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("403")(js.Any.fromFunction0(`403`))
    __obj.updateDynamic("404")(js.Any.fromFunction0(`404`))
    __obj.updateDynamic("500")(js.Any.fromFunction0(`500`))
    __obj.asInstanceOf[Anon_403]
  }
}

