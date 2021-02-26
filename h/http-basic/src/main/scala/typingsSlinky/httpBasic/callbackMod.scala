package typingsSlinky.httpBasic

import typingsSlinky.httpResponseObject.mod.^
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.NodeJS.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object callbackMod {
  
  type Callback = js.Function2[/* err */ ErrnoException | Null, /* response */ js.UndefOr[^[ReadableStream]], Unit]
}
