package typingsSlinky.notify

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.notify.Notify.ClassCSS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictclassName extends /* className */ StringDictionary[ClassCSS] {
  var base: js.UndefOr[ClassCSS] = js.native
}

object AnonDictclassName {
  @scala.inline
  def apply(): AnonDictclassName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDictclassName]
  }
  @scala.inline
  implicit class AnonDictclassNameOps[Self <: AnonDictclassName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: ClassCSS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(js.undefined)
        ret
    }
  }
  
}

