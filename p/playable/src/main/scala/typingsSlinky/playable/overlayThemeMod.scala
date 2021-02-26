package typingsSlinky.playable

import typingsSlinky.playable.anon.Fill
import typingsSlinky.playable.anon.Stroke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overlayThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/overlay/overlay.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/overlay/overlay.theme", "default.overlayPlaySvgFill")
    @js.native
    def overlayPlaySvgFill: Fill = js.native
    @scala.inline
    def overlayPlaySvgFill_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overlayPlaySvgFill")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/overlay/overlay.theme", "default.overlayPlaySvgStroke")
    @js.native
    def overlayPlaySvgStroke: Stroke = js.native
    @scala.inline
    def overlayPlaySvgStroke_=(x: Stroke): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overlayPlaySvgStroke")(x.asInstanceOf[js.Any])
  }
}
