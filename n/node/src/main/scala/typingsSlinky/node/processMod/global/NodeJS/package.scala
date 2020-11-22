package typingsSlinky.node.processMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object NodeJS {
  
  type BeforeExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  
  type DisconnectListener = js.Function0[scala.Unit]
  
  type ExitListener = js.Function1[/* code */ scala.Double, scala.Unit]
  
  type MessageListener = js.Function2[/* message */ js.Any, /* sendHandle */ js.Any, scala.Unit]
  
  type MultipleResolveListener = js.Function3[
    /* type */ typingsSlinky.node.processMod.global.NodeJS.MultipleResolveType, 
    /* promise */ js.Promise[js.Any], 
    /* value */ js.Any, 
    scala.Unit
  ]
  
  type NewListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  
  // Alias for compatibility
  type ProcessEnv = typingsSlinky.node.NodeJS.Dict[java.lang.String]
  
  // this namespace merge is here because these are specifically used
  // as the type for process.stdin, process.stdout, and process.stderr.
  // they can't live in tty.d.ts because we need to disambiguate the imported name.
  type ReadStream = typingsSlinky.node.ttyMod.ReadStream
  
  type RejectionHandledListener = js.Function1[/* promise */ js.Promise[js.Any], scala.Unit]
  
  type RemoveListenerListener = js.Function2[
    /* type */ java.lang.String | js.Symbol, 
    /* listener */ js.Function1[/* repeated */ js.Any, scala.Unit], 
    scala.Unit
  ]
  
  type SignalsListener = js.Function1[/* signal */ typingsSlinky.node.processMod.global.NodeJS.Signals, scala.Unit]
  
  type UncaughtExceptionListener = js.Function1[/* error */ js.Error, scala.Unit]
  
  type UnhandledRejectionListener = js.Function2[
    /* reason */ js.UndefOr[js.Object | scala.Null], 
    /* promise */ js.Promise[js.Any], 
    scala.Unit
  ]
  
  type WarningListener = js.Function1[/* warning */ js.Error, scala.Unit]
  
  type WriteStream = typingsSlinky.node.ttyMod.WriteStream
}
