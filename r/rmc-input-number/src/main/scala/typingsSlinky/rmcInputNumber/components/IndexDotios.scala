package typingsSlinky.rmcInputNumber.components

import typingsSlinky.rmcInputNumber.indexIosMod.PropsType
import typingsSlinky.rmcInputNumber.indexIosMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IndexDotios {
  @JSImport("rmc-input-number/lib/index.ios", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsType): SharedBuilder_PropsType_990310604[default] = new SharedBuilder_PropsType_990310604[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IndexDotios.type): SharedBuilder_PropsType_990310604[default] = new SharedBuilder_PropsType_990310604[default](js.Array(this.component, js.Dictionary.empty))()
}

