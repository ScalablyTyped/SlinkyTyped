package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamingConventionOptions extends js.Object {
  var clientPropertyNameToServer: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
  var serverPropertyNameToClient: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
}

object NamingConventionOptions {
  @scala.inline
  def apply(): NamingConventionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamingConventionOptions]
  }
  @scala.inline
  implicit class NamingConventionOptionsOps[Self <: NamingConventionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientPropertyNameToServer(value: /* name */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPropertyNameToServer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClientPropertyNameToServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientPropertyNameToServer")(js.undefined)
        ret
    }
    @scala.inline
    def withServerPropertyNameToClient(value: /* name */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPropertyNameToClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutServerPropertyNameToClient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverPropertyNameToClient")(js.undefined)
        ret
    }
  }
  
}

