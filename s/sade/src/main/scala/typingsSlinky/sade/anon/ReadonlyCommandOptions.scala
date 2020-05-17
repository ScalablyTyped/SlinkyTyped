package typingsSlinky.sade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<sade.sade.CommandOptions> */
@js.native
trait ReadonlyCommandOptions extends js.Object {
  val default: js.UndefOr[Boolean] = js.native
}

object ReadonlyCommandOptions {
  @scala.inline
  def apply(): ReadonlyCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyCommandOptions]
  }
  @scala.inline
  implicit class ReadonlyCommandOptionsOps[Self <: ReadonlyCommandOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
  }
  
}

