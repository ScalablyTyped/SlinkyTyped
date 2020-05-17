package typingsSlinky.knockoutPaging.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.knockoutPaging.KnockoutPageGenerator
import typingsSlinky.knockoutPaging.KnockoutSlidingPageGenerator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictname extends /* name */ StringDictionary[KnockoutPageGenerator] {
  var sliding: KnockoutSlidingPageGenerator = js.native
}

object Dictname {
  @scala.inline
  def apply(sliding: KnockoutSlidingPageGenerator): Dictname = {
    val __obj = js.Dynamic.literal(sliding = sliding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname]
  }
  @scala.inline
  implicit class DictnameOps[Self <: Dictname] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSliding(value: KnockoutSlidingPageGenerator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

