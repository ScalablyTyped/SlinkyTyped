package typingsSlinky.reactGravatar.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react.react.DetailedHTMLProps<react.react.ImgHTMLAttributes<std.HTMLImageElement>, std.HTMLImageElement> ]:? react.react.DetailedHTMLProps<react.react.ImgHTMLAttributes<std.HTMLImageElement>, std.HTMLImageElement>[P]} */ @js.native
trait Props extends js.Object {
  var className: js.UndefOr[String] = js.native
  /**
  		 * Gravatar has a number of built in options which you can use as defaults when an email address has no
  		 * matching Gravatar image.
  		 *
  		 * @default "retro"
  		 * @see https://gravatar.com/site/implement/images/#default-image
  		 */
  var default: js.UndefOr[DefaultImage] = js.native
  /**
  		 * The email address used to look up the Gravatar image.
  		 * If you wish to avoid sending an email address to the client, you can compute the md5 hash on the server and
  		 * pass the hash to the component using the `md5` prop instead of the `email` prop.
  		 */
  var email: js.UndefOr[String] = js.native
  /**
  		 * The md5 hash of the email address used to look up the Gravatar image.
  		 * If you wish to avoid sending an email address to the client, you can compute the md5 hash on the server and
  		 * pass the hash to the component using the `md5` prop instead of the `email` prop.
  		 */
  var md5: js.UndefOr[String] = js.native
  /**
  		 * The protocol used to fetch the Gravatar image. Should be one of `http://`, `https://` or `//` (default).
  		 *
  		 * @default "//"
  		 * @see https://gravatar.com/site/implement/images/#secure-images
  		 */
  var protocol: js.UndefOr[String] = js.native
  /**
  		 * Gravatar allows users to self-rate their images so that they can indicate if an image is appropriate for a
  		 * certain audience. By default, only `g` rated images are displayed unless you indicate that you would like
  		 * to see higher ratings.
  		 *
  		 * @default "g"
  		 * @see https://gravatar.com/site/implement/images/#rating
  		 */
  var rating: js.UndefOr[Rating] = js.native
  /**
  		 * By default, images are presented at 50px by 50px if no size prop is supplied.
  		 *
  		 * @default 50
  		 * @see https://gravatar.com/site/implement/images/#size
  		 */
  var size: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withDefault(value: DefaultImage): Self = {
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
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withMd5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md5")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: Rating): Self = {
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
    @scala.inline
    def withStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

