package typingsSlinky.babelPluginSyntaxJsx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonManipulateOptions extends js.Object {
  def manipulateOptions(opts: js.Any, parserOpts: AnonPlugins): Unit = js.native
}

object AnonManipulateOptions {
  @scala.inline
  def apply(manipulateOptions: (js.Any, AnonPlugins) => Unit): AnonManipulateOptions = {
    val __obj = js.Dynamic.literal(manipulateOptions = js.Any.fromFunction2(manipulateOptions))
    __obj.asInstanceOf[AnonManipulateOptions]
  }
  @scala.inline
  implicit class AnonManipulateOptionsOps[Self <: AnonManipulateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withManipulateOptions(value: (js.Any, AnonPlugins) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manipulateOptions")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

