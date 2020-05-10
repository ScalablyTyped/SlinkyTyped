package typingsSlinky.audiosprite.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.audiosprite.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var autoplay: js.UndefOr[String] = js.native
  var resources: js.Array[String] = js.native
  var spritemap: StringDictionary[AnonEnd] = js.native
}

object Result {
  @scala.inline
  def apply(resources: js.Array[String], spritemap: StringDictionary[AnonEnd]): Result = {
    val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any], spritemap = spritemap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpritemap(value: StringDictionary[AnonEnd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spritemap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoplay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(js.undefined)
        ret
    }
  }
  
}

