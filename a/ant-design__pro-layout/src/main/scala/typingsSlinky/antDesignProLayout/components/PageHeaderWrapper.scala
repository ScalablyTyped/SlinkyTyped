package typingsSlinky.antDesignProLayout.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsSlinky.antDesignProLayout.pageHeaderWrapperMod.PageHeaderWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PageHeaderWrapper {
  @JSImport("@ant-design/pro-layout/lib/PageHeaderWrapper", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def contentReactElement(value: ReactElement): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def content(value: TagMod[Any]): this.type = set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def extraContentReactElement(value: ReactElement): this.type = set("extraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def extraContent(value: TagMod[Any]): this.type = set("extraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def onTabChange(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['onChange'] */ js.Any
    ): this.type = set("onTabChange", value.asInstanceOf[js.Any])
    @scala.inline
    def pageHeaderRender(value: /* props */ PageHeaderWrapperProps => TagMod[Any]): this.type = set("pageHeaderRender", js.Any.fromFunction1(value))
    @scala.inline
    def tabActiveKey(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['activeKey'] */ js.Any
    ): this.type = set("tabActiveKey", value.asInstanceOf[js.Any])
    @scala.inline
    def tabBarExtraContent(
      value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps * / any['tabBarExtraContent'] */ js.Any
    ): this.type = set("tabBarExtraContent", value.asInstanceOf[js.Any])
    @scala.inline
    def tabList(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabPaneProps */ _
        ]
    ): this.type = set("tabList", value.asInstanceOf[js.Any])
    @scala.inline
    def tabProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsProps */ js.Any
    ): this.type = set("tabProps", value.asInstanceOf[js.Any])
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: TagMod[Any] | `false`): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PageHeaderWrapperProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PageHeaderWrapper.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

