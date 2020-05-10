package typingsSlinky.firefoxWebextBrowser

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddClientId extends js.Object {
  /** True if the ping should contain the client id. */
  var addClientId: js.UndefOr[Boolean] = js.native
  /** True if the ping should contain the environment data. */
  var addEnvironment: js.UndefOr[Boolean] = js.native
  /** Set to override the environment data. */
  var overrideEnvironment: js.UndefOr[StringDictionary[js.Any]] = js.native
  /** If true, send the ping using the PingSender. */
  var usePingSender: js.UndefOr[Boolean] = js.native
}

object AnonAddClientId {
  @scala.inline
  def apply(): AnonAddClientId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAddClientId]
  }
  @scala.inline
  implicit class AnonAddClientIdOps[Self <: AnonAddClientId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddClientId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddClientId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addClientId")(js.undefined)
        ret
    }
    @scala.inline
    def withAddEnvironment(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEnvironment")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideEnvironment(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideEnvironment")(js.undefined)
        ret
    }
    @scala.inline
    def withUsePingSender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePingSender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsePingSender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("usePingSender")(js.undefined)
        ret
    }
  }
  
}

