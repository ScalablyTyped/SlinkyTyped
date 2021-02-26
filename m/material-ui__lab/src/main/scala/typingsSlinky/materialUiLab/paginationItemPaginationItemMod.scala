package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.anon.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemPaginationItemMod {
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://material-ui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://material-ui.com/api/pagination-item/)
    */
  @JSImport("@material-ui/lab/PaginationItem/PaginationItem", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<PaginationItemTypeMap> */ js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.root
    - typingsSlinky.materialUiLab.materialUiLabStrings.page
    - typingsSlinky.materialUiLab.materialUiLabStrings.sizeSmall
    - typingsSlinky.materialUiLab.materialUiLabStrings.sizeLarge
    - typingsSlinky.materialUiLab.materialUiLabStrings.textPrimary
    - typingsSlinky.materialUiLab.materialUiLabStrings.textSecondary
    - typingsSlinky.materialUiLab.materialUiLabStrings.outlined
    - typingsSlinky.materialUiLab.materialUiLabStrings.outlinedPrimary
    - typingsSlinky.materialUiLab.materialUiLabStrings.outlinedSecondary
    - typingsSlinky.materialUiLab.materialUiLabStrings.rounded
    - typingsSlinky.materialUiLab.materialUiLabStrings.ellipsis
    - typingsSlinky.materialUiLab.materialUiLabStrings.focusVisible
    - typingsSlinky.materialUiLab.materialUiLabStrings.disabled
    - typingsSlinky.materialUiLab.materialUiLabStrings.selected
    - typingsSlinky.materialUiLab.materialUiLabStrings.icon
  */
  trait PaginationItemClassKey extends StObject
  object PaginationItemClassKey {
    
    @scala.inline
    def disabled: typingsSlinky.materialUiLab.materialUiLabStrings.disabled = "disabled".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.disabled]
    
    @scala.inline
    def ellipsis: typingsSlinky.materialUiLab.materialUiLabStrings.ellipsis = "ellipsis".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.ellipsis]
    
    @scala.inline
    def focusVisible: typingsSlinky.materialUiLab.materialUiLabStrings.focusVisible = "focusVisible".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.focusVisible]
    
    @scala.inline
    def icon: typingsSlinky.materialUiLab.materialUiLabStrings.icon = "icon".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.icon]
    
    @scala.inline
    def outlined: typingsSlinky.materialUiLab.materialUiLabStrings.outlined = "outlined".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.outlined]
    
    @scala.inline
    def outlinedPrimary: typingsSlinky.materialUiLab.materialUiLabStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.outlinedPrimary]
    
    @scala.inline
    def outlinedSecondary: typingsSlinky.materialUiLab.materialUiLabStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.outlinedSecondary]
    
    @scala.inline
    def page: typingsSlinky.materialUiLab.materialUiLabStrings.page = "page".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.page]
    
    @scala.inline
    def root: typingsSlinky.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.root]
    
    @scala.inline
    def rounded: typingsSlinky.materialUiLab.materialUiLabStrings.rounded = "rounded".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.rounded]
    
    @scala.inline
    def selected: typingsSlinky.materialUiLab.materialUiLabStrings.selected = "selected".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.selected]
    
    @scala.inline
    def sizeLarge: typingsSlinky.materialUiLab.materialUiLabStrings.sizeLarge = "sizeLarge".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.sizeLarge]
    
    @scala.inline
    def sizeSmall: typingsSlinky.materialUiLab.materialUiLabStrings.sizeSmall = "sizeSmall".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.sizeSmall]
    
    @scala.inline
    def textPrimary: typingsSlinky.materialUiLab.materialUiLabStrings.textPrimary = "textPrimary".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.textPrimary]
    
    @scala.inline
    def textSecondary: typingsSlinky.materialUiLab.materialUiLabStrings.textSecondary = "textSecondary".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.textSecondary]
  }
  
  type PaginationItemProps[D /* <: ReactElement */, P] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverrideProps<PaginationItemTypeMap<P, D>, D> */ js.Any
  
  @js.native
  trait PaginationItemTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var classKey: PaginationItemClassKey = js.native
    
    var defaultComponent: D = js.native
    
    var props: P with Color = js.native
  }
  object PaginationItemTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](classKey: PaginationItemClassKey, defaultComponent: D, props: P with Color): PaginationItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationItemTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class PaginationItemTypeMapMutableBuilder[Self <: PaginationItemTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (PaginationItemTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setClassKey(value: PaginationItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
