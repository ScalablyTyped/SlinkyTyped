package typingsSlinky.reactRange

import slinky.core.facade.ReactElement
import typingsSlinky.reactRange.typesMod.IMarkProps
import typingsSlinky.reactRange.typesMod.IThumbProps
import typingsSlinky.reactRange.typesMod.ITrackProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Children extends StObject {
    
    var children: ReactElement = js.native
    
    var disabled: Boolean = js.native
    
    var isDragged: Boolean = js.native
    
    var props: ITrackProps = js.native
  }
  object Children {
    
    @scala.inline
    def apply(disabled: Boolean, isDragged: Boolean, props: ITrackProps): Children = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: ITrackProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DraggedThumbIndex extends StObject {
    
    var draggedThumbIndex: Double = js.native
    
    var draggedTrackPos: js.Array[Double] = js.native
    
    var isChanged: Boolean = js.native
    
    var markOffsets: js.Array[scala.Nothing] = js.native
    
    var thumbZIndexes: js.Array[Double] = js.native
  }
  object DraggedThumbIndex {
    
    @scala.inline
    def apply(
      draggedThumbIndex: Double,
      draggedTrackPos: js.Array[Double],
      isChanged: Boolean,
      markOffsets: js.Array[scala.Nothing],
      thumbZIndexes: js.Array[Double]
    ): DraggedThumbIndex = {
      val __obj = js.Dynamic.literal(draggedThumbIndex = draggedThumbIndex.asInstanceOf[js.Any], draggedTrackPos = draggedTrackPos.asInstanceOf[js.Any], isChanged = isChanged.asInstanceOf[js.Any], markOffsets = markOffsets.asInstanceOf[js.Any], thumbZIndexes = thumbZIndexes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggedThumbIndex]
    }
    
    @scala.inline
    implicit class DraggedThumbIndexMutableBuilder[Self <: DraggedThumbIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraggedThumbIndex(value: Double): Self = StObject.set(x, "draggedThumbIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedTrackPos(value: js.Array[Double]): Self = StObject.set(x, "draggedTrackPos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggedTrackPosVarargs(value: Double*): Self = StObject.set(x, "draggedTrackPos", js.Array(value :_*))
      
      @scala.inline
      def setIsChanged(value: Boolean): Self = StObject.set(x, "isChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkOffsets(value: js.Array[scala.Nothing]): Self = StObject.set(x, "markOffsets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkOffsetsVarargs(value: scala.Nothing*): Self = StObject.set(x, "markOffsets", js.Array(value :_*))
      
      @scala.inline
      def setThumbZIndexes(value: js.Array[Double]): Self = StObject.set(x, "thumbZIndexes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbZIndexesVarargs(value: Double*): Self = StObject.set(x, "thumbZIndexes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: Double = js.native
    
    var props: IMarkProps = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, props: IMarkProps): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: IMarkProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IsDragged extends StObject {
    
    var index: Double = js.native
    
    var isDragged: Boolean = js.native
    
    var props: IThumbProps = js.native
    
    var value: Double = js.native
  }
  object IsDragged {
    
    @scala.inline
    def apply(index: Double, isDragged: Boolean, props: IThumbProps, value: Double): IsDragged = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDragged = isDragged.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsDragged]
    }
    
    @scala.inline
    implicit class IsDraggedMutableBuilder[Self <: IsDragged] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDragged(value: Boolean): Self = StObject.set(x, "isDragged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: IThumbProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
