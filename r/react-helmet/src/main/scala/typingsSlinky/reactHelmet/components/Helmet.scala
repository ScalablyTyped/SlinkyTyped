package typingsSlinky.reactHelmet.components

import typingsSlinky.reactHelmet.mod.HelmetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Helmet {
  @JSImport("react-helmet", "Helmet")
  @js.native
  object component extends js.Object
  
  def withProps(p: HelmetProps): SharedBuilder_HelmetProps_943863553[typingsSlinky.reactHelmet.mod.Helmet] = new SharedBuilder_HelmetProps_943863553[typingsSlinky.reactHelmet.mod.Helmet](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Helmet.type): SharedBuilder_HelmetProps_943863553[typingsSlinky.reactHelmet.mod.Helmet] = new SharedBuilder_HelmetProps_943863553[typingsSlinky.reactHelmet.mod.Helmet](js.Array(this.component, js.Dictionary.empty))()
}

