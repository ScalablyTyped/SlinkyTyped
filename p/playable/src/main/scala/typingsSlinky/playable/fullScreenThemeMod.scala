package typingsSlinky.playable

import typingsSlinky.playable.anon.Fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fullScreenThemeMod {
  
  object default {
    
    @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen.theme", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("playable/dist/src/modules/ui/controls/full-screen/full-screen.theme", "default.fullScreenSvgFill")
    @js.native
    def fullScreenSvgFill: Fill = js.native
    @scala.inline
    def fullScreenSvgFill_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fullScreenSvgFill")(x.asInstanceOf[js.Any])
  }
}
