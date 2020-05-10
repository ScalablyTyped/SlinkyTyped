package typingsSlinky.jestTypes

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlobal extends js.Object {
  var global: StringDictionary[Double] = js.native
}

object AnonGlobal {
  @scala.inline
  def apply(global: StringDictionary[Double]): AnonGlobal = {
    val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobal]
  }
  @scala.inline
  implicit class AnonGlobalOps[Self <: AnonGlobal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobal(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

