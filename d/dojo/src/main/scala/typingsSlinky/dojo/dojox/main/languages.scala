package typingsSlinky.dojo.dojox.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/main.languages.html
  *
  *
  */
@js.native
trait languages extends js.Object {
  /**
    *
    */
  var pygments: js.Object = js.native
}

object languages {
  @scala.inline
  def apply(pygments: js.Object): languages = {
    val __obj = js.Dynamic.literal(pygments = pygments.asInstanceOf[js.Any])
    __obj.asInstanceOf[languages]
  }
  @scala.inline
  implicit class languagesOps[Self <: languages] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPygments(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pygments")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

