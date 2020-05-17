package typingsSlinky.rcTreeSelect

import typingsSlinky.rcTreeSelect.interfaceMod.SelectSource
import typingsSlinky.rcTreeSelect.useKeyValueMappingMod.SkipType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTreeSelectStrings {
  @js.native
  sealed trait checkbox extends SkipType
  
  @js.native
  sealed trait clear extends SelectSource
  
  @js.native
  sealed trait input extends SelectSource
  
  @js.native
  sealed trait option extends SelectSource
  
  @js.native
  sealed trait select extends SkipType
  
  @js.native
  sealed trait selection extends SelectSource
  
  @scala.inline
  def checkbox: checkbox = "checkbox".asInstanceOf[checkbox]
  @scala.inline
  def clear: clear = "clear".asInstanceOf[clear]
  @scala.inline
  def input: input = "input".asInstanceOf[input]
  @scala.inline
  def option: option = "option".asInstanceOf[option]
  @scala.inline
  def select: select = "select".asInstanceOf[select]
  @scala.inline
  def selection: selection = "selection".asInstanceOf[selection]
}

