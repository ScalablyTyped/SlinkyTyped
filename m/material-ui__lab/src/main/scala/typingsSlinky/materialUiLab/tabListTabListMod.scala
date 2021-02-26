package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiCore.tabsTabsMod.TabsClassKey
import typingsSlinky.materialUiLab.materialUiLabStrings.value
import typingsSlinky.materialUiTypes.mod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabListTabListMod {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://material-ui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://material-ui.com/api/tab-list/)
    * - inherits [Tabs API](https://material-ui.com/api/tabs/)
    */
  @JSImport("@material-ui/lab/TabList/TabList", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<TabListTypeMap> */ js.Any = js.native
  
  type TabListClassKey = TabsClassKey
  
  type TabListProps[D /* <: ReactElement */, P] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverrideProps<TabListTypeMap<P, D>, D> */ js.Any
  
  @js.native
  trait TabListTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var classKey: TabListClassKey = js.native
    
    var defaultComponent: D = js.native
    
    var props: P with (Omit[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
        value
      ]) = js.native
  }
  object TabListTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](
      classKey: TabListClassKey,
      defaultComponent: D,
      props: P with (Omit[
          /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
          value
        ])
    ): TabListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabListTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class TabListTypeMapMutableBuilder[Self <: TabListTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (TabListTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setClassKey(value: TabListClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(
        value: P with (Omit[
              /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TabsTypeMap * / any['props'] */ js.Any, 
              value
            ])
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
