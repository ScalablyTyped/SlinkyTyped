package typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod

import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuSubComponentStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextualMenuClassNames extends js.Object {
  var container: String = js.native
  var header: String = js.native
  var list: String = js.native
  var root: String = js.native
  var subComponentStyles: js.UndefOr[IContextualMenuSubComponentStyles] = js.native
  var title: String = js.native
}

object IContextualMenuClassNames {
  @scala.inline
  def apply(container: String, header: String, list: String, root: String, title: String): IContextualMenuClassNames = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextualMenuClassNames]
  }
  @scala.inline
  implicit class IContextualMenuClassNamesOps[Self <: IContextualMenuClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubComponentStyles(value: IContextualMenuSubComponentStyles): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subComponentStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubComponentStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subComponentStyles")(js.undefined)
        ret
    }
  }
  
}

