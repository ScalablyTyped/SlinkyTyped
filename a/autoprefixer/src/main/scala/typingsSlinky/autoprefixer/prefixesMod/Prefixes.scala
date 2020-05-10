package typingsSlinky.autoprefixer.prefixesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Prefixes extends js.Object {
  var remove: StringDictionary[js.Any] = js.native
  def unprefixed(value: String): String = js.native
}

object Prefixes {
  @scala.inline
  def apply(remove: StringDictionary[js.Any], unprefixed: String => String): Prefixes = {
    val __obj = js.Dynamic.literal(remove = remove.asInstanceOf[js.Any], unprefixed = js.Any.fromFunction1(unprefixed))
    __obj.asInstanceOf[Prefixes]
  }
  @scala.inline
  implicit class PrefixesOps[Self <: Prefixes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemove(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnprefixed(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unprefixed")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

