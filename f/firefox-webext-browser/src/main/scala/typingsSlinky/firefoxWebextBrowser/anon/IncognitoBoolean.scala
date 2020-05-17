package typingsSlinky.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncognitoBoolean extends js.Object {
  /** Whether to return the value that applies to the incognito session (default false). */
  var incognito: js.UndefOr[Boolean] = js.native
}

object IncognitoBoolean {
  @scala.inline
  def apply(): IncognitoBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncognitoBoolean]
  }
  @scala.inline
  implicit class IncognitoBooleanOps[Self <: IncognitoBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncognito(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncognito: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incognito")(js.undefined)
        ret
    }
  }
  
}

