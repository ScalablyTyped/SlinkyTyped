package typingsSlinky.antDesignProLayout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick</ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any, 'routes' | 'itemRender'> */
@js.native
trait PickanyroutesitemRender extends js.Object {
  var itemRender: js.UndefOr[js.Any] = js.native
  var routes: js.UndefOr[js.Any] = js.native
}

object PickanyroutesitemRender {
  @scala.inline
  def apply(): PickanyroutesitemRender = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickanyroutesitemRender]
  }
  @scala.inline
  implicit class PickanyroutesitemRenderOps[Self <: PickanyroutesitemRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemRender(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemRender")(js.undefined)
        ret
    }
    @scala.inline
    def withRoutes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routes")(js.undefined)
        ret
    }
  }
  
}

