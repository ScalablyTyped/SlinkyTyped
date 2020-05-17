package typingsSlinky.enzyme.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends // TODO Maybe some life cycle are missing
/* lifecycleName */ StringDictionary[js.Any] {
  var calledByRenderer: Boolean = js.native
}

object Dictkey {
  @scala.inline
  def apply(calledByRenderer: Boolean): Dictkey = {
    val __obj = js.Dynamic.literal(calledByRenderer = calledByRenderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalledByRenderer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calledByRenderer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

