package typingsSlinky.reactNativeReadMoreText.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadMoreProps extends js.Object {
  var children: TagMod[Any]
  var numberOfLines: Double
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  def renderRevealedFooter(onPress: js.Function0[Unit]): TagMod[Any]
  def renderTruncatedFooter(onPress: js.Function0[Unit]): TagMod[Any]
}

object ReadMoreProps {
  @scala.inline
  def apply(
    children: TagMod[Any],
    numberOfLines: Double,
    renderRevealedFooter: js.Function0[Unit] => TagMod[Any],
    renderTruncatedFooter: js.Function0[Unit] => TagMod[Any],
    onReady: () => Unit = null
  ): ReadMoreProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], numberOfLines = numberOfLines.asInstanceOf[js.Any], renderRevealedFooter = js.Any.fromFunction1(renderRevealedFooter), renderTruncatedFooter = js.Any.fromFunction1(renderTruncatedFooter))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction0(onReady))
    __obj.asInstanceOf[ReadMoreProps]
  }
}

