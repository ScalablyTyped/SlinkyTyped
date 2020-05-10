package typingsSlinky.packageJson.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistTags extends /* tagName */ StringDictionary[String] {
  val latest: String = js.native
}

object DistTags {
  @scala.inline
  def apply(latest: String): DistTags = {
    val __obj = js.Dynamic.literal(latest = latest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistTags]
  }
  @scala.inline
  implicit class DistTagsOps[Self <: DistTags] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latest")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

