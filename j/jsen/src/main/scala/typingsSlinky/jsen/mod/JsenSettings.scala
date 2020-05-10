package typingsSlinky.jsen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsenSettings extends js.Object {
  var formats: js.UndefOr[JsenFormats] = js.native
  var greedy: js.UndefOr[Boolean] = js.native
  @JSName("missing$Ref")
  var missing$Ref: js.UndefOr[Boolean] = js.native
  var schemas: js.UndefOr[js.Any] = js.native
}

object JsenSettings {
  @scala.inline
  def apply(): JsenSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsenSettings]
  }
  @scala.inline
  implicit class JsenSettingsOps[Self <: JsenSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: JsenFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(js.undefined)
        ret
    }
    @scala.inline
    def withGreedy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGreedy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greedy")(js.undefined)
        ret
    }
    @scala.inline
    def withMissing$Ref(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing$Ref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissing$Ref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing$Ref")(js.undefined)
        ret
    }
    @scala.inline
    def withSchemas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchemas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schemas")(js.undefined)
        ret
    }
  }
  
}

