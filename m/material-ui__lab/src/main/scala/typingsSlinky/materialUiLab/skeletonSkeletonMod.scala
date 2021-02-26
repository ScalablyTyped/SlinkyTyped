package typingsSlinky.materialUiLab

import slinky.core.facade.ReactElement
import typingsSlinky.materialUiLab.anon.Animation
import typingsSlinky.materialUiLab.materialUiLabStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonSkeletonMod {
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://material-ui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://material-ui.com/api/skeleton/)
    */
  @JSImport("@material-ui/lab/Skeleton/Skeleton", JSImport.Default)
  @js.native
  val default: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverridableComponent<SkeletonTypeMap> */ js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiLab.materialUiLabStrings.root
    - typingsSlinky.materialUiLab.materialUiLabStrings.text
    - typingsSlinky.materialUiLab.materialUiLabStrings.rect
    - typingsSlinky.materialUiLab.materialUiLabStrings.circle
    - typingsSlinky.materialUiLab.materialUiLabStrings.pulse
    - typingsSlinky.materialUiLab.materialUiLabStrings.wave
    - typingsSlinky.materialUiLab.materialUiLabStrings.withChildren
    - typingsSlinky.materialUiLab.materialUiLabStrings.fitContent
    - typingsSlinky.materialUiLab.materialUiLabStrings.heightAuto
  */
  trait SkeletonClassKey extends StObject
  object SkeletonClassKey {
    
    @scala.inline
    def circle: typingsSlinky.materialUiLab.materialUiLabStrings.circle = "circle".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.circle]
    
    @scala.inline
    def fitContent: typingsSlinky.materialUiLab.materialUiLabStrings.fitContent = "fitContent".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.fitContent]
    
    @scala.inline
    def heightAuto: typingsSlinky.materialUiLab.materialUiLabStrings.heightAuto = "heightAuto".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.heightAuto]
    
    @scala.inline
    def pulse: typingsSlinky.materialUiLab.materialUiLabStrings.pulse = "pulse".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.pulse]
    
    @scala.inline
    def rect: typingsSlinky.materialUiLab.materialUiLabStrings.rect = "rect".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.rect]
    
    @scala.inline
    def root: typingsSlinky.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.root]
    
    @scala.inline
    def text: typingsSlinky.materialUiLab.materialUiLabStrings.text = "text".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.text]
    
    @scala.inline
    def wave: typingsSlinky.materialUiLab.materialUiLabStrings.wave = "wave".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.wave]
    
    @scala.inline
    def withChildren: typingsSlinky.materialUiLab.materialUiLabStrings.withChildren = "withChildren".asInstanceOf[typingsSlinky.materialUiLab.materialUiLabStrings.withChildren]
  }
  
  type SkeletonProps[D /* <: ReactElement */, P] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OverrideProps<SkeletonTypeMap<P, D>, D> */ js.Any
  
  @js.native
  trait SkeletonTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var classKey: SkeletonClassKey = js.native
    
    var defaultComponent: div = js.native
    
    var props: P with Animation = js.native
  }
  object SkeletonTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ReactElement */](classKey: SkeletonClassKey, defaultComponent: div, props: P with Animation): SkeletonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class SkeletonTypeMapMutableBuilder[Self <: SkeletonTypeMap[_, _], P, D /* <: ReactElement */] (val x: Self with (SkeletonTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setClassKey(value: SkeletonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Animation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
}
