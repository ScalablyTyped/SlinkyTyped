package typingsSlinky.packageJson.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictversion extends /* tagName */ StringDictionary[String] {
  val created: String = js.native
  val modified: String = js.native
}

object Dictversion {
  @scala.inline
  def apply(created: String, modified: String): Dictversion = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictversion]
  }
  @scala.inline
  implicit class DictversionOps[Self <: Dictversion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modified")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

