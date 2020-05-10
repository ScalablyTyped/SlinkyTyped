package typingsSlinky.createEmotion.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.createEmotion.createEmotionNumbers.`1`
import typingsSlinky.createEmotion.createEmotionNumbers.`2`
import typingsSlinky.createEmotion.createEmotionNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmotionOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.native
  var key: js.UndefOr[String] = js.native
  var nonce: js.UndefOr[String] = js.native
  var prefix: js.UndefOr[
    Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
  ] = js.native
  var stylisPlugins: js.UndefOr[StylisPlugins] = js.native
}

object EmotionOptions {
  @scala.inline
  def apply(): EmotionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmotionOptions]
  }
  @scala.inline
  implicit class EmotionOptionsOps[Self <: EmotionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withPrefix(
      value: Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ `1` | `2` | `3`, Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withStylisPluginsFunction1(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylisPlugins")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStylisPlugins(value: StylisPlugins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylisPlugins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylisPlugins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylisPlugins")(js.undefined)
        ret
    }
    @scala.inline
    def withStylisPluginsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylisPlugins")(null)
        ret
    }
  }
  
}

