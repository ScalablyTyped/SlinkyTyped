package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.materialUiCore.anon.PartialClassNameMapGridLiActionIcon
import typingsSlinky.materialUiCore.materialUiCoreStrings.bottom
import typingsSlinky.materialUiCore.materialUiCoreStrings.left
import typingsSlinky.materialUiCore.materialUiCoreStrings.right
import typingsSlinky.materialUiCore.materialUiCoreStrings.top
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridListTileBarGridListTileBarMod extends Shortcut {
  
  @JSImport("@material-ui/core/GridListTileBar/GridListTileBar", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GridListTileBarProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.materialUiCore.materialUiCoreStrings.root
    - typingsSlinky.materialUiCore.materialUiCoreStrings.titlePositionBottom
    - typingsSlinky.materialUiCore.materialUiCoreStrings.titlePositionTop
    - typingsSlinky.materialUiCore.materialUiCoreStrings.rootSubtitle
    - typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrap
    - typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft
    - typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight
    - typingsSlinky.materialUiCore.materialUiCoreStrings.title
    - typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle
    - typingsSlinky.materialUiCore.materialUiCoreStrings.actionIcon
    - typingsSlinky.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft
  */
  trait GridListTileBarClassKey extends StObject
  object GridListTileBarClassKey {
    
    @scala.inline
    def actionIcon: typingsSlinky.materialUiCore.materialUiCoreStrings.actionIcon = "actionIcon".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.actionIcon]
    
    @scala.inline
    def actionIconActionPosLeft: typingsSlinky.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft = "actionIconActionPosLeft".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.actionIconActionPosLeft]
    
    @scala.inline
    def root: typingsSlinky.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.root]
    
    @scala.inline
    def rootSubtitle: typingsSlinky.materialUiCore.materialUiCoreStrings.rootSubtitle = "rootSubtitle".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.rootSubtitle]
    
    @scala.inline
    def subtitle: typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle = "subtitle".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.subtitle]
    
    @scala.inline
    def title: typingsSlinky.materialUiCore.materialUiCoreStrings.title = "title".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.title]
    
    @scala.inline
    def titlePositionBottom: typingsSlinky.materialUiCore.materialUiCoreStrings.titlePositionBottom = "titlePositionBottom".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.titlePositionBottom]
    
    @scala.inline
    def titlePositionTop: typingsSlinky.materialUiCore.materialUiCoreStrings.titlePositionTop = "titlePositionTop".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.titlePositionTop]
    
    @scala.inline
    def titleWrap: typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrap = "titleWrap".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrap]
    
    @scala.inline
    def titleWrapActionPosLeft: typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft = "titleWrapActionPosLeft".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrapActionPosLeft]
    
    @scala.inline
    def titleWrapActionPosRight: typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight = "titleWrapActionPosRight".asInstanceOf[typingsSlinky.materialUiCore.materialUiCoreStrings.titleWrapActionPosRight]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/core.@material-ui/core/GridListTileBar/GridListTileBar.GridListTileBarClassKey, never> */
  @js.native
  trait GridListTileBarProps extends StObject {
    
    var actionIcon: js.UndefOr[ReactElement] = js.native
    
    var actionPosition: js.UndefOr[left | right] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var classes: js.UndefOr[PartialClassNameMapGridLiActionIcon] = js.native
    
    var innerRef: js.UndefOr[Ref[_] | ReactRef[_]] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var subtitle: js.UndefOr[ReactElement] = js.native
    
    var title: js.UndefOr[ReactElement] = js.native
    
    var titlePosition: js.UndefOr[top | bottom] = js.native
  }
  object GridListTileBarProps {
    
    @scala.inline
    def apply(): GridListTileBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridListTileBarProps]
    }
    
    @scala.inline
    implicit class GridListTileBarPropsMutableBuilder[Self <: GridListTileBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionIcon(value: ReactElement): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionIconReactElement(value: ReactElement): Self = StObject.set(x, "actionIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionIconUndefined: Self = StObject.set(x, "actionIcon", js.undefined)
      
      @scala.inline
      def setActionPosition(value: left | right): Self = StObject.set(x, "actionPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionPositionUndefined: Self = StObject.set(x, "actionPosition", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClasses(value: PartialClassNameMapGridLiActionIcon): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[_] | ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ _ | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefRefObject(value: ReactRef[_]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubtitle(value: ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleReactElement(value: ReactElement): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePosition(value: top | bottom): Self = StObject.set(x, "titlePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePositionUndefined: Self = StObject.set(x, "titlePosition", js.undefined)
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GridListTileBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `gridListTileBarGridListTileBarMod.foo` */
  override def _to: ReactComponentClass[GridListTileBarProps] = default
}
