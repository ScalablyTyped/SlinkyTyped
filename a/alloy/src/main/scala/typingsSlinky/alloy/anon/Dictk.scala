package typingsSlinky.alloy.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictk
  extends /* k */ StringDictionary[js.Any] {
  def instance(name: String): js.Any = js.native
}

object Dictk {
  @scala.inline
  def apply(instance: String => js.Any): Dictk = {
    val __obj = js.Dynamic.literal(instance = js.Any.fromFunction1(instance))
    __obj.asInstanceOf[Dictk]
  }
  @scala.inline
  implicit class DictkOps[Self <: Dictk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

