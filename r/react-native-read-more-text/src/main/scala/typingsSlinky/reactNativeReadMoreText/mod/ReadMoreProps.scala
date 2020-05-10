package typingsSlinky.reactNativeReadMoreText.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadMoreProps extends js.Object {
  var children: TagMod[Any] = js.native
  var numberOfLines: Double = js.native
  var onReady: js.UndefOr[js.Function0[Unit]] = js.native
  def renderRevealedFooter(onPress: js.Function0[Unit]): TagMod[Any] = js.native
  def renderTruncatedFooter(onPress: js.Function0[Unit]): TagMod[Any] = js.native
}

object ReadMoreProps {
  @scala.inline
  def apply(
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => TagMod[Any],
    renderTruncatedFooter: js.Function0[Unit] => TagMod[Any]
  ): ReadMoreProps = {
    val __obj = js.Dynamic.literal(numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    __obj.asInstanceOf[ReadMoreProps]
  }
  @scala.inline
  implicit class ReadMorePropsOps[Self <: ReadMoreProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderRevealedFooter(value: js.Function0[Unit] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderRevealedFooter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRenderTruncatedFooter(value: js.Function0[Unit] => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderTruncatedFooter")(js.Any.fromFunction1(value))
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
    def withOnReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReady")(js.undefined)
        ret
    }
  }
  
}

