package typingsSlinky.reactAddonsTestUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type EventSimulator = js.Function2[
    /* element */ org.scalajs.dom.raw.Element | slinky.core.ReactComponentClass[js.Any], 
    /* eventData */ js.UndefOr[typingsSlinky.reactAddonsTestUtils.mod.SyntheticEventData], 
    scala.Unit
  ]
}
