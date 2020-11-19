package typingsSlinky.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object useResizeObserverMod {
  
  /**
    * A function that will return the resize observer target element. This should
    * return an HTMLElement or null.
    */
  type GetTarget[E /* <: org.scalajs.dom.raw.HTMLElement */] = js.Function0[E | scala.Null]
  
  type ObservedResizeEventHandler = js.Function1[
    /* event */ typingsSlinky.reactMdUtils.useResizeObserverMod.ObservedResizeData, 
    scala.Unit
  ]
  
  type RefTarget[E /* <: org.scalajs.dom.raw.HTMLElement */] = typingsSlinky.react.mod.MutableRefObject[E | scala.Null]
  
  type ResizeObserverTarget[E /* <: org.scalajs.dom.raw.HTMLElement */] = scala.Null | org.scalajs.dom.raw.HTMLElement | java.lang.String | typingsSlinky.reactMdUtils.useResizeObserverMod.RefTarget[E] | typingsSlinky.reactMdUtils.useResizeObserverMod.GetTarget[E]
}
