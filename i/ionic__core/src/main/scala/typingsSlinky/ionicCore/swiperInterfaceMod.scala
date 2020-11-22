package typingsSlinky.ionicCore

import typingsSlinky.swiper.mod.SelectableElement
import typingsSlinky.swiper.mod.SwiperModule
import typingsSlinky.swiper.mod.SwiperOptions
import typingsSlinky.swiper.swiperEsmMod.Swiper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/slides/swiper/swiper-interface", JSImport.Namespace)
@js.native
object swiperInterfaceMod extends js.Object {
  
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
  @js.native
  object SwiperInterface extends js.Object {
    
    /**
      * Installs modules on Swiper in runtime.
      */
    def use(modules: js.Array[SwiperModule]): Unit = js.native
  }
}
