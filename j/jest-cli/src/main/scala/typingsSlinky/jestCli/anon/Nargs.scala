package typingsSlinky.jestCli.anon

import typingsSlinky.jestCli.jestCliStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nargs extends js.Object {
  var description: java.lang.String = js.native
  var nargs: Double = js.native
  var `type`: string = js.native
}

object Nargs {
  @scala.inline
  def apply(description: java.lang.String, nargs: Double, `type`: string): Nargs = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], nargs = nargs.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nargs]
  }
  @scala.inline
  implicit class NargsOps[Self <: Nargs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNargs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nargs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

