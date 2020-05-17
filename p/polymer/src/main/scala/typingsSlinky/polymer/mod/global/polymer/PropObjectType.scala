package typingsSlinky.polymer.mod.global.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropObjectType extends js.Object {
  var computed: js.UndefOr[String] = js.native
  @JSName("notify")
  var notify_FPropObjectType: js.UndefOr[Boolean] = js.native
  var observer: js.UndefOr[String] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var reflectToAttribute: js.UndefOr[Boolean] = js.native
  var `type`: PropConstructorType = js.native
  var value: js.UndefOr[Boolean | Double | String | js.Function | js.Object] = js.native
}

object PropObjectType {
  @scala.inline
  def apply(`type`: PropConstructorType): PropObjectType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropObjectType]
  }
  @scala.inline
  implicit class PropObjectTypeOps[Self <: PropObjectType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: PropConstructorType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computed")(js.undefined)
        ret
    }
    @scala.inline
    def withNotify(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(js.undefined)
        ret
    }
    @scala.inline
    def withObserver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObserver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observer")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withReflectToAttribute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectToAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReflectToAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectToAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Boolean | Double | String | js.Function | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

