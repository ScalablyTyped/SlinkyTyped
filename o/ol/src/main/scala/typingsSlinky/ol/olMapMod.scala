package typingsSlinky.ol

import typingsSlinky.ol.pluggableMapMod.MapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object olMapMod {
  
  @JSImport("ol/Map", JSImport.Default)
  @js.native
  class default protected () extends Map {
    def this(options: MapOptions) = this()
  }
  
  @js.native
  trait Map
    extends typingsSlinky.ol.pluggableMapMod.default
}
