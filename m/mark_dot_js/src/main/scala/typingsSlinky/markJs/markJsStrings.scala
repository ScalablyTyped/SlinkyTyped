package typingsSlinky.markJs

import typingsSlinky.markJs.mod.MarkAccuracy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markJsStrings {
  
  @scala.inline
  def complementary: complementary = "complementary".asInstanceOf[complementary]
  
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @scala.inline
  def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @scala.inline
  def exactly: exactly = "exactly".asInstanceOf[exactly]
  
  @scala.inline
  def partially: partially = "partially".asInstanceOf[partially]
  
  @scala.inline
  def withSpaces: withSpaces = "withSpaces".asInstanceOf[withSpaces]
  
  @js.native
  sealed trait complementary extends MarkAccuracy
  
  @js.native
  sealed trait disabled extends js.Object
  
  @js.native
  sealed trait enabled extends js.Object
  
  @js.native
  sealed trait exactly extends MarkAccuracy
  
  @js.native
  sealed trait partially extends MarkAccuracy
  
  @js.native
  sealed trait withSpaces extends js.Object
}
