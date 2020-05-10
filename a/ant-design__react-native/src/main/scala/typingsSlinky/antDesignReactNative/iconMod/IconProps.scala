package typingsSlinky.antDesignReactNative.iconMod

import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.lg
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.md
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.sm
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.xs
import typingsSlinky.antDesignReactNative.antDesignReactNativeStrings.xxs
import typingsSlinky.reactNative.mod.TextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconProps extends TextProps {
  var color: js.UndefOr[String] = js.native
  var name: IconNames = js.native
  var size: js.UndefOr[xxs | xs | sm | md | lg | Double] = js.native
}

object IconProps {
  @scala.inline
  def apply(name: IconNames): IconProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconProps]
  }
  @scala.inline
  implicit class IconPropsOps[Self <: IconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: IconNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: xxs | xs | sm | md | lg | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

