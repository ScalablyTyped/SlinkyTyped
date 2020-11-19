package typingsSlinky.node

import typingsSlinky.node.readlineMod.Direction
import typingsSlinky.node.v8Mod.DoesZapCodeSpaceFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeNumbers {
  
  @scala.inline
  def `-1`: `-1` = -1.asInstanceOf[`-1`]
  
  @scala.inline
  def `0`: `0` = 0.asInstanceOf[`0`]
  
  @scala.inline
  def `1`: `1` = 1.asInstanceOf[`1`]
  
  @scala.inline
  def `2`: `2` = 2.asInstanceOf[`2`]
  
  @js.native
  sealed trait `-1`
    extends Direction
       with typingsSlinky.node.ttyMod.Direction
  
  @js.native
  sealed trait `0`
    extends Direction
       with typingsSlinky.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `1`
    extends Direction
       with typingsSlinky.node.ttyMod.Direction
       with DoesZapCodeSpaceFlag
  
  @js.native
  sealed trait `2` extends js.Object
}
