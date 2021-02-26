package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.antd.baseMod.BlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyParagraphMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Paragraph", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ParagraphProps] = js.native
  
  type ParagraphProps = BlockProps
  
  type _To = ReactComponentClass[ParagraphProps]
  
  /* This means you don't have to write `default`, but can instead just say `typographyParagraphMod.foo` */
  override def _to: ReactComponentClass[ParagraphProps] = default
}
