package typingsSlinky.rehypeReact.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.ReactComponentClass
import typingsSlinky.rehypeReact.anon.Children
import typingsSlinky.rehypeReact.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var Fragment: js.UndefOr[ReactComponentClass[Children]] = js.native
  var components: js.UndefOr[StringDictionary[ReactComponentClass[_]]] = js.native
  var createElement: FnCall = js.native
  var prefix: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(createElement: FnCall): Options = {
    val __obj = js.Dynamic.literal(createElement = createElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateElement(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentFunctionComponent(value: ReactComponentClass[Children]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragmentComponentClass(value: ReactComponentClass[Children]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragment(value: ReactComponentClass[Children]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFragment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Fragment")(js.undefined)
        ret
    }
    @scala.inline
    def withComponents(value: StringDictionary[ReactComponentClass[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
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
  }
  
}

