package typingsSlinky.graphqlDepthLimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var ignore: js.Array[String | js.RegExp | (js.Function1[/* queryDepths */ js.Array[_], Boolean])] = js.native
}

object Options {
  @scala.inline
  def apply(ignore: js.Array[String | js.RegExp | (js.Function1[/* queryDepths */ js.Array[_], Boolean])]): Options = {
    val __obj = js.Dynamic.literal(ignore = ignore.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnore(value: js.Array[String | js.RegExp | (js.Function1[/* queryDepths */ js.Array[_], Boolean])]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

