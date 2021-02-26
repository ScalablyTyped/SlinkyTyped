package typingsSlinky.antd.components

import typingsSlinky.antd.typographyTitleMod.TitleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Title {
  
  @JSImport("antd/lib/typography/Title", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Title.type): SharedBuilder_TitleProps500649929 = new SharedBuilder_TitleProps500649929(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TitleProps): SharedBuilder_TitleProps500649929 = new SharedBuilder_TitleProps500649929(js.Array(this.component, p.asInstanceOf[js.Any]))
}
