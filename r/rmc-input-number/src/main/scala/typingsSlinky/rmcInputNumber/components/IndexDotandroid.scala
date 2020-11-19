package typingsSlinky.rmcInputNumber.components

import typingsSlinky.rmcInputNumber.indexAndroidMod.default
import typingsSlinky.rmcInputNumber.indexIosMod.PropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IndexDotandroid {
  
  @JSImport("rmc-input-number/lib/index.android", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsType): SharedBuilder_PropsType_990310604[default] = new SharedBuilder_PropsType_990310604[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: IndexDotandroid.type): SharedBuilder_PropsType_990310604[default] = new SharedBuilder_PropsType_990310604[default](js.Array(this.component, js.Dictionary.empty))()
}
