package typingsSlinky.next.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictpage
  extends /* page */ StringDictionary[js.Array[String]] {
  @JSName("/_app")
  var Slash_app: js.Array[String] = js.native
}

object Dictpage {
  @scala.inline
  def apply(Slash_app: js.Array[String]): Dictpage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("/_app")(Slash_app.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictpage]
  }
  @scala.inline
  implicit class DictpageOps[Self <: Dictpage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSlash_app(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("/_app")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

