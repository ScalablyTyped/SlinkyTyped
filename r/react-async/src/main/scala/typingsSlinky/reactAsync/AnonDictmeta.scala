package typingsSlinky.reactAsync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDictmeta
  extends /* prop */ StringDictionary[js.Any] {
  var counter: Double = js.native
}

object AnonDictmeta {
  @scala.inline
  def apply(counter: Double): AnonDictmeta = {
    val __obj = js.Dynamic.literal(counter = counter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictmeta]
  }
  @scala.inline
  implicit class AnonDictmetaOps[Self <: AnonDictmeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counter")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

