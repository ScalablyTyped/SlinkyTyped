package typingsSlinky.pluralsCldr

import typingsSlinky.pluralsCldr.mod.Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluralsCldrStrings {
  
  @scala.inline
  def few: few = "few".asInstanceOf[few]
  
  @scala.inline
  def many: many = "many".asInstanceOf[many]
  
  @scala.inline
  def one: one = "one".asInstanceOf[one]
  
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @scala.inline
  def two: two = "two".asInstanceOf[two]
  
  @scala.inline
  def zero: zero = "zero".asInstanceOf[zero]
  
  @js.native
  sealed trait few extends Form
  
  @js.native
  sealed trait many extends Form
  
  @js.native
  sealed trait one extends Form
  
  @js.native
  sealed trait other extends Form
  
  @js.native
  sealed trait two extends Form
  
  @js.native
  sealed trait zero extends Form
}
