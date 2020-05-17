package typingsSlinky.rmcPicker.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictx
  extends /* x */ StringDictionary[js.Any] {
  def ref(picker: js.Any): Unit = js.native
}

object Dictx {
  @scala.inline
  def apply(ref: js.Any => Unit): Dictx = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
    __obj.asInstanceOf[Dictx]
  }
  @scala.inline
  implicit class DictxOps[Self <: Dictx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRef(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ref")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

