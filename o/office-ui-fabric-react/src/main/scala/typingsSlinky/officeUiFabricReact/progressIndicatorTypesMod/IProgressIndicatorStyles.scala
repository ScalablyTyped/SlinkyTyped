package typingsSlinky.officeUiFabricReact.progressIndicatorTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProgressIndicatorStyles extends js.Object {
  var itemDescription: IStyle = js.native
  var itemName: IStyle = js.native
  var itemProgress: IStyle = js.native
  var progressBar: IStyle = js.native
  var progressTrack: IStyle = js.native
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
}

object IProgressIndicatorStyles {
  @scala.inline
  def apply(): IProgressIndicatorStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProgressIndicatorStyles]
  }
  @scala.inline
  implicit class IProgressIndicatorStylesOps[Self <: IProgressIndicatorStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemDescription(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withItemDescriptionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemDescription")(null)
        ret
    }
    @scala.inline
    def withItemName(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(js.undefined)
        ret
    }
    @scala.inline
    def withItemNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemName")(null)
        ret
    }
    @scala.inline
    def withItemProgress(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withItemProgressNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemProgress")(null)
        ret
    }
    @scala.inline
    def withProgressBar(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressBarNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressBar")(null)
        ret
    }
    @scala.inline
    def withProgressTrack(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressTrackNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressTrack")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
  }
  
}

