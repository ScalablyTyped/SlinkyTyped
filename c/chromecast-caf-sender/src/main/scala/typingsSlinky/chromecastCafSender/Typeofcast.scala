package typingsSlinky.chromecastCafSender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcast extends js.Object {
  ////////////////////
  // Framework
  ////////////////////
  /**
    * Cast Application Framework
    * @see https://developers.google.com/cast/docs/reference/chrome/cast.framework
    */
  val framework: Typeofframework = js.native
}

object Typeofcast {
  @scala.inline
  def apply(framework: Typeofframework): Typeofcast = {
    val __obj = js.Dynamic.literal(framework = framework.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcast]
  }
  @scala.inline
  implicit class TypeofcastOps[Self <: Typeofcast] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFramework(value: Typeofframework): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("framework")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

