package typingsSlinky.antd

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.rcImage.imageMod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod extends Shortcut {
  
  @JSImport("antd/lib/image", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ImageProps] = js.native
  
  type _To = ReactComponentClass[ImageProps]
  
  /* This means you don't have to write `default`, but can instead just say `imageMod.foo` */
  override def _to: ReactComponentClass[ImageProps] = default
}
