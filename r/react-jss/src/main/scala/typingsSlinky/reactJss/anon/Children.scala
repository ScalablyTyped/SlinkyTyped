package typingsSlinky.reactJss.anon

import slinky.core.TagMod
import typingsSlinky.jss.mod.CreateGenerateIdOptions
import typingsSlinky.jss.mod.GenerateId
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.Rule
import typingsSlinky.jss.mod.SheetsRegistry
import typingsSlinky.jss.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: TagMod[Any] = js.native
  var classNamePrefix: js.UndefOr[String] = js.native
  var disableStylesGeneration: js.UndefOr[Boolean] = js.native
  var generateId: js.UndefOr[GenerateId] = js.native
  var id: js.UndefOr[CreateGenerateIdOptions] = js.native
  var jss: js.UndefOr[Jss] = js.native
  var registry: js.UndefOr[SheetsRegistry] = js.native
}

object Children {
  @scala.inline
  def apply(): Children = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClassNamePrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNamePrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassNamePrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classNamePrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableStylesGeneration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStylesGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableStylesGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableStylesGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGenerateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: CreateGenerateIdOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withJss(value: Jss): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jss")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistry(value: SheetsRegistry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registry")(js.undefined)
        ret
    }
  }
  
}

