package typingsSlinky.baseui.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyledArtworkContainerPropsT extends js.Object {
  @JSName("$artworkSize")
  var $artworkSize: ArtworkSizesT = js.native
}

object StyledArtworkContainerPropsT {
  @scala.inline
  def apply($artworkSize: ArtworkSizesT): StyledArtworkContainerPropsT = {
    val __obj = js.Dynamic.literal($artworkSize = $artworkSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyledArtworkContainerPropsT]
  }
  @scala.inline
  implicit class StyledArtworkContainerPropsTOps[Self <: StyledArtworkContainerPropsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$artworkSize(value: ArtworkSizesT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$artworkSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

