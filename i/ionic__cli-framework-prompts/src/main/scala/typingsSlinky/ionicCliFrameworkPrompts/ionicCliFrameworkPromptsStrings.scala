package typingsSlinky.ionicCliFrameworkPrompts

import typingsSlinky.ionicCliFrameworkPrompts.mod.PromptTypeOther
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicCliFrameworkPromptsStrings {
  
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  
  @scala.inline
  def confirm: confirm = "confirm".asInstanceOf[confirm]
  
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @scala.inline
  def password: password = "password".asInstanceOf[password]
  
  @js.native
  sealed trait checkbox extends js.Object
  
  @js.native
  sealed trait confirm extends js.Object
  
  @js.native
  sealed trait input extends PromptTypeOther
  
  @js.native
  sealed trait list extends PromptTypeOther
  
  @js.native
  sealed trait password extends PromptTypeOther
}
