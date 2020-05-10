package typingsSlinky.conductorAnimate.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConductorProps extends js.Object {
  var animations: Animations = js.native
  var children: TagMod[Any] | ReactNodeArray = js.native
  var config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config]) = js.native
}

object ConductorProps {
  @scala.inline
  def apply(
    animations: Animations,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
  ): ConductorProps = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConductorProps]
  }
  @scala.inline
  implicit class ConductorPropsOps[Self <: ConductorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimations(value: Animations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigFunction2(value: (/* id */ String, /* additional */ js.Object) => Config): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withConfig(
      value: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any] | ReactNodeArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

