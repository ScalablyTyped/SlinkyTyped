package typingsSlinky.leafletDraw

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def drawLocal: typingsSlinky.leafletDraw.mod.Localization.DrawLocal = typingsSlinky.leafletDraw.mod.^.asInstanceOf[js.Dynamic].selectDynamic("drawLocal").asInstanceOf[typingsSlinky.leafletDraw.mod.Localization.DrawLocal]
  
  @scala.inline
  def drawVersion: java.lang.String = typingsSlinky.leafletDraw.mod.^.asInstanceOf[js.Dynamic].selectDynamic("drawVersion").asInstanceOf[java.lang.String]
  
  @scala.inline
  def map(
    element: java.lang.String | org.scalajs.dom.raw.HTMLElement,
    options: js.UndefOr[typingsSlinky.leafletDraw.mod.MapOptions]
  ): typingsSlinky.leafletDraw.mod.DrawMap = (typingsSlinky.leafletDraw.mod.^.asInstanceOf[js.Dynamic].applyDynamic("map")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.leafletDraw.mod.DrawMap]
}
