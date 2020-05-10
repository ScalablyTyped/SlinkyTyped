package typingsSlinky.prettyFormat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewPlugin extends Plugin {
  var test: Test = js.native
  def serialize(`val`: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String = js.native
}

object NewPlugin {
  @scala.inline
  def apply(
    serialize: (js.Any, Config, String, Double, Refs, Printer) => String,
    test: /* arg0 */ js.Any => Boolean
  ): NewPlugin = {
    val __obj = js.Dynamic.literal(serialize = js.Any.fromFunction6(serialize), test = js.Any.fromFunction1(test))
    __obj.asInstanceOf[NewPlugin]
  }
  @scala.inline
  implicit class NewPluginOps[Self <: NewPlugin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerialize(value: (js.Any, Config, String, Double, Refs, Printer) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withTest(value: /* arg0 */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

