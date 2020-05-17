package typingsSlinky.jsoneditor.anon

import typingsSlinky.jsoneditor.mod.AutoCompleteCompletion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends AutoCompleteCompletion {
  var options: js.Array[String] = js.native
  var startFrom: Double = js.native
}

object Options {
  @scala.inline
  def apply(options: js.Array[String], startFrom: Double): Options = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], startFrom = startFrom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFrom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

