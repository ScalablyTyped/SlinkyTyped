package typingsSlinky.cathoQuantum

import slinky.core.ReactComponentClass
import typingsSlinky.cathoQuantum.anon.`13`
import typingsSlinky.cathoQuantum.anon.`1`
import typingsSlinky.cathoQuantum.cathoQuantumStrings.button
import typingsSlinky.cathoQuantum.cathoQuantumStrings.circle
import typingsSlinky.cathoQuantum.cathoQuantumStrings.large
import typingsSlinky.cathoQuantum.cathoQuantumStrings.medium
import typingsSlinky.cathoQuantum.cathoQuantumStrings.rect
import typingsSlinky.cathoQuantum.cathoQuantumStrings.small
import typingsSlinky.cathoQuantum.cathoQuantumStrings.tag
import typingsSlinky.cathoQuantum.cathoQuantumStrings.text
import typingsSlinky.cathoQuantum.cathoQuantumStrings.xsmall
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  @JSImport("@catho/quantum/Skeleton", JSImport.Default)
  @js.native
  class default ()
    extends Component[SkeletonProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("@catho/quantum/Skeleton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@catho/quantum/Skeleton", "default.Button")
    @js.native
    def Button: SkeletonButton = js.native
    @scala.inline
    def Button_=(x: SkeletonButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Skeleton", "default.Circle")
    @js.native
    def Circle: SkeletonCircle = js.native
    @scala.inline
    def Circle_=(x: SkeletonCircle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Circle")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Skeleton", "default.Tag")
    @js.native
    def Tag: SkeletonTag = js.native
    @scala.inline
    def Tag_=(x: SkeletonTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Tag")(x.asInstanceOf[js.Any])
    
    @JSImport("@catho/quantum/Skeleton", "default.Text")
    @js.native
    def Text: SkeletonText = js.native
    @scala.inline
    def Text_=(x: SkeletonText): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Text")(x.asInstanceOf[js.Any])
  }
  
  type Skeleton = ReactComponentClass[SkeletonProps]
  
  type SkeletonButton = ReactComponentClass[SkeletonButtonProps]
  
  @js.native
  trait SkeletonButtonProps extends StObject {
    
    var size: xsmall | small | medium | large = js.native
    
    var theme: `1` = js.native
  }
  object SkeletonButtonProps {
    
    @scala.inline
    def apply(size: xsmall | small | medium | large, theme: `1`): SkeletonButtonProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonButtonProps]
    }
    
    @scala.inline
    implicit class SkeletonButtonPropsMutableBuilder[Self <: SkeletonButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: `1`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type SkeletonCircle = ReactComponentClass[js.Object]
  
  @js.native
  trait SkeletonProps extends StObject {
    
    var height: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[xsmall | small | medium | large] = js.native
    
    var theme: js.UndefOr[`13`] = js.native
    
    var `type`: js.UndefOr[rect | circle | text | button | tag] = js.native
    
    var width: js.UndefOr[String] = js.native
  }
  object SkeletonProps {
    
    @scala.inline
    def apply(): SkeletonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonProps]
    }
    
    @scala.inline
    implicit class SkeletonPropsMutableBuilder[Self <: SkeletonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTheme(value: `13`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: rect | circle | text | button | tag): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type SkeletonTag = ReactComponentClass[SkeletonTagProps]
  
  @js.native
  trait SkeletonTagProps extends StObject {
    
    var size: xsmall | small | medium | large = js.native
    
    var theme: `13` = js.native
  }
  object SkeletonTagProps {
    
    @scala.inline
    def apply(size: xsmall | small | medium | large, theme: `13`): SkeletonTagProps = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonTagProps]
    }
    
    @scala.inline
    implicit class SkeletonTagPropsMutableBuilder[Self <: SkeletonTagProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: xsmall | small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: `13`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type SkeletonText = ReactComponentClass[js.Object]
}
