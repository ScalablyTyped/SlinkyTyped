package typingsSlinky.ionicCore

import typingsSlinky.swiper.mod.SelectableElement
import typingsSlinky.swiper.mod.SwiperModule
import typingsSlinky.swiper.mod.SwiperOptions
import typingsSlinky.swiper.swiperEsmMod.Swiper
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swiperInterfaceMod {
  
  @JSImport("@ionic/core/dist/types/components/slides/swiper/swiper-interface", "SwiperInterface")
  @js.native
  class SwiperInterface protected () extends Swiper {
    /**
      * Constructs a new Swiper instance.
      *
      * @param container Where Swiper applies to.
      * @param options   Instance options.
      */
    def this(container: SelectableElement) = this()
    def this(container: SelectableElement, options: SwiperOptions) = this()
  }
  /* static members */
  object SwiperInterface {
    
    /**
      * Installs modules on Swiper in runtime.
      */
    @JSImport("@ionic/core/dist/types/components/slides/swiper/swiper-interface", "SwiperInterface.use")
    @js.native
    def use(modules: js.Array[SwiperModule]): Unit = js.native
  }
}
