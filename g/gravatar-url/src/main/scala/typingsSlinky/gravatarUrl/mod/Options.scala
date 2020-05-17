package typingsSlinky.gravatarUrl.mod

import typingsSlinky.gravatarUrl.gravatarUrlStrings.`404`
import typingsSlinky.gravatarUrl.gravatarUrlStrings.blank
import typingsSlinky.gravatarUrl.gravatarUrlStrings.g
import typingsSlinky.gravatarUrl.gravatarUrlStrings.identicon
import typingsSlinky.gravatarUrl.gravatarUrlStrings.mm
import typingsSlinky.gravatarUrl.gravatarUrlStrings.monsterid
import typingsSlinky.gravatarUrl.gravatarUrlStrings.pg
import typingsSlinky.gravatarUrl.gravatarUrlStrings.r
import typingsSlinky.gravatarUrl.gravatarUrlStrings.retro
import typingsSlinky.gravatarUrl.gravatarUrlStrings.wavatar
import typingsSlinky.gravatarUrl.gravatarUrlStrings.x
import typingsSlinky.typeFest.mod.LiteralUnion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
  		[Image](https://en.gravatar.com/site/implement/images/#default-image) to return if the identifier didn't match any Gravatar profile. Either a ustom URL or [`404`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=404), [`mm`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=mm), [`identicon`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=identicon), [`monsterid`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=monsterid), [`wavatar`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=wavatar), [`retro`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=retro), [`blank`](https://gravatar.com/avatar/5cc22f8c06631cccead907acbb627b69?default=blank).
  		@default 'https://gravatar.com/avatar/00000000000000000000000000000000'
  		*/
  val default: js.UndefOr[
    LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String]
  ] = js.native
  /**
  		Allowed [rating](https://en.gravatar.com/site/implement/images/#rating) of the image.
  		@default 'g'
  		*/
  val rating: js.UndefOr[g | pg | r | x] = js.native
  /**
  		[Size](https://en.gravatar.com/site/implement/images/#size) of the image. Values: `1..2048`.
  		@default 80
  		*/
  val size: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: LiteralUnion[`404` | mm | identicon | monsterid | wavatar | retro | blank, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: g | pg | r | typingsSlinky.gravatarUrl.gravatarUrlStrings.x): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

