package typingsSlinky.gulpTap

import typingsSlinky.node.NodeJS.ReadWriteStream
import typingsSlinky.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gulp-tap", JSImport.Namespace)
  @js.native
  def apply(tapFunction: js.Function2[/* file */ File, /* t */ js.UndefOr[js.Object], Unit]): ReadWriteStream = js.native
  
  type Tap = js.Function2[/* tapFunction */ TapFunction, /* t */ js.UndefOr[js.Any], ReadWriteStream]
  
  type TapFunction = js.Function1[/* file */ File, js.Any]
}
