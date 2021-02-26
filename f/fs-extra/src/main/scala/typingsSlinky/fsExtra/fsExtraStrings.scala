package typingsSlinky.fsExtra

import typingsSlinky.fsExtra.mod.SymlinkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsExtraStrings {
  
  @js.native
  sealed trait buffer extends StObject
  @scala.inline
  def buffer: buffer = "buffer".asInstanceOf[buffer]
  
  @js.native
  sealed trait dir extends SymlinkType
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait file extends SymlinkType
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait junction extends SymlinkType
  @scala.inline
  def junction: junction = "junction".asInstanceOf[junction]
}
