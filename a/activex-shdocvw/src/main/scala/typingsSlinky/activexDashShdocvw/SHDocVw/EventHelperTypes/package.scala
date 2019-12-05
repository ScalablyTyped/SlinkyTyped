package typingsSlinky.activexDashShdocvw.SHDocVw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EventHelperTypes {
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.Cancel
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.Flags
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.Headers
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.PostData
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.Processed
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.TargetFrameName
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.URL
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.cItems
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.cVisits
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.fAvailableOffline
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.hItem
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.pDisp
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.strDate
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.strName
  import typingsSlinky.activexDashShdocvw.activexDashShdocvwStrings.strUrl

  type InternetExplorerMedium_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type InternetExplorer_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type ShellBrowserWindow_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type ShellNameSpace_FavoritesSelectionChange_ArgNames = js.Tuple7[cItems, hItem, strName, strUrl, cVisits, strDate, fAvailableOffline]
  type WebBrowser_BeforeNavigate2_ArgNames = js.Tuple7[pDisp, URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type WebBrowser_V1_BeforeNavigate_ArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type WebBrowser_V1_FrameBeforeNavigate_ArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Cancel]
  type WebBrowser_V1_FrameNewWindow_ArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Processed]
  type WebBrowser_V1_NewWindow_ArgNames = js.Tuple6[URL, Flags, TargetFrameName, PostData, Headers, Processed]
}
