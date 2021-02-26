package typingsSlinky.jimpPluginCrop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CropOnlyFrames extends StObject {
    
    var cropOnlyFrames: js.UndefOr[Boolean] = js.native
    
    var cropSymmetric: js.UndefOr[Boolean] = js.native
    
    var ignoreSides: js.UndefOr[East] = js.native
    
    var leaveBorder: js.UndefOr[Double] = js.native
    
    var tolerance: js.UndefOr[Double] = js.native
  }
  object CropOnlyFrames {
    
    @scala.inline
    def apply(): CropOnlyFrames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropOnlyFrames]
    }
    
    @scala.inline
    implicit class CropOnlyFramesMutableBuilder[Self <: CropOnlyFrames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCropOnlyFrames(value: Boolean): Self = StObject.set(x, "cropOnlyFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropOnlyFramesUndefined: Self = StObject.set(x, "cropOnlyFrames", js.undefined)
      
      @scala.inline
      def setCropSymmetric(value: Boolean): Self = StObject.set(x, "cropSymmetric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropSymmetricUndefined: Self = StObject.set(x, "cropSymmetric", js.undefined)
      
      @scala.inline
      def setIgnoreSides(value: East): Self = StObject.set(x, "ignoreSides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSidesUndefined: Self = StObject.set(x, "ignoreSides", js.undefined)
      
      @scala.inline
      def setLeaveBorder(value: Double): Self = StObject.set(x, "leaveBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveBorderUndefined: Self = StObject.set(x, "leaveBorder", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  @js.native
  trait East extends StObject {
    
    var east: Boolean = js.native
    
    var north: Boolean = js.native
    
    var south: Boolean = js.native
    
    var west: Boolean = js.native
  }
  object East {
    
    @scala.inline
    def apply(east: Boolean, north: Boolean, south: Boolean, west: Boolean): East = {
      val __obj = js.Dynamic.literal(east = east.asInstanceOf[js.Any], north = north.asInstanceOf[js.Any], south = south.asInstanceOf[js.Any], west = west.asInstanceOf[js.Any])
      __obj.asInstanceOf[East]
    }
    
    @scala.inline
    implicit class EastMutableBuilder[Self <: East] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEast(value: Boolean): Self = StObject.set(x, "east", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNorth(value: Boolean): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSouth(value: Boolean): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWest(value: Boolean): Self = StObject.set(x, "west", value.asInstanceOf[js.Any])
    }
  }
}
