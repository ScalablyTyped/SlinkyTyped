package typingsSlinky.angular.angular

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Supplement IComponentOptions from angular.d.ts with router-specific
// fields.
@js.native
trait IComponentOptions extends js.Object {
  @JSName("$canActivate")
  var $canActivate: js.UndefOr[
    js.Function1[
      /* repeated */ js.Any, 
      Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<boolean> */ _)
    ]
  ] = js.native
  @JSName("$routeConfig")
  var $routeConfig: js.UndefOr[js.Array[RouteDefinition]] = js.native
}

object IComponentOptions {
  @scala.inline
  def apply(): IComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IComponentOptions]
  }
  @scala.inline
  implicit class IComponentOptionsOps[Self <: IComponentOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$canActivate(
      value: /* repeated */ js.Any => Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IPromise<boolean> */ _)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$canActivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$canActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$canActivate")(js.undefined)
        ret
    }
    @scala.inline
    def with$routeConfig(value: js.Array[RouteDefinition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$routeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$routeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$routeConfig")(js.undefined)
        ret
    }
  }
  
}

