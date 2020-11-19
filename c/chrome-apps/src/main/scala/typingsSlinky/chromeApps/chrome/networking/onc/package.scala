package typingsSlinky.chromeApps.chrome.networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object onc {
  
  type ManagedBoolean = typingsSlinky.chromeApps.chrome.networking.onc.ManagedType[scala.Boolean]
  
  type ManagedDOMString = typingsSlinky.chromeApps.chrome.networking.onc.ManagedType[java.lang.String]
  
  type ManagedDOMStringList = typingsSlinky.chromeApps.chrome.networking.onc.ManagedType[js.Array[java.lang.String]]
  
  type ManagedIPConfigType = typingsSlinky.chromeApps.chrome.networking.onc.ManagedType[js.Array[typingsSlinky.chromeApps.chrome.networking.onc.IPConfigType]]
  
  type ManagedLong = typingsSlinky.chromeApps.chrome.networking.onc.ManagedType[typingsSlinky.chromeApps.chrome.integer]
  
  type ManagedProperties = typingsSlinky.chromeApps.chrome.networking.onc.NetworkProperties[
    typingsSlinky.chromeApps.chromeAppsStrings.managed, 
    typingsSlinky.chromeApps.chromeAppsStrings.full
  ]
  
  type NetworkConfigProperties[OF /* <: typingsSlinky.chromeApps.chrome.networking.onc.internal.ObjectFunction */] = typingsSlinky.chromeApps.chrome.networking.onc.internal.NetworkConfigBase[
    typingsSlinky.chromeApps.chromeAppsStrings.unmanaged, 
    typingsSlinky.chromeApps.chromeAppsStrings.full, 
    OF
  ]
  
  type NetworkStateProperties = typingsSlinky.chromeApps.chrome.networking.onc.NetworkProperties[
    typingsSlinky.chromeApps.chromeAppsStrings.unmanaged, 
    typingsSlinky.chromeApps.chromeAppsStrings.partial
  ]
}
