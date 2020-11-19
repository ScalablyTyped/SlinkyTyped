package typingsSlinky.activexShell.Shell32

import typingsSlinky.activexShell.activexShellNumbers.`0x00000001`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000002`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000004`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000008`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000010`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000020`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000080`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000100`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000200`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000400`
import typingsSlinky.activexShell.activexShellNumbers.`0x00000800`
import typingsSlinky.activexShell.activexShellNumbers.`0x00001000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00002000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00004000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00008000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00010000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00020000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00040000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00080000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00100000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00200000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00400000`
import typingsSlinky.activexShell.activexShellNumbers.`0x00800000`
import typingsSlinky.activexShell.activexShellNumbers.`0x01000000`
import typingsSlinky.activexShell.activexShellNumbers.`0x02000000`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line no-const-enum
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexShell.activexShellNumbers.`0x00800000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000200`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000800`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000080`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00010000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000004`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00004000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x01000000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00001000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00008000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00100000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00080000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000001`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000100`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000008`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000002`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00002000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00400000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00040000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000020`
  - typingsSlinky.activexShell.activexShellNumbers.`0x02000000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000010`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00200000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00020000`
  - typingsSlinky.activexShell.activexShellNumbers.`0x00000400`
*/
trait SettingKey extends js.Object
object SettingKey {
  
  /**
    * The state of the **Use check boxes to select items** option. This option is enabled automatically when the system has a pen input device configured.
    *
    * _Windows Vista and later_
    */
  @scala.inline
  def SSF_AUTOCHECKSELECT: `0x00800000` = 0x00800000.asInstanceOf[`0x00800000`]
  
  /** Not used. */
  @scala.inline
  def SSF_DESKTOPHTML: `0x00000200` = 0x00000200.asInstanceOf[`0x00000200`]
  
  /** The state of the **Allow all uppercase names** option. As of Windows Vista, this folder option is no longer available. */
  @scala.inline
  def SSF_DONTPRETTYPATH: `0x00000800` = 0x00000800.asInstanceOf[`0x00000800`]
  
  /** The state of the **Double-click to open an item (single-click to select)** option. */
  @scala.inline
  def SSF_DOUBLECLICKINWEBVIEW: `0x00000080` = 0x00000080.asInstanceOf[`0x00000080`]
  
  /** Not used. */
  @scala.inline
  def SSF_FILTER: `0x00010000` = 0x00010000.asInstanceOf[`0x00010000`]
  
  /** Not used. */
  @scala.inline
  def SSF_HIDDENFILEEXTS: `0x00000004` = 0x00000004.asInstanceOf[`0x00000004`]
  
  /** The state of icon display in the Windows Explorer list view. If this option is active, no icons are displayed in the list view. */
  @scala.inline
  def SSF_HIDEICONS: `0x00004000` = 0x00004000.asInstanceOf[`0x00004000`]
  
  /**
    * The state of display name display in the Windows Explorer list view. If this option is active, icons are displayed in the list view, but display names are not.
    *
    * _Windows Vista and later_
    */
  @scala.inline
  def SSF_ICONSONLY: `0x01000000` = 0x01000000.asInstanceOf[`0x01000000`]
  
  /** The state of the **Show map network drive button in toolbar** option. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_MAPNETDRVBUTTON: `0x00001000` = 0x00001000.asInstanceOf[`0x00001000`]
  
  /** The state of the Recycle Bin's **Display delete confirmation dialog** option. */
  @scala.inline
  def SSF_NOCONFIRMRECYCLE: `0x00008000` = 0x00008000.asInstanceOf[`0x00008000`]
  
  /** The state of the **Automatically search for network folders and printers** option. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_NONETCRAWLING: `0x00100000` = 0x00100000.asInstanceOf[`0x00100000`]
  
  /** The state of the **Launch folder windows in a separate process** option. */
  @scala.inline
  def SSF_SEPPROCESS: `0x00080000` = 0x00080000.asInstanceOf[`0x00080000`]
  
  /** Not used. */
  @scala.inline
  def SSF_SERVERADMINUI: `0x00000004` = 0x00000004.asInstanceOf[`0x00000004`]
  
  /** The state of the **Hidden files and folders** option. */
  @scala.inline
  def SSF_SHOWALLOBJECTS: `0x00000001` = 0x00000001.asInstanceOf[`0x00000001`]
  
  /** The state of the **Show File Attributes in Detail View** option. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_SHOWATTRIBCOL: `0x00000100` = 0x00000100.asInstanceOf[`0x00000100`]
  
  /** The state of the **Show encrypted or compressed NTFS files in color** option. */
  @scala.inline
  def SSF_SHOWCOMPCOLOR: `0x00000008` = 0x00000008.asInstanceOf[`0x00000008`]
  
  /** The state of the **Hide extensions for known file types** option. */
  @scala.inline
  def SSF_SHOWEXTENSIONS: `0x00000002` = 0x00000002.asInstanceOf[`0x00000002`]
  
  /** The state of the **Show pop-up description for folder and desktop items** option. */
  @scala.inline
  def SSF_SHOWINFOTIP: `0x00002000` = 0x00002000.asInstanceOf[`0x00002000`]
  
  /** Not used. */
  @scala.inline
  def SSF_SHOWSTARTPAGE: `0x00400000` = 0x00400000.asInstanceOf[`0x00400000`]
  
  /** The state of the **Hide protected operating system files** option. */
  @scala.inline
  def SSF_SHOWSUPERHIDDEN: `0x00040000` = 0x00040000.asInstanceOf[`0x00040000`]
  
  /**
    * The state of the **Hidden files and folders** option. In Windows Vista and later, this is equivalent to `SSF_SHOWALLOBJECTS`. In versions of Windows before Windows Vista, this value
    * referred to the state of the **Do not show hidden files and folders** option.
    */
  @scala.inline
  def SSF_SHOWSYSFILES: `0x00000020` = 0x00000020.asInstanceOf[`0x00000020`]
  
  /**
    * The state of the **Display file icon on thumbnails** option. If this option is active, a file type overlay is applied when a file supplies a thumbnail representation.
    *
    * _Windows Vista and later_
    */
  @scala.inline
  def SSF_SHOWTYPEOVERLAY: `0x02000000` = 0x02000000.asInstanceOf[`0x02000000`]
  
  /** Not used. */
  @scala.inline
  def SSF_SORTCOLUMNS: `0x00000010` = 0x00000010.asInstanceOf[`0x00000010`]
  
  /** The state of the Windows XP display option, which selects between the Windows XP style and the classic style. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_STARTPANELON: `0x00200000` = 0x00200000.asInstanceOf[`0x00200000`]
  
  /** The state of the **Display as a web view option**. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_WEBVIEW: `0x00020000` = 0x00020000.asInstanceOf[`0x00020000`]
  
  /** The state of the **Classic Style** option. As of Windows Vista, this option is no longer available. */
  @scala.inline
  def SSF_WIN95CLASSIC: `0x00000400` = 0x00000400.asInstanceOf[`0x00000400`]
}
