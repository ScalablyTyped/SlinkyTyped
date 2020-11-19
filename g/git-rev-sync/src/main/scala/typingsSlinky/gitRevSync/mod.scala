package typingsSlinky.gitRevSync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("git-rev-sync", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def branch(): String = js.native
  def branch(filePath: String): String = js.native
  
  def count(): Double = js.native
  
  def date(): js.Date = js.native
  
  def hasUnstagedChanges(): Boolean = js.native
  
  def isDirty(): Boolean = js.native
  
  def isTagDirty(): Boolean = js.native
  
  def long(): String = js.native
  def long(filePath: String): String = js.native
  
  def message(): String = js.native
  
  def remoteUrl(): String = js.native
  
  def short(): String = js.native
  def short(filePath: js.UndefOr[scala.Nothing], length: Double): String = js.native
  def short(filePath: String): String = js.native
  def short(filePath: String, length: Double): String = js.native
  
  def tag(): String = js.native
  def tag(makeDirty: Boolean): String = js.native
  
  def tagFirstParent(): String = js.native
  def tagFirstParent(makeDirty: Boolean): String = js.native
}
