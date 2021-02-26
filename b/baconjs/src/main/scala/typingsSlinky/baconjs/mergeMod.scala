package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mergeMod {
  
  @JSImport("baconjs/types/merge", "mergeAll")
  @js.native
  def mergeAll[V](streams: (default[V] | js.Array[default[V]])*): EventStream[V] = js.native
}
