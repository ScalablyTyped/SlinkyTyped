package typingsSlinky.kolite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// when not AMD, add to ko object
@js.native
trait KnockoutStatic extends StObject {
  
  def DirtyFlag(): DirtyFlagResult = js.native
  @JSName("DirtyFlag")
  var DirtyFlag_Original: DirtyFlag = js.native
  
  def asyncCommand(options: KoLiteCommandOptions): KoliteAsyncCommand = js.native
  
  def command(options: KoLiteCommandOptions): KoliteCommand = js.native
}
