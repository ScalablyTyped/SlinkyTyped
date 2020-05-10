package typingsSlinky.agGrid.gridMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.agGrid.iFrameworkFactoryMod.IFrameworkFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridParams extends js.Object {
  @JSName("$compile")
  var $compile: js.UndefOr[js.Any] = js.native
  @JSName("$scope")
  var $scope: js.UndefOr[js.Any] = js.native
  var frameworkFactory: js.UndefOr[IFrameworkFactory] = js.native
  var globalEventListener: js.UndefOr[js.Function] = js.native
  var quickFilterOnScope: js.UndefOr[js.Any] = js.native
  var seedBeanInstances: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object GridParams {
  @scala.inline
  def apply(): GridParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridParams]
  }
  @scala.inline
  implicit class GridParamsOps[Self <: GridParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$compile(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$compile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$compile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$compile")(js.undefined)
        ret
    }
    @scala.inline
    def with$scope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$scope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$scope")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameworkFactory(value: IFrameworkFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameworkFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameworkFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalEventListener(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalEventListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalEventListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalEventListener")(js.undefined)
        ret
    }
    @scala.inline
    def withQuickFilterOnScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickFilterOnScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuickFilterOnScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quickFilterOnScope")(js.undefined)
        ret
    }
    @scala.inline
    def withSeedBeanInstances(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedBeanInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeedBeanInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seedBeanInstances")(js.undefined)
        ret
    }
  }
  
}

