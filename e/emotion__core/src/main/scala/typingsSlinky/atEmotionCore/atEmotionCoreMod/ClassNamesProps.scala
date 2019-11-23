package typingsSlinky.atEmotionCore.atEmotionCoreMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassNamesProps[Theme] extends js.Object {
  def children(content: ClassNamesContent[Theme]): TagMod[Any]
}

object ClassNamesProps {
  @scala.inline
  def apply[Theme](children: ClassNamesContent[Theme] => TagMod[Any]): ClassNamesProps[Theme] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[ClassNamesProps[Theme]]
  }
}

