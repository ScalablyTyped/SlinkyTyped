package typingsSlinky.playable

import typingsSlinky.playable.anon.After
import typingsSlinky.playable.anon.BackgroundColor
import typingsSlinky.playable.anon.Fill
import typingsSlinky.playable.anon.Stroke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object volumeThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume.theme", "default.volumeProgress")
    @js.native
    def volumeProgress: After = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume.theme", "default.volumeProgressBackground")
    @js.native
    def volumeProgressBackground: BackgroundColor = js.native
    @scala.inline
    def volumeProgressBackground_=(x: BackgroundColor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volumeProgressBackground")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def volumeProgress_=(x: After): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volumeProgress")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume.theme", "default.volumeSvgFill")
    @js.native
    def volumeSvgFill: Fill = js.native
    @scala.inline
    def volumeSvgFill_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volumeSvgFill")(x.asInstanceOf[js.Any])
    
    @JSImport("playable/dist/src/modules/ui/controls/volume/volume.theme", "default.volumeSvgStroke")
    @js.native
    def volumeSvgStroke: Stroke = js.native
    @scala.inline
    def volumeSvgStroke_=(x: Stroke): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("volumeSvgStroke")(x.asInstanceOf[js.Any])
  }
}
