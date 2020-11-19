package typingsSlinky.babelTraverse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object babelTraverseStrings {
  
  @scala.inline
  def const: const = "const".asInstanceOf[const]
  
  @scala.inline
  def let: let = "let".asInstanceOf[let]
  
  @scala.inline
  def module: module = "module".asInstanceOf[module]
  
  @scala.inline
  def `var`: `var` = "var".asInstanceOf[`var`]
  
  @js.native
  sealed trait const extends js.Object
  
  @js.native
  sealed trait let extends js.Object
  
  @js.native
  sealed trait module extends js.Object
  
  @js.native
  sealed trait `var` extends js.Object
}
