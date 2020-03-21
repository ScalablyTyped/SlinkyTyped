package typingsSlinky.javascriptObfuscator

import typingsSlinky.javascriptObfuscator.espreeMod.SourceType
import typingsSlinky.javascriptObfuscator.tvisitordirectionMod.TVisitorDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object javascriptObfuscatorStrings {
  @js.native
  sealed trait enter extends TVisitorDirection
  
  @js.native
  sealed trait leave extends TVisitorDirection
  
  @js.native
  sealed trait module extends SourceType
  
  @js.native
  sealed trait script extends SourceType
  
  @js.native
  sealed trait `use strict` extends js.Object
  
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  @scala.inline
  def script: script = "script".asInstanceOf[script]
  @scala.inline
  def `use strict`: `use strict` = "use strict".asInstanceOf[`use strict`]
}

