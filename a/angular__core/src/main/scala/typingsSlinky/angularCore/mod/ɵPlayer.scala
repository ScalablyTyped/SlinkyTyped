package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ɵPlayer extends StObject {
  
  def addEventListener(state: String, cb: js.Function1[/* data */ js.UndefOr[js.Any], _]): Unit = js.native
  def addEventListener(state: ɵPlayState, cb: js.Function1[/* data */ js.UndefOr[js.Any], _]): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def finish(): Unit = js.native
  
  var parent: js.UndefOr[ɵPlayer | Null] = js.native
  
  def pause(): Unit = js.native
  
  def play(): Unit = js.native
  
  var state: ɵPlayState = js.native
}
