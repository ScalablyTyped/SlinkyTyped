package typingsSlinky.reactMdTransition

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useFixedPositioningMod {
  
  type FixedTo = java.lang.String | org.scalajs.dom.raw.HTMLElement | scala.Null | typingsSlinky.reactMdTransition.useFixedPositioningMod.FixedToFunction
  
  type FixedToFunction = js.Function0[org.scalajs.dom.raw.HTMLElement | scala.Null]
  
  type GetFixedPositionOptions = js.Function1[
    /* node */ org.scalajs.dom.raw.HTMLElement, 
    typingsSlinky.reactMdTransition.useFixedPositioningMod.OptionalFixedPositionOptions
  ]
  
  type OnFixedPositionScroll = js.Function2[
    /* event */ org.scalajs.dom.raw.Event, 
    /* data */ typingsSlinky.reactMdTransition.useFixedPositioningMod.ScrollData, 
    scala.Unit
  ]
  
  type PositionChange = js.Function2[
    /* wanted */ typingsSlinky.reactMdUtils.typesMod.PositionAnchor, 
    /* actual */ typingsSlinky.reactMdUtils.typesMod.PositionAnchor, 
    scala.Unit
  ]
}
