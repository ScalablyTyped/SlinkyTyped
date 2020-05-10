package typingsSlinky.ckeditor.CKEDITOR.plugins.widget

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.ckeditor.CKEDITOR.eventInfo
import typingsSlinky.ckeditor.CKEDITOR.feature
import typingsSlinky.ckeditor.CKEDITOR.filter.allowedContentRules
import typingsSlinky.ckeditor.CKEDITOR.htmlParser.element
import typingsSlinky.ckeditor.CKEDITOR.style
import typingsSlinky.ckeditor.CKEDITOR.template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait definition extends feature {
  var button: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Function1[/* evt */ eventInfo, Unit]] = js.native
  var defaults: js.UndefOr[StringDictionary[js.Any]] = js.native
  var dialog: js.UndefOr[String] = js.native
  var downcast: js.UndefOr[String | (js.Function1[/* element */ element, Unit])] = js.native
  var downcasts: js.UndefOr[StringDictionary[js.Any]] = js.native
  var draggable: js.UndefOr[Boolean] = js.native
  var edit: js.UndefOr[js.Function0[Unit]] = js.native
  var editables: js.UndefOr[StringDictionary[js.Any]] = js.native
  var getLabel: js.UndefOr[js.Function0[_]] = js.native
  var init: js.UndefOr[js.Function0[Unit]] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var insert: js.UndefOr[js.Function0[Unit]] = js.native
  var mask: js.UndefOr[Boolean] = js.native
  var parts: js.UndefOr[StringDictionary[js.Any]] = js.native
  var pathName: js.UndefOr[String] = js.native
  var styleToAllowedContentRules: js.UndefOr[js.Function1[/* style */ style, allowedContentRules]] = js.native
  var styleableElements: js.UndefOr[String] = js.native
  var template: js.UndefOr[String | typingsSlinky.ckeditor.CKEDITOR.template] = js.native
  var upcast: js.UndefOr[String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean])] = js.native
  var upcastPriority: js.UndefOr[Double] = js.native
  var upcasts: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object definition {
  @scala.inline
  def apply(): definition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[definition]
  }
  @scala.inline
  implicit class definitionOps[Self <: definition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: /* evt */ eventInfo => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaults(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withDialog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(js.undefined)
        ret
    }
    @scala.inline
    def withDowncastFunction1(value: /* element */ element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downcast")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDowncast(value: String | (js.Function1[/* element */ element, Unit])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downcast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDowncast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downcast")(js.undefined)
        ret
    }
    @scala.inline
    def withDowncasts(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downcasts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDowncasts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downcasts")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEditables(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editables")(js.undefined)
        ret
    }
    @scala.inline
    def withGetLabel(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withInit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInsert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withParts(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parts")(js.undefined)
        ret
    }
    @scala.inline
    def withPathName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathName")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleToAllowedContentRules(value: /* style */ style => allowedContentRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleToAllowedContentRules")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStyleToAllowedContentRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleToAllowedContentRules")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleableElements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleableElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyleableElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleableElements")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String | template): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withUpcastFunction2(value: (/* element */ element, /* data */ js.Any) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUpcast(value: String | (js.Function2[/* element */ element, /* data */ js.Any, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcast")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpcast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcast")(js.undefined)
        ret
    }
    @scala.inline
    def withUpcastPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcastPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpcastPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcastPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withUpcasts(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcasts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpcasts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upcasts")(js.undefined)
        ret
    }
  }
  
}

