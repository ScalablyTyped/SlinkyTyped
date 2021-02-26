package typingsSlinky.reactFns

import slinky.core.ReactComponentClass
import typingsSlinky.reactFns.geoPositionGeoPositionMod.GeoPositionProps
import typingsSlinky.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geoPositionMod {
  
  @JSImport("react-fns/dist/GeoPosition", "GeoPosition")
  @js.native
  class GeoPosition protected ()
    extends typingsSlinky.reactFns.geoPositionGeoPositionMod.GeoPosition {
    def this(props: SharedRenderProps[GeoPositionProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[GeoPositionProps], context: js.Any) = this()
  }
  
  @JSImport("react-fns/dist/GeoPosition", "withGeoPosition")
  @js.native
  def withGeoPosition[Props](Component: ReactComponentClass[Props with GeoPositionProps]): ReactComponentClass[Props] = js.native
}
