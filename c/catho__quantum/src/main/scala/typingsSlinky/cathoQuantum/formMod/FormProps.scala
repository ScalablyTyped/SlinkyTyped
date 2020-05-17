package typingsSlinky.cathoQuantum.formMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import typingsSlinky.cathoQuantum.anon.Valid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormProps extends js.Object {
  var children: js.Array[TagMod[Any]] | TagMod[Any] = js.native
  var noValidate: js.UndefOr[Boolean] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* hasValid */ js.UndefOr[Valid], Unit]] = js.native
  var onValidSubmit: js.UndefOr[
    js.Function1[/* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]], Unit]
  ] = js.native
}

object FormProps {
  @scala.inline
  def apply(): FormProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormProps]
  }
  @scala.inline
  implicit class FormPropsOps[Self <: FormProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[TagMod[Any]] | TagMod[Any]): Self = {
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
    def withNoValidate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noValidate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSubmit(value: /* hasValid */ js.UndefOr[Valid] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnValidSubmit(value: /* values */ js.UndefOr[StringDictionary[js.UndefOr[String]]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidSubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnValidSubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onValidSubmit")(js.undefined)
        ret
    }
  }
  
}

