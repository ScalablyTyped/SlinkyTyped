package typingsSlinky.pollyjsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exclude extends js.Object {
  var exclude: js.Array[String] = js.native
}

object Exclude {
  @scala.inline
  def apply(exclude: js.Array[String]): Exclude = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exclude]
  }
  @scala.inline
  implicit class ExcludeOps[Self <: Exclude] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

