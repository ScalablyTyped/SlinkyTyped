package typingsSlinky.activexShell.Shell32

import typingsSlinky.activexShell.activexShellNumbers.`0x00010`
import typingsSlinky.activexShell.activexShellNumbers.`0x00020`
import typingsSlinky.activexShell.activexShellNumbers.`0x00040`
import typingsSlinky.activexShell.activexShellNumbers.`0x00080`
import typingsSlinky.activexShell.activexShellNumbers.`0x00200`
import typingsSlinky.activexShell.activexShellNumbers.`0x00400`
import typingsSlinky.activexShell.activexShellNumbers.`0x00800`
import typingsSlinky.activexShell.activexShellNumbers.`0x01000`
import typingsSlinky.activexShell.activexShellNumbers.`0x02000`
import typingsSlinky.activexShell.activexShellNumbers.`0x04000`
import typingsSlinky.activexShell.activexShellNumbers.`0x08000`
import typingsSlinky.activexShell.activexShellNumbers.`0x10000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexShell.activexShellNumbers.`0x00010`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00020`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00040`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00080`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00200`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00400`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00800`
  - typingsSlinky.activexShell.activexShellNumbers.`0x01000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x02000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x04000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x08000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x10000`
*/
trait ShellFolderEnumerationFlags extends js.Object
object ShellFolderEnumerationFlags {
  
  /** **Windows 7 and later** The calling application is checking for the existence of child items in the folder. */
  @scala.inline
  def SHCONTF_CHECKING_FOR_CHILDREN: `0x00010` = 0x00010.asInstanceOf[`0x00010`]
  
  /**
    * **Windows Vista and later**. The calling application is monitoring for change notifications.This means that the enumerator does not have to return all results.
    * Items can be reported through change notifications.
    */
  @scala.inline
  def SHCONTF_ENABLE_ASYNC: `0x08000` = 0x08000.asInstanceOf[`0x08000`]
  
  /** **Windows Vista and later**. The calling application is looking for resources that can be enumerated quickly. */
  @scala.inline
  def SHCONTF_FASTITEMS: `0x02000` = 0x02000.asInstanceOf[`0x02000`]
  
  /** **Windows Vista and later**. Enumerate items as a simple list even if the folder itself is not structured in that way. */
  @scala.inline
  def SHCONTF_FLATLIST: `0x04000` = 0x04000.asInstanceOf[`0x04000`]
  
  /** Include items that are folders in the enumeration. */
  @scala.inline
  def SHCONTF_FOLDERS: `0x00020` = 0x00020.asInstanceOf[`0x00020`]
  
  /** Include hidden items in the enumeration. This does not include hidden system items. (To include hidden system items, use SHCONTF_INCLUDESUPERHIDDEN.) */
  @scala.inline
  def SHCONTF_INCLUDEHIDDEN: `0x00080` = 0x00080.asInstanceOf[`0x00080`]
  
  /**
    * **Windows 7 and later**. Include hidden system items in the enumeration. This value does not include hidden non-system items.
    * (To include hidden non-system items, use SHCONTF_INCLUDEHIDDEN.)
    */
  @scala.inline
  def SHCONTF_INCLUDESUPERHIDDEN: `0x10000` = 0x10000.asInstanceOf[`0x10000`]
  
  /** **Windows 7 and later**. Child folders should provide a navigation enumeration. */
  @scala.inline
  def SHCONTF_NAVIGATION_ENUM: `0x01000` = 0x01000.asInstanceOf[`0x01000`]
  
  /** The calling application is looking for printer objects. */
  @scala.inline
  def SHCONTF_NETPRINTERSRCH: `0x00200` = 0x00200.asInstanceOf[`0x00200`]
  
  /** Include items that are not folders in the enumeration. */
  @scala.inline
  def SHCONTF_NONFOLDERS: `0x00040` = 0x00040.asInstanceOf[`0x00040`]
  
  /** The calling application is looking for resources that can be shared. */
  @scala.inline
  def SHCONTF_SHAREABLE: `0x00400` = 0x00400.asInstanceOf[`0x00400`]
  
  /** Include items with accessible storage and their ancestors, including hidden items. */
  @scala.inline
  def SHCONTF_STORAGE: `0x00800` = 0x00800.asInstanceOf[`0x00800`]
}
