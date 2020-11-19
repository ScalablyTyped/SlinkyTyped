package typingsSlinky.nodeAbi

import typingsSlinky.nodeAbi.mod.Runtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeAbiStrings {
  
  @scala.inline
  def electron: electron = "electron".asInstanceOf[electron]
  
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  
  @scala.inline
  def `node-webkit`: `node-webkit` = "node-webkit".asInstanceOf[`node-webkit`]
  
  @js.native
  sealed trait electron extends Runtime
  
  @js.native
  sealed trait node extends Runtime
  
  @js.native
  sealed trait `node-webkit` extends Runtime
}
