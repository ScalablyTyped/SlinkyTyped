package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgVideoPlayerCommercials
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Customizes the ad message settings of the commercial. Ad message shows the duration of the commercial and pops up when the commercial starts playing.
  	 *
  	 */
  var adMessage: js.UndefOr[IgVideoPlayerCommercialsAdMessage] = js.native
  /**
  	 * Gets/Sets whether the commercials will play againg during the repetitive video plays.
  	 *
  	 */
  var alwaysPlayCommercials: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets an array of embedded commercials objects. An embedded commercial is an ad that is contained in the original video file. It is suitable when you want to mark some sections of the video as commercials.
  	 *
  	 */
  var embeddedCommercials: js.UndefOr[js.Array[IgVideoPlayerCommercialsEmbeddedCommercial]] = js.native
  /**
  	 * Gets/Sets an array of linked commercial objects. A linked commercial is a separate video file that will be played in the specified position of the original movie clip by [startTime](ui.igvideoplayer#options:commercials.linkedCommercials.startTime). This feature is useful if you have frequently changing outside commercial sources.
  	 *
  	 */
  var linkedCommercials: js.UndefOr[js.Array[IgVideoPlayerCommercialsLinkedCommercial]] = js.native
  /**
  	 * Gets/Sets whether to show commercial locations or not.
  	 *
  	 */
  var showBookmarks: js.UndefOr[Boolean] = js.native
}

object IgVideoPlayerCommercials {
  @scala.inline
  def apply(): IgVideoPlayerCommercials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgVideoPlayerCommercials]
  }
  @scala.inline
  implicit class IgVideoPlayerCommercialsOps[Self <: IgVideoPlayerCommercials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdMessage(value: IgVideoPlayerCommercialsAdMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysPlayCommercials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysPlayCommercials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysPlayCommercials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysPlayCommercials")(js.undefined)
        ret
    }
    @scala.inline
    def withEmbeddedCommercials(value: js.Array[IgVideoPlayerCommercialsEmbeddedCommercial]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedCommercials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedCommercials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedCommercials")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedCommercials(value: js.Array[IgVideoPlayerCommercialsLinkedCommercial]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedCommercials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedCommercials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedCommercials")(js.undefined)
        ret
    }
    @scala.inline
    def withShowBookmarks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBookmarks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowBookmarks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showBookmarks")(js.undefined)
        ret
    }
  }
  
}

