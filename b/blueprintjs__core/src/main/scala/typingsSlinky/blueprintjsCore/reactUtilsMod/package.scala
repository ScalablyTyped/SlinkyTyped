package typingsSlinky.blueprintjsCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object reactUtilsMod {
  
  type LifecycleCompatPolyfill[P, T /* <: slinky.core.ReactComponentClass[P] */] = js.Function1[
    /* Comp */ T, 
    T with typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.LifecycleCompatPolyfill with org.scalablytyped.runtime.TopLevel[T]
  ]
}
