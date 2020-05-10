package typingsSlinky.argv.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait module extends js.Object {
  var description: String = js.native
  var mod: String = js.native
  var options: StringDictionary[helpOption] = js.native
}

object module {
  @scala.inline
  def apply(description: String, mod: String, options: StringDictionary[helpOption]): module = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[module]
  }
  @scala.inline
  implicit class moduleOps[Self <: module] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: StringDictionary[helpOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

