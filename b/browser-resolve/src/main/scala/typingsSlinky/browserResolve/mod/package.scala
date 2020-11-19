package typingsSlinky.browserResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AsyncOpts = typingsSlinky.resolve.mod.AsyncOpts with typingsSlinky.browserResolve.mod.Opts
  
  /**
    * Callback invoked when resolving asynchronously
    * @param error
    * @param resolved Absolute path to resolved identifier
    */
  type Callback = js.Function2[
    /* err */ js.Error | scala.Null, 
    /* resolved */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  
  type SyncOpts = typingsSlinky.resolve.mod.SyncOpts with typingsSlinky.browserResolve.mod.Opts
}
