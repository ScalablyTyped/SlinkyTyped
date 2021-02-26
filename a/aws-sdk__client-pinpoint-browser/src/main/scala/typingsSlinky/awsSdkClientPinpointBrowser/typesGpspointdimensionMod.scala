package typingsSlinky.awsSdkClientPinpointBrowser

import typingsSlinky.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.GPSCoordinates
import typingsSlinky.awsSdkClientPinpointBrowser.typesGpscoordinatesMod.UnmarshalledGPSCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesGpspointdimensionMod {
  
  @js.native
  trait GPSPointDimension extends StObject {
    
    /**
      * Coordinate to measure distance from.
      */
    var Coordinates: js.UndefOr[GPSCoordinates] = js.native
    
    /**
      * Range in kilometers from the coordinate.
      */
    var RangeInKilometers: js.UndefOr[Double] = js.native
  }
  object GPSPointDimension {
    
    @scala.inline
    def apply(): GPSPointDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GPSPointDimension]
    }
    
    @scala.inline
    implicit class GPSPointDimensionMutableBuilder[Self <: GPSPointDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: GPSCoordinates): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesUndefined: Self = StObject.set(x, "Coordinates", js.undefined)
      
      @scala.inline
      def setRangeInKilometers(value: Double): Self = StObject.set(x, "RangeInKilometers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeInKilometersUndefined: Self = StObject.set(x, "RangeInKilometers", js.undefined)
    }
  }
  
  @js.native
  trait UnmarshalledGPSPointDimension extends GPSPointDimension {
    
    /**
      * Coordinate to measure distance from.
      */
    @JSName("Coordinates")
    var Coordinates_UnmarshalledGPSPointDimension: js.UndefOr[UnmarshalledGPSCoordinates] = js.native
  }
  object UnmarshalledGPSPointDimension {
    
    @scala.inline
    def apply(): UnmarshalledGPSPointDimension = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledGPSPointDimension]
    }
    
    @scala.inline
    implicit class UnmarshalledGPSPointDimensionMutableBuilder[Self <: UnmarshalledGPSPointDimension] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: UnmarshalledGPSCoordinates): Self = StObject.set(x, "Coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesUndefined: Self = StObject.set(x, "Coordinates", js.undefined)
    }
  }
}
