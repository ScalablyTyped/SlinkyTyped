package typingsSlinky.reduxLittleRouter.components

import typingsSlinky.reduxLittleRouter.mod.FragmentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Fragment {
  @JSImport("redux-little-router", "Fragment")
  @js.native
  object component extends js.Object
  
  def withProps(p: FragmentProps): SharedBuilder_FragmentProps514414898[typingsSlinky.reduxLittleRouter.mod.Fragment] = new SharedBuilder_FragmentProps514414898[typingsSlinky.reduxLittleRouter.mod.Fragment](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Fragment.type): SharedBuilder_FragmentProps514414898[typingsSlinky.reduxLittleRouter.mod.Fragment] = new SharedBuilder_FragmentProps514414898[typingsSlinky.reduxLittleRouter.mod.Fragment](js.Array(this.component, js.Dictionary.empty))()
}

