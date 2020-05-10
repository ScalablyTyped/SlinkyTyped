package typingsSlinky.gatsby.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapPageElementBrowserArgs[DataType, PageContextType] extends BrowserPluginArgs {
  var element: js.Object = js.native
  var props: PageProps[DataType, PageContextType] = js.native
}

object WrapPageElementBrowserArgs {
  @scala.inline
  def apply[DataType, PageContextType](
    element: js.Object,
    getResourceURLsForPathname: js.Function,
    getResourcesForPathname: js.Function,
    getResourcesForPathnameSync: js.Function,
    props: PageProps[DataType, PageContextType]
  ): WrapPageElementBrowserArgs[DataType, PageContextType] = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], getResourceURLsForPathname = getResourceURLsForPathname.asInstanceOf[js.Any], getResourcesForPathname = getResourcesForPathname.asInstanceOf[js.Any], getResourcesForPathnameSync = getResourcesForPathnameSync.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapPageElementBrowserArgs[DataType, PageContextType]]
  }
  @scala.inline
  implicit class WrapPageElementBrowserArgsOps[Self[datatype, pagecontexttype] <: WrapPageElementBrowserArgs[datatype, pagecontexttype], DataType, PageContextType] (val x: Self[DataType, PageContextType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DataType, PageContextType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DataType, PageContextType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[DataType, PageContextType]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[DataType, PageContextType]) with Other]
    @scala.inline
    def withElement(value: js.Object): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: PageProps[DataType, PageContextType]): Self[DataType, PageContextType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

