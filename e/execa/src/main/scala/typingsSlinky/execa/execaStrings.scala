package typingsSlinky.execa

import typingsSlinky.execa.mod.StdioOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object execaStrings {
  @js.native
  sealed trait ignore extends StdioOption
  
  @js.native
  sealed trait inherit extends StdioOption
  
  @js.native
  sealed trait ipc extends StdioOption
  
  @js.native
  sealed trait pipe extends StdioOption
  
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def inherit: inherit = "inherit".asInstanceOf[inherit]
  @scala.inline
  def ipc: ipc = "ipc".asInstanceOf[ipc]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
}

