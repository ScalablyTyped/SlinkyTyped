package typingsSlinky.baseui.cardMod

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardProps extends js.Object {
  val action: js.UndefOr[TagMod[Any]] = js.native
  val children: js.UndefOr[TagMod[Any]] = js.native
  val hasThumbnail: js.UndefOr[js.Function1[/* props */ Thumbnail, Boolean]] = js.native
  val headerImage: js.UndefOr[
    String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImagePropsT */ js.Any)
  ] = js.native
  val overrides: js.UndefOr[CardOverrides] = js.native
  val thumbnail: js.UndefOr[String] = js.native
  val title: js.UndefOr[TagMod[Any]] = js.native
}

object CardProps {
  @scala.inline
  def apply(): CardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardProps]
  }
  @scala.inline
  implicit class CardPropsOps[Self <: CardProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withHasThumbnail(value: /* props */ Thumbnail => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasThumbnail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHasThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderImage(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ImagePropsT */ js.Any)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerImage")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: CardOverrides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

