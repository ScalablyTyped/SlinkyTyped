package typingsSlinky.antDesignProLayout.pageHeaderWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageHeaderTabConfig extends js.Object {
  var onTabChange: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['onChange'] */ js.Any
  ] = js.native
  var tabActiveKey: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['activeKey'] */ js.Any
  ] = js.native
  var tabBarExtraContent: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['tabBarExtraContent'] */ js.Any
  ] = js.native
  var tabList: js.UndefOr[
    js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabPaneProps */ _
    ]
  ] = js.native
  var tabProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps */ js.Any
  ] = js.native
}

object PageHeaderTabConfig {
  @scala.inline
  def apply(): PageHeaderTabConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageHeaderTabConfig]
  }
  @scala.inline
  implicit class PageHeaderTabConfigOps[Self <: PageHeaderTabConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnTabChange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['onChange'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnTabChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTabChange")(js.undefined)
        ret
    }
    @scala.inline
    def withTabActiveKey(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['activeKey'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabActiveKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabActiveKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabActiveKey")(js.undefined)
        ret
    }
    @scala.inline
    def withTabBarExtraContent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['tabBarExtraContent'] */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarExtraContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabBarExtraContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabBarExtraContent")(js.undefined)
        ret
    }
    @scala.inline
    def withTabList(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabPaneProps */ _
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabList")(js.undefined)
        ret
    }
    @scala.inline
    def withTabProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabProps")(js.undefined)
        ret
    }
  }
  
}

