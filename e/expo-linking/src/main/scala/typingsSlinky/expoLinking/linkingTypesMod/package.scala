package typingsSlinky.expoLinking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object linkingTypesMod {
  
  type NativeURLListener = js.Function1[/* nativeEvent */ org.scalajs.dom.raw.MessageEvent, scala.Unit]
  
  type QueryParams = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  
  type URLListener = js.Function1[/* event */ typingsSlinky.expoLinking.linkingTypesMod.EventType, scala.Unit]
}
