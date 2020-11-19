package typingsSlinky.activexShell.Shell32

import typingsSlinky.activexShdocvw.SHDocVw.InternetExplorer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShellWindows extends js.Object {
  
  /** Contains the number of items in the collection. */
  val Count: Double = js.native
  
  /**
    * Retrieves an InternetExplorer object that represents the Shell window.
    * @param index Default is 0
    */
  def Item(): InternetExplorer = js.native
  def Item(index: Double): InternetExplorer = js.native
  
  @JSName("Shell32.ShellWindows_typekey")
  var Shell32DotShellWindows_typekey: ShellWindows = js.native
}
