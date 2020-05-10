package typingsSlinky.reactNativeNavbar.mod

import typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.clip
import typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.head
import typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.middle
import typingsSlinky.reactNativeNavbar.reactNativeNavbarStrings.tail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationBarTitle extends js.Object {
  var ellipsizeMode: js.UndefOr[head | middle | tail | clip] = js.native
  var numberOfLines: js.UndefOr[Double] = js.native
  var tintColor: js.UndefOr[String] = js.native
  var title: String = js.native
}

object NavigationBarTitle {
  @scala.inline
  def apply(title: String): NavigationBarTitle = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBarTitle]
  }
  @scala.inline
  implicit class NavigationBarTitleOps[Self <: NavigationBarTitle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEllipsizeMode(value: head | middle | tail | clip): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsizeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsizeMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsizeMode")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberOfLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(js.undefined)
        ret
    }
    @scala.inline
    def withTintColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTintColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tintColor")(js.undefined)
        ret
    }
  }
  
}

