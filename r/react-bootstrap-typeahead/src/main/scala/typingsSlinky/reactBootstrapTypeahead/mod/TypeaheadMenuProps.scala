package typingsSlinky.reactBootstrapTypeahead.mod

import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.TagMod
import slinky.core.facade.ReactRef
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.LegacyRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent react-bootstrap-typeahead.react-bootstrap-typeahead.MenuProps */
/* Inlined parent std.Pick<react-bootstrap-typeahead.react-bootstrap-typeahead.AllTypeaheadOwnAndInjectedProps<T>, react-bootstrap-typeahead.react-bootstrap-typeahead.TypeaheadMenuPropsPick> */
@js.native
trait TypeaheadMenuProps[T /* <: TypeaheadModel */] extends js.Object {
  var className: js.UndefOr[String] = js.native
  var emptyLabel: js.UndefOr[String] = js.native
  var id: String = js.native
  var innerRef: js.UndefOr[LegacyRef[HTMLUListElement]] = js.native
  var labelKey: js.UndefOr[TypeaheadLabelKey[T]] = js.native
  var maxHeight: js.UndefOr[String] = js.native
  var newSelectionPrefix: js.UndefOr[String] = js.native
  var options: js.Array[T] = js.native
  var renderMenuItemChildren: js.UndefOr[
    js.Function3[
      /* option */ TypeaheadResult[T], 
      /* props */ TypeaheadMenuProps[T], 
      /* index */ Double, 
      TagMod[Any]
    ]
  ] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  var text: js.UndefOr[String] = js.native
}

object TypeaheadMenuProps {
  @scala.inline
  def apply[T](id: String, options: js.Array[T]): TypeaheadMenuProps[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadMenuProps[T]]
  }
  @scala.inline
  implicit class TypeaheadMenuPropsOps[Self[t] <: TypeaheadMenuProps[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withId(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyLabel(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyLabel: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefRefObject(value: ReactRef[HTMLUListElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerRefFunction1(value: /* instance */ HTMLUListElement | Null => Unit): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInnerRef(value: LegacyRef[HTMLUListElement]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerRef: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerRefNull: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerRef")(null)
        ret
    }
    @scala.inline
    def withLabelKeyFunction1(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLabelKey(value: TypeaheadLabelKey[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelKey: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelKey")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withNewSelectionPrefix(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectionPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewSelectionPrefix: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newSelectionPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderMenuItemChildren(
      value: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => TagMod[Any]
    ): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMenuItemChildren")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutRenderMenuItemChildren: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderMenuItemChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: CSSProperties): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

