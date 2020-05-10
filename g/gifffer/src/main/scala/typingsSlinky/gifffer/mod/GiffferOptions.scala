package typingsSlinky.gifffer.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see {@link https://github.com/krasimir/gifffer#styling|Styling}
  */
@js.native
trait GiffferOptions extends js.Object {
  var playButtonIconStyles: StringDictionary[String] = js.native
  var playButtonStyles: StringDictionary[String] = js.native
}

object GiffferOptions {
  @scala.inline
  def apply(playButtonIconStyles: StringDictionary[String], playButtonStyles: StringDictionary[String]): GiffferOptions = {
    val __obj = js.Dynamic.literal(playButtonIconStyles = playButtonIconStyles.asInstanceOf[js.Any], playButtonStyles = playButtonStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[GiffferOptions]
  }
  @scala.inline
  implicit class GiffferOptionsOps[Self <: GiffferOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayButtonIconStyles(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playButtonIconStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayButtonStyles(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playButtonStyles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

