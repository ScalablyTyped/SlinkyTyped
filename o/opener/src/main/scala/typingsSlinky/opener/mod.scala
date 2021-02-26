package typingsSlinky.opener

import typingsSlinky.node.childProcessMod.ChildProcess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("opener", JSImport.Namespace)
  @js.native
  def apply(args: String): ChildProcess = js.native
  @JSImport("opener", JSImport.Namespace)
  @js.native
  def apply(args: String, options: js.UndefOr[scala.Nothing], callback: Callback): ChildProcess = js.native
  @JSImport("opener", JSImport.Namespace)
  @js.native
  def apply(args: String, options: js.Object): ChildProcess = js.native
  @JSImport("opener", JSImport.Namespace)
  @js.native
  def apply(args: String, options: js.Object, callback: Callback): ChildProcess = js.native
  @JSImport("opener", JSImport.Namespace)
  @js.native
  def apply(args: js.Array[String]): ChildProcess = js.native
  @JSImport("opener", JSImport.Namespace)
  @js.native
  def apply(args: js.Array[String], options: js.UndefOr[scala.Nothing], callback: Callback): ChildProcess = js.native
  @JSImport("opener", JSImport.Namespace)
  @js.native
  def apply(args: js.Array[String], options: js.Object): ChildProcess = js.native
  @JSImport("opener", JSImport.Namespace)
  @js.native
  def apply(args: js.Array[String], options: js.Object, callback: Callback): ChildProcess = js.native
  
  type Callback = js.Function3[/* error */ js.Error, /* stdout */ String, /* stderr */ String, Unit]
}
