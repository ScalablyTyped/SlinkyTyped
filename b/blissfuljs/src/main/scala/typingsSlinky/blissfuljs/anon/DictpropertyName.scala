package typingsSlinky.blissfuljs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropertyName
  extends /* propertyName */ StringDictionary[js.Any] {
  var `abstract`: js.UndefOr[Boolean] = js.native
  var constructor: js.UndefOr[js.Function] = js.native
  var `extends`: js.UndefOr[js.Function] = js.native
  var `lazy`: js.UndefOr[js.Object] = js.native
  var live: js.UndefOr[js.Object] = js.native
  var static: js.UndefOr[js.Object] = js.native
}

object DictpropertyName {
  @scala.inline
  def apply(): DictpropertyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DictpropertyName]
  }
  @scala.inline
  implicit class DictpropertyNameOps[Self <: DictpropertyName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbstract(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbstract: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abstract")(js.undefined)
        ret
    }
    @scala.inline
    def withConstructor(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstructor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constructor")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
        ret
    }
    @scala.inline
    def withLazy(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLazy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(js.undefined)
        ret
    }
    @scala.inline
    def withLive(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("live")(js.undefined)
        ret
    }
    @scala.inline
    def withStatic(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("static")(js.undefined)
        ret
    }
  }
  
}

