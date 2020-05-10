package typingsSlinky.cassanknex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateableIndexBuilder extends js.Object {
  def withOptions(opts: MappedDict[String]): this.type = js.native
}

object CreateableIndexBuilder {
  @scala.inline
  def apply(withOptions: MappedDict[String] => CreateableIndexBuilder): CreateableIndexBuilder = {
    val __obj = js.Dynamic.literal(withOptions = js.Any.fromFunction1(withOptions))
    __obj.asInstanceOf[CreateableIndexBuilder]
  }
  @scala.inline
  implicit class CreateableIndexBuilderOps[Self <: CreateableIndexBuilder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithOptions(value: MappedDict[String] => CreateableIndexBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withOptions")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

