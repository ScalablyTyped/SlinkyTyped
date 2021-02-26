package typingsSlinky.carbonComponents

import typingsSlinky.carbonComponents.anon.Left
import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingMenuMod {
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", JSImport.Default)
  @js.native
  class default protected () extends FloatingMenu {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/floating-menu/floating-menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/floating-menu/floating-menu", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
    
    /* static member */
    object options {
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.attribAvoidFocusOnOpen")
      @js.native
      def attribAvoidFocusOnOpen: String = js.native
      @scala.inline
      def attribAvoidFocusOnOpen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attribAvoidFocusOnOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.attribDirection")
      @js.native
      def attribDirection: String = js.native
      @scala.inline
      def attribDirection_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("attribDirection")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.classRefShown")
      @js.native
      def classRefShown: String = js.native
      @scala.inline
      def classRefShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classRefShown")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.classShown")
      @js.native
      def classShown: String = js.native
      @scala.inline
      def classShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classShown")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.eventAfterHidden")
      @js.native
      def eventAfterHidden: String = js.native
      @scala.inline
      def eventAfterHidden_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventAfterHidden")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.eventAfterShown")
      @js.native
      def eventAfterShown: String = js.native
      @scala.inline
      def eventAfterShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventAfterShown")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.eventBeforeHidden")
      @js.native
      def eventBeforeHidden: String = js.native
      @scala.inline
      def eventBeforeHidden_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventBeforeHidden")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.eventBeforeShown")
      @js.native
      def eventBeforeShown: String = js.native
      @scala.inline
      def eventBeforeShown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventBeforeShown")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.offset")
      @js.native
      def offset: Left = js.native
      @scala.inline
      def offset_=(x: Left): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.refNode")
      @js.native
      def refNode: Null = js.native
      @scala.inline
      def refNode_=(x: Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("refNode")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.selectorContainer")
      @js.native
      def selectorContainer: String = js.native
      @scala.inline
      def selectorContainer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("carbon-components/components/floating-menu/floating-menu", "default.options.selectorPrimaryFocus")
      @js.native
      def selectorPrimaryFocus: String = js.native
      @scala.inline
      def selectorPrimaryFocus_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectorPrimaryFocus")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "DIRECTION_BOTTOM")
  @js.native
  val DIRECTION_BOTTOM: /* "bottom" */ String = js.native
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "DIRECTION_LEFT")
  @js.native
  val DIRECTION_LEFT: /* "left" */ String = js.native
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "DIRECTION_RIGHT")
  @js.native
  val DIRECTION_RIGHT: /* "right" */ String = js.native
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "DIRECTION_TOP")
  @js.native
  val DIRECTION_TOP: /* "top" */ String = js.native
  
  @JSImport("carbon-components/components/floating-menu/floating-menu", "getFloatingPosition")
  @js.native
  def getFloatingPosition(hasMenuSizeRefPositionOffsetDirectionScrollXScrollY: js.Any): js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait FloatingMenu extends StObject {
    
    def _changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    
    def _getContainer(): js.Any = js.native
    
    def _getPos(): js.Any = js.native
    
    def _handleKeydown(event: js.Any): Unit = js.native
    
    def _place(): Unit = js.native
    
    def _testStyles(): Unit = js.native
    
    def handleBlur(event: js.Any): Unit = js.native
    
    def release(): Unit = js.native
    
    def shouldStateBeChanged(state: js.Any): Boolean = js.native
  }
  object FloatingMenu {
    
    @scala.inline
    def apply(
      _changeState: (js.Any, js.Any, js.Any) => Unit,
      _getContainer: () => js.Any,
      _getPos: () => js.Any,
      _handleKeydown: js.Any => Unit,
      _place: () => Unit,
      _testStyles: () => Unit,
      handleBlur: js.Any => Unit,
      release: () => Unit,
      shouldStateBeChanged: js.Any => Boolean
    ): FloatingMenu = {
      val __obj = js.Dynamic.literal(_changeState = js.Any.fromFunction3(_changeState), _getContainer = js.Any.fromFunction0(_getContainer), _getPos = js.Any.fromFunction0(_getPos), _handleKeydown = js.Any.fromFunction1(_handleKeydown), _place = js.Any.fromFunction0(_place), _testStyles = js.Any.fromFunction0(_testStyles), handleBlur = js.Any.fromFunction1(handleBlur), release = js.Any.fromFunction0(release), shouldStateBeChanged = js.Any.fromFunction1(shouldStateBeChanged))
      __obj.asInstanceOf[FloatingMenu]
    }
    
    @scala.inline
    implicit class FloatingMenuMutableBuilder[Self <: FloatingMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandleBlur(value: js.Any => Unit): Self = StObject.set(x, "handleBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRelease(value: () => Unit): Self = StObject.set(x, "release", js.Any.fromFunction0(value))
      
      @scala.inline
      def setShouldStateBeChanged(value: js.Any => Boolean): Self = StObject.set(x, "shouldStateBeChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_changeState(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "_changeState", js.Any.fromFunction3(value))
      
      @scala.inline
      def set_getContainer(value: () => js.Any): Self = StObject.set(x, "_getContainer", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_getPos(value: () => js.Any): Self = StObject.set(x, "_getPos", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_handleKeydown(value: js.Any => Unit): Self = StObject.set(x, "_handleKeydown", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_place(value: () => Unit): Self = StObject.set(x, "_place", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_testStyles(value: () => Unit): Self = StObject.set(x, "_testStyles", js.Any.fromFunction0(value))
    }
  }
}
