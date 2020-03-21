package typingsSlinky.cathoQuantum.formMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.cathoQuantum.AnonValid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormProps extends js.Object {
  var children: js.Array[TagMod[Any]] | TagMod[Any]
  var noValidate: js.UndefOr[Boolean] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* hasValid */ js.UndefOr[AnonValid], Unit]] = js.undefined
  var onValidSubmit: js.UndefOr[
    js.Function1[/* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]], Unit]
  ] = js.undefined
}

object FormProps {
  @scala.inline
  def apply(
    children: js.Array[TagMod[Any]] | TagMod[Any],
    noValidate: js.UndefOr[Boolean] = js.undefined,
    onSubmit: /* hasValid */ js.UndefOr[AnonValid] => Unit = null,
    onValidSubmit: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit = null
  ): FormProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (!js.isUndefined(noValidate)) __obj.updateDynamic("noValidate")(noValidate.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onValidSubmit != null) __obj.updateDynamic("onValidSubmit")(js.Any.fromFunction1(onValidSubmit))
    __obj.asInstanceOf[FormProps]
  }
}

