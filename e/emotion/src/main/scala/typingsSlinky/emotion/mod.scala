package typingsSlinky.emotion

import typingsSlinky.createEmotion.mod.ClassNameArg
import typingsSlinky.createEmotion.mod.Interpolation
import typingsSlinky.createEmotion.mod.StyleSheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("emotion", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val cache: /* import warning: importer.ImportType#apply Failed type conversion: create-emotion.create-emotion.Emotion['cache'] */ js.Any = js.native
  
  val css: js.Function1[/* repeated */ Interpolation, String] = js.native
  
  val cx: js.Function1[/* repeated */ ClassNameArg, String] = js.native
  
  val flush: js.Function0[Unit] = js.native
  
  val getRegisteredStyles: js.Function2[/* registeredStyles */ js.Array[String], /* classNames */ String, String] = js.native
  
  val hydrate: js.Function1[/* ids */ js.Array[String], Unit] = js.native
  
  val injectGlobal: js.Function1[/* repeated */ Interpolation, Unit] = js.native
  
  val keyframes: js.Function1[/* repeated */ Interpolation, String] = js.native
  
  val sheet: StyleSheet = js.native
  
  @js.native
  object merge extends js.Object {
    
    def apply(className: String): String = js.native
    def apply(className: String, sourceMap: String): String = js.native
  }
}
