package typingsSlinky.grommet.components

import typingsSlinky.grommet.boxMod.BoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Main {
  
  @JSImport("grommet/es6", "Main")
  @js.native
  object component extends js.Object
  
  def withProps(p: BoxProps): SharedBuilder_BoxProps_991765222 = new SharedBuilder_BoxProps_991765222(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Main.type): SharedBuilder_BoxProps_991765222 = new SharedBuilder_BoxProps_991765222(js.Array(this.component, js.Dictionary.empty))()
}
