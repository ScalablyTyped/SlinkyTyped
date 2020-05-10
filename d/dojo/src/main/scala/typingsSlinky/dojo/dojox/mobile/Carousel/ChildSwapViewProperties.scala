package typingsSlinky.dojo.dojox.mobile.Carousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/mobile/Carousel.ChildSwapViewProperties.html
  *
  * This property can be specified for the SwapView children of a dojox/mobile/Carousel.
  *
  */
@js.native
trait ChildSwapViewProperties extends js.Object {
  /**
    * Specifies that the Carousel child must be lazily loaded.
    *
    */
  var `lazy`: Boolean = js.native
}

object ChildSwapViewProperties {
  @scala.inline
  def apply(`lazy`: Boolean): ChildSwapViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lazy")(`lazy`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildSwapViewProperties]
  }
  @scala.inline
  implicit class ChildSwapViewPropertiesOps[Self <: ChildSwapViewProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLazy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lazy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

