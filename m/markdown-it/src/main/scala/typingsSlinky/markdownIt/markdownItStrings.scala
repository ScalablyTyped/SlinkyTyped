package typingsSlinky.markdownIt

import typingsSlinky.markdownIt.libMod.PresetName
import typingsSlinky.markdownIt.stateBlockMod.ParentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markdownItStrings {
  
  @scala.inline
  def blockquote: blockquote = "blockquote".asInstanceOf[blockquote]
  
  @scala.inline
  def commonmark: commonmark = "commonmark".asInstanceOf[commonmark]
  
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @scala.inline
  def paragraph: paragraph = "paragraph".asInstanceOf[paragraph]
  
  @scala.inline
  def reference: reference = "reference".asInstanceOf[reference]
  
  @scala.inline
  def root: root = "root".asInstanceOf[root]
  
  @scala.inline
  def zero: zero = "zero".asInstanceOf[zero]
  
  @js.native
  sealed trait blockquote extends ParentType
  
  @js.native
  sealed trait commonmark extends PresetName
  
  @js.native
  sealed trait default extends PresetName
  
  @js.native
  sealed trait list extends ParentType
  
  @js.native
  sealed trait paragraph extends ParentType
  
  @js.native
  sealed trait reference extends ParentType
  
  @js.native
  sealed trait root extends ParentType
  
  @js.native
  sealed trait zero extends PresetName
}
