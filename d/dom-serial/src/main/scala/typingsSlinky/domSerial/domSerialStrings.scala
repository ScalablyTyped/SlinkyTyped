package typingsSlinky.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domSerialStrings {
  
  @js.native
  sealed trait even extends ParityType
  @scala.inline
  def even: even = "even".asInstanceOf[even]
  
  @js.native
  sealed trait hardware extends FlowControlType
  @scala.inline
  def hardware: hardware = "hardware".asInstanceOf[hardware]
  
  @js.native
  sealed trait mark extends ParityType
  @scala.inline
  def mark: mark = "mark".asInstanceOf[mark]
  
  @js.native
  sealed trait none
    extends FlowControlType
       with ParityType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait odd extends ParityType
  @scala.inline
  def odd: odd = "odd".asInstanceOf[odd]
  
  @js.native
  sealed trait space extends ParityType
  @scala.inline
  def space: space = "space".asInstanceOf[space]
}
