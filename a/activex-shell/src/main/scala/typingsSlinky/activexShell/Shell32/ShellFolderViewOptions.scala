package typingsSlinky.activexShell.Shell32

import typingsSlinky.activexShell.activexShellNumbers.`0x00000001`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000002`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000008`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000020`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000040`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000080`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000200`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000001`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000002`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000008`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000020`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000040`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000080`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000200`
*/
trait ShellFolderViewOptions extends js.Object
object ShellFolderViewOptions {
  
  /** The **Active Desktop – View as Web Page** option is enabled. */
  @scala.inline
  def SFVVO_DESKTOPHTML: `0x00000200` = 0x00000200.asInstanceOf[`0x00000200`]
  
  /** The **Double-Click to Open an Item** option is enabled. */
  @scala.inline
  def SFVVO_DOUBLECLICKINWEBVIEW: `0x00000080` = 0x00000080.asInstanceOf[`0x00000080`]
  
  /** The **Show All Files** option is enabled. */
  @scala.inline
  def SFVVO_SHOWALLOBJECTS: `0x00000001` = 0x00000001.asInstanceOf[`0x00000001`]
  
  /** The **Display Compressed Files and Folders with Alternate Color** option is enabled. */
  @scala.inline
  def SFVVO_SHOWCOMPCOLOR: `0x00000008` = 0x00000008.asInstanceOf[`0x00000008`]
  
  /** The **Hide extensions for known file types** option is disabled. */
  @scala.inline
  def SFVVO_SHOWEXTENSIONS: `0x00000002` = 0x00000002.asInstanceOf[`0x00000002`]
  
  /** The **Do Not Show Hidden Files** option is enabled. */
  @scala.inline
  def SFVVO_SHOWSYSFILES: `0x00000020` = 0x00000020.asInstanceOf[`0x00000020`]
  
  /** The **Classic Style** option is enabled. */
  @scala.inline
  def SFVVO_WIN95CLASSIC: `0x00000040` = 0x00000040.asInstanceOf[`0x00000040`]
}
