package typingsSlinky.eventemitter3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArgumentMap[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]: T[K] extends (args : ...any): void? std.Parameters<T[K]> : T[K] extends std.Array<any>? T[K] : std.Array<any>}
    */ typingsSlinky.eventemitter3.eventemitter3Strings.ArgumentMap with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type EventArgs[T /* <: typingsSlinky.eventemitter3.mod.ValidEventTypes */, K /* <: typingsSlinky.eventemitter3.mod.EventNames[T] */] = typingsSlinky.std.Parameters[typingsSlinky.eventemitter3.mod.EventListener[T, K]]
  
  type EventListener[T /* <: typingsSlinky.eventemitter3.mod.ValidEventTypes */, K /* <: typingsSlinky.eventemitter3.mod.EventNames[T] */] = js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: eventemitter3.eventemitter3.ArgumentMap<std.Exclude<T, string | symbol>>[std.Extract<K, keyof T>] */ /* args */ js.Any, 
    scala.Unit
  ]
  
  type EventNames[T /* <: typingsSlinky.eventemitter3.mod.ValidEventTypes */] = (/* keyof T */ java.lang.String) | T
  
  type ListenerFn[Args /* <: js.Array[_] */] = js.Function1[/* args */ Args, scala.Unit]
  
  type ValidEventTypes = java.lang.String | js.Symbol | js.Object
}
