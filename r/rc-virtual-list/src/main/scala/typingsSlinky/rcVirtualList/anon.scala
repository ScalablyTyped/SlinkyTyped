package typingsSlinky.rcVirtualList

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.rcVirtualList.listMod.ListRef
import typingsSlinky.rcVirtualList.listMod.ScrollAlign
import typingsSlinky.rcVirtualList.listMod.ScrollConfig
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Align extends ScrollConfig {
    
    var align: js.UndefOr[ScrollAlign] = js.native
    
    var index: Double = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object Align {
    
    @scala.inline
    def apply(index: Double): Align = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: ScrollAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var ref: js.UndefOr[Ref[ListRef]] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[ListRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ ListRef | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[ListRef]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: Double = js.native
    
    var multiple: Boolean = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, multiple: Boolean): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends ScrollConfig {
    
    var align: js.UndefOr[ScrollAlign] = js.native
    
    var key: typingsSlinky.react.mod.Key = js.native
    
    var offset: js.UndefOr[Double] = js.native
  }
  object Key {
    
    @scala.inline
    def apply(key: typingsSlinky.react.mod.Key): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: ScrollAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setKey(value: typingsSlinky.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
