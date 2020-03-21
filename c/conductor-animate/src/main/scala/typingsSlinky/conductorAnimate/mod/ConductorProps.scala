package typingsSlinky.conductorAnimate.mod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.react.mod.ReactNodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConductorProps extends js.Object {
  var animations: Animations
  var children: TagMod[Any] | ReactNodeArray
  var config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
}

object ConductorProps {
  @scala.inline
  def apply(
    animations: Animations,
    children: TagMod[Any] | ReactNodeArray,
    config: StringDictionary[Config] | (js.Function2[/* id */ String, /* additional */ js.Object, Config])
  ): ConductorProps = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConductorProps]
  }
}

