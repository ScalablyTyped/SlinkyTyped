package typingsSlinky.angularCompiler

import typingsSlinky.angularCompiler.outputAstMod.JSDocTagName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object angularCompilerStrings {
  @js.native
  sealed trait desc extends JSDocTagName
  
  @js.native
  sealed trait id extends JSDocTagName
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait meaning extends JSDocTagName
  
  @js.native
  sealed trait ngtsc extends js.Object
  
  @js.native
  sealed trait root extends js.Object
  
  @js.native
  sealed trait tsc extends js.Object
  
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def id: id = "id".asInstanceOf[id]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def meaning: meaning = "meaning".asInstanceOf[meaning]
  @scala.inline
  def ngtsc: ngtsc = "ngtsc".asInstanceOf[ngtsc]
  @scala.inline
  def root: root = "root".asInstanceOf[root]
  @scala.inline
  def tsc: tsc = "tsc".asInstanceOf[tsc]
}

