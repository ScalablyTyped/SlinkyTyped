package typingsSlinky.reactHelmet.components

import typingsSlinky.reactHelmet.mod.HelmetProps
import typingsSlinky.reactHelmet.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactHelmet {
  
  @JSImport("react-helmet", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: HelmetProps): SharedBuilder_HelmetProps_943863553[default] = new SharedBuilder_HelmetProps_943863553[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactHelmet.type): SharedBuilder_HelmetProps_943863553[default] = new SharedBuilder_HelmetProps_943863553[default](js.Array(this.component, js.Dictionary.empty))()
}
