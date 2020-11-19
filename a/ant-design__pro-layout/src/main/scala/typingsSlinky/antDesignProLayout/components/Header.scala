package typingsSlinky.antDesignProLayout.components

import typingsSlinky.antDesignProLayout.headerMod.HeaderViewProps
import typingsSlinky.antDesignProLayout.headerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("@ant-design/pro-layout/lib/Header", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: HeaderViewProps): SharedBuilder_HeaderViewProps_1284827889[default] = new SharedBuilder_HeaderViewProps_1284827889[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Header.type): SharedBuilder_HeaderViewProps_1284827889[default] = new SharedBuilder_HeaderViewProps_1284827889[default](js.Array(this.component, js.Dictionary.empty))()
}
